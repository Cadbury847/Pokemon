package world;

public class Tile {

	public static Tile tiles1[] = new Tile[500];
	public static int numOfTiles = 0;
	
	public static final Tile testTile = new Tile("pokemon/bulbasaurFrontTexture");
	public static final Tile testTile2 = new Tile("pokemon/bulbasaurShinyFrontTexture").setSolid();
	public static final Tile testTile3 = new Tile("pokemon/bulbasaurBackTexture");
	public static final Tile testTile4 = new Tile("areas/palletTown/0");
	public static final Tile testTile5 = new Tile("areas/palletTown/24");
	public static final Tile testTile6 = new Tile("areas/palletTown/1");
	public static final Tile testTile7 = new Tile("areas/palletTown/25");
	
	public static final Tile palletTown0 = new Tile("areas/palletTown/0").setSolid();
	public static final Tile palletTown1 = new Tile("areas/palletTown/1").setSolid();

	public static final Tile palletTown2 = new Tile("areas/palletTown/20").setSolid();
	public static final Tile palletTown3 = new Tile("areas/palletTown/21").setSolid();
	public static final Tile palletTown4 = new Tile("areas/palletTown/41").setSolid();
	public static final Tile palletTown5 = new Tile("areas/palletTown/42");
	public static final Tile palletTown6 = new Tile("areas/palletTown/43");
	
	public static final Tile palletTown7 = new Tile("areas/palletTown/57");
	public static final Tile palletTown8 = new Tile("areas/palletTown/58");
	public static final Tile palletTown9 = new Tile("areas/palletTown/59").setSolid();
	
	public static final Tile palletTown10 = new Tile("areas/palletTown/61").setSolid();
	public static final Tile palletTown11 = new Tile("areas/palletTown/62");
	public static final Tile palletTown12 = new Tile("areas/palletTown/63");
	public static final Tile palletTown13 = new Tile("areas/palletTown/64");
	public static final Tile palletTown14 = new Tile("areas/palletTown/65");
	public static final Tile palletTown15 = new Tile("areas/palletTown/68");
	public static final Tile palletTown16 = new Tile("areas/palletTown/69");
	
	public static final Tile palletTown17 = new Tile("areas/palletTown/70");
	public static final Tile palletTown18 = new Tile("areas/palletTown/71");
	public static final Tile palletTown19 = new Tile("areas/palletTown/77");
	public static final Tile palletTown20 = new Tile("areas/palletTown/79").setSolid();

	public static final Tile palletTown21 = new Tile("areas/palletTown/84");
	public static final Tile palletTown22 = new Tile("areas/palletTown/85");
	public static final Tile palletTown23 = new Tile("areas/palletTown/86").setSolid();
	public static final Tile palletTown24 = new Tile("areas/palletTown/87").setSolid();
	public static final Tile palletTown25 = new Tile("areas/palletTown/88");

	public static final Tile palletTown26 = new Tile("areas/palletTown/103").setSolid();
	public static final Tile palletTown27 = new Tile("areas/palletTown/104").setSolid();
	public static final Tile palletTown28 = new Tile("areas/palletTown/105").setSolid();
	public static final Tile palletTown29 = new Tile("areas/palletTown/106").setSolid();
	public static final Tile palletTown30 = new Tile("areas/palletTown/107").setSolid();
	public static final Tile palletTown31 = new Tile("areas/palletTown/108");

	public static final Tile palletTown32 = new Tile("areas/palletTown/111").setSolid();
	public static final Tile palletTown33 = new Tile("areas/palletTown/112");
	public static final Tile palletTown34 = new Tile("areas/palletTown/113");
	public static final Tile palletTown35 = new Tile("areas/palletTown/114").setSolid();

