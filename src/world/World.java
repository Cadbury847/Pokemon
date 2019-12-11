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

	private int[] tiles;
	private AABB[] boundingBoxes;
	private List<Entity> entities;
	private int width;
	private int height;
	private int scale;
	
	private Matrix4f world;
	
	public World(String world) {
		try {
			BufferedImage tileSheet = ImageIO.read(new File("res/areas/"+world+".png"));
			//BufferedImage entitySheet = ImageIO.read(new File("areas/"+world+"_entity.png"));
			
			width = tileSheet.getWidth();
			height = tileSheet.getHeight();
			scale = 20;
			
			this.world = new Matrix4f().setTranslation(new Vector3f(0));
			this.world.scale(scale);
			
			int[] colourTileSheet = tileSheet.getRGB(0, 0, width, height, null, 0, width);
			
			tiles = new int[width*height];
			boundingBoxes = new AABB[width*height];
			
			for(int j = 0; j < height; j++) {
				for(int i = 0; i < width; i++) {
					int red = (colourTileSheet[i+j*width] >> 16) & 0xFF;
					
					Tile t = Tile.tiles1[red];
					setTile(t, i, j);
				}
			}
			
			entities = new ArrayList<Entity>();
			entities.add(new Player(new Transform()));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public World() {
		width = 24;
		height = 20;
		scale = 20;
		
		tiles = new int[width * height];
		boundingBoxes = new AABB[width*height];
		

		entities = new ArrayList<Entity>();

		Transform t = new Transform();
		t.pos.x = 22;
		t.pos.y = -18;

		Player player = new Player(t);
		
		entities.add(player);
		
		world = new Matrix4f().setTranslation(new Vector3f(0));
		world.scale(scale);
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
				Tile t = getTile(i-posX-(viewX/2)+1, j+posY-(viewY/2));
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
	
	public Tile getTile(int x, int y) {
		try {
			return Tile.tiles1[tiles[x+y*width]];
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
}
