package world;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;

import collision.AABB;
import entity.Entity;
import entity.Player;
import entity.Transform;
import io.Window;
import render.Animation;
import render.Camera;
import render.Shader;

public class World {
	private int viewX;
	private int viewY;
	private String area;

	private int[] tiles;
	private AABB[] boundingBoxes;
	public List<Entity> entities;
	private int width;
	private int height;
	private int scale;
	
	private Matrix4f world;
	
	public World(Camera camera) {
		width = 38;
		height = 25;
		scale = 20;
		
		tiles = new int[width * height];
		boundingBoxes = new AABB[width*height];

		entities = new ArrayList<Entity>();

		Transform t = new Transform();
		t.pos.x = 22;
		t.pos.y = -18;

		Player player = new Player(t);
		entities.add(player);
		area = "Pallet Town";

		camera.getPosition().set(t.pos.mul(-scale, new Vector3f()));
		
		world = new Matrix4f().setTranslation(new Vector3f(0));
		world.scale(scale);
	}
	
	public void checkDoors() {
		Entity temp = entities.get(0);
		
		switch(area) {
		case("Pallet Town"):
			if(temp.getPos().x == 12 && temp.getPos().y == -14) {
				System.out.println("Changing!");
				WorldLoader.PlayerHouseGround(this);				
			}
			break;
		case("Player House Ground"):
			if((temp.getPos().x > 4 && temp.getPos().x < 6) && (temp.getPos().y < -14 && temp.getPos().y > -15)) {
				System.out.println("Changing!");
				WorldLoader.PalletTown(this);				
			} else if((temp.getPos().x > 18 && temp.getPos().x < 19) && temp.getPos().y == -2) {
				System.out.println("Changing!");
				WorldLoader.PlayerHouseUpper(this);
			}
			break;
		case("Player House Upper"):
			//System.out.println(temp.getPos().x+", "+temp.getPos().y);
			if((temp.getPos().x > 14 && temp.getPos().x < 15) && temp.getPos().y == -4) {
				System.out.println("Changing!");
				WorldLoader.PlayerHouseGround(this);	
			}
		}
	}
	
	public void calculateView(Window window) {
		viewX = (window.getWidth() / (scale * 2)) + 4;
		viewY = (window.getHeight() / (scale * 2)) + 4;
	}
	
	public void render(TileRenderer render, Shader shader, Camera cam) {
		int posX = (int) cam.getPosition().x / (scale*2);
		int posY = (int) cam.getPosition().y / (scale*2);
		
		for(int i = 0; i < viewX; i++) {
			for(int j = 0; j < viewY; j++) {
				Tile t = getTile(i-posX-(viewX/2)+1, j+posY-(viewY/2), area);
				if(t != null) {
					render.renderTile(t, i-posX-(viewX/2)+1, -j-posY+(viewY/2), shader, world, cam);
				}
			}
		}
		
		for(Entity entity : entities) {
			entity.render(shader, cam, this);
		}
	}
	
	public void update(float delta, Window window, Camera camera) {
		for(Entity entity : entities) {
			entity.update(delta, window, camera, this);
		}
		
		for(int i = 0; i < entities.size(); i++) {
			entities.get(i).tileCollide(this);

			for(int j = i+1; j < entities.size(); j++) {
				entities.get(i).entityCollide(entities.get(j));
			}
			entities.get(i).tileCollide(this);
		}
	}
	
	public void correctCamera(Camera cam, Window window) {
		Vector3f pos = cam.getPosition();
		
		int w = -width * scale * 2;
		int h = height * scale * 2;
		
		if(pos.x > -(window.getWidth()/2) + scale) {
			pos.x = -(window.getWidth()/2) + scale;
		} else if(pos.x < w + (window.getWidth()/2) + scale) {
			pos.x = w + window.getWidth()/2 + scale;
		}
		if(pos.y > h-(window.getHeight()/2) - scale) {
			pos.y = h-(window.getHeight()/2) - scale;
		} else if(pos.y < (window.getHeight()/2) - scale) {
			pos.y = window.getHeight()/2 - scale;
		}
	}
	
	
	public void setTile(Tile tile, int x, int y) {
		
		tiles[x + y * width] = tile.getId();
		
		if(tile.isSolid()) {
			boundingBoxes[x+y*width] = new AABB(new Vector2f(x*2,-y*2), new Vector2f(1,1));
		} else {
			boundingBoxes[x+y*width] = null;
		}
	}
	
	public Tile getTile(int x, int y, String area) {
		try {
			return Tile.tiles[tiles[x+y*width]];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public AABB getTileBoundingBox(int x, int y) {
		try {
			return boundingBoxes[x+y*width];
		}catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	public int getScale() {
		return scale;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	public Matrix4f getWorldMatrix() { return world; }

	public String getArea() {
		return area;
	}
	
	public void setArea(String newArea) {
		area = newArea;
	}
}