	public static final Tile palletTown36 = new Tile("areas/palletTown/123").setSolid();
	public static final Tile palletTown37 = new Tile("areas/palletTown/124").setSolid();
	public static final Tile palletTown38 = new Tile("areas/palletTown/125").setSolid();
	public static final Tile palletTown39 = new Tile("areas/palletTown/126").setSolid();
	public static final Tile palletTown40 = new Tile("areas/palletTown/127");
	public static final Tile palletTown41 = new Tile("areas/palletTown/134");
	
	public static final Tile palletTown42 = new Tile("areas/palletTown/146").setSolid();
	public static final Tile palletTown43 = new Tile("areas/palletTown/147").setSolid();
	public static final Tile palletTown44 = new Tile("areas/palletTown/148");
	public static final Tile palletTown45 = new Tile("areas/palletTown/157").setSolid();
	public static final Tile palletTown46 = new Tile("areas/palletTown/159").setSolid();

	public static final Tile palletTown47 = new Tile("areas/palletTown/166").setSolid();
	public static final Tile palletTown48 = new Tile("areas/palletTown/167").setSolid();
	public static final Tile palletTown49 = new Tile("areas/palletTown/177").setSolid();
	public static final Tile palletTown50 = new Tile("areas/palletTown/179").setSolid();
	
	public static final Tile palletTown51 = new Tile("areas/palletTown/183").setSolid();
	public static final Tile palletTown52 = new Tile("areas/palletTown/184").setSolid();
	public static final Tile palletTown53 = new Tile("areas/palletTown/185").setSolid();
	public static final Tile palletTown54 = new Tile("areas/palletTown/186").setSolid();
	public static final Tile palletTown55 = new Tile("areas/palletTown/187").setSolid();
	public static final Tile palletTown56 = new Tile("areas/palletTown/191").setSolid();
	public static final Tile palletTown57 = new Tile("areas/palletTown/192");
	public static final Tile palletTown58 = new Tile("areas/palletTown/193");
	public static final Tile palletTown59 = new Tile("areas/palletTown/194");
	public static final Tile palletTown60 = new Tile("areas/palletTown/174");
	public static final Tile palletTown61 = new Tile("areas/palletTown/154");

	public static final Tile palletTown62 = new Tile("areas/palletTown/203");
	public static final Tile palletTown63 = new Tile("areas/palletTown/204");
	public static final Tile palletTown64 = new Tile("areas/palletTown/205");
	public static final Tile palletTown65 = new Tile("areas/palletTown/208");
	
	public static final Tile palletTown66 = new Tile("areas/palletTown/217").setSolid();
	public static final Tile palletTown67 = new Tile("areas/palletTown/219").setSolid();

	public static final Tile palletTown68 = new Tile("areas/palletTown/240");
	public static final Tile palletTown69 = new Tile("areas/palletTown/241");
	public static final Tile palletTown70 = new Tile("areas/palletTown/242");
	public static final Tile palletTown71 = new Tile("areas/palletTown/260");
	public static final Tile palletTown72 = new Tile("areas/palletTown/261");
	public static final Tile palletTown73 = new Tile("areas/palletTown/262");
	public static final Tile palletTown74 = new Tile("areas/palletTown/377");
	public static final Tile palletTown75 = new Tile("areas/palletTown/337");
	public static final Tile palletTown76 = new Tile("areas/palletTown/376").setSolid();
	public static final Tile palletTown77 = new Tile("areas/palletTown/336").setSolid();

	public static final Tile palletTown78 = new Tile("areas/palletTown/396");
	public static final Tile palletTown79 = new Tile("areas/palletTown/256");
	
	public static final Tile palletTown80 = new Tile("areas/palletTown/269").setSolid();
	public static final Tile palletTown81 = new Tile("areas/palletTown/270").setSolid();
	public static final Tile palletTown82 = new Tile("areas/palletTown/271").setSolid();
	public static final Tile palletTown83 = new Tile("areas/palletTown/272").setSolid();
	public static final Tile palletTown84 = new Tile("areas/palletTown/273").setSolid();

