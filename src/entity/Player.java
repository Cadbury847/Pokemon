package entity;

import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjgl.glfw.GLFW;

import io.Window;
import render.Animation;
import render.Camera;
import world.World;

public class Player extends Entity{
	public static final int ANIM_IDLE = 0;
	public static final int ANIM_WALK = 1;
	public static final int ANIM_SIZE = 2;
	
	public Player(Transform transform) {
		super(ANIM_SIZE, transform);
		setAnimation(ANIM_IDLE, new Animation(1, 1, "anim/playerSprites/idle"));
		setAnimation(ANIM_WALK, new Animation(3, 6, "anim/playerSprites/walkingDown"));
	}
	
	@Override
	public void update(float delta, Window window, Camera camera, World world) {
		Vector2f movement = new Vector2f();
		
		if(window.getInput().isKeyDown(GLFW.GLFW_KEY_A)) {
			movement.add(-8*delta,0 );
		}
		if(window.getInput().isKeyDown(GLFW.GLFW_KEY_D)) {
			movement.add(8*delta, 0);
		}
		if(window.getInput().isKeyDown(GLFW.GLFW_KEY_W)) {
			movement.add(0, 8*delta);
		}
		if(window.getInput().isKeyDown(GLFW.GLFW_KEY_S)) {
			movement.add(0,-8*delta);
		}
		
		move(movement);
		
		if(movement.x != 0 || movement.y != 0) {
			useAnimation(ANIM_WALK);
		} else {
			useAnimation(ANIM_IDLE);
		}

		
		camera.getPosition().lerp(transform.pos.mul(-world.getScale(), new Vector3f()), 0.05f);
		//camera.setPosition(transform.pos.mul(-world.getScale(), new Vector3f()));
		world.correctCamera(camera, window);
	}
}