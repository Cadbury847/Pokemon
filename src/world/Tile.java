package world;

public class Tile {

	public static Tile tiles[] = new Tile[7000];
	public static int numOfTiles = 0;
	
	public static final Tile resetTile = new Tile("pokemon/bulbasaurFrontTexture");
	public static final Tile testTile = new Tile("pokemon/bulbasaurBackTexture");
	
	
	private int id;
	private boolean solid;
	private String texture;
	
	public Tile(String tex) {
		this.solid = false;
		this.id = numOfTiles;
		numOfTiles++;
		this.texture = tex;
		tiles[id] = this;
	}
	
	public Tile setSolid() {
		this.solid = true;
		return this;
	}
	
	public boolean isSolid() {
		return solid;
	}

	public int getId() {
		return id;
	}
	
	public String getTexture() {
		return texture;
	}
}
