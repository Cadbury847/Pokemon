package mainGame;

public class NPC {
	
	private String[] lines = new String[] {};
	private int[] basePos, currentPos = new int[2];
	
	private String name;
	private boolean canMove, canRotate;
	private int[][] moveRange;
	private int facing;
	
	public NPC(String[] lines, int[] basePos, String name, boolean canMove, boolean canRotate, int[][] moveRange, int facing) { //Texture texture
		
		this.lines = lines;
		this.basePos = basePos;
		this.currentPos = basePos;
		this.name = name;
		this.canMove = canMove;
		this.moveRange = moveRange;
		this.facing = facing;
		this.canRotate = canRotate;
		
	}
	
	
	
	
	public void talk() {
		//Initialise new textBox
		//TextBox textBox = new TextBox();
		for (String i : lines) {
			//set textBox.text = i;
			//sleep (1);
			//while !textBox.confirm(){
			//	continue;;
			//}
		}
	}
	
	public String getDirection() {
		switch(facing) {
		case(0):
			return "North";
		case(1):
			return "East";
		case(2):
			return "South";
		case(3):
			return "West";
		}
		return "gg; it broke. facing in NPC " + name + " wasnt 0, 1, 2, or 3";
	}
	
	public String getName() {
		return name;
	}
	
	public int[] getPos() {
		return currentPos;
	}

}
