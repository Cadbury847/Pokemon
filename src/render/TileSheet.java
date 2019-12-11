package render;

import org.joml.Matrix4f;

public class TileSheet {
	private Texture texture;
	private Matrix4f scale, translation;
	private int numTiles;
	
	public TileSheet(String texture, int numTiles) {
		this.texture = new Texture("sheets/"+texture);
		
		scale = new Matrix4f().scale(1.0f / (float)numTiles);
		translation = new Matrix4f();
		this.numTiles = numTiles;
	}
	
	public void bindTile(Shader shader, int x, int y) {
		scale.translate(x, y, 0, translation);
		
		shader. setUniform("sampler", 0);
		shader.setUniform("texModifier",  translation);
		texture.bind(0);
	}
	
	public void bindTile(Shader shader, int index) {
		int x = index % numTiles;
		int y = index / numTiles;
		bindTile(shader, x, y);
	}
}
