package world;

import java.util.HashMap;

import org.joml.Matrix4f;
import org.joml.Vector3f;

import render.Camera;
import render.Model;
import render.Shader;
import render.Texture;

public class TileRenderer {
	private HashMap<String, Texture> tileTextures;
	private Model model;
	
	public TileRenderer() {
		tileTextures = new HashMap<String, Texture>();
		
		float[] vertices = new float[] {
				-1f, 1f, 0,	//TOP LEFT
				1f, 1f, 0,	//TOP RIGHT
				1f, -1f, 0,	//BOTTOM RIGHT
				-1f, -1f, 0	//BOTTOM LEFT
		};
		
		float[] texture = new float[] {
			0,0,
			1,0,
			1,1,
			0,1
		};
		
		int[] indices = new int[] {
				0,1,2,
				2,3,0
		};
		
		model = new Model(vertices, texture, indices);
		
		for(int i = 0; i < Tile.tiles1.length; i++) {
			if(Tile.tiles1[i] != null) {
				if (!tileTextures.containsKey(Tile.tiles1[i].getTexture())) {
					String tex = Tile.tiles1[i].getTexture();
					tileTextures.put(tex, new Texture(tex));
				}
			}
		}
	}
	
	public void renderTile(Tile id, int x, int y, Shader shader, Matrix4f world, Camera cam) {
		shader.bind();
		if(tileTextures.containsKey(id.getTexture())) {
			tileTextures.get(id.getTexture()).bind(0);
		}
		
		Matrix4f tilePos = new Matrix4f().translate(new Vector3f(x*2, y*2, 0));
		Matrix4f target = new Matrix4f();
		
		cam.getProjection().mul(world, target);
		target.mul(tilePos);
		
		shader.setUniform("sampler",  0);
		shader.setUniform("projection", target);
		
		model.render();
	}

}
