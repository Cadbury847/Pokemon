package gui;

import org.joml.Matrix4f;
import org.joml.Vector2f;

import assets.Assets;
import io.Window;
import render.Camera;
import render.Shader;
import render.TileSheet;

public class Gui {
	private Shader shader;
	private Camera camera;
	private TileSheet sheet;
	private Button temp;
	
	public Gui(Window window) {
		shader = new Shader("gui");
		sheet = new TileSheet("test", 3);
		camera = new Camera(window.getWidth(), window.getHeight());
		temp = new Button(new Vector2f(0,0), new Vector2f(48, 16));
	}
	
	public void resizeCamera(Window window) {
		camera.setProjection(window.getWidth(), window.getHeight());
	}
	
	public void render() {
		shader.bind();
		temp.render(camera,  sheet,  shader);
		
		
	}

}