	public static final Tile palletTown85 = new Tile("areas/palletTown/289").setSolid();
	public static final Tile palletTown86 = new Tile("areas/palletTown/290").setSolid();
	public static final Tile palletTown87 = new Tile("areas/palletTown/291").setSolid();
	public static final Tile palletTown88 = new Tile("areas/palletTown/292").setSolid();
	public static final Tile palletTown89 = new Tile("areas/palletTown/293").setSolid();
	
	public static final Tile palletTown90 = new Tile("areas/palletTown/309").setSolid();
	public static final Tile palletTown91 = new Tile("areas/palletTown/310").setSolid();
	public static final Tile palletTown92 = new Tile("areas/palletTown/311").setSolid();
	public static final Tile palletTown93 = new Tile("areas/palletTown/312").setSolid();
	public static final Tile palletTown94 = new Tile("areas/palletTown/313").setSolid();

	public static final Tile palletTown95 = new Tile("areas/palletTown/329").setSolid();
	public static final Tile palletTown96 = new Tile("areas/palletTown/330").setSolid();
	public static final Tile palletTown97 = new Tile("areas/palletTown/331").setSolid();
	public static final Tile palletTown98 = new Tile("areas/palletTown/332").setSolid();
	public static final Tile palletTown99 = new Tile("areas/palletTown/333");


	public static final Tile palletTown100 = new Tile("areas/palletTown/349").setSolid();
	public static final Tile palletTown101 = new Tile("areas/palletTown/350").setSolid();
	public static final Tile palletTown102 = new Tile("areas/palletTown/351").setSolid();
	public static final Tile palletTown103 = new Tile("areas/palletTown/352").setSolid();
	public static final Tile palletTown104 = new Tile("areas/palletTown/353").setSolid();

	public static final Tile palletTown105 = new Tile("areas/palletTown/369").setSolid();
	public static final Tile palletTown106 = new Tile("areas/palletTown/370").setSolid();
	public static final Tile palletTown107 = new Tile("areas/palletTown/371").setSolid();
	public static final Tile palletTown108 = new Tile("areas/palletTown/372").setSolid();
	public static final Tile palletTown109 = new Tile("areas/palletTown/373").setSolid();
	
	public static final Tile palletTown110 = new Tile("areas/palletTown/389").setSolid();
	public static final Tile palletTown111 = new Tile("areas/palletTown/390").setSolid();
	public static final Tile palletTown112 = new Tile("areas/palletTown/391").setSolid();
	public static final Tile palletTown113 = new Tile("areas/palletTown/392").setSolid();
	public static final Tile palletTown114 = new Tile("areas/palletTown/393").setSolid();

	public static final Tile palletTown115 = new Tile("areas/palletTown/410");
	public static final Tile palletTown116 = new Tile("areas/palletTown/412");
	public static final Tile palletTown117 = new Tile("areas/palletTown/413");
	public static final Tile palletTown118 = new Tile("areas/palletTown/414");
	public static final Tile palletTown119 = new Tile("areas/palletTown/394");
	
	public static final Tile palletTown199 = new Tile("areas/palletTown/422");
	public static final Tile palletTown200 = new Tile("areas/palletTown/430");
	public static final Tile palletTown201 = new Tile("areas/palletTown/438");
	public static final Tile palletTown202 = new Tile("areas/palletTown/442").setSolid();
	public static final Tile palletTown203 = new Tile("areas/palletTown/443").setSolid();
	public static final Tile palletTown204 = new Tile("areas/palletTown/22").setSolid();
	public static final Tile palletTown205 = new Tile("areas/palletTown/23").setSolid();
	
	
	
	
	
	private int id;
	private boolean solid;
	private String texture;
	
	public Tile(String tex) {
		this.solid = false;
		this.id = numOfTiles;
		numOfTiles++;
		this.texture = tex;
		tiles1[id] = this;
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
