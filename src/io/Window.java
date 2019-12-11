package io;

import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import static org.lwjgl.glfw.Callbacks.*;

public class Window {
	
	private long window;
	private int width, height;
	private boolean fullscreen;
	private boolean hasResized;
	private GLFWWindowSizeCallback windowSizeCallback;
	private Input input;
	
	public static void setCallBack() {
		//glfwSetErrorCallback(GLFWErrorCallback.createPrint(System.err));
		glfwSetErrorCallback(new GLFWErrorCallback() {
			@Override
			public void invoke(int errorCode, long descriptionPointer) {
				throw new IllegalStateException(GLFWErrorCallback.getDescription(descriptionPointer));
			}});
		
	}
	
	private void setLocalCallbacks() {
		windowSizeCallback = new GLFWWindowSizeCallback() {

			@Override
			public void invoke(long argWindow, int argWidth, int argHeight) {
				width = argWidth;
				height = argHeight;
				hasResized = true;
			}
		};
		
		glfwSetWindowSizeCallback(window, windowSizeCallback);
	}
	
	/*public Window(String title, boolean fullscreen) {
		
		GLFWVidMode vid = glfwGetVideoMode(glfwGetPrimaryMonitor());
		
		if (fullscreen) {
			height = vid.height();
			width = vid.width();
		} else {
			height = 480;
			width = 640;
		}
		
		window = glfwCreateWindow(width, height, title,
				fullscreen ? glfwGetPrimaryMonitor() : 0, 0);
		if (window == 0) {
			throw new IllegalStateException("Window creation failed.");
		}
		
		
		setSize(width,height);
		glfwSetWindowPos(window,  (width)/2, (height)/2);
		glfwShowWindow(window);
		glfwMakeContextCurrent(window);
		
		input = new Input(window);
	}*/
	
	public Window(String title, boolean fullscreen) {
		setSize(640,460);
		toggleFullscreen();
		hasResized = false;
		
		window = glfwCreateWindow(640, 480, title, 0, 0);
		
		glfwShowWindow(window);
		glfwMakeContextCurrent(window);
		
		
		input = new Input(window);
		setLocalCallbacks();
	}
	
	public void cleanUp() {
		glfwFreeCallbacks(window);
	}
	
	public boolean shouldClose() {
		return glfwWindowShouldClose(window);
	}
	
	public void swapBuffers() {
		glfwSwapBuffers(window);
	}
	
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void toggleFullscreen() {
		fullscreen = !fullscreen;
	}
	
	public void update() {
		hasResized = false;
		input.update();
		glfwPollEvents();
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public boolean hasResized() { return hasResized; }
	public boolean isFullscreen() { return fullscreen; }
	public Input getInput() { return input; }
	public long getWindow() { return window; }

}
