package world;

import org.joml.Vector2f;

import data.Maths;

public class WorldLoader {
	
	private static int[] palletTownBlocks = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,14,15,16,17,18,19,20,21,22,23,
	24,25,26,27,28,29,30,31,32,33,34,35,38,39,40,41,42,43,44,45,46,47,48,49,70,71,72,73,94,95,96,97,101,102,103,
	104,105,110,111,112,113,114,118,119,120,121,125,126,127,128,129,134,135,136,137,138,142,143,144,145,149,150,151,152,
	153,158,159,160,161,162,166,167,168,169,172,173,175,176,177,181,182,184,185,186,190,191,192,193,214,215,
	216,217,238,239,240,241,253,254,255,256,257,258,259,262,263,264,265,269,270,271,272,273,277,278,279,280,281,282,283,
	286,287,288,289,301,302,303,304,305,306,307,310,311,312,313,325,326,327,329,330,331,334,335,336,337,341,358,359,
	360,361,382,383,384,385,397,398,399,400,401,406,407,408,409,415,416,417,418,430,431,432,433,439,440,441,442,454,455,
	456,457,458,459,460,461,463,464,465,466,474,475,476,477,478,479};
	
	private static int[] playerHouseGroundBlocks = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,29,44,45,60,69};
	private static int[] playerHouseUpperBlocks = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,15,16,17,24,36,37,
															40,45,46};
	
	public static void setAreas() {
		int i = 0;
		while(i < 480) {
			if(Maths.contains(palletTownBlocks, i)) {
				new Tile("areas/palletTown/"+i).setSolid();
			} else {
				new Tile("areas/palletTown/"+i);
			}
			i++;
		}
		
		i = 0;
		while(i < 80) {
			if(Maths.contains(playerHouseGroundBlocks, i)) {
				new Tile("areas/playerHouseGround/"+i).setSolid();
			} else {
				new Tile("areas/playerHouseGround/"+i);
			}
			i++;
		}
		
		i = 0;
		while(i < 72) {
			if(Maths.contains(playerHouseUpperBlocks, i)) {
				new Tile("areas/playerHouseUpper/"+i).setSolid();
			} else {
				new Tile("areas/playerHouseUpper/"+i);
			}
			i++;
		}
	}
	
	public static void clearWorld(World world) {
		world.setArea("");
		for(int x = 0; x < world.getWidth(); x++) {
			for(int y = 0; y < world.getHeight(); y++) {
				world.setTile(Tile.tiles[0], x, y);
			}
		}
	}
	
	public static void PalletTown(World world) {
		int width = 24;
		int height = 20;

		String tempArea = world.getArea();
		clearWorld(world);
		
		if(tempArea == "Player House Ground") {
			world.entities.get(0).setPos(new Vector2f(12,-14));
		} else if(tempArea == "Route 1") {
			
		} else {
			System.out.println("Error PT");
		}
		
		world.setArea("Pallet Town");
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				world.setTile(Tile.tiles[2+x+y*width], x, y);
			}
		}

	}

	public static void PlayerHouseGround(World world) {
		int width = 10;
		int height = 8;
		
		String tempArea = world.getArea();
		clearWorld(world);
		
		if(tempArea == "Pallet Town") {
			world.entities.get(0).setPos(new Vector2f(5,-13));
		} else if(tempArea == "Player House Upper") {
			world.entities.get(0).setPos(new Vector2f(17,-3));
		} else {
			System.out.println("Error PHG");
		}
		
		world.setArea("Player House Ground");
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				world.setTile(Tile.tiles[482+x+y*width], x, y);
			}
		}
	}
	
	public static void PlayerHouseUpper(World world) {
		int width = 9;
		int height = 8;
		
		clearWorld(world);
		
		world.entities.get(0).setPos(new Vector2f(15,-4));
		
		world.setArea("Player House Upper");
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				world.setTile(Tile.tiles[562+x+y*width], x, y);
			}
		}
	}
}

/*
*/