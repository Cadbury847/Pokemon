package game;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.joml.Vector3f;
import org.lwjgl.opengl.GL;

import assets.Assets;
import entity.Entity;
import gui.Gui;
import io.Timer;
import io.Window;
import render.Camera;
import render.Shader;
import world.Tile;
import world.TileRenderer;
import world.World;
import world.WorldLoader;

public class Main {
	
	public Main() {
//		
//		//IMAGE SPLITTER
		try {
			final BufferedImage source = ImageIO.read(new File("res/areas/playerHouseUpper.png"));
			int idx = 0;
			
			for(int y = 0; y < source.getHeight(); y += 20) {
				for (int x = 0; x < source.getWidth(); x += 20) {
					ImageIO.write(source.getSubimage(x, y, 20, 20), "png", new File("res/areas/playerHouseUpper/" + idx++ + ".png"));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
//				
		if (!glfwInit()) {
			System.err.println("GLFW Init() fail");
			System.exit(1);;
		}
		
		Window win = new Window("Bulbasaur Sim 2020", true);
		
		GL.createCapabilities();
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		
		WorldLoader.setAreas();
		
		Camera camera = new Camera(win.getWidth(), win.getHeight());
		
		glEnable(GL_TEXTURE_2D);
		
		TileRenderer tiles = new TileRenderer();
		Assets.initAsset();

		
		
		Shader shader = new Shader("shader");
		
		World world = new World(camera);
		world.calculateView(win);
		WorldLoader.PalletTown(world);
		
		//TODO
		//Gui gui = new Gui(win);
		
		
		//camera.setPosition(new Vector3f(0, 0, 0));
		
		double frameCap = 1.0/60.0;
		double frameTime = 0;
		int frames = 0;
		
		double time = Timer.getTime();
		double unprocessed = 0;
		
		while(!win.shouldClose()) {
			
			boolean canRender = false;
			
			double time2 = Timer.getTime();
			double passed = time2 - time;
			
			unprocessed += passed;
			frameTime += passed;
			time = time2;
			
			while (unprocessed >= frameCap) {
				if(win.hasResized()) {

					camera.setProjection(win.getWidth(), win.getHeight());

					world.calculateView(win);
					//TODO
					//gui.resizeCamera(win);
					glViewport(0, 0, win.getWidth(), win.getHeight());
					world.correctCamera(camera, win);
				}
				
				unprocessed -= frameCap;
				canRender = true;
				
				
				if (win.getInput().isKeyPressed(GLFW_KEY_ESCAPE)) {
					glfwSetWindowShouldClose(win.getWindow(), true);
				}
				if (win.getInput().isKeyPressed(GLFW_KEY_C)) {
					WorldLoader.clearWorld(world);
				}
				if (win.getInput().isKeyPressed(GLFW_KEY_P)) {
					WorldLoader.PalletTown(world);
				}
				if (win.getInput().isKeyPressed(GLFW_KEY_L)) {
					WorldLoader.PlayerHouseGround(world);
				}
//				if (win.getInput().isKeyPressed(GLFW_KEY_K)) {
//					WorldLoader.PlayerHouseGround(world);
//				}
				
				
				world.checkDoors();
				
				world.correctCamera(camera, win);
				
				world.update((float)frameCap, win, camera);
				win.update();
				
				if (frameTime >= 1.0) {
					frameTime = 0;
					System.out.println("FPS: " + frames);
					frames=0;
				}
			}
			
			if (canRender) {
				glClear(GL_COLOR_BUFFER_BIT);
			
//				shader.bind();
//				shader.setUniform("sampler", 0);
//				shader.setUniform("projection",  camera.getProjection().mul(target));
//				tex.bind(0);
				
				
				world.render(tiles, shader, camera);
				//TODO
				//gui.render();
				
				
				win.swapBuffers();
				frames++;
			}
		}
		
		Assets.deleteAsset();
		glfwTerminate();
	}
	
	public static void main(String[] args) {
		Window.setCallBack();
		new Main();
	}

}
