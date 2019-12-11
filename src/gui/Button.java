package gui;

import org.joml.Matrix4f;
import org.joml.Vector2f;

import assets.Assets;
import collision.AABB;
import render.Camera;
import render.Shader;
import render.TileSheet;

public class Button {
	public final int STATE_IDLE = 0;
	public static final int STATE_SELECTED = 1;
	public static final int STATE_CLICKED = 2;
	
	private AABB boundingBox;
	private int state;
	private static Matrix4f transform = new Matrix4f();
	
	
	public Button(Vector2f position, Vector2f scale) {
		this.boundingBox = new AABB(position, scale);
		this.state = 0;
	}
	
	public void render(Camera camera, TileSheet sheet, Shader shader) {
		Vector2f position = boundingBox.getCenter(), 
				 scale    = boundingBox.getHalfExtent();
		
		transform.identity().translate(position.x, position.y, 0).scale(scale.x, scale.y, 1);
		shader.setUniform("projection", camera.getProjection().mul(transform));
		sheet.bindTile(shader, 0);
		Assets.getModel().render();
		
	}

}
