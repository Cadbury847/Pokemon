package data;

import java.util.Dictionary;
import java.util.Hashtable;

public class PokemonData {

	public static Dictionary<String, Dictionary<String, Object>> pokemon = new Hashtable<String, Dictionary<String, Object>>();
	
///////////////////////////////////////////////////////////////////0 FORMAT///////////////////////////////////////////////////////////////////////	Pokémon
	
	static String[] secondaryFormat = new String[] {"dexNum","dexEntry","species","height","weight","type","type2","EVYield","catchRate",
			"baseExp","growthRate","gender","baseHp","baseAttack","baseDefence","baseSp.Atk","baseSp.Def","baseSpeed",
			"baseTotal","canEvolve","evolveAt","itemEvolve","evolveItem","tradeEvolve","evolvesInto","possibleMoves","HMMoves","TMMoves", "backTexture", 
			"frontTexture", "shinyBackTexture", "shinyFrontTexture", "dexTexture"};
	
///////////////////////////////////////////////////////////////////1 BULBASAUR///////////////////////////////////////////////////////////////////////	

	static String[][] bulbMoveTable = new String[][] {{"^1", "Growl", "Tackle"}, {"^7", "Leech Seed"}, {"^13", "Vine Whip"}, {"^20", "Poison Powder"},
								{"^27", "Razor Leaf"}, {"^34", "Growth"}, {"^41", "Sleep Powder"}, {"^48", "Solar Beam"}};

	static Object[] bulbInfo1 = new Object[] {1, "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon.",
				"Seed Pokémon",0.7,6.9,"Grass","Poison", new Object[] {1, "Sp.Atk"}, 45, 64, "medium slow", 87.5, 45, 49, 49, 65, 65, 45,
				318, true, 16, false, "null", false,"Ivysaur", bulbMoveTable, new int[] {01}, new int[] {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33 ,34, 44, 50}, 
				"bulbasaurBackTexture.PNG", "bulbasaurFrontTexture.PNG", "bulbasaurShinyBackTexture.PNG", "bulbasaurShinyFrontTexture.PNG",
				"bulbasaurDexTexture.PNG"};

	static Dictionary<String, Object> bulbInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////2 IVYSAUR///////////////////////////////////////////////////////////////////////	
	
	static String[][] ivyMoveTable = new String[][] {{"^1", "Growl", "Leech Seed", "Tackle"}, {"^7", "Leech Seed"}, {"^13", "Vine Whip"}, {"^22", "Poison Powder"},
						{"^30", "Razor Leaf"}, {"^38", "Growth"}, {"^46", "Sleep Powder"}, {"^54", "Solar Beam"}};

	static Object[] ivyInfo1 = new Object[] {2, "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.",
			"Seed Pokémon",1.0,13.0,"Grass","Poison", new Object[] {1, "Sp.Atk", 1, "Sp.Def"}, 45, 141, "medium slow", 87.5, 60, 62, 63, 80, 80,
			60, 405, true, 32, false, "null", false,"Venusaur", ivyMoveTable, new int[] {01}, new int[] {3, 6, 8, 9, 10, 20, 21, 22, 31, 32, 33, 34, 44, 50},
			"ivysaurBackTexture.PNG", "ivysaurFrontTexture.PNG", "ivysaurShinyBackTexture.PNG", "ivysaurShinyFrontTexture.PNG",
			"ivysaurDexTexture.PNG"};
	
	static Dictionary<String, Object> ivyInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////3 VENUSAUR///////////////////////////////////////////////////////////////////////
	
	static String[][] venuMoveTable = new String[][] {{"^1", "Growl", "Leech Seed", "Tackle", "Vine Whip"}, {"^7", "Leech Seed"}, {"^13", "Vine Whip"},
								{"^22", "Poison Powder"}, {"^30", "Razor Leaf"}, {"^43", "Growth"}, {"^55", "Sleep Powder"}, {"^65", "Solar Beam"}};
								
	static Object[] venuInfo1 = new Object[] {3, "The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.",
				"Seed Pokémon",2.0,100.0,"Grass","Poison", new Object[] {2, "Sp.Atk", 1, "Sp.Def"}, 45, 208, "medium slow",87.5,
				80,82,83,100,100,80,525,false,200,false,"null",false,"null",venuMoveTable, new int[] {01}, new int[] {3, 6, 8, 9, 10, 15, 20, 21, 22, 
				31, 32, 33, 34, 44, 50},"venusaurBackTexture.PNG", "venusaurFrontTexture.PNG", "venusaurShinyBackTexture.PNG", 
				"venusaurShinyFrontTexture.PNG", "venusaurDexTexture.PNG"};
	
	static Dictionary<String, Object> venuInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////4 CHARMANDER///////////////////////////////////////////////////////////////////////
	
	static String[][] charmanderMoveTable = new String[][] {{"^1", "Growl", "Scratch"}, {"^9", "Ember"}, {"^15", "Leer"}, {"^22", "Rage"}, {"^30", "Slash"},
								{"^38", "Flamethrower"}, {"^46", "Fire Spin"}};
								
	static Object[] charmanderInfo1 = new Object[] {4,"Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.",
					"Lizard Pokémon",0.6,8.5,"Fire","null", new Object[] {1, "Speed"}, 45, 65, "medium slow",87.5,39,52,43,60,
					50,65,309,true,16,false,"null",false,"Charmeleon",charmanderMoveTable, new int[] {01, 04}, new int[] {1,3,5,6,8,9,10,17,18,19,
					20,23,28,31,32,33,34,38,39,40,44,50},"charmanderBackTexture.PNG", "charmanderFrontTexture.PNG", "charmanderShinyBackTexture.PNG", 
					"charmanderShinyFrontTexture.PNG", "charmanderDexTexture.PNG"};
	
	static Dictionary<String, Object> charmanderInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////5 CHARMELEON///////////////////////////////////////////////////////////////////////
	
	static String[][] charmeleonMoveTable = new String[][] {{"^1", "Ember", "Growl", "Scratch"}, {"^9", "Ember"}, {"^15", "Leer"}, {"^24", "Rage"},
								{"^33", "Slash"}, {"^42", "Flamethrower"}, {"^56", "Fire Spin"}};
								
	static Object[] charmeleonInfo1 = new Object[] {5, "When it swings its burning tail, it elevates the temperature to unbearably high levels.",
				"Flame Pokémon",1.1,19.0,"Fire","null", new Object[] {1, "Sp.Atk", 1, "Speed"},45,142,"medium slow",87.5,
				58,64,58,80,65,80,405,true,36,false,"null",false,"Charizard",charmeleonMoveTable, new int[] {01, 04}, new int[] {1,3,5,6,8,9,10,17,
				18,19,20,23,28,31,32,33,34,38,39,40,44,50},"charmeleonBackTexture.PNG", "charmeleonFrontTexture.PNG", "charmeleonShinyBackTexture.PNG", 
				"charmeleonShinyFrontTexture.PNG", "charmeleonDexTexture.PNG"};
	
	static Dictionary<String, Object> charmeleonInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////6 CHARIZARD///////////////////////////////////////////////////////////////////////	
	
	static String[][] charizardMoveTable = new String[][] {{"^1", "Ember", "Growl", "Leer", "Scratch"}, {"^9", "Ember"}, {"^15", "Leer"},
								{"^24", "Rage"}, {"^36", "Slash"}, {"^46", "Flamethrower"}, {"^55", "Fire Spin"}};
								
	static Object[] charizardInfo1 = new Object[] {6, "Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.",
				"Flame Pokémon",1.7,90.5,"Fire","Flying", new Object[] {3, "Sp.Atk"}, 45, 209, "medium slow", 87.5, 78, 84, 78,
				109, 85, 100, 534, false, 200, false, "null", false,"null", charizardMoveTable, new int[] {01, 04}, new int[] {1,3,5,6,8,9,10,15,17,18,19,20,23,
				26,27,28,31,32,33,34,38,39,40,44,50},"charizardBackTexture.PNG", "charizardFrontTexture.PNG", "charizardShinyBackTexture.PNG", 
				"charizardShinyFrontTexture.PNG", "charizardDexTexture.PNG"};
	
	static Dictionary<String, Object> charizardInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////7 SQUIRTLE///////////////////////////////////////////////////////////////////////	
	
	static String[][] squirtleMoveTable = new String[][] {{"^1", "Tackle", "Tail Whip"}, {"^8", "Bubble"}, {"^15", "Water Gun"}, {"^22", "Bite"},
								{"^28", "Withdraw"}, {"^35", "Skull Bash"}, {"^42", "Hydro Pump"}};
	
	static Object[] squirtleInfo1 = new Object[] {7, "After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.",
					"Tiny Turtle Pokémon",0.5,9.0,"Water","null", new Object[] {1, "Defence"}, 45, 66, "medium slow", 87.5,
					44, 48, 65, 50, 64, 43, 314, true, 16, false, "null", false, "Wartortle",squirtleMoveTable, new int[] {03,04}, new int[] {1,5,6,8,
					9,10,11,12,13,14,17,18,19,20,28,31,32,33,34,40,44,50}, "squirtleBackTexture.PNG", "squirtleFrontTexture.PNG", 
					"squirtleShinyBackTexture.PNG", "squirtleShinyFrontTexture.PNG", "squirtleDexTexture.PNG"};
	
	static Dictionary<String, Object> squirtleInfo2 = new Hashtable<String, Object>();
	
///////////////////////////////////////////////////////////////////8 WARTORTLE///////////////////////////////////////////////////////////////////////	

	static String[][] wartortleMoveTable = new String[][] {{"^1", "Bubble", "Tackle", "Tail Whip"}, {"^8", "Bubble"}, {"^15", "Water Gun"},
								{"^24", "Bite"}, {"^31", "Withdraw"}, {"^39", "Skull Bash"}, {"^47", "Hydro Pump"}};
	
	static Object[] wartortleInfo1 = new Object[] {8, "Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.",
							"Turtle Pokémon",1.0,22.5,"Water","null", new Object[] {1, "Defence", 1, "Sp.Def"}, 45, 143, 
							"medium slow", 87.5, 59, 63, 80, 65, 80, 58, 405, true, 36, false, "null", false,"Blastoise", wartortleMoveTable, 
							new int[] {03,04}, new int[] {1,5,6,8,9,10,11,12,13,14,17,18,19,20,28,31,32,33,34,40,44,50}, "wartortleBackTexture.PNG", 
							"wartortleFrontTexture.PNG", "wartortleShinyBackTexture.PNG", "wartortleShinyFrontTexture.PNG", "wartortleDexTexture.PNG"};
	
	static Dictionary<String, Object> wartortleInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////9 BLASTOISE///////////////////////////////////////////////////////////////////////	

	static String[][] blastoiseMoveTable = new String[][] {{"^1", "Bubble", "Tackle", "Tail Whip", "Water Gun"}, {"^8", "Bubble"}, {"^15", "Water Gun"},
								{"^24", "Bite"}, {"^31", "Withdraw"}, {"^42", "Skull Bash"}, {"^52", "Hydro Pump"}};
	
	static Object[] blastoiseInfo1 = new Object[] {9, "A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles.",
							"Shellfish Pokémon",1.6,85.5,"Water","null", new Object[] {3, "Sp.Def"}, 45, 210, "medium slow",
							87.5, 79, 83, 100, 85, 105, 78, 530, false, 200, false, "null", false, "null",blastoiseMoveTable, new int[] {03, 04},
							new int[] {1,5,6,8,9,10,11,12,13,14,15,17,18,19,20,26,27,28,31,32,33,34,40,44,50}, "blastoiseBackTexture.PNG", 
							"blastoiseFrontTexture.PNG", "blastoiseShinyBackTexture.PNG", "blastoiseShinyFrontTexture.PNG", "blastoiseDexTexture.PNG"};
	
	static Dictionary<String, Object> blastoiseInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////10 CATERPIE///////////////////////////////////////////////////////////////////////	

	static String[][] caterpieMoveTable = new String[][] {{"^1", "String Shot", "Tackle"}};
	
	static Object[] caterpieInfo1 = new Object[] {10,"Its short feet are tipped with suction pads that enable it to tirelessly climb slopes and walls.",
							"Worm Pokémon",0.3,2.9,"Bug","null", new Object[] {1, "HP"}, 255, 53, "medium fast", 50, 45, 30,
							35, 20, 20, 45, 195, true, 7, false, "null", false, "Metapod", caterpieMoveTable, new int[] {}, new int[] {},
							"caterpieBackTexture.PNG", "caterpieFrontTexture.PNG", "caterpieShinyBackTexture.PNG", 
							"caterpieShinyFrontTexture.PNG", "caterpieDexTexture.PNG"};
	
	static Dictionary<String, Object> caterpieInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////11 METAPOD///////////////////////////////////////////////////////////////////////	

	static String[][] metapodMoveTable = new String[][] {{"^1", "Harden"}};
	
	static Object[] metapodInfo1 = new Object[] {11, "This Pokémon is vulnerable to attack while its shell is soft, exposing its weak and tender body.",
							"Cocoon Pokémon",0.7,9.9,"Bug","null", new Object[] {2, "Defence"}, 120, 72, "medium fast", 50, 50, 20,
							55, 25, 25, 30, 205, true, 10, false, "null", false, "Butterfree", metapodMoveTable, new int[] {}, new int[] {}, 
							"metapodBackTexture.PNG", "metapodFrontTexture.PNG", "metapodShinyBackTexture.PNG",
							"metapodShinyFrontTexture.PNG", "metapodDexTexture.PNG"};
	
	static Dictionary<String, Object> metapodInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////12 BUTTERFREE///////////////////////////////////////////////////////////////////////	

	static String[][] butterfreeMoveTable = new String[][] {{"^1", "Confusion"}, {"^12", "Confusion"}, {"^15", "Poison Powder"}, {"^16", "Stun Spore"},
								{"^17", "Sleep Powder"}, {"^21","Supersonic"}, {"^26", "Whirlwind"}, {"^32", "Psybeam"}};
	
	static Object[] butterfreeInfo1 = new Object[] {12, "In battle, it flaps its wings at high speed to release highly toxic dust into the air.",
							"Butterfly Pokémon",1.1,32.0,"Bug","Flying", new Object[] {2, "Sp.Atk",1,"Sp.Def"},
							45, 160, "medium fast", 50, 60, 45, 50, 90, 80, 70, 395, false, 200, false, "null", false, "null", butterfreeMoveTable,
							new int[] {}, new int[] {2,4,6,9,10,15,20,21,22,29,30,31,32,33,34,39,44,46,50}, "butterfreeBackTexture.PNG", 
							"butterfreeFrontTexture.PNG", "butterfreeShinyBackTexture.PNG", 
							"butterfreeShinyFrontTexture.PNG", "butterfreeDexTexture.PNG"};
	
	static Dictionary<String, Object> butterfreeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////13 WEEDLE///////////////////////////////////////////////////////////////////////	

	static String[][] weedleMoveTable = new String[][] {{"^1", "Poison Sting", "String Shot"}};
	
	static Object[] weedleInfo1 = new Object[] {13, "Often found in forests, eating leaves. It has a sharp venomous stinger on its head.", 
						"Hairy Bug Pokémon",0.3,3.2,"Bug","Poison", new Object[] {1,"Speed"},255, 39, "medium fast", 52,
						40, 35, 30, 20, 20, 50, 195, true, 7, false, "null", false, "Kakuna", weedleMoveTable, new int[] {}, new int[] {},
						"weedleBackTexture.PNG", "weedleFrontTexture.PNG", "weedleShinyBackTexture.PNG", "weedleShinyFrontTexture.PNG", 
						"weedleDexTexture.PNG"};
	
	static Dictionary<String, Object> weedleInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////14 KAKUNA///////////////////////////////////////////////////////////////////////	

	static String[][] kakunaMoveTable = new String[][] {{"^1", "Harden"}};
	
	static Object[] kakunaInfo1 = new Object[] {14, "Almost incapable of moving, this Pokémon can only harden its shell to protect itself from predators.",
							"Cocoon Pokémon",0.6,10,"Bug","Poison", new Object[] {2, "Defence"}, 120, 71, "medium fast", 50,
							45, 25, 50, 25, 25, 35, 205, true, 10, false, "null", false, "Beedrill", kakunaMoveTable, new int[] {}, new int[] {}, 
							"kakunaBackTexture.PNG", "kakunaFrontTexture.PNG", "kakunaShinyBackTexture.PNG", "kakunaShinyFrontTexture.PNG", 
							"kakunaDexTexture.PNG"};
	
	static Dictionary<String, Object> kakunaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////15 BEEDRILL///////////////////////////////////////////////////////////////////////	

	static String[][] beedrillMoveTable = new String[][] {{"^1", "Fury Attack"}, {"^12", "Fury Attack"}, {"^16", "Focus Energy"}, {"^20", "Twineedle"},
								{"^25", "Rage"}, {"^30", "Pin Missile"}, {"^35", "Agility"}};
	
	static Object[] beedrillInfo1 = new Object[] {15, "Flies at high speed and attacks using its large venomous stingers on its forelegs and tail.",
							"Poison Bee Pokémon",1.0,29.5,"Bug","Poison", new Object[] {2,"Attack", 1,"Sp.Def"}, 45, 159, "medium fast", 50, 65,
							80, 40, 45, 80, 75, 385, false, 200, false, "null", false,"null", beedrillMoveTable, new int[] {1}, 
							new int[] {3,6,9,10,15,20,21,31,32,33,34,39,40,44,50}, "beedrillBackTexture.PNG", "beedrillFrontTexture.PNG", 
							"beedrillShinyBackTexture.PNG", "beedrillShinyFrontTexture.PNG", "beedrillDexTexture.PNG"};
	
	static Dictionary<String, Object> beedrillInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////16 PIDGEY///////////////////////////////////////////////////////////////////////	

	static String[][] pidgeyMoveTable = new String[][] {{"^1", "Gust"}, {"^5", "Sand Attack"}, {"^12", "Quick Attack"}, {"^19", "Whirlwind"},
							{"^28", "Wing Attack"}, {"^36", "Agility"}, {"^44", "Mirror Move"}};
	
	static Object[] pidgeyInfo1 = new Object[] {16, "A common sight in forests and woods. It flaps its wings at ground level to kick up blinding sand.",
						"Tiny Bird Pokémon",0.2,1.8,"Normal","Flying", new Object[] {1, "Speed"}, 255, 55, "medium slow", 50, 40, 45, 40, 35, 35, 56,
						251, true, 18, false, "null", false, "Pidgeotto", pidgeyMoveTable, new int[] {02}, new int[] {2,4,6,9,10,21,31,32,33,34,39,43,
						44,50},"pidgeyBackTexture.PNG", "pidgeyFrontTexture.PNG", "pidgeyShinyBackTexture.PNG", "pidgeyShinyFrontTexture.PNG", 
						"pidgeyDexTexture.PNG"};
	
	static Dictionary<String, Object> pidgeyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////17 PIDGEOTTO///////////////////////////////////////////////////////////////////////	

	static String[][] pidgeottoMoveTable = new String[][] {{"^1", "Gust", "Sand Attack"}, {"^5", "Sand Attack"}, {"^12", "Quick Attack"}, 
								{"^21", "Whirlwind"}, {"^31", "Wing Attack"}, {"^40", "Agility"}, {"^49", "Mirror Move"}};
	
	static Object[] pidgeottoInfo1 = new Object[] {17, "Very protective of its sprawling territorial area, this POKéMON will fiercely peck at any intruder.",
							"Bird Pokémon",1.1,30.0,"Normal","Flying", new Object[] {2, "Speed"}, 120, 113, "medium slow", 50, 63, 60, 55, 50, 50, 71,
							349, true, 36, false, "null", false, "Pidgeot", pidgeottoMoveTable, new int[] {02}, new int[] {2,4,6,9,10,20,31,32,33,34,
							39,43,44,50},"pidgeottoBackTexture.PNG", "pidgeottoFrontTexture.PNG", "pidgeottoShinyBackTexture.PNG", 
							"pidgeottoShinyFrontTexture.PNG", "pidgeottoDexTexture.PNG"};
	
	static Dictionary<String, Object> pidgeottoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////18 PIDGEOT///////////////////////////////////////////////////////////////////////	

	static String[][] pidgeotMoveTable = new String[][] {{"^1", "Gust", "Quick Attack", "Sand Attack"}, {"^5", "Sand Attack"}, {"^12", "Quick Attack"},
								{"^21", "Whirlwind"}, {"^31", "Wing Attack"}, {"^44", "Agility"}, {"^54", "Mirror Move"}};
	
	static Object[] pidgeotInfo1 = new Object[] {18, "When hunting, it skims the surface of water at high speed to pick off unwary prey such as Magikarp.",
							"Bird Pokémon",1.5,39.5,"Normal","Flying", new Object[] {3, "Speed"}, 45, 172, "medium slow", 50, 83, 80, 75, 70, 70, 91, 
							469, false, 200, false, "null", false, "null",pidgeotMoveTable, new int[] {02}, new int[] {2,4,6,9,10,15,20,31,32,33,34,39,43,44,50},
							"pidgeotBackTexture.PNG", "pidgeotFrontTexture.PNG", "pidgeotShinyBackTexture.PNG", "pidgeotShinyFrontTexture.PNG", 
							"pidgeotDexTexture.PNG"};
	
	static Dictionary<String, Object> pidgeotInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////19 RATTATA///////////////////////////////////////////////////////////////////////	

	static String[][] rattataMoveTable = new String[][] {{"^1", "Tackle", "Tail Whip"}, {"^7", "Quick Attack"}, {"^14", "Hyper Fang"}, 
								{"^23", "Focus Energy"}, {"^34", "Super Fang"}};
	
	static Object[] rattataInfo1 = new Object[] {19, "Bites anything when it attacks. Small and very quick, it is a common sight in many places.",
							"Mouse Pokémon",0.3,3.5, "Normal","null", new Object[] {1, "Speed"}, 255, 57, "medium fast", 50, 30, 56, 35, 25, 35, 72, 253,
							true, 20, false, "null", false, "Raticate",rattataMoveTable, new int[] {}, new int[] {6,8,9,10,11,12,14,20,24,25,28,31,32,34,39,40,
							44, 50}, "rattataBackTexture.PNG", "rattataFrontTexture.PNG", "rattataShinyBackTexture.PNG", "rattataShinyFrontTexture.PNG", 
							"rattataDexTexture.PNG"};
	
	static Dictionary<String, Object> rattataInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////20 RATICATE///////////////////////////////////////////////////////////////////////	

	static String[][] raticateMoveTable = new String[][] {{"^1", "Quick Attack", "Tackle", "Tail Whip"}, {"^7", "Quick Attack"}, {"^14", "Hyper Fang"},
								{"^27", "Focus Energy"}, {"^41", "Super Fang"}};
	
	static Object[] raticateInfo1 = new Object[] {20, "It uses its whiskers to maintain its balance. It apparently slows down if they are cut off.", 
							"Mouse Pokémon",0.7,18.5,"Normal","null", new Object[] {2, "Speed"}, 90, 116, "medium fast", 50, 55, 81, 60, 50, 70, 91, 413,
							false, 200, false, "null", false, "null", raticateMoveTable, new int[] {}, new int[] {6,8,9,10,11,12,13,14,15,20,24,28,31,32,34,39,
							40,44,50}, "raticateBackTexture.PNG", "raticateFrontTexture.PNG", "raticateShinyBackTexture.PNG", "raticateShinyFrontTexture.PNG", 
							"raticateDexTexture.PNG"};
	
	static Dictionary<String, Object> raticateInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////21 SPEAROW///////////////////////////////////////////////////////////////////////	

	static String[][] spearowMoveTable = new String[][] {{"^1", "Growl", "Peck"},{"^9","Leer"}, {"^15", "Fury Attack"}, {"^22", "Mirror Move"},
								{"^29", "Drill Peck"}, {"^36", "Agility"}};
	
	static Object[] spearowInfo1 = new Object[] {21, "Eats bugs in grassy areas. It has to flap its short wings at high speed to stay airborne.",
							"Tiny Bird Pokémon",0.3,2.0,"Normal","Flying", new Object[] {1, "Speed"}, 255, 58, "medium fast", 50, 40, 60, 30, 31, 31,
							70, 262, true, 20, false, "null", false, "Fearow",spearowMoveTable, new int[] {02}, new int[] {2,4,6,9,10,20,31,32,34,39,43,44,50}, 
							"spearowBackTexture.PNG", "spearowFrontTexture.PNG", "spearowShinyBackTexture.PNG", "spearowShinyFrontTexture.PNG", 
							"spearowDexTexture.PNG"};
	
	static Dictionary<String, Object> spearowInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////22 FEAROW///////////////////////////////////////////////////////////////////////	

	static String[][] fearowMoveTable = new String[][] {{"^1", "Growl", "Leer", "Peck"}, {"^9", "Leer"}, {"^15", "Fury Attack"}, {"^25", "Mirror Move"},
								{"^34", "Drill Peck"}, {"^43", "Agility"}};
	
	static Object[] fearowInfo1 = new Object[] {22, "With its huge and magnificent wings, it can keep aloft without ever having to land for rest.",
							"Beak Pokémon", 1.2, 38.0, "Normal", "Flying", new Object[] {2, "Speed"}, 90, 162, "medium fast", 50, 65, 90, 65, 61, 61,
							100, 442, false, 200, false, "null", false, "null",fearowMoveTable, new int[] {02}, new int[] {2,4,6,9,10,15,20,31,32,34,39,43,44,50},
							"fearowBackTexture.PNG", "fearowFrontTexture.PNG", "fearowShinyBackTexture.PNG", "fearowShinyFrontTexture.PNG", 
							"fearowDexTexture.PNG"};
	
	static Dictionary<String, Object> fearowInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////23 EKANS///////////////////////////////////////////////////////////////////////	

	static String[][] ekansMoveTable = new String[][] {{"^1", "Leer", "Wrap"}, {"^10", "Poison Sting"}, {"^17", "Bite"}, {"^24", "Glare"}, {"^31", 
								"Screech"}, {"^38", "Acid"}};
	
	static Object[] ekansInfo1 = new Object[] {23, "Moves silently and stealthily. Eats the eggs of birds, such as Pidgey and Spearow, whole.",
							"Snake Pokémon",2.0,6.9,"Poison","null", new Object[] {1, "Attack"}, 255, 62, "medium fast", 50, 35, 60, 44, 40, 54, 55,
							288, true, 22, false, "null", false, "Arbok",ekansMoveTable, new int[] {04}, new int[] {6, 8, 9, 10, 20, 21, 26, 27, 28, 31, 32, 34,
							40, 44, 48, 50}, "ekansBackTexture.PNG", "ekansFrontTexture.PNG", "ekansShinyBackTexture.PNG", "ekansShinyFrontTexture.PNG", 
							"ekansDexTexture.PNG"};
	
	static Dictionary<String, Object> ekansInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////24 ARBOK///////////////////////////////////////////////////////////////////////

	static String[][] arbokMoveTable = new String[][] {{"^1", "Leer", "Poison Sting", "Wrap"}, {"^10", "Poison Sting"}, {"^17", "Bite"}, {"^27", 
								"Glare"}, {"^36", "Screech"}, {"^47", "Acid"}};
	
	static Object[] arbokInfo1 = new Object[] {24, "It is rumored that the ferocious warning markings on its belly differ from area to area.",
						"Cobra Pokémon",3.5,65.0,"Poison","null", new Object[] {2, "Attack"}, 90, 147, "medium fast", 50, 60, 85, 69, 65, 79, 80,
						438, false, 200, false, "null", false, "null",arbokMoveTable, new int[] {04}, new int[] {6,8,9,10,15,20,21,26,27,28,31,32,34,40,44,48,50},
						"arbokBackTexture.PNG", "arbokFrontTexture.PNG", "arbokShinyBackTexture.PNG", "arbokShinyFrontTexture.PNG", 
						"arbokDexTexture.PNG"};
	
	static Dictionary<String, Object> arbokInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////25 PIKACHU///////////////////////////////////////////////////////////////////////	

	static String[][] pikachuMoveTable = new String[][] {{"^1", "Growl", "Thunder Shock"}, {"^9", "Thunder Wave"}, {"^16", "Quick Attack"}, {"^26", 
								"Swift"}, {"^33", "Agility"}, {"^43", "Thunder"}};
	
	static Object[] pikachuInfo1 = new Object[] {25, "When several of these Pokémon gather, their electricity could build and cause lightning storms.",
							"Mouse Pokémon", 0.4, 6.0, "Electric","null", new Object[] {2, "Speed"}, 190, 82, "medium fast", 50, 35, 55, 30, 50, 50, 90,
							310, true, 200, true, "Thunder Stone", false,"Raichu", pikachuMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,16,17,19,20,24,25,31,
							32,33,34,39,40,44,45,50}, "pikachuBackTexture.PNG", "pikachuFrontTexture.PNG", "pikachuShinyBackTexture.PNG", 
							"pikachuShinyFrontTexture.PNG", "pikachuDexTexture.PNG"};
	
	static Dictionary<String, Object> pikachuInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////26 RAICHU///////////////////////////////////////////////////////////////////////	

	static String[][] raichuMoveTable = new String[][] {{"^1", "Growl", "Thunder Shock", "Thunder Wave"}};
	
	static Object[] raichuInfo1 = new Object[] {26, "Its long tail serves as a ground to protect itself from its own high voltage power.",
							"Mouse Pokémon", 0.8, 30.0, "Electric", "null", new Object[] {3, "Speed"}, 75, 122, "medium fast", 50, 60, 90, 55, 90, 80, 100,
							475, false, 200, false, "null", false,"null", raichuMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,15,16,17,19,20,24,25,31,
							32,33,34,39,40,44,45,50}, "raichuBackTexture.PNG", "raichuFrontTexture.PNG", "raichuShinyBackTexture.PNG", 
							"raichuShinyFrontTexture.PNG", "raichuDexTexture.PNG"};
	
	static Dictionary<String, Object> raichuInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////27 SANDSHREW///////////////////////////////////////////////////////////////////////	
	
	static String[][] sandshrewMoveTable = new String[][] {{"^1", "Scratch"}, {"^10", "Sand Attack"}, {"^17", "Slash"}, {"^24", "Poison Sting"},
									{"^31", "Swift"}, {"^38", "Fury Swipes"}};
	
	static Object[] sandshrewInfo1 = new Object[] {27, "Burrows deep underground in arid locations far from water. It only emerges to hunt for food.",
								"Mouse Pokémon", 0.5, 12.0, "Ground", "null", new Object[] {1, "Defence"}, 255, 93, "medium fast", 50, 50, 75, 85, 20, 30,
								40, 300, true, 22, false, "null", false,"Sandslash", sandshrewMoveTable, new int[] {01, 04}, new int[] {3,6,8,9,10,17,19,20,26,27,28,
								31,32,34,39,40,44,48,50}, "sandshrewBackTexture.PNG", "sandshrewFrontTexture.PNG", "sandshrewShinyBackTexture.PNG", 
								"sandshrewShinyFrontTexture.PNG", "sandshrewDexTexture.PNG"};
	
	static Dictionary<String, Object> sandshrewInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////28 SANDSLASH///////////////////////////////////////////////////////////////////////	

	static String[][] sandslashMoveTable = new String[][] {{"^1", "Sand Attack", "Scratch"}, {"^10", "Sand Attack"}, {"^17", "Slash"}, {"^27", 
									"Poison Sting"}, {"^36", "Swift"}, {"^47", "Fury Swipes"}};
	
	static Object[] sandslashInfo1 = new Object[] {28, "Curls up into a spiny ball when threatened. It can roll while curled up to attack or escape.",
							"Mouse Pokémon",1.0,29.5, "Ground", "null", new Object[] {2, "Defence"}, 90, 163, "medium fast", 50, 75, 100, 110, 45, 55, 
							65, 450, false, 200, false, "null", false, "null",sandslashMoveTable, new int[] {01,04}, new int[] {3,6,8,9,10,15,17,19,20,26,27,28,
							31,32,34,39,40,44,48,50}, "sandslashBackTexture.PNG", "sandslashFrontTexture.PNG", "sandslashShinyBackTexture.PNG", 
							"sandslashShinyFrontTexture.PNG", "sandslashDexTexture.PNG"};
	
	static Dictionary<String, Object> sandslashInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////29 NIDORAN(F)///////////////////////////////////////////////////////////////////////	

	static String[][] nidoranfMoveTable = new String[][] {{"^1", "Growl", "Tackle"}, {"^8", "Scratch"}, {"^14", "Poison Sting"}, {"^21", "Tail Whip"},
									{"^29", "Bite"}, {"^36", "Fury Swipes"}, {"^43", "Double Kick"}};
	
	static Object[] nidoranfInfo1 = new Object[] {29, "Although small, its venomous barbs render this Pokémon dangerous. The female has smaller horns.",
							"Poison Pin Pokémon",0.4,7.0, "Poison","null", new Object[] {1, "HP"}, 235, 59, "medium slow", 0, 55, 47, 52, 40, 40, 41,
							275, true, 16, false, "null", false,"Nidorina", nidoranfMoveTable, new int[] {}, new int[] {6,8,9,10,14,20,24,25,31,32,33,34,40,44,50},
							"nidoranfBackTexture.PNG", "nidoranfFrontTexture.PNG", "nidoranfShinyBackTexture.PNG", 
							"nidoranfShinyFrontTexture.PNG", "nidoranfDexTexture.PNG"};
	
	static Dictionary<String, Object> nidoranfInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////30 NIDORINA///////////////////////////////////////////////////////////////////////	

	static String[][] nidorinaMoveTable = new String[][] {{"^1", "Growl", "Scratch", "Tackle"}, {"^8", "Scratch"}, {"^14", "Poison Sting"},
									{"^23", "Tail Whip"}, {"^32", "Bite"}, {"^41", "Fury Swipes"}, {"^50", "Double Kick"}};
	
	static Object[] nidorinaInfo1 = new Object[] {30, "The female’s horn develops slowly. Prefers physical attacks such as clawing and biting.",
							"Poison Pin Pokémon", 0.8, 20.0, "Poison", "null", new Object[] {2, "HP"}, 120, 117, "medium slow", 0, 70, 62, 67,
							55, 55, 56, 365, true, 200, true, "Moon Stone", false, "Nidoqueen",nidorinaMoveTable, new int[] {}, new int [] {6,7,8,9,10,11,12,
							13,14,20,24,25,31,32,33,34,40,44,50}, "nidorinaBackTexture.PNG", "nidorinaFrontTexture.PNG", "nidorinaShinyBackTexture.PNG", 
							"nidorinaShinyFrontTexture.PNG", "nidorinaDexTexture.PNG"};
	
	static Dictionary<String, Object> nidorinaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////31 NIDOQUEEN///////////////////////////////////////////////////////////////////////	

	static String[][] nidoqueenMoveTable = new String[][] {{"^1", "Body Slam", "Scratch", "Tackle", "Tail Whip"}, {"^8", "Scratch"}, {"^14", 
									"Poison Sting"}, {"^23", "Body Slam"}};
	
	static Object[] nidoqueenInfo1 = new Object[] {31, "Its hard scales provide strong protection. It uses its hefty bulk to execute powerful moves.",
								"Drill Pokémon",1.3,60.0,"Poison","Ground", new Object[] {3, "HP"}, 45, 194, "medium slow", 0, 90, 82, 87, 75, 85, 76,
								495, false, 200, false, "null", false,"null", nidoqueenMoveTable, new int[] {03,04}, new int[] {1,5,6,7,8,9,10,11,12,13,14,15,
								16,17,18,19,20,24,25,26,27,31,32,33,34,38,40,44,48,50}, "nidoqueenBackTexture.PNG", "nidoqueenFrontTexture.PNG", 
								"nidoqueenShinyBackTexture.PNG", "nidoqueenShinyFrontTexture.PNG", "nidoqueenDexTexture.PNG"};
	
	static Dictionary<String, Object> nidoqueenInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////32 NIDORAN(M)///////////////////////////////////////////////////////////////////////	

	static String[][] nidoranmMoveTable = new String[][] {{"^1", "Leer", "Tackle"}, {"^8", "Horn Attack"}, {"^14", "Poison Sting"}, {"^21", 
									"Focus Energy"}, {"^29", "Fury Attack"}, {"^36", "Horn Drill"}, {"^43", "Double Kick"}};
	
	static Object[] nidoranmInfo1 = new Object[] {32, "Stiffens its ears to sense danger. The larger its horns, the more powerful its secreted venom.",
							"Poison Pin Pokémon", 0.5, 9.0, "Poison", "null", new Object[] {1,"Attack"}, 235, 60, "medium slow",100, 46, 57, 40,
							40, 40, 50, 273, true, 16, false, "null", false,"Nidorino", nidoranmMoveTable, new int[] {}, new int[] {6,7,8,9,10,14,20,24,25,31,32,
							33,34,40,44,50}, "nidoranmBackTexture.PNG", "nidoranmFrontTexture.PNG", "nidoranmShinyBackTexture.PNG", 
							"nidoranmShinyFrontTexture.PNG", "nidoranmDexTexture.PNG"};
	
	static Dictionary<String, Object> nidoranmInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////33 NIDORINO///////////////////////////////////////////////////////////////////////	

	static String[][] nidorinoMoveTable = new String[][] {{"^1", "Horn Attack", "Leer", "Tackle"}, {"^8", "Horn Attack"}, {"^14", "Poison Sting"},
									{"^23", "Focus Energy"}, {"^32", "Fury Attack"}, {"^41", "Horn Drill"}, {"^50", "Double Kick"}};
	
	static Object[] nidorinoInfo1 = new Object[] {33, "An aggressive Pokémon that is quick to attack. The horn on its head secretes a powerful venom.",
							"Poison Pin Pokémon",0.9,19.5, "Poison", "null", new Object[] {2,"Attack"}, 120, 118, "medium slow", 100, 61, 72, 57, 55,
							55, 65, 365, true, 200, true, "Moon Stone", false,"Nidoking", nidorinoMoveTable, new int[] {}, new int[] {6,7,8,9,10,11,12,13,14,20,
							24,25,31,32,33,34,40,44,50}, "nidorinoBackTexture.PNG", "nidorinoFrontTexture.PNG", "nidorinoShinyBackTexture.PNG", 
							"nidorinoShinyFrontTexture.PNG", "nidorinoDexTexture.PNG"};
	
	static Dictionary<String, Object> nidorinoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////34 NIDOKING///////////////////////////////////////////////////////////////////////	

	static String[][] nidokingMoveTable = new String[][] {{"^1", "Horn Attack", "Poison Sting", "Tackle", "Thrash"}, {"^8", "Horn Attack"},
									{"^14", "Poison Sting"},{"^23", "Thrash"}};
	
	static Object[] nidokingInfo1 = new Object[] {34, "It uses its powerful tail in battle to smash, constrict, then break the prey’s bones.",
							"Drill Pokémon", 1.4, 62.0, "Poison","Ground", new Object[] {3,"Attack"}, 45, 195, "medium slow", 100, 81, 92, 77, 85,
							75, 85, 495, false, 200, false, "null", false,"null", nidokingMoveTable, new int[] {03,04}, new int[] {1,5,6,7,8,9,10,11,12,13,
							14,15,16,17,18,19,20,24,25,26,27,31,32,33,34,38,40,44,48,50}, "nidokingBackTexture.PNG", "nidokingFrontTexture.PNG", 
							"nidokingShinyBackTexture.PNG", "nidokingShinyFrontTexture.PNG", "nidokingDexTexture.PNG"};
	
	static Dictionary<String, Object> nidokingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////35 CLEFAIRY///////////////////////////////////////////////////////////////////////	

	static String[][] clefairyMoveTable = new String[][] {{"^1", "Growl", "Pound"}, {"^13", "Sing"}, {"^18", "Double Slap"}, {"^24", "Minimize"},
									{"^31", "Metronme"}, {"^39", "Defence Curl"}, {"^48", "Light Screen"}};
	
	static Object[] clefairyInfo1 = new Object[] {35, "Its magical and cute appeal has many admirers. It is rare and found only in certain areas.",
							"Fairy Pokémon",0.6,7.5,"Normal","null", new Object[] {2,"HP"}, 150, 68, "fast", 25, 70, 45, 48, 60, 65, 35, 323, true,
							200, true, "Moon Stone", false,"Clefable", clefairyMoveTable, new int[] {04, 05}, new int[] {1,5,6,8,9,10,11,12,13,14,17,18,19,
							20,22,24,25,29,30,31,32,33,34,35,38,40,44,45,46,49,50}, "clefairyBackTexture.PNG", "clefairyFrontTexture.PNG", 
							"clefairyShinyBackTexture.PNG", "clefairyShinyFrontTexture.PNG", "clefairyDexTexture.PNG"};
	
	static Dictionary<String, Object> clefairyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////36 CLEFABLE///////////////////////////////////////////////////////////////////////	

	static String[][] clefableMoveTable = new String[][] {{"^1", "Double Slap", "Metronome", "Minimize", "Sing"}};
	
	static Object[] clefableInfo1 = new Object[] {36, "A timid fairy Pokémon that is rarely seen. It will run and hide the moment it senses people.",
							"Fairy Pokémon", 1.3, 40.0, "Normal", "null", new Object[] {3, "HP"}, 25, 129, "fast", 25, 95, 70, 73, 95, 90, 60, 483,
							false, 200, false, "null", false, "null",clefableMoveTable, new int[] {04,05}, new int[] {1,5,6,8,9,10,11,12,13,14,15,17,18,
							19,20,22,24,25,29,30,31,32,33,34,35,38,40,44,45,46,49,50}, "clefableBackTexture.PNG", "clefableFrontTexture.PNG", 
							"clefableShinyBackTexture.PNG", "clefableShinyFrontTexture.PNG", "clefableDexTexture.PNG"};
	
	static Dictionary<String, Object> clefableInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////37 VULPIX///////////////////////////////////////////////////////////////////////	

	static String[][] vulpixMoveTable = new String[][] {{"^1", "Ember", "Tail Whip"}, {"^16", "Quick Attack"}, {"^21", "Roar"}, {"^28", "Confuse Ray"},
								{"^35", "Flamethrower"}, {"^42", "Fire Spin"}};
	
	static Object[] vulpixInfo1 = new Object[] {37, "At the time of birth, it has just one tail. The tail splits from its tip as it grows older.",
							"Fox Pokémon",0.6, 9.9, "Fire", "null", new Object[] {1, "Speed"}, 190, 63, "medium fast", 25, 38, 41, 40, 50, 65, 65, 299,
							true, 200, true, "Fire Stone", false, "Ninetales",vulpixMoveTable, new int[] {}, new int[] {6,8,9,10,20,28,31,32,33,34,38,39,40,44,50},
							"vulpixBackTexture.PNG", "vulpixFrontTexture.PNG", "vulpixShinyBackTexture.PNG", "vulpixShinyFrontTexture.PNG",
							"vulpixDexTexture.PNG"};
	
	static Dictionary<String, Object> vulpixInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////38 NINETALES///////////////////////////////////////////////////////////////////////	

	static String[][] ninetalesMoveTable = new String[][] {{"^1", "Ember", "Quick Attack", "Roar", "Tail Whip"}};
	
	static Object[] ninetalesInfo1 = new Object[] {38, "Very smart and very vengeful. Grabbing one of its many tails could result in a 1000-year curse.",
							"Fox Pokémon",1.1,19.9,"Fire","null", new Object[] {1,"Sp.Def", 1, "Speed"}, 75, 178, "medium fast", 25, 73, 76, 75, 81,
							100, 100, 505, false, 200, false, "null", false,"null", ninetalesMoveTable, new int[] {}, new int[] {6,8,9,10,15,20,28,31,
							32,33,34,38,39,40,44,50},"ninetalesBackTexture.PNG", "ninetalesFrontTexture.PNG", "ninetalesShinyBackTexture.PNG", 
							"ninetalesShinyFrontTexture.PNG","ninetalesDexTexture.PNG"};
	
	static Dictionary<String, Object> ninetalesInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////39 JIGGLYPUFF///////////////////////////////////////////////////////////////////////	
	
	static String[][] jigglypuffMoveTable = new String[][] {{"^1", "Sing"}, {"^9", "Pound"}, {"^14", "Disable"}, {"^19", "Defence Curl"}, {"^24", 
									"Double Slap"}, {"^29", "Rest"}, {"^34", "Body Slam"}, {"^39", "Double-Edge"}};
	
	static Object[] jigglypuffInfo1 = new Object[] {39, "When its huge eyes light up, it sings a mysteriously soothing melody that lulls its enemies to sleep.",
								"Balloon Pokémon", 0.5, 5.5, "Normal", "null", new Object[] {2, "HP"}, 170, 76, "fast", 25, 115, 45, 20, 45, 25, 20, 270,
								true, 200, true, "Moon Stone", false, "Wigglytuff", jigglypuffMoveTable, new int[] {04, 05}, new int[] {1,5,6,8,9,10,11,12,
								13,14,17,18,19,20,22,24,25,29,30,31,32,33,34,38,40,44,45,46,49,50}, "jigglypuffBackTexture.PNG", 
								"jigglypuffFrontTexture.PNG", "jigglypuffShinyBackTexture.PNG", 
								"jigglypuffShinyFrontTexture.PNG","jigglypuffDexTexture.PNG"};
	
	static Dictionary<String, Object> jigglypuffInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////40 WIGGLYTUFF///////////////////////////////////////////////////////////////////////	
	
	static String[][] wigglytuffMoveTable = new String[][] {{"^1", "Defence Curl", "Disable", "Double Slap", "Sing"}};
	
	static Object[] wigglytuffInfo1 = new Object[] {40, "The body is soft and rubbery. When angered, it will suck in air and inflate itself to an enormous size.",
								"Balloon Pokémon",1.0,12.0, "Normal", "null", new Object[] {3,"HP"}, 50, 109, "fast", 25, 140, 70, 45, 85, 50, 45, 435,
								false, 200, false, "null", false, "null", wigglytuffMoveTable, new int[] {04, 05}, new int[] {1,5,6,8,9,10,11,12,13,14,
								15,17,18,19,20,22,24,25,29,30,31,32,33,34,38,40,44,45,46,49,50}, "wigglytuffBackTexture.PNG", 
								"wigglytuffFrontTexture.PNG", "wigglytuffShinyBackTexture.PNG", 
								"wigglytuffShinyFrontTexture.PNG","wigglytuffDexTexture.PNG"};
	
	static Dictionary<String, Object> wigglytuffInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////41 ZUBAT///////////////////////////////////////////////////////////////////////	

	static String[][] zubatMoveTable = new String[][] {{"^1", "Leech Life"}, {"^10", "Supersonic"}, {"^15", "Bite"}, {"^21", "Confuse Ray"},
									{"^28", "Wing Attack"}, {"^36", "Haze"}};
	
	static Object[] zubatInfo1 = new Object[] {41, "Forms colonies in perpetually dark places. Uses ultrasonic waves to identify and approach targets.",
							"Bat Pokémon",0.8,7.5, "Poison", "Flying", new Object[] {1, "Speed"}, 255, 54, "medium fast", 50, 40, 45, 35, 30, 40, 55,
							245, true, 22, false, "null", false, "Golbat", zubatMoveTable, new int[] {}, new int[] {2,4,6,9,10,20,21,31,32,34,39,44,50},
							"zubatBackTexture.PNG", "zubatFrontTexture.PNG", "zubatShinyBackTexture.PNG", 
							"zubatShinyFrontTexture.PNG","zubatDexTexture.PNG"};
	
	static Dictionary<String, Object> zubatInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////42 GOLBAT///////////////////////////////////////////////////////////////////////	

	static String[][] golbatMoveTable = new String[][] {{"^1", "Bite", "Leech Life", "Screech"}, {"^10", "Supersonic"}, {"^15", "Bite"}, {"^21", 
									"Confuse Ray"}, {"^32", "Wing Attack"}, {"^43", "Haze"}};
	
	static Object[] golbatInfo1 = new Object[] {42, "Once it strikes, it will not stop draining energy from the victim even if it gets too heavy to fly.",
							"Bat Pokémon",1.6,55.0,"Poison","Flying", new Object[] {2, "Speed"}, 90, 171, "medium fast", 50, 75, 80, 70, 65, 75, 90, 455,
							false, 200, false, "null", false, "null", golbatMoveTable, new int[] {}, new int[] {2,4,6,9,10,15,20,21,31,32,34,39,44,50},
							"golbatBackTexture.PNG", "golbatFrontTexture.PNG", "golbatShinyBackTexture.PNG", 
							"golbatShinyFrontTexture.PNG","golbatDexTexture.PNG"};
	
	static Dictionary<String, Object> golbatInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////43 ODDISH///////////////////////////////////////////////////////////////////////	

	static String[][] oddishMoveTable = new String[][] {{"^1", "Absorb"}, {"^15", "Poison Powder"}, {"^17", "Stun Spore"}, {"^19", "Sleep Powder"},
								{"^24", "Acid"}, {"^33", "Petal Dance"}, {"^46", "Solar Beam"}};
	
	static Object[] oddishInfo1 = new Object[] {43, "During the day, it keeps its face buried in the ground. At night, it wanders around sowing its seeds.",
						"Weed Pokémon",0.5,5.4,"Grass","Poison", new Object[] {1,"Sp.Atk"}, 255, 78, "medium slow", 50, 45, 50, 55, 75, 65, 30, 320, true,
						21, false, "null", false, "Gloom", oddishMoveTable, new int[] {01}, new int[] {3,6,9,10,20,21,22,31,32,33,34,44,50},
						"oddishBackTexture.PNG", "oddishFrontTexture.PNG", "oddishShinyBackTexture.PNG", 
						"oddishShinyFrontTexture.PNG","oddishDexTexture.PNG"};
	
	static Dictionary<String, Object> oddishInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////44 GLOOM///////////////////////////////////////////////////////////////////////	

	static String[][] gloomMoveTable = new String[][] {{"^1", "Absorb", "Poison Powder", "Stun Spore"}, {"^15", "Poison Powder"}, {"^17", "Stun Spore"},
										{"^19", "Sleep Powder"}, {"^28", "Acid"}, {"^38", "Petal Dance"}, {"^52", "Solar Beam"}};
	
	static Object[] gloomInfo1 = new Object[] {44, "The fluid that oozes from its mouth isn’t drool. It is a nectar that is used to attract prey.",
						"Weed Pokémon", 0.8, 8.6, "Grass", "Poison", new Object[] {2, "Sp.Atk"}, 120, 132, "medium slow", 50, 60, 65, 70, 85, 75, 40,
						395, true, 200, true, "Leaf Stone", false, "VilePlume", gloomMoveTable, new int[] {01}, new int[] {3,6,9,10,20,21,22,31,32,33,34,
						44,50}, "gloomBackTexture.PNG", "gloomFrontTexture.PNG", "gloomShinyBackTexture.PNG", 
						"gloomShinyFrontTexture.PNG","gloomDexTexture.PNG"};
	
	static Dictionary<String, Object> gloomInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////45 VILEPLUME///////////////////////////////////////////////////////////////////////	

	static String[][] vileplumeMoveTable = new String[][] {{"^1", "Acid", "Petal Dance", "Sleep Powder", "Stun Spore"}, {"^15", "Poison Powder"},
											{"^17", "Stun Spore"}, {"^19", "Sleep Powder"}};
	
	static Object[] vileplumeInfo1 = new Object[] {45, "The larger its petals, the more toxic pollen it contains. Its big head is heavy and hard to hold up.",
							"Flower Pokémon",1.2,18.6,"Grass","Poison", new Object[] {3,"Sp.Atk"}, 45, 184, "medium slow", 50, 75, 80, 85, 110, 90, 50,
							490, false, 200, false, "null", false, "null", vileplumeMoveTable, new int[] {01}, new int[] {3,6,8,9,10,15,20,21,22,31,32,
							33,34,44,50}, "vileplumeBackTexture.PNG", "vileplumeFrontTexture.PNG", "vileplumeShinyBackTexture.PNG", 
							"vileplumeShinyFrontTexture.PNG","vileplumeDexTexture.PNG"};
	
	static Dictionary<String, Object> vileplumeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////46 PARAS///////////////////////////////////////////////////////////////////////	

	static String[][] parasMoveTable = new String[][] {{"^1", "Scratch"}, {"^13", "Stun Spore"}, {"^20", "Leech Life"}, {"^27", "Spore"},
											{"^34", "Slash"}, {"^41", "Growth"}};
	
	static Object[] parasInfo1 = new Object[] {46, "Burrows to suck tree roots. The mushrooms on its back grow by drawing nutrients from the bug host.",
							"Mushroom Pokémon", 0.3, 5.4, "Bug", "Grass", new Object[] {1, "Attack"}, 190, 70, "medium fast", 50, 35, 70, 55, 45, 55, 25,
							285, true, 24, false, "null", false, "Parasect", parasMoveTable, new int[] {01}, new int[] {3,6,8,9,10,20,21,22,28,31,32,33,
							34,40,44,50}, "parasBackTexture.PNG", "parasFrontTexture.PNG", "parasShinyBackTexture.PNG", 
							"parasShinyFrontTexture.PNG","parasDexTexture.PNG"};
	
	static Dictionary<String, Object> parasInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////47 PARASECT///////////////////////////////////////////////////////////////////////	

	static String[][] parasectMoveTable = new String[][] {{"^1", "Leech Life", "Scratch", "Stun Spore"}, {"^13", "Stun Spore"}, {"^20", "Leech Life"},
											{"^30", "Spore"}, {"^39", "Slash"}, {"^48", "Growth"}};
	
	static Object[] parasectInfo1 = new Object[] {47, "A host-parasite pair in which the parasite mushroom has taken over the host bug. Prefers damp places.",
					"Mushroom Pokémon",1.0,29.5,"Bug","Grass", new Object[] {2,"Attack", 1,"Defence"}, 75, 128, "medium fast", 50, 60, 95, 80, 60,
					80, 30, 405, false, 200, false, "null", false, "null", parasectMoveTable, new int[] {01}, new int[] {3,6,8,9,10,15,20,21,22,28,31,
					32,33,34,40,44,50}, "parasectBackTexture.PNG", "parasectFrontTexture.PNG", "parasectShinyBackTexture.PNG", 
					"parasectShinyFrontTexture.PNG","parasectDexTexture.PNG"};
	
	static Dictionary<String, Object> parasectInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////48 VENONAT///////////////////////////////////////////////////////////////////////	

	static String[][] venonatMoveTable = new String[][] {{"^1", "Disable", "Tackle"}, {"^24", "Poison Powder"}, {"^27", "Leech Life"}, {"^30", 
											"Stun Spore"}, {"^35", "Psybeam"}, {"^38", "Sleep Powder"}, {"^43", "Psycic"}};
	
	static Object[] venonatInfo1 = new Object[] {48, "Lives in the shadows of tall trees where it eats insects. It is attracted by light at night.",
						"Insect Pokémon", 1.0, 30.0, "Bug","Poison", new Object[] {1, "Sp.Def"}, 190, 75, "medium fast", 50, 60, 55, 50, 40, 55, 45,
						305, true, 31, false, "null", false, "Venomoth", venonatMoveTable, new int[] {}, new int[] {6,9,10,20,21,22,29,31,32,33,34,
						44,46,50}, "venonatBackTexture.PNG", "venonatFrontTexture.PNG", "venonatShinyBackTexture.PNG", 
						"venonatShinyFrontTexture.PNG","venonatDexTexture.PNG"};
	
	static Dictionary<String, Object> venonatInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////49 VENOMOTH///////////////////////////////////////////////////////////////////////	

	static String[][] venomothMoveTable = new String[][] {{"^1", "Disable", "Leech Life", "Poison Powder", "Tackle"}, {"^24", "Poison Powder"},
										{"^27", "Leech Life"}, {"^30", "Stun Spore"}, {"^38", "Psybeam"}, {"^43", "Sleep Powder"}, {"^50", "Psychic"}};
	
	static Object[] venomothInfo1 = new Object[] {49, "The dust-like scales covering its wings are color coded to indicate the kinds of poison it has.",
						"Poison Moth Pokémon", 1.5, 12.5, "Bug","Poison", new Object[] {1,"Sp.Atk", 1, "Speed"}, 75, 138, "medium fast", 50, 70, 65,
						60, 90, 75, 90, 450, false, 200, false, "null", false, "null", venomothMoveTable, new int[] {}, new int[] {2,4,6,9,10,15,20,
						21,22,29,30,31,32,33,34,39,44,46,50}, "venomothBackTexture.PNG", "venomothFrontTexture.PNG", "venomothShinyBackTexture.PNG", 
						"venomothShinyFrontTexture.PNG","venomothDexTexture.PNG"};
	
	static Dictionary<String, Object> venomothInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////50 DIGLETT///////////////////////////////////////////////////////////////////////	

	static String[][] diglettMoveTable = new String[][] {{"^1", "Scratch"}, {"^15", "Growl"}, {"^19", "Dig"}, {"^24", "Sand Attack"},
											{"^31", "Slash"}, {"^40", "Earthquake"}};
	
	static Object[] diglettInfo1 = new Object[] {50, "Lives about one yard underground where it feeds on plant roots. It sometimes appears above ground.",
						"Mole Pokémon", 0.2, 0.8, "Ground", "null", new Object[] {1,"Speed"}, 255, 81, "medium fast", 50, 10, 55, 25, 35, 45, 95, 265,
						true, 26, false, "null", false, "Dugtrio", diglettMoveTable, new int[] {}, new int[] {6,8,9,10,20,26,27,28,31,32,34,44,48,50},
						"diglettBackTexture.PNG", "diglettFrontTexture.PNG", "diglettShinyBackTexture.PNG", 
						"diglettShinyFrontTexture.PNG","diglettDexTexture.PNG"};
	
	static Dictionary<String, Object> diglettInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////51 DUGTRIO///////////////////////////////////////////////////////////////////////	

	static String[][] dugtrioMoveTable = new String[][] {{"^1", "Dig", "Growl", "Scratch"}, {"^15", "Growl"}, {"^19", "Dig"}, {"^24", "Sand Attack"},
											{"^35", "Slash"}, {"^47", "Earthquake"}};
	
	static Object[] dugtrioInfo1 = new Object[] {51, "A team of Diglett triplets. It triggers huge earthquakes by burrowing 60 miles underground.",
						"Mole Pokémon",0.7, 33.5, "Ground","null", new Object[] {2,"Speed"}, 50, 153, "medium fast", 50, 35, 80, 50, 50, 70, 120, 405,
						false, 200, false, "null", false, "null", dugtrioMoveTable, new int[] {}, new int[] {6,8,9,10,15,20,26,27,28,31,32,34,44,48,50},
						"dugtrioBackTexture.PNG", "dugtrioFrontTexture.PNG", "dugtrioShinyBackTexture.PNG", 
						"dugtrioShinyFrontTexture.PNG","dugtrioDexTexture.PNG"};
	
	static Dictionary<String, Object> dugtrioInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////52 MEOWTH///////////////////////////////////////////////////////////////////////	

	static String[][] meowthMoveTable = new String[][] {{"^1", "Growl", "Scratch"}, {"^12", "Bite"}, {"^17", "Pay Day"}, {"^24", "Screech"},
										{"^33", "Fury Swipes"}, {"^44", "Slash"}};
	
	static Object[] meowthInfo1 = new Object[] {52, "Adores circular objects. Wanders the streets on a nightly basis to look for dropped loose change.",
						"Scratch Cat Pokémon",0.4, 4.2, "Normal", "null", new Object[] {1,"Speed"}, 255, 69, "medium fast", 50, 40, 45, 35, 40, 40, 90,
						290, true, 28, false, "null", false, "Persian", meowthMoveTable, new int[] {}, new int[] {6,8,9,10,11,12,16,20,24,25,31,32,34,39,
						40,44,50}, "meowthBackTexture.PNG", "meowthFrontTexture.PNG", "meowthShinyBackTexture.PNG", 
						"meowthShinyFrontTexture.PNG","meowthDexTexture.PNG"};
	
	static Dictionary<String, Object> meowthInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////53 PERSIAN///////////////////////////////////////////////////////////////////////	

	static String[][] persianMoveTable = new String[][] {{"^1", "Bite", "Growl", "Scratch", "Screech"}, {"^12", "Bite"}, {"^17", "Pay Day"},
										{"^24", "Screech"}, {"^37", "Fury Swipes"}, {"^51", "Slash"}};
	
	static Object[] persianInfo1 = new Object[] {53, "Although its fur has many admirers, it is tough to raise as a pet because of its fickle meanness.",
						"Classy Cat Pokémon",1.0,32.0, "Normal","null", new Object[] {2,"Speed"}, 90, 148, "medium fast", 50, 65, 70, 60, 65, 65, 115, 440,
						false, 200, false, "null", false, "null", persianMoveTable, new int[] {}, new int[] {6,8,9,10,11,12,15,16,20,24,25,31,32,34,39,
						40,44,50}, "persianBackTexture.PNG", "persianFrontTexture.PNG", "persianShinyBackTexture.PNG", 
						"persianShinyFrontTexture.PNG","persianDexTexture.PNG"};
	
	static Dictionary<String, Object> persianInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////54 PSYDUCK///////////////////////////////////////////////////////////////////////	

	static String[][] psyduckMoveTable = new String[][] {{"^1", "Scratch"}, {"^28", "Tail Whip"}, {"^31", "Disable"}, {"^36", "Confusion"}, 
										{"^43", "Fury SWipes"}, {"^52", "Hydro Pump"}};
	
	static Object[] psyduckInfo1 = new Object[] {54, "While lulling its enemies with its vacant look, this wily Pokémon will use psychokinetic powers.",
						"Duck Pokémon",0.8,19.6,"Water","null", new Object[] {1,"Sp.Atk"},190, 80, "medium fast", 50, 50, 52, 48, 65, 50, 55, 320,
						true, 33, false, "null", false, "Golduck", psyduckMoveTable, new int[] {03,04}, new int[] {1,5,6,8,9,10,11,12,13,14,16,17,18,19,
						20,28,31,32,34,39,40,44,50}, "psyduckBackTexture.PNG", "psyduckFrontTexture.PNG", "psyduckShinyBackTexture.PNG", 
						"psyduckShinyFrontTexture.PNG","psyduckDexTexture.PNG"};
	
	static Dictionary<String, Object> psyduckInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////55 GOLDUCK///////////////////////////////////////////////////////////////////////	

	static String[][] golduckMoveTable = new String[][] {{"^1", "Disable", "Scratch", "Tail Whip"}, {"^28", "Tail Whip"}, {"^31", "Disable"},
										{"^39", "Confusion"}, {"^48", "Fury Swipes"}, {"^59", "Hydro Pump"}};
	
	static Object[] golduckInfo1 = new Object[] {55, "Often seen swimming elegantly by lake shores. It is often mistaken for the Japanese monster, Kappa.",
						"Duck Pokémon",1.7,76.6,"Water","null", new Object[] {2,"Sp.Atk"}, 75, 174, "medium fast", 50, 80, 82, 78, 95, 80, 85, 500,
						false, 200, false, "null", false, "null", golduckMoveTable, new int[] {03,04}, new int[] {1,5,6,8,9,10,11,12,13,14,15,16,17,
						18,19,20,28,31,32,34,39,40,44,50}, "golduckBackTexture.PNG", "golduckFrontTexture.PNG", "golduckShinyBackTexture.PNG", 
						"golduckShinyFrontTexture.PNG","golduckDexTexture.PNG"};
	
	static Dictionary<String, Object> golduckInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////56 MANKEY///////////////////////////////////////////////////////////////////////	

	static String[][] mankeyMoveTable = new String[][] {{"^1", "Leer", "Scratch"}, {"^15", "Karate Chop"}, {"^21", "Fury Swipes"}, {"^27", "Seismic Toss"},
										{"^39", "Thrash"}};
	
	static Object[] mankeyInfo1 = new Object[] {56, "Extremely quick to anger. It could be docile one moment then thrashing away the next instant.",
						"Pig Monkey Pokémon", 0.5, 28.0, "Fighting", "null", new Object[] {1,"Attack"}, 190, 74, "medium fast", 50, 40, 80, 35, 35, 45,
						70, 305, true, 28, false, "null", false, "Primeape", mankeyMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,16,17,18,19,20,
						24,25,28,31,32,34,35,39,40,44,48,50}, "mankeyBackTexture.PNG", "mankeyFrontTexture.PNG", "mankeyShinyBackTexture.PNG", 
						"mankeyShinyFrontTexture.PNG","mankeyDexTexture.PNG"};
	
	static Dictionary<String, Object> mankeyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////57 PRIMEAPE///////////////////////////////////////////////////////////////////////	

	static String[][] primeapeMoveTable = new String[][] {{"^1", "Fury Swipes", "Karate Chop", "Leer", "Scratch"}, {"^15", "Karate Chop"},
										{"^21", "Fury Swipes"}, {"^27", "Focus Energy"}, {"^37", "Seismic Toss"}, {"^46", "Thrash"}};
	
	static Object[] primeapeInfo1 = new Object[] {57, "Always furious and tenacious to boot. It will not abandon chasing its quarry until it is caught.",
						"Pig Monkey Pokémon", 1.0,32.0, "Fighting", "null", new Object[] {2, "Attack"}, 75, 149, "medium fast", 50, 65, 105, 60, 60, 70,
						95, 455, false, 200, false, "null", false, "null", primeapeMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,15,16,17,18,19,20,
						24,25,28,31,32,34,35,39,40,44,48,50}, "primeapeBackTexture.PNG", "primeapeFrontTexture.PNG", "primeapeShinyBackTexture.PNG", 
						"primeapeShinyFrontTexture.PNG","primeapeDexTexture.PNG"};
	
	static Dictionary<String, Object> primeapeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////58 GROWLITHE///////////////////////////////////////////////////////////////////////	

	static String[][] growlitheMoveTable = new String[][] {{"^1", "Bite", "Roar"}, {"^18", "Ember"}, {"^23", "Leer"}, {"^30", "Take Down"},
										{"^39", "Agility"}, {"^50", "Flamethrower"}};
	
	static Object[] growlitheInfo1 = new Object[] {58, "Very protective of its territory. It will bark and bite to repel intruders from its space.",
						"Puppy Pokémon",0.7,19.0,"Fire","null", new Object[] {1,"Attack"}, 190, 91, "slow", 75, 55, 70, 45, 70, 50, 60, 350, true,
						200, true, "Fire Stone", false, "Arcanine", growlitheMoveTable, new int[] {}, new int[] {6,8,9,10,20,23,28,31,32,33,34,38,39,
						40,44,50}, "growlitheBackTexture.PNG", "growlitheFrontTexture.PNG", "growlitheShinyBackTexture.PNG", 
						"growlitheShinyFrontTexture.PNG","growlitheDexTexture.PNG"};
	
	static Dictionary<String, Object> growlitheInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////59 ARCANINE///////////////////////////////////////////////////////////////////////	

	static String[][] arcanineMoveTable = new String[][] {{"^1", "Ember", "Leer", "Roar", "Take Down"}};
	
	static Object[] arcanineInfo1 = new Object[] {59, "A Pokémon that has been admired since the past for its beauty. It runs agilely as if on wings.",
						"Legendary Pokémon",1.9,155.0,"Fire","null", new Object[] {2,"Attack"}, 75, 213, "slow", 75, 90, 110, 80, 100, 80, 95, 555,
						false, 200, false, "null", false, "null", arcanineMoveTable, new int[] {}, new int[] {6,8,9,10,15,20,23,28,30,31,32,33,34,38,39,
						40,44,50}, "arcanineBackTexture.PNG", "arcanineFrontTexture.PNG", "arcanineShinyBackTexture.PNG", 
						"arcanineShinyFrontTexture.PNG","arcanineDexTexture.PNG"};
	
	static Dictionary<String, Object> arcanineInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////60 POLIWAG///////////////////////////////////////////////////////////////////////	
	
	static String[][] poliwagMoveTable = new String[][] {{"^1", "Bubble"}, {"^16", "Hyposis"}, {"^19", "Water Gun"}, {"^25", "Double Slap"},
										{"^31", "Body Slam"}, {"^38", "Amnesia"}, {"^45", "Hydro Pump"}};
	
	static Object[] poliwagInfo1 = new Object[] {60, "Its newly grown legs prevent it from running. It appears to prefer swimming than trying to stand.",
						"Tadpole Pokémon",0.6,12.4,"Water","null", new Object[] {1,"Speed"}, 255, 77, "medium slow", 50, 40, 50, 40, 40, 40, 90, 300,
						true, 25, false, "null", false, "Poliwhirl", poliwagMoveTable, new int[] {03}, new int[] {6,8,9,10,11,12,13,14,20,29,31,32,34,40,
						44,46,50}, "poliwagBackTexture.PNG", "poliwagFrontTexture.PNG", "poliwagShinyBackTexture.PNG", 
						"poliwagShinyFrontTexture.PNG","poliwagDexTexture.PNG"};
	
	static Dictionary<String, Object> poliwagInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////61 POLIWHIRL///////////////////////////////////////////////////////////////////////	

	static String[][] poliwhirlMoveTable = new String[][] {{"^1", "Bubble", "Hypnosis", "Water Gun"}, {"^16", "Hypnosis"}, {"^19", "Water Gun"},
										{"^26", "Double Slap"}, {"^33", "Body Slam"}, {"^41", "Amnesia"}, {"^49", "Hydro Pump"}};
	
	static Object[] poliwhirlInfo1 = new Object[] {61, "Capable of living in or out of water. When out of water, it sweats to keep its body slimy.",
						"Tadpole Pokémon",1.0,20.0,"Water","null", new Object[] {2,"Speed"}, 120, 131, "medium slow", 50, 65, 65, 65, 50, 50, 90, 385,
						true, 200, true, "Water Stone", false, "Poliwrath", poliwhirlMoveTable, new int[] {03,04}, new int[] {1,5,6,8,9,10,11,12,13,14,
						17,18,19,20,26,27,29,31,32,34,35,40,44,46,50}, "poliwhirlBackTexture.PNG", "poliwhirlFrontTexture.PNG", 
						"poliwhirlShinyBackTexture.PNG", "poliwhirlShinyFrontTexture.PNG","poliwhirlDexTexture.PNG"};
	
	static Dictionary<String, Object> poliwhirlInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////62 POLIWRATH///////////////////////////////////////////////////////////////////////	

	static String[][] poliwrathMoveTable = new String[][] {{"^1", "Body Slam", "Double Slap", "Hypnosis", "Water Gun"}, {"^16", "Hypnosis"},
										{"^19", "Water Gun"}};
	
	static Object[] poliwrathInfo1 = new Object[] {62, "An adept swimmer at both the front crawl and breast stroke. Easily overtakes the best human swimmers.",
						"Tadpole Pokémon", 1.3,54.0,"Water","Fighting", new Object[] {3,"Defence"}, 45, 185, "medium slow", 50, 90, 85, 95, 70, 90,
						70, 500, false, 200, false, "null", false, "null", poliwrathMoveTable, new int[] {03,04}, new int[] {1,5,6,8,9,10,11,12,13,
						14,15,17,18,19,20,26,27,29,31,32,34,35,40,44,46,50}, "poliwrathBackTexture.PNG", "poliwrathFrontTexture.PNG", 
						"poliwrathShinyBackTexture.PNG", "poliwrathShinyFrontTexture.PNG","poliwrathDexTexture.PNG"};
	
	static Dictionary<String, Object> poliwrathInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////63 ABRA///////////////////////////////////////////////////////////////////////	

	static String[][] abraMoveTable = new String[][] {{"^1", "Teleport"}};
	
	static Object[] abraInfo1 = new Object[] {63, "Using its ability to read minds, it will identify impending danger and teleport to safety.",
						"Psi Pokémon", 0.9,19.5,"Psychic","null", new Object[] {1, "Sp.Atk"}, 200, 73, "medium slow", 75, 25, 20, 15, 105, 55, 90, 310,
						true, 16, false, "null", false, "Kadabra", abraMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,17,18,19,20,29,30,31,32,33,34,
						35,40,44,45,46,49,50}, "abraBackTexture.PNG", "abraFrontTexture.PNG", 
						"abraShinyBackTexture.PNG", "abraShinyFrontTexture.PNG","abraDexTexture.PNG"};
	
	static Dictionary<String, Object> abraInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////64 KADABRA///////////////////////////////////////////////////////////////////////	

	static String[][] kadabraMoveTable = new String[][] {{"^1", "Confusion", "Disable", "Teleport"}, {"^16", "Confusion"}, {"^20", "Disable"},
										{"^27", "Psybeam"}, {"^31", "Recover"}, {"^38", "Psychic"}, {"^42", "Reflect"}};
	
	static Object[] kadabraInfo1 = new Object[] {64, "It emits special alpha waves from its body that induce headaches just by being close by.",
						"Psi Pokémon",1.3,56.5,"Psychic","null", new Object[] {2, "Sp.Atk"}, 100, 145, "medium slow", 75, 40, 35, 30, 120, 70, 105, 400,
						true, 200, false, "null", true, "Alakazam", kadabraMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,17,18,19,20,28,29,30,31,32,
						33,34,35,40,44,45,46,49,50}, "kadabraBackTexture.PNG", "kadabraFrontTexture.PNG", 
						"kadabraShinyBackTexture.PNG", "kadabraShinyFrontTexture.PNG","kadabraDexTexture.PNG"};
	
	static Dictionary<String, Object> kadabraInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////65 ALAKAZAM///////////////////////////////////////////////////////////////////////	

	static String[][] alakazamMoveTable = new String[][] {{"^1", "Confusion","Disable","Teleport"},{"^16","Confusion"},{"^20","Disable"},
										{"^27", "Psybeam"}, {"^31", "Recover"}, {"^38", "Psychic"}, {"^42", "Reflect"}};
	
	static Object[] alakazamInfo1 = new Object[] {65, "Its brain can outperform a supercomputer. Its intelligence quotient is said to be 5,000.",
						"Psi Pokémon", 1.5,48.0,"Psychic","null", new Object[] {3,"Sp.Atk"}, 50, 186, "medium slow", 75, 55, 50, 45, 135, 95, 120, 500,
						false, 200, false, "null", false, "null", alakazamMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,15,17,18,19,20,28,29,
						30,31,32,33,34,35,40,44,45,46,49,50}, "alakazamBackTexture.PNG", "alakazamFrontTexture.PNG", 
						"alakazamShinyBackTexture.PNG", "alakazamShinyFrontTexture.PNG","alakazamDexTexture.PNG"};
	
	static Dictionary<String, Object> alakazamInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////66 MACHOP///////////////////////////////////////////////////////////////////////	

	static String[][] machopMoveTable = new String[][] {{"^1", "Karate Chop"}, {"^20", "Low Kick"}, {"^25", "Leer"}, {"^32", "Focus Energy"},
										{"^39", "Seismic Toss"}, {"^46", "Submission"}};
	
	static Object[] machopInfo1 = new Object[] {66, "Loves to build its muscles. It trains in all styles of martial arts to become even stronger.",
						"Superpower Pokémon",0.8,19.5,"Fighting","null", new Object[] {1,"Attack"}, 180, 88, "medium slow", 75, 70, 80, 50, 35, 35, 35,
						305, true, 28, false, "null", false, "Machoke", machopMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,17,18,19,20,26,27,28,
						31,32,34,35,38,40,44,48,50}, "machopBackTexture.PNG", "machopFrontTexture.PNG", 
						"machopShinyBackTexture.PNG", "machopShinyFrontTexture.PNG","machopDexTexture.PNG"};
	
	static Dictionary<String, Object> machopInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////67 MACHOKE///////////////////////////////////////////////////////////////////////	

	static String[][] machokeMoveTable = new String[][] {{"^1" ,"Karate Chop", "Leer", "Low Kick"}, {"^20", "Low Kick"}, {"^25", "Leer"},
											{"^36", "Focus Energy"}, {"^44", "Seismic Toss"}, {"^52", "Submission"}};
	
	static Object[] machokeInfo1 = new Object[] {67, "Its muscular body is so powerful, it must wear a power save belt to be able to regulate its motions.",
						"Superpower Pokémon",1.5,70.5,"Fighting","null", new Object[] {2,"Attack"}, 90, 146, "medium slow",75, 80,100, 70, 50, 60, 45,
						405, true, 200, false, "null", true, "Machamp", machokeMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,17,18,19,20,26,27,28,31,
						32,34,35,38,40,44,48,50}, "machokeBackTexture.PNG", "machokeFrontTexture.PNG", 
						"machokeShinyBackTexture.PNG", "machokeShinyFrontTexture.PNG","machokeDexTexture.PNG"};
	
	static Dictionary<String, Object> machokeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////68 MACHAMP///////////////////////////////////////////////////////////////////////	

	static String[][] machampMoveTable = new String[][] {{"^1", "Karate Chop", "Leer", "Low Kick"}, {"^20", "Low Kick"}, {"^25", "Leer"}, 
										{"^36", "Focus Energy"}, {"^44", "Seismic Toss"}, {"^52", "Submission"}};
	
	static Object[] machampInfo1 = new Object[] {68, "Using its heavy muscles, it throws powerful punches that can send the victim clear over the horizon.",
						"Superpower Pokémon",1.6,130.0,"Fighting","null", new Object[] {3,"Attack"}, 45, 193, "medium slow", 75, 90, 130, 80, 65, 85, 55,
						false, 200, false, "null", false, "null", machampMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,15,17,18,19,20,26,27,28,31,32,
						34,35,38,40,44,48,50}, "machampBackTexture.PNG", "machampFrontTexture.PNG", 
						"machampShinyBackTexture.PNG", "machampShinyFrontTexture.PNG","machampDexTexture.PNG"};
	
	static Dictionary<String, Object> machampInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////69 BELLSPROUT///////////////////////////////////////////////////////////////////////	

	static String[][] bellsproutMoveTable = new String[][] {{"^1", "Growth", "Vine Whip"}, {"^13","Wrap"}, {"^15", "Poison Powder"}, {"^18", "Sleep Powder"},
										{"^26", "Acid"}, {"^33", "Razor Leaf"}, {"^42", "Slam"}};
	
	static Object[] bellsproutInfo1 = new Object[] {69, "A carnivorous Pokémon that traps and eats bugs. It uses its root feet to soak up needed moisture.",
						"Flower Pokémon",0.7,4.0, "Grass","Poison", new Object[] {1,"Attack"}, 255, 84, "medium slow", 50, 50, 75, 35, 70, 30, 40, 300, true,
						21, false, "null", false, "Weepinbell", bellsproutMoveTable, new int[] {01}, new int[] {3,6,9,10,20,21,22,31,32,33,34,44,50}, 
						"bellsproutBackTexture.PNG", "bellsproutFrontTexture.PNG", 
						"bellsproutShinyBackTexture.PNG", "bellsproutShinyFrontTexture.PNG","bellsproutDexTexture.PNG"};
	
	static Dictionary<String, Object> bellsproutInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////70 WEEPINBELL///////////////////////////////////////////////////////////////////////	

	static String[][] weepinbellMoveTable = new String[][] {{"^1", "Growth", "Vine Whip", "Wrap"}, {"^13", "Wrap"}, {"^15", "Poison Powder"}, 
										{"^18", "Sleep Powder"}, {"^23", "Stun Spore"}, {"^29", "Acid"}, {"^38", "Razor Leaf"},{"^49", "Slam"}};
	
	static Object[] weepinbellInfo1 = new Object[] {70, "It spits out poison powder to immobilize the enemy and then finishes it with a spray of acid.",
						"Flycatcher Pokémon",1.0,6.4,"Grass","Poison", new Object[] {2,"Attack"}, 120, 151, "medium slow", 50, 65, 90, 50, 85, 45, 55, 390,
						true, 200, true, "Leaf Stone", false, "Victreebel", weepinbellMoveTable, new int[] {01}, new int[] {3,6,9,10,20,21,22,31,32,33,
						34,44,50}, "weepinbellBackTexture.PNG", "weepinbellFrontTexture.PNG", 
						"weepinbellShinyBackTexture.PNG", "weepinbellShinyFrontTexture.PNG","weepinbellDexTexture.PNG"};
	
	static Dictionary<String, Object> weepinbellInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////71 VICTREEBEL///////////////////////////////////////////////////////////////////////	

	static String[][] victreebelMoveTable = new String[][] {{"^1", "Acid", "Razor Leaf", "Sleep Powder", "Stun Spore"}, {"^13", "Wrap"},
										{"^15", "Poison Powder"}, {"^18", "Sleep Powder"}};
	
	static Object[] victreebelInfo1 = new Object[] {71, "Said to live in huge colonies deep in jungles, although no one has ever returned from there.",
						"Flycatcher Pokémon",1.7,15.5,"Grass","Poison", new Object[] {3,"Attack"}, 45, 191, "medium slow", 50, 80, 105, 65, 100, 70, 70,
						490, false, 200, false, "null", false, "null", victreebelMoveTable, new int[] {01}, new int[] {3,6,8,9,10,15,20,21,22,31,32,33,34,
						44,50}, "victreebelBackTexture.PNG", "victreebelFrontTexture.PNG", 
						"victreebelShinyBackTexture.PNG", "victreebelShinyFrontTexture.PNG","victreebelDexTexture.PNG"};
	
	static Dictionary<String, Object> victreebelInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////72 TENTACOOL///////////////////////////////////////////////////////////////////////	

	static String[][] tentacoolMoveTable = new String[][] {{"^1", "Acid"}, {"^7", "Supersonic"}, {"^13", "Wrap"}, {"^18", "Poison String"}, 
										{"^22", "Water Gun"}, {"^27", "Constrict"}, {"^33","Barrier"}, {"^40", "Screech"}, {"^48", "Hydro Pump"}};
	
	static Object[] tentacoolInfo1 = new Object[] {72, "Drifts in shallow seas. Anglers who hook them by accident are often punished by its stinging acid.",
						"Jellyfish Pokémon",0.9,45.5,"Water","Poison", new Object[] {1,"Sp.Def"}, 190, 105, "slow", 50, 40, 40, 35, 50, 100, 70, 335, true,
						30, false, "null", false, "Tentacruel", tentacoolMoveTable, new int[] {01, 03}, new int[] {3,6,9,10,11,12,13,14,20,21,31,32,33,
						34,40,44,50}, "tentacoolBackTexture.PNG", "tentacoolFrontTexture.PNG", 
						"tentacoolShinyBackTexture.PNG", "tentacoolShinyFrontTexture.PNG","tentacoolDexTexture.PNG"};
	
	static Dictionary<String, Object> tentacoolInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////73 TENTACRUEL///////////////////////////////////////////////////////////////////////	

	static String[][] tentacruelMoveTable = new String[][] {{"^1", "Acid", "Supersonic", "Wrap"}, {"^7", "Supersonic"}, {"^13", "Wrap"},
							{"^18", "Poison Sting"}, {"^22", "Water Gun"}, {"^27", "Constrict"}, {"^35", "Barrier"}, {"^43", "Screech"}, {"^50", "Hydro Pump"}};
	
	static Object[] tentacruelInfo1 = new Object[] {73, "The tentacles are normally kept short. On hunts, they are extended to ensnare and immobilize prey.",
						"Jellyfish Pokémon",1.6,55.0,"Water","Poison",new Object[] {2,"Sp.Def"},60,205,"slow",50, 80,70,65,80,120,100,515, false, 200, false,
						"null", false, "null", tentacruelMoveTable, new int[] {01, 03}, new int[] {3,6,9,10,11,12,13,14,15,20,21,31,32,33,34,40,44,50}, 
						"tentacruelBackTexture.PNG", "tentacruelFrontTexture.PNG", 
						"tentacruelShinyBackTexture.PNG", "tentacruelShinyFrontTexture.PNG","tentacruelDexTexture.PNG"};
	
	static Dictionary<String, Object> tentacruelInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////74 GEODUDE///////////////////////////////////////////////////////////////////////	

	static String[][] geodudeMoveTable = new String[][] {{"^1", "Tackle"}, {"^11", "Defence Curl"}, {"^16", "Rock Throw"}, {"^21", "Self-Destruct"},
										{"^26", "Harden"}, {"^31", "Earthquake"}, {"^36", "Explosion"}};
	
	static Object[] geodudeInfo1 = new Object[] {74, "Found in fields and mountains. Mistaking them for boulders, people often step or trip on them.",
						"Rock Pokémon",0.4,20.0,"Rock","Ground", new Object[] {1,"Defence"}, 255, 86, "medium slow", 50, 40, 80, 100, 30, 30, 20, 300,
						true, 25, false, "null", false, "Graveler", geodudeMoveTable, new int[] {04}, new int[] {1,6,8,9,10,17,18,19,20,26,27,28,31,32,34,
						35,36,38,44,47,48,50}, "geodudeBackTexture.PNG", "geodudeFrontTexture.PNG", 
						"geodudeShinyBackTexture.PNG", "geodudeShinyFrontTexture.PNG","geodudeDexTexture.PNG"};
	
	static Dictionary<String, Object> geodudeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////75 GRAVELER///////////////////////////////////////////////////////////////////////	

	static String[][] gravelerMoveTable = new String[][] {{"^1", "Defence Curl", "Tackle"}, {"^11", "Defence Curl"}, {"^16", "Rock Throw"},
									{"^21", "Self-Destruct"}, {"^29", "Harden"}, {"^36", "Earthquake"}, {"^43", "Explosion"}};
	
	static Object[] gravelerInfo1 = new Object[] {75, "Rolls down slopes to move. It rolls over any obstacle without slowing or changing its direction.",
						"Rock Pokémon",1.0, 105.0, "Rock","Ground", new Object[] {2, "Defence"}, 120, 134, "medium slow", 50, 55, 95, 115, 45, 45, 35,
						390, true, 200, false, "null", true, "Golem", gravelerMoveTable, new int[] {04}, new int[] {1,6,8,9,10,17,18,19,20,26,27,28,31,32,
						34,35,36,38,44,47,48,50}, "gravelerBackTexture.PNG", "gravelerFrontTexture.PNG", 
						"gravelerShinyBackTexture.PNG", "gravelerShinyFrontTexture.PNG","gravelerDexTexture.PNG"};
	
	static Dictionary<String, Object> gravelerInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////76 GOLEM///////////////////////////////////////////////////////////////////////	

	static String[][] golemMoveTable = new String[][] {{"^1", "Defence Curl", "Tackle"}, {"^11", "Defence Curl"}, {"^16", "Rock Throw"},
										{"^21", "Self-Destruct"}, {"^29", "Harden"}, {"^36", "Earthquake"}, {"^43", "Explosion"}};
	
	static Object[] golemInfo1 = new Object[] {76, "Its boulder-like body is extremely hard. It can easily withstand dynamite blasts without damage.",
						"Megaton Pokémon",1.4,300.0,"Rock","Ground", new Object[] {3,"Defence"}, 45, 177, "medium slow", 50, 80, 110, 130, 55, 65, 45, 485,
						false, 200, false, "null", false, "null", golemMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,15,17,18,19,20,26,27,28,31,32,34,
						35,36,38,44,47,48,50}, "golemBackTexture.PNG", "golemFrontTexture.PNG", 
						"golemShinyBackTexture.PNG", "golemShinyFrontTexture.PNG","golemDexTexture.PNG"};
	
	static Dictionary<String, Object> golemInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////77 PONYTA///////////////////////////////////////////////////////////////////////	

	static String[][] ponytaMoveTable = new String[][] {{"^1", "Ember"}, {"^30", "Tail Whip"}, {"^32", "Stomp"}, {"^35", "Growl"}, {"^39", "Fire Spin"},
										{"^43", "Take Down"}, {"^48", "Agility"}};
	
	static Object[] ponytaInfo1 = new Object[] {77, "Its hooves are 10 times harder than diamonds. It can trample anything completely flat in little time.",
						"Fire Horse Pokémon",1.0,30.0,"Fire","null", new Object[] {1,"Speed"}, 190, 152, "medium fast", 50, 50, 85, 55, 65, 65, 90, 410,
						true, 40, false, "null", false, "Rapidash", ponytaMoveTable, new int[] {}, new int[] {6,7,8,9,10,20,31,32,33,34,38,39,40,44,50}, 
						"ponytaBackTexture.PNG", "ponytaFrontTexture.PNG", 
						"ponytaShinyBackTexture.PNG", "ponytaShinyFrontTexture.PNG","ponytaDexTexture.PNG"};
	
	static Dictionary<String, Object> ponytaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////78 RAPIDASH///////////////////////////////////////////////////////////////////////	

	static String[][] rapidashMoveTable = new String[][] {{"^1", "Ember", "Growl", "Stomp", "Tail Whip"}, {"^30", "Tail Whip"}, {"^32", "Stomp"},
									{"^35", "Growl"}, {"^39", "Fire Spin"}, {"^47", "Take Down"}, {"^55", "Agility"}};
	
	static Object[] rapidashInfo1 = new Object[] {78, "Very competitive, this Pokémon will chase anything that moves fast in the hopes of racing it.",
						"Fire Horse Pokémon",1.7,95.0,"Fire","null", new Object[] {2,"Speed"}, 60, 192, "medium fast", 50, 65, 100, 70, 80, 80, 105,
						500, false, 200, false, "null", false, "null", rapidashMoveTable, new int[] {}, new int[] {6,7,8,9,10,15,20,31,32,33,34,38,39,
						40,44,50}, "rapidashBackTexture.PNG", "rapidashFrontTexture.PNG", 
						"rapidashShinyBackTexture.PNG", "rapidashShinyFrontTexture.PNG","rapidashDexTexture.PNG"};
	
	static Dictionary<String, Object> rapidashInfo2 = new Hashtable<String, Object>();

//////////////////////////////////////////////////////////////////79 SLOWPOKE///////////////////////////////////////////////////////////////////////	

	static String[][] slowpokeMoveTable = new String[][] {{"^1", "Confusion"}, {"^18", "Disable"}, {"^22", "Headbutt"}, {"^27", "Growl"},
										{"^33", "Water Gun"}, {"^40", "Amnesia"}, {"^48", "Psychic"}};
	
	static Object[] slowpokeInfo1 = new Object[] {79, "Incredibly slow and dopey. It takes 5 seconds for it to feel pain when under attack.",
						"Dopey Pokémon",1.2, 36.0, "Water", "Psychic", new Object[] {1,"HP"},190,99,"medium fast", 50, 90, 65, 65, 40, 40, 15, 315,
						true, 37, false, "null", false, "Slowbro", slowpokeMoveTable, new int[] {03, 04 ,05}, new int[] {6,8,9,10,11,12,13,14,16,20,26,
						27,28,29,30,31,32,33,34,38,39,40,44,45,46,49,50}, "slowpokeBackTexture.PNG", "slowpokeFrontTexture.PNG", 
						"slowpokeShinyBackTexture.PNG", "slowpokeShinyFrontTexture.PNG","slowpokeDexTexture.PNG"};
	
	static Dictionary<String, Object> slowpokeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////80 SLOWBRO///////////////////////////////////////////////////////////////////////	

	static String[][] slowbroMoveTable = new String[][] {{"^1", "Confusion", "Disable", "Headbutt"}, {"^18", "Disable"}, {"^22", "Headbutt"},
									{"^27", "Growl"}, {"^33", "Water Gun"}, {"^37", "Withdraw"}, {"^44", "Amnesia"}, {"^55", "Psychic"}};
	
	static Object[] slowbroInfo1 = new Object[] {80, "The Shellder that is latched onto Slowpoke’s tail is said to feed on the host’s left over scraps.",
						"Hermit Crab Pokémon",1.6,78.5,"Water","Psychic", new Object[] {2,"Defence"}, 75, 164, "medium fast", 50, 95, 75, 110, 100, 80, 
						40, 490, false, 200, false, "null", false, "null", slowbroMoveTable, new int[] {03, 04, 05}, new int[] {1,5,6,8,9,10,11,12,13,
						14,15,16,17,18,19,20,26,27,28,29,30,31,32,33,34,38,39,40,44,45,46,49,50}, "slowbroBackTexture.PNG", "slowbroFrontTexture.PNG", 
						"slowbroShinyBackTexture.PNG", "slowbroShinyFrontTexture.PNG","slowbroDexTexture.PNG"};
	
	static Dictionary<String, Object> slowbroInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////81 MAGNEMITE///////////////////////////////////////////////////////////////////////	

	static String[][] magnemiteMoveTable = new String[][] {{"^1", "Tackle"}, {"^21", "Sonic Boom"}, {"^25", "Thunder Shock"}, {"^29", "Supersonic"},
												{"^35", "Thunder Wave"}, {"^41", "Swift"}, {"^47", "Screech"}};
	
	static Object[] magnemiteInfo1 = new Object[] {81, "Uses anti-gravity to stay suspended. Appears without warning and uses Thunder Wave and similar moves.",
						"Magnet Pokémon",0.3,6.0,"Electric", "null", new Object[] {1,"Sp.Atk"},190, 89, "medium fast", 0, 25, 35, 70, 95, 55, 45, 325, true,
						30, false, "null", false, "Magneton", magnemiteMoveTable, new int[] {05}, new int[] {6,9,10,20,24,25,30,31,32,33,34,39,44,45,
						50}, "magnemiteBackTexture.PNG", "magnemiteFrontTexture.PNG", 
						"magnemiteShinyBackTexture.PNG", "magnemiteShinyFrontTexture.PNG","magnemiteDexTexture.PNG"};
	
	static Dictionary<String, Object> magnemiteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////82 MAGNETON///////////////////////////////////////////////////////////////////////	

	static String[][] magnetonMoveTable = new String[][] {{"^1", "Sonic Boom", "Tackle", "Thunder Shock"}, {"^21", "Sonic Boom"}, {"^25", "Thunder Shock"},
											{"^29", "Supersonic"}, {"^38", "Thunder Wave"}, {"^46", "Swift"}, {"^52", "Screech"}};
	
	static Object[] magnetonInfo1 = new Object[] {82, "Formed by several Magnemites linked together. They frequently appear when sunspots flare up.",
						"Magnet Pokémon",1.0,60.0, "Electric","null", new Object[] {2,"Sp.Atk"}, 60, 161, "medium fast", 0, 50, 60, 95, 120, 70, 70, 465,
						false, 200, false, "null", false, "null", magnetonMoveTable, new int[] {05}, new int[] {6,9,10,15,20,24,25,30,31,32,33,34,
						39,44,45,50}, "magnetonBackTexture.PNG", "magnetonFrontTexture.PNG", 
						"magnetonShinyBackTexture.PNG", "magnetonShinyFrontTexture.PNG","magnetonDexTexture.PNG"};
	
	static Dictionary<String, Object> magnetonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////83 FARFETCH'D///////////////////////////////////////////////////////////////////////	

	static String[][] farfetchMoveTable = new String[][] {{"^1", "Peck", "Sand Attack"}, {"^7", "Leer"}, {"^15", "Fury Attack"}, {"^23", "Swords Fance"},
												{"^31", "Agility"}, {"^39", "Slash"}};
	
	static Object[] farfetchInfo1 = new Object[] {83, "The sprig of green onions it holds is its weapon. It is used much like a metal sword.",
						"Wild Duck Pokémon",0.8,15.0,"Normal","Flying", new Object[] {1,"Attack"}, 45, 94, "medium fast", 50, 52, 65, 55, 58, 62,
						60, 352, false, 200, false, "null", false, "null", farfetchMoveTable, new int[] {01, 02}, new int[] {2,3,4,6,8,9,10,20,31,32,33,
						34,39,40,44,50}, "farfetchBackTexture.PNG", "farfetchFrontTexture.PNG", 
						"farfetchShinyBackTexture.PNG", "farfetchShinyFrontTexture.PNG","farfetchDexTexture.PNG"};
	
	static Dictionary<String, Object> farfetchInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////84 DODUO///////////////////////////////////////////////////////////////////////	

	static String[][] doduoMoveTable = new String[][] {{"^1", "Peck"}, {"^20", "Growl"}, {"^24", "Fury Attack"}, {"^30", "Drill Peck"}, {"^36", "Rage"},
											{"^40", "Tri Attack"}, {"^44", "Agility"}};
	
	static Object[] doduoInfo1 = new Object[] {84, "A bird that makes up for its poor flying with its fast foot speed. Leaves giant footprints.",
						"Twin Bird Pokémon",1.4,39.2,"Normal","Flying", new Object[] {1,"Attack"}, 190, 96, "medium fast", 50, 35, 85, 45, 35,
						35, 75, 310, true, 31, false, "null", false, "Dodrio", doduoMoveTable, new int[] {02}, new int[] {4,6,8,9,10,20,31,32,
						33,34,40,43,44,49,50}, "doduoBackTexture.PNG", "doduoFrontTexture.PNG", 
						"doduoShinyBackTexture.PNG", "doduoShinyFrontTexture.PNG","doduoDexTexture.PNG"};
	
	static Dictionary<String, Object> doduoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////85 DODRIO///////////////////////////////////////////////////////////////////////	

	static String[][] dodrioMoveTable = new String[][] {{"^1", "Fury Attack", "Growl", "Peck"}, {"^20", "Growl"}, {"^24", "Fury Attack"},
												{"^30", "Drill Peck"}, {"^39", "Rage"}, {"^45", "Tri Attack"}, {"^51", "Agility"}};
	
	static Object[] dodrioInfo1 = new Object[] {85, "Uses its three brains to execute complex plans. While two heads sleep, one head stays awake.",
						"Triple Bird Pokémon",1.8,85.2, "Normal","Flying", new Object[] {2,"Attack"}, 45, 158, "medium fast", 50, 60, 110, 70, 60, 60,
						100, 460, false, 200, false, "null", false, dodrioMoveTable, new int[] {02}, new int[] {4,6,8,9,10,15,20,31,32,33,34,40,43,
						44,49,50}, "dodrioBackTexture.PNG", "dodrioFrontTexture.PNG", 
						"dodrioShinyBackTexture.PNG", "dodrioShinyFrontTexture.PNG","dodrioDexTexture.PNG"};
	
	static Dictionary<String, Object> dodrioInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////86 SEEL///////////////////////////////////////////////////////////////////////	

	static String[][] seelMoveTable = new String[][] {{"^1", "Headbutt"}, {"^30", "Growl"}, {"^35", "Aurora Beam"}, {"^40", "Rest"}, {"^45", "Take Down"},
												{"^50", "Ice Beam"}};
	
	static Object[] seelInfo1 = new Object[] {86, "The protruding horn on its head is very hard. It is used for bashing through thick ice.",
						"Sea Lion Pokémon",1.1, 90.0, "Water","null", new Object[] {1,"Sp.Def"},190, 100, "medium fast", 50, 65, 45, 55, 45, 70,
						45, 325, true, 34, false, "null", false, "Dewgong", seelMoveTable, new int[] {03, 04}, new int[] {6,7,8,9,10,11,12,13,
						14,16,20,31,32,34,40,44,50}, "seelBackTexture.PNG", "seelFrontTexture.PNG", 
						"seelShinyBackTexture.PNG", "seelShinyFrontTexture.PNG","seelDexTexture.PNG"};
	
	static Dictionary<String, Object> seelInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////87 DEWGONG///////////////////////////////////////////////////////////////////////	

	static String[][] dewgongMoveTable = new String[][] {{"^1", "Aurora Beam", "Growl", "Headbutt"}, {"^30", "Growl"}, {"^35", "Aurora Beam"},
												{"^44", "Rest"}, {"^50", "Take Down"}, {"^56" ,"Ice Beam"}};
	
	static Object[] dewgongInfo1 = new Object[] {87, "Stores thermal energy in its body. Swims at a steady 8 knots even in intensely cold waters.",
						"Sea Lion Pokémon", 1.7, 120.0, "Water","Ice",new Object[] {2,"Sp.Def"}, 75, 176, "medium fast", 50, 90, 70, 80, 70, 95,
						70, 475, false, 200, false, "null", false, "null", dewgongMoveTable, new int[] {03, 04}, new int[] {6,7,8,9,10,11,12,13,
						14,15,16,20,31,32,34,40,44,50}, "dewgongBackTexture.PNG", "dewgongFrontTexture.PNG", 
						"dewgongShinyBackTexture.PNG", "dewgongShinyFrontTexture.PNG","dewgongDexTexture.PNG"};
	
	static Dictionary<String, Object> dewgongInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////88 GRIMER///////////////////////////////////////////////////////////////////////	

	static String[][] grimerMoveTable = new String[][] {{"^1", "Disable", "Pound"}, {"^30", "Poison Gas"}, {"^33", "Minimize"}, {"^37","Sludge"},
												{"^42", "Harden"}, {"^48", "Screech"}, {"^55", "Acid Armour"}};
	
	static Object[] grimerInfo1 = new Object[] {88, "Appears in filthy areas. Thrives by sucking up polluted sludge that is pumped out of factories.",
						"Sludge Pokémon",0.9,30.0,"Poison","null",new Object[] {1,"HP"},190,90, "medium fast",50, 80, 80, 50, 40, 50, 25, 325, true, 38,
						false, "null", false, "Muk", grimerMoveTable, new int[] {}, new int[] {6,8,20,21,24,25,31,32,34,36,38,44,47,50},
						"grimerBackTexture.PNG", "grimerFrontTexture.PNG", "grimerShinyBackTexture.PNG", 
						"grimerShinyFrontTexture.PNG","grimerDexTexture.PNG"};
	
	static Dictionary<String, Object> grimerInfo2 = new Hashtable<String, Object>();

/////////////////////////////////////////////////////////////////////89 MUK/////////////////////////////////////////////////////////////////////////	

	static String[][] mukMoveTable = new String[][] {{"^1", "Disable", "Poison Gas", "Pound"}, {"^30", "Poison Gas"}, {"^33", "Minimize"}, {"^37", "Sludge"},
										{"^45", "Harden"}, {"^53", "Screech"}, {"^60", "Acid Armour"}};
	
	static Object[] mukInfo1 = new Object[] {89, "Thickly covered with a filthy, vile sludge. It is so toxic, even its footprints contain poison.",
						"Sludge Pokémon",1.2, 30.0, "Poison","null",new Object[] {1,"HP", 1,"Attack"}, 75, 157, "medium fast", 50, 105, 105, 75, 65, 100,
						50, 500, false, 200, false, "null", false, "null", mukMoveTable, new int[] {}, new int[] {6,8,15,20,21,24,25,31,32,34,36,38,44,
						47,50}, "mukBackTexture.PNG", "mukFrontTexture.PNG", "mukShinyBackTexture.PNG", "mukShinyFrontTexture.PNG","mukDexTexture.PNG"};
	
	static Dictionary<String, Object> mukInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////90 SHELLDER///////////////////////////////////////////////////////////////////////	

	static String[][] shellderMoveTable = new String[][] {{"^1", "Tackle", "Withdraw"}, {"^18", "Supersonic"}, {"^23", "Clamp"}, {"^30", "Aurora Beam"},
											{"^39", "Leer"}, {"^50", "Ice Beam"}};
	
	static Object[] shellderInfo1 = new Object[] {90, "Its hard shell repels any kind of attack. It is vulnerable only when its shell is open.",
						"Bivalve Pokémon",0.3,4.0,"Water","null",new Object[] {1, "Defence"}, 190, 97, "slow", 50, 30, 65, 100, 45, 25, 40, 305, true,
						200, true, "Water Stone", false, "Cloyster", shellderMoveTable, new int[] {03}, new int[] {6,9,10,11,12,13,14,20,30,31,32,33,
						34,36,39,44,37,49,50}, "shellderBackTexture.PNG", "shellderFrontTexture.PNG", "shellderShinyBackTexture.PNG", 
						"shellderShinyFrontTexture.PNG","shellderDexTexture.PNG"};
	
	static Dictionary<String, Object> shellderInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////91 CLOYSTER///////////////////////////////////////////////////////////////////////	

	static String[][] cloysterMoveTable = new String[][] {{"^1", "Aurora Beam","Clamp", "Supersonic", "Withdraw"}, {"^50", "Spike Cannon"}};
	
	static Object[] cloysterInfo1 = new Object[] {91, "When attacked, it launches its horns in quick volleys. Its innards have never been seen.",
						"Bivalve Pokémon",1.5, 132.5, "Water", "Ice", new Object[] {2,"Defence"}, 60, 203, "slow", 50, 50, 95, 180, 85, 45, 70, 525,
						false, 200, false, "null", false, "null", cloysterMoveTable, new int[] {03}, new int[] {6,9,10,11,12,13,14,15,20,30,31,32,33,34,
						36,39,44,47,49,50}, "cloysterBackTexture.PNG", "cloysterFrontTexture.PNG", "cloysterShinyBackTexture.PNG", 
						"cloysterShinyFrontTexture.PNG","cloysterDexTexture.PNG"};
	
	static Dictionary<String, Object> cloysterInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////92 GASTLY///////////////////////////////////////////////////////////////////////	

	static String[][] gastlyMoveTable = new String[][] {{"^1", "Confuse Ray","Lick","Night Shade"}, {"^27", "Hypnosis"}, {"^35", "Dream Eater"}};
	
	static Object[] gastlyInfo1 = new Object[] {92, "Almost invisible, this gaseous Pokémon cloaks the target and puts it to sleep without notice.",
						"Gas Pokémon",1.3,0.1,"Ghost","Poison", new Object[] {1,"Sp.Atk"}, 190, 95, "medium slow", 50, 30, 35, 30, 100, 35, 80, 310,
						true, 25, false, "null", false, "Haunter", gastlyMoveTable, new int[] {}, new int[] {6,20,21,24,25,29,31,32,34,36,42,44,
						46,47,50}, "gastlyBackTexture.PNG", "gastlyFrontTexture.PNG", "gastlyShinyBackTexture.PNG", 
						"gastlyShinyFrontTexture.PNG","gastlyDexTexture.PNG"};
	
	static Dictionary<String, Object> gastlyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////93 HAUNTER///////////////////////////////////////////////////////////////////////	

	static String[][] haunterMoveTable = new String[][] {{"^1", "Confuse Ray", "Lick", "Night Shade"}, {"^29", "Hypnosis"}, {"^38", "Dream Eater"}};
	
	static Object[] haunterInfo1 = new Object[] {93, "Because of its ability to slip through block walls, it is said to be from another dimension.",
						"Gas Pokémon",1.6,0.1,"Ghost","Poison",new Object[] {2,"Sp.Atk"},90,126,"medium slow", 50, 45, 50, 45, 115, 55, 95, 405, true,
						200, false, "null", true, "Gengar", haunterMoveTable, new int[] {}, new int[] {6,20,21,24,25,29,31,32,34,36,42,44,46,47,50}, 
						"haunterBackTexture.PNG", "haunterFrontTexture.PNG", "haunterShinyBackTexture.PNG", 
						"haunterShinyFrontTexture.PNG","haunterDexTexture.PNG"};
	
	static Dictionary<String, Object> haunterInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////94 GENGAR///////////////////////////////////////////////////////////////////////	

	static String[][] gengarMoveTable = new String[][] {{"^1", "Confuse Ray", "Lick", "Night Shade"}, {"^29", "Hypnosis"}, {"^38", "Dream Eater"}};
	
	static Object[] gengarInfo1 = new Object[] {94, "Under a full moon, this Pokémon likes to mimic the shadows of people and laugh at their fright.",
						"Shadow Pokémon",1.5,40.5,"Ghost","Poison", new Object[] {3,"Sp.Atk"}, 45, 190, "medium slow", 50, 60, 65, 60, 130, 75, 110, 500,
						false, 200, false, "null", false, "null", gengarMoveTable, new int[] {04}, new int[] {1,5,6,8,9,10,15,17,18,19,20,21,24,25,29,31,
						32,34,35,36,40,42,44,46,47,50}, "gengarBackTexture.PNG", "gengarFrontTexture.PNG", "gengarShinyBackTexture.PNG", 
						"gengarShinyFrontTexture.PNG","gengarDexTexture.PNG"};
	
	static Dictionary<String, Object> gengarInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////95 ONIX///////////////////////////////////////////////////////////////////////	

	static String[][] onixMoveTable = new String[][] {{"^1", "Screech", "Tackle"}, {"^15", "Bind"}, {"^19", "Rock Throw"}, {"^25", "Rage"},
										{"^33", "Slam"}, {"^43", "Harden"}};
	
	static Object[] onixInfo1 = new Object[] {95, "As it grows, the stone portions of its body harden to become similar to a diamond, but colored black.",
						"Rock Snake Pokémon",8.8,210.0,"Rock","Ground",new Object[] {1,"Defence"}, 45, 108, "medium fast", 50, 35, 45, 160, 30, 45, 70, 385,
						false, 200, false, "null", false, "null", onixMoveTable, new int[] {04}, new int[] {6,8,9,10,20,26,27,28,31,32,34,36,40,44,47,
						48,50}, "onixBackTexture.PNG", "onixFrontTexture.PNG", "onixShinyBackTexture.PNG", "onixShinyFrontTexture.PNG","onixDexTexture.PNG"};
	
	static Dictionary<String, Object> onixInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////96 DROWZEE///////////////////////////////////////////////////////////////////////	

	static String[][] drowzeeMoveTable = new String[][] {{"^1", "Hypnosis", "Pound"}, {"^12", "Disable"}, {"^17", "Confusion"}, {"^24", "Headbutt"},
										{"^29","Poison Gas"}, {"^32", "Psychic"}, {"^37", "Meditate"}};
	
	static Object[] drowzeeInfo1 = new Object[] {96, "Puts enemies to sleep then eats their dreams. Occasionally gets sick from eating bad dreams.",
						"Hypnosis Pokémon",1.0, 32.4, "Psychic", "null", new Object[] {1,"Sp.Def"},190, 102, "medium fast", 50, 60, 48, 45, 43, 90, 42,
						328, true, 26, false, "null", false, "Hypno", drowzeeMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,17,18,19,20,29,30,31,32,
						33,34,35,40,42,44,45,46,49,50}, "drowzeeBackTexture.PNG", "drowzeeFrontTexture.PNG", "drowzeeShinyBackTexture.PNG", 
						"drowzeeShinyFrontTexture.PNG","drowzeeDexTexture.PNG"};
	
	static Dictionary<String, Object> drowzeeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////97 HYPNO///////////////////////////////////////////////////////////////////////	

	static String[][] hypnoMoveTable = new String[][] {{"^1", "Confusion", "Disable", "Hypnosis", "Pound"}, {"^12", "Disable"}, {"^17", "Confusion"},
											{"^24", "Headbutt"}, {"^33", "Poison Gas"}, {"^37", "Psychic"}, {"^43", "Meditate"}};
	
	static Object[] hypnoInfo1 = new Object[] {97, "When it locks eyes with an enemy, it will use a mix of PSI moves such as Hypnosis and Confusion.",
						"Hypnosis Pokémon",1.6,75.6,"Psychic","null",new Object[] {2,"Sp.Def"}, 75, 165, "medium fast", 50, 85, 73, 70, 73, 115, 67,
						483, false, 200, false, "null", false, "null", hypnoMoveTable, new int[] {05}, new int[] {1,5,6,8,9,10,15,17,18,19,20,29,30,
						31,32,33,34,35,40,42,44,45,46,49,50}, "hypnoBackTexture.PNG", "hypnoFrontTexture.PNG", "hypnoShinyBackTexture.PNG", 
						"hypnoShinyFrontTexture.PNG","hypnoDexTexture.PNG"};
	
	static Dictionary<String, Object> hypnoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////98 KRABBY///////////////////////////////////////////////////////////////////////	

	static String[][] krabbyMoveTable = new String[][] {{"^1", "Bubble", "Leer"},{"^20", "Vice Grip"}, {"^25", "Guillotine"}, {"^30", "Stomp"},
												{"^35", "Crabhammer"}, {"^40", "Harden"}};
	
	static Object[] krabbyInfo1 = new Object[] {98, "Its pincers are not only powerful weapons, they are used for balance when walking sideways.",
						"River Crab Pokémon",0.4,6.5,"Water","null", new Object[] {1,"Attack"}, 225, 115, "medium fast", 50, 30, 105, 90, 25, 25,
						50, 325, true, 28, false, "null", false, "Kingler", krabbyMoveTable, new int[] {01, 03, 04}, new int[] {3,6,9,10,11,12,13,14,20,
						31,32,34,44,50}, "krabbyBackTexture.PNG", "krabbyFrontTexture.PNG", "krabbyShinyBackTexture.PNG", 
						"krabbyShinyFrontTexture.PNG","krabbyDexTexture.PNG"};
	
	static Dictionary<String, Object> krabbyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////99 KINGLER///////////////////////////////////////////////////////////////////////	

	static String[][] kinglerMoveTable = new String[][] {};
	
	static Object[] kinglerInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kinglerInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////100 VOLTORB///////////////////////////////////////////////////////////////////////	

	static String[][] voltorbMoveTable = new String[][] {};
	
	static Object[] voltorbInfo1 = new Object[] {};
	
	static Dictionary<String, Object> voltorbInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////101 ELECTRODE///////////////////////////////////////////////////////////////////////	

	static String[][] electrodeMoveTable = new String[][] {};
	
	static Object[] electrodeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> electrodeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////102 EXEGGCUTE///////////////////////////////////////////////////////////////////////	
	
	static String[][] exeggcuteMoveTable = new String[][] {};
	
	static Object[] exeggcuteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> exeggcuteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////103 EXEGGUTOR///////////////////////////////////////////////////////////////////////	

	static String[][] exeggutorMoveTaable = new String[][] {};
	
	static Object[] exeggutorInfo1 = new Object[] {};
	
	static Dictionary<String, Object> exeggutorInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////104 CUBONE///////////////////////////////////////////////////////////////////////	

	static String[][] cuboneMoveTable = new String[][] {};
	
	static Object[] cuboneInfo1 = new Object[] {};
	
	static Dictionary<String, Object> cuboneInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////105 MAROWAK///////////////////////////////////////////////////////////////////////	

	static String[][] marowakMoveTable = new String[][] {};
	
	static Object[] marowakInfo1 = new Object[] {};
	
	static Dictionary<String, Object> marowakInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////106 HITMONLEE///////////////////////////////////////////////////////////////////////	

	static String[][] hitmonleeMoveTable = new String[][] {};
	
	static Object[] hitmonleeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> hitmonleeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////107 HITMONCHAN///////////////////////////////////////////////////////////////////////	
	
	static String[][] hitmonchanMoveTable = new String[][] {};
	
	static Object[] hitmonchanInfo1 = new Object[] {};
	
	static Dictionary<String, Object> hitmonchanInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////108 LICKITUNG///////////////////////////////////////////////////////////////////////	

	static String[][] lickitungMoveTable = new String[][] {};
	
	static Object[] lickitungInfo1 = new Object[] {};
	
	static Dictionary<String, Object> lickitungInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////109 KOFFING///////////////////////////////////////////////////////////////////////	

	static String[][] koffingMoveTable = new String[][] {};
	
	static Object[] koffingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> koffingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////110 WEEZING///////////////////////////////////////////////////////////////////////	

	static String[][] weezingMoveTable = new String[][] {};
	
	static Object[] weezingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> weezingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////111 RHYHORN///////////////////////////////////////////////////////////////////////	

	static String[][] rhyhornMoveTable = new String[][] {};
	
	static Object[] rhyhornInfo1 = new Object[] {};
	
	static Dictionary<String, Object> rhyhornInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////112 RHYDON///////////////////////////////////////////////////////////////////////	

	static String[][] rhydonMoveTable = new String[][] {};
	
	static Object[] rhydonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> rhydonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////113 CHANSEY///////////////////////////////////////////////////////////////////////	

	static String[][] chanseyMoveTable = new String[][] {};
	
	static Object[] chanseyInfo1 = new Object[] {};
	
	static Dictionary<String, Object> chanseyInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////114 TANGELA///////////////////////////////////////////////////////////////////////	

	static String[][] tangelaMoveTable = new String[][] {};
	
	static Object[] tangelaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> tangelaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////115 KANGASKHAN///////////////////////////////////////////////////////////////////////	

	static String[][] kangaskhanMoveTable = new String[][] {};
	
	static Object[] kangaskhanInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kangaskhanInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////116 HORSEA///////////////////////////////////////////////////////////////////////	

	static String[][] horseaMoveTable = new String[][] {};
	
	static Object[] horseaInfo1 = new Object[] {};
	
	static Dictionary<String, Object> horseaInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////117 SEADRA///////////////////////////////////////////////////////////////////////	

	static String[][] seadraMoveTable = new String[][] {};
	
	static Object[] seadraInfo1 = new Object[] {};
	
	static Dictionary<String, Object> seadraInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////118 GOLDEEN///////////////////////////////////////////////////////////////////////	

	static String[][] goldeenMoveTable = new String[][] {};
	
	static Object[] goldeenInfo1 = new Object[] {};
	
	static Dictionary<String, Object> goldeenInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////119 SEAKING///////////////////////////////////////////////////////////////////////	

	static String[][] seakingMoveTable = new String[][] {};
	
	static Object[] seakingInfo1 = new Object[] {};
	
	static Dictionary<String, Object> seakingInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////120 STARYU///////////////////////////////////////////////////////////////////////	

	static String[][] staryuMoveTable = new String[][] {};
	
	static Object[] staryuInfo1 = new Object[] {};
	
	static Dictionary<String, Object> staryuInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////121 STARMIE///////////////////////////////////////////////////////////////////////	

	static String[][] starmieMoveTable = new String[][] {};
	
	static Object[] starmieInfo1 = new Object[] {};
	
	static Dictionary<String, Object> starmieInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////122 MR. MIME///////////////////////////////////////////////////////////////////////	

	static String[][] mimeMoveTable = new String[][] {};
	
	static Object[] mimeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mimeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////123 SCYTHER///////////////////////////////////////////////////////////////////////	

	static String[][] scytherMoveTable = new String[][] {};
	
	static Object[] scytherInfo1 = new Object[] {};
	
	static Dictionary<String, Object> scytherInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////124 JYNX///////////////////////////////////////////////////////////////////////	

	static String[][] jynxMoveTable = new String[][] {};
	
	static Object[] jynxInfo1 = new Object[] {};
	
	static Dictionary<String, Object> jynxInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////125 ELECTABUZZ///////////////////////////////////////////////////////////////////////	

	static String[][] electabuzzMoveTable = new String[][] {};
	
	static Object[] electabuzzInfo1 = new Object[] {};
	
	static Dictionary<String, Object> electabuzzInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////126 MAGMAR///////////////////////////////////////////////////////////////////////	

	static String[][] magmarMoveTable = new String[][] {};
	
	static Object[] magmarInfo1 = new Object[] {};
	
	static Dictionary<String, Object> magmarInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////127 PINSIR///////////////////////////////////////////////////////////////////////	

	static String[][] pinsirMoveTable = new String[][] {};
	
	static Object[] pinsirInfo1 = new Object[] {};
	
	static Dictionary<String, Object> pinsirInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////128 TAUROS///////////////////////////////////////////////////////////////////////	

	static String[][] taurosMoveTable = new String[][] {};
	
	static Object[] taurosInfo1 = new Object[] {};
	
	static Dictionary<String, Object> taurosInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////129 MAGIKARP///////////////////////////////////////////////////////////////////////	

	static String[][] magikarpMoveTable = new String[][] {};
	
	static Object[] magikarpInfo1 = new Object[] {};
	
	static Dictionary<String, Object> magikarpInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////130 GYARADOS///////////////////////////////////////////////////////////////////////	

	static String[][] gyaradosMoveTable = new String[][] {};
	
	static Object[] gyaradosInfo1 = new Object[] {};
	
	static Dictionary<String, Object> gyaradosInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////131 LAPRAS///////////////////////////////////////////////////////////////////////	

	static String[][] laprasMoveTable = new String[][] {};
	
	static Object[] laprasInfo1 = new Object[] {};
	
	static Dictionary<String, Object> laprasInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////132 DITTO///////////////////////////////////////////////////////////////////////	

	static String[][] dittoMoveTable = new String[][] {};
	
	static Object[] dittoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dittoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////133 EEVEE///////////////////////////////////////////////////////////////////////	

	static String[][] eeveeMoveTable = new String[][] {};
	
	static Object[] eeveeInfo1 = new Object[] {};
	
	static Dictionary<String, Object> eeveeInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////134 VAPOREON///////////////////////////////////////////////////////////////////////	

	static String[][] vaporeonMoveTable = new String[][] {};
	
	static Object[] vaporeonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> vaporeonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////135 JOLTEON///////////////////////////////////////////////////////////////////////	

	static String[][] jolteonMoveTable = new String[][] {};
	
	static Object[] jolteonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> jolteonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////136 FLAREON///////////////////////////////////////////////////////////////////////	

	static String[][] flareonMoveTable = new String[][] {};
	
	static Object[] flareonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> flareonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////137 PORYGON///////////////////////////////////////////////////////////////////////	

	static String[][] porygonMoveTable = new String[][] {};
	
	static Object[] porygonInfo1 = new Object[] {};
	
	static Dictionary<String, Object> porygonInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////138 OMANYTE///////////////////////////////////////////////////////////////////////	

	static String[][] omanyteMoveTable = new String[][] {};
	
	static Object[] omanyteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> omanyteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////139 OMASTAR///////////////////////////////////////////////////////////////////////	

	static String[][] omastarMoveTable = new String[][] {};
	
	static Object[] omastarInfo1 = new Object[] {};
	
	static Dictionary<String, Object> omastarInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////140 KABUTO///////////////////////////////////////////////////////////////////////	
	
	static String[][] kabutoMoveTable = new String[][] {};
	
	static Object[] kabutoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kabutoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////141 KABUTOPS///////////////////////////////////////////////////////////////////////	
	
	static String[][] kabutopsMoveTable = new String[][] {};
	
	static Object[] kabutopsInfo1 = new Object[] {};
	
	static Dictionary<String, Object> kabutopsInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////142 AERODACTYL///////////////////////////////////////////////////////////////////////	

	static String[][] aerodactylMoveTable = new String[][] {};
	
	static Object[] aerodactylInfo1 = new Object[] {};
	
	static Dictionary<String, Object> aerodactylInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////143 SNORLAX///////////////////////////////////////////////////////////////////////	
	
	static String[][] snorlaxMoveTable = new String[][] {};
	
	static Object[] snorlaxInfo1 = new Object[] {};
	
	static Dictionary<String, Object> snorlaxInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////144 ARTICUNO///////////////////////////////////////////////////////////////////////	

	static String[][] articunoMoveTable = new String[][] {};
	
	static Object[] articunoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> articunoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////145 ZAPDOS///////////////////////////////////////////////////////////////////////	

	static String[][] zapdosMoveTable = new String[][] {};
	
	static Object[] zapdosInfo1 = new Object[] {};
	
	static Dictionary<String, Object> zapdosInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////146 MOLTRES///////////////////////////////////////////////////////////////////////	

	static String[][] moltresMoveTable = new String[][] {};
	
	static Object[] moltresInfo1 = new Object[] {};
	
	static Dictionary<String, Object> moltresInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////147 DRATINI///////////////////////////////////////////////////////////////////////	

	static String[][] dratiniMoveTable = new String[][] {};
	
	static Object[] dratiniInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dratiniInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////148 DRAGONAIR///////////////////////////////////////////////////////////////////////	

	static String[][] dragonairMoveTable = new String[][] {};
	
	static Object[] dragonairInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dragonairInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////149 DRAGONITE///////////////////////////////////////////////////////////////////////	

	static String[][] dragoniteMoveTable = new String[][] {};
	
	static Object[] dragoniteInfo1 = new Object[] {};
	
	static Dictionary<String, Object> dragoniteInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////150 MEWTWO///////////////////////////////////////////////////////////////////////	
	
	static String[][] mewtwoMoveTable = new String[][] {};
	
	static Object[] mewtwoInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mewtwoInfo2 = new Hashtable<String, Object>();

///////////////////////////////////////////////////////////////////151 MEW///////////////////////////////////////////////////////////////////////	

	static String[][] mewMoveTable = new String[][] {};
	
	static Object[] mewInfo1 = new Object[] {};
	
	static Dictionary<String, Object> mewInfo2 = new Hashtable<String, Object>();
	
	
	
	
	
	
	public static void Initialize() {
		
		for (int i = 0; i < secondaryFormat.length; i++) {
			bulbInfo2.put(secondaryFormat[i], bulbInfo1[i]);			//1
			ivyInfo2.put(secondaryFormat[i], ivyInfo1[i]);				//2
			venuInfo2.put(secondaryFormat[i], venuInfo1[i]);			//3
			charmanderInfo2.put(secondaryFormat[i], charmanderInfo1[i]);//4
			charmeleonInfo2.put(secondaryFormat[i], charmeleonInfo1[i]);//5
			charizardInfo2.put(secondaryFormat[i], charizardInfo1[i]);	//6
			squirtleInfo2.put(secondaryFormat[i], squirtleInfo1[i]);	//7
			wartortleInfo2.put(secondaryFormat[i], wartortleInfo1[i]);	//8
			blastoiseInfo2.put(secondaryFormat[i], blastoiseInfo1[i]);	//9
			caterpieInfo2.put(secondaryFormat[i], caterpieInfo1[i]);	//10
			metapodInfo2.put(secondaryFormat[i], metapodInfo1[i]);		//11
			butterfreeInfo2.put(secondaryFormat[i], butterfreeInfo1[i]);//12
			weedleInfo2.put(secondaryFormat[i], weedleInfo1[i]);		//13
			kakunaInfo2.put(secondaryFormat[i], kakunaInfo1[i]);		//14
			beedrillInfo2.put(secondaryFormat[i], beedrillInfo1[i]);	//15
			pidgeyInfo2.put(secondaryFormat[i], pidgeyInfo1[i]);		//16
			pidgeottoInfo2.put(secondaryFormat[i], pidgeottoInfo1[i]);	//17
			pidgeotInfo2.put(secondaryFormat[i], pidgeotInfo1[i]);		//18
			rattataInfo2.put(secondaryFormat[i], rattataInfo1[i]);		//19
			raticateInfo2.put(secondaryFormat[i], raticateInfo1[i]);	//20
			spearowInfo2.put(secondaryFormat[i], spearowInfo1[i]);		//21
			fearowInfo2.put(secondaryFormat[i], fearowInfo1[i]);		//22
			ekansInfo2.put(secondaryFormat[i], ekansInfo1[i]);			//23
			arbokInfo2.put(secondaryFormat[i], arbokInfo1[i]);			//24
			pikachuInfo2.put(secondaryFormat[i], pikachuInfo1[i]);		//25
			raichuInfo2.put(secondaryFormat[i], raichuInfo1[i]);		//26
			sandshrewInfo2.put(secondaryFormat[i], sandshrewInfo1[i]);	//27
			sandslashInfo2.put(secondaryFormat[i], sandslashInfo1[i]);	//28
			nidoranfInfo2.put(secondaryFormat[i], nidoranfInfo1[i]);	//29
			nidorinaInfo2.put(secondaryFormat[i], nidorinaInfo1[i]);	//30
			nidoqueenInfo2.put(secondaryFormat[i], nidoqueenInfo1[i]);	//31
			nidoranmInfo2.put(secondaryFormat[i], nidoranmInfo1[i]);	//32
			nidorinoInfo2.put(secondaryFormat[i], nidorinoInfo1[i]);	//33
			nidokingInfo2.put(secondaryFormat[i], nidokingInfo1[i]);	//34
			clefairyInfo2.put(secondaryFormat[i], clefairyInfo1[i]);	//35
			clefableInfo2.put(secondaryFormat[i], clefableInfo1[i]);	//36
			vulpixInfo2.put(secondaryFormat[i], vulpixInfo1[i]);		//37
			ninetalesInfo2.put(secondaryFormat[i], ninetalesInfo1[i]);	//38
			jigglypuffInfo2.put(secondaryFormat[i], jigglypuffInfo1[i]);//39
			wigglytuffInfo2.put(secondaryFormat[i], wigglytuffInfo1[i]);//40
			zubatInfo2.put(secondaryFormat[i], zubatInfo1[i]);			//41
			golbatInfo2.put(secondaryFormat[i], golbatInfo1[i]);		//42
			oddishInfo2.put(secondaryFormat[i], oddishInfo1[i]);		//43
			gloomInfo2.put(secondaryFormat[i], gloomInfo1[i]);			//44
			vileplumeInfo2.put(secondaryFormat[i], vileplumeInfo1[i]);	//45
			parasInfo2.put(secondaryFormat[i], parasInfo1[i]);			//46
			parasectInfo2.put(secondaryFormat[i], parasectInfo1[i]);	//47
			venonatInfo2.put(secondaryFormat[i], venonatInfo1[i]);		//48
			venomothInfo2.put(secondaryFormat[i], venomothInfo1[i]);	//49
			diglettInfo2.put(secondaryFormat[i], diglettInfo1[i]);		//50
			dugtrioInfo2.put(secondaryFormat[i], dugtrioInfo1[i]);		//51
			meowthInfo2.put(secondaryFormat[i], meowthInfo1[i]);		//52
			persianInfo2.put(secondaryFormat[i], persianInfo1[i]);		//53
			psyduckInfo2.put(secondaryFormat[i], psyduckInfo1[i]);		//54
			golduckInfo2.put(secondaryFormat[i], golduckInfo1[i]);		//55
			mankeyInfo2.put(secondaryFormat[i], mankeyInfo1[i]);		//56
			primeapeInfo2.put(secondaryFormat[i], primeapeInfo1[i]);	//57
			growlitheInfo2.put(secondaryFormat[i], growlitheInfo1[i]);	//58
			arcanineInfo2.put(secondaryFormat[i], arcanineInfo1[i]);	//59
			poliwagInfo2.put(secondaryFormat[i], poliwagInfo1[i]);		//60
			poliwhirlInfo2.put(secondaryFormat[i], poliwhirlInfo1[i]);	//61
			poliwrathInfo2.put(secondaryFormat[i], poliwrathInfo1[i]);	//62
			abraInfo2.put(secondaryFormat[i], abraInfo1[i]);			//63
			kadabraInfo2.put(secondaryFormat[i], kadabraInfo1[i]);		//64
			alakazamInfo2.put(secondaryFormat[i], alakazamInfo1[i]);	//65
			machopInfo2.put(secondaryFormat[i], machopInfo1[i]);		//66
			machokeInfo2.put(secondaryFormat[i], machokeInfo1[i]);		//67
			machampInfo2.put(secondaryFormat[i], machampInfo1[i]);		//68
			bellsproutInfo2.put(secondaryFormat[i], bellsproutInfo1[i]);//69
			weepinbellInfo2.put(secondaryFormat[i], weepinbellInfo1[i]);//70
			victreebelInfo2.put(secondaryFormat[i], victreebelInfo1[i]);//71
			tentacoolInfo2.put(secondaryFormat[i], tentacoolInfo1[i]);	//72
			tentacruelInfo2.put(secondaryFormat[i], tentacruelInfo1[i]);//73
			geodudeInfo2.put(secondaryFormat[i], geodudeInfo1[i]);		//74
			gravelerInfo2.put(secondaryFormat[i], gravelerInfo1[i]);	//75
			golemInfo2.put(secondaryFormat[i], golemInfo1[i]);			//76
			ponytaInfo2.put(secondaryFormat[i], ponytaInfo1[i]);		//77
			rapidashInfo2.put(secondaryFormat[i], rapidashInfo1[i]);	//78
			slowpokeInfo2.put(secondaryFormat[i], slowpokeInfo1[i]);	//79
			slowbroInfo2.put(secondaryFormat[i], slowbroInfo1[i]);		//80
			magnemiteInfo2.put(secondaryFormat[i], magnemiteInfo1[i]);	//81
			magnetonInfo2.put(secondaryFormat[i], magnetonInfo1[i]);	//82
			farfetchInfo2.put(secondaryFormat[i], farfetchInfo1[i]);	//83
			doduoInfo2.put(secondaryFormat[i], doduoInfo1[i]);			//84
			dodrioInfo2.put(secondaryFormat[i], dodrioInfo1[i]);		//85
			seelInfo2.put(secondaryFormat[i], seelInfo1[i]);			//86
			dewgongInfo2.put(secondaryFormat[i], dewgongInfo1[i]);		//87
			grimerInfo2.put(secondaryFormat[i], grimerInfo1[i]);		//88
			mukInfo2.put(secondaryFormat[i], mukInfo1[i]);				//89
			shellderInfo2.put(secondaryFormat[i], shellderInfo1[i]);	//90
			cloysterInfo2.put(secondaryFormat[i], cloysterInfo1[i]);	//91
			gastlyInfo2.put(secondaryFormat[i], gastlyInfo1[i]);		//92
			haunterInfo2.put(secondaryFormat[i], haunterInfo1[i]);		//93
			gengarInfo2.put(secondaryFormat[i], gengarInfo1[i]);		//94
			onixInfo2.put(secondaryFormat[i], onixInfo1[i]);			//95
			drowzeeInfo2.put(secondaryFormat[i], drowzeeInfo1[i]);		//96
			hypnoInfo2.put(secondaryFormat[i], hypnoInfo1[i]);			//97
			krabbyInfo2.put(secondaryFormat[i], krabbyInfo1[i]);		//98
			kinglerInfo2.put(secondaryFormat[i], kinglerInfo1[i]);		//99
			voltorbInfo2.put(secondaryFormat[i], voltorbInfo1[i]);		//100
			electrodeInfo2.put(secondaryFormat[i], electrodeInfo1[i]);	//101
			exeggcuteInfo2.put(secondaryFormat[i], exeggcuteInfo1[i]);	//102
			exeggutorInfo2.put(secondaryFormat[i], exeggutorInfo1[i]);	//103
			cuboneInfo2.put(secondaryFormat[i], cuboneInfo1[i]);		//104
			marowakInfo2.put(secondaryFormat[i], marowakInfo1[i]);		//105
			hitmonleeInfo2.put(secondaryFormat[i], hitmonleeInfo1[i]);	//106
			hitmonchanInfo2.put(secondaryFormat[i], hitmonchanInfo1[i]);//107
			lickitungInfo2.put(secondaryFormat[i], lickitungInfo1[i]);	//108
			koffingInfo2.put(secondaryFormat[i], koffingInfo1[i]);		//109
			weezingInfo2.put(secondaryFormat[i], weezingInfo1[i]);		//110
			rhyhornInfo2.put(secondaryFormat[i], rhyhornInfo1[i]);		//111
			rhydonInfo2.put(secondaryFormat[i], rhydonInfo1[i]);		//112
			chanseyInfo2.put(secondaryFormat[i], chanseyInfo1[i]);		//113
			tangelaInfo2.put(secondaryFormat[i], tangelaInfo1[i]);		//114
			kangaskhanInfo2.put(secondaryFormat[i], kangaskhanInfo1[i]);//115
			horseaInfo2.put(secondaryFormat[i], horseaInfo1[i]);		//116
			seadraInfo2.put(secondaryFormat[i], seadraInfo1[i]);		//117
			goldeenInfo2.put(secondaryFormat[i], goldeenInfo1[i]);		//118
			seakingInfo2.put(secondaryFormat[i], seakingInfo1[i]);		//119
			staryuInfo2.put(secondaryFormat[i], staryuInfo1[i]);		//120
			starmieInfo2.put(secondaryFormat[i], starmieInfo1[i]);		//121
			mimeInfo2.put(secondaryFormat[i], mimeInfo1[i]);			//122
			scytherInfo2.put(secondaryFormat[i], scytherInfo1[i]);		//123
			jynxInfo2.put(secondaryFormat[i], jynxInfo1[i]);			//124
			electabuzzInfo2.put(secondaryFormat[i], electabuzzInfo1[i]);//125
			magmarInfo2.put(secondaryFormat[i], magmarInfo1[i]);		//126
			pinsirInfo2.put(secondaryFormat[i], pinsirInfo1[i]);		//127
			taurosInfo2.put(secondaryFormat[i], taurosInfo1[i]);		//128
			magikarpInfo2.put(secondaryFormat[i], magikarpInfo1[i]);	//129
			gyaradosInfo2.put(secondaryFormat[i], gyaradosInfo1[i]);	//130
			laprasInfo2.put(secondaryFormat[i], laprasInfo1[i]);		//131
			dittoInfo2.put(secondaryFormat[i], dittoInfo1[i]);			//132
			eeveeInfo2.put(secondaryFormat[i], eeveeInfo1[i]);			//133
			vaporeonInfo2.put(secondaryFormat[i], vaporeonInfo1[i]);	//134
			jolteonInfo2.put(secondaryFormat[i], jolteonInfo1[i]);		//135
			flareonInfo2.put(secondaryFormat[i], flareonInfo1[i]);		//136
			porygonInfo2.put(secondaryFormat[i], porygonInfo1[i]);		//137
			omanyteInfo2.put(secondaryFormat[i], omanyteInfo1[i]);		//138
			omastarInfo2.put(secondaryFormat[i], omastarInfo1[i]);		//139
			kabutoInfo2.put(secondaryFormat[i], kabutoInfo1[i]);		//140
			kabutopsInfo2.put(secondaryFormat[i], kabutopsInfo1[i]);	//141
			aerodactylInfo2.put(secondaryFormat[i], aerodactylInfo1[i]);//142
			snorlaxInfo2.put(secondaryFormat[i], snorlaxInfo1[i]);		//143
			articunoInfo2.put(secondaryFormat[i], articunoInfo1[i]);	//144
			zapdosInfo2.put(secondaryFormat[i], zapdosInfo1[i]);		//145
			moltresInfo2.put(secondaryFormat[i], moltresInfo1[i]);		//146
			dratiniInfo2.put(secondaryFormat[i], dratiniInfo1[i]);		//147
			dragonairInfo2.put(secondaryFormat[i], dragonairInfo1[i]);	//148
			dragoniteInfo2.put(secondaryFormat[i], dragoniteInfo1[i]);	//149
			mewtwoInfo2.put(secondaryFormat[i], mewtwoInfo1[i]);		//150
			mewInfo2.put(secondaryFormat[i], mewInfo1[i]);				//151
		}
		
		pokemon.put("Bulbasaur", bulbInfo2);
		pokemon.put("Ivysaur", ivyInfo2);
		pokemon.put("Venusaur", venuInfo2);
		pokemon.put("Charmander", charmanderInfo2);
		pokemon.put("Charmeleon", charmeleonInfo2);
		pokemon.put("Charizard", charizardInfo2);
		pokemon.put("Squirtle", squirtleInfo2);
		pokemon.put("Wartortle", wartortleInfo2);
		pokemon.put("Blastoise", blastoiseInfo2);
		pokemon.put("Caterpie", caterpieInfo2);
		pokemon.put("Metapod", metapodInfo2);
		pokemon.put("Butterfree", butterfreeInfo2);
		pokemon.put("Weedle", weedleInfo2);
		pokemon.put("Kakuna", kakunaInfo2);
		pokemon.put("Beedrill", beedrillInfo2);
		pokemon.put("Pidgey", pidgeyInfo2);
		pokemon.put("Pidgeotto", pidgeottoInfo2);
		pokemon.put("Pidgeot", pidgeotInfo2);
		pokemon.put("Rattata", rattataInfo2);
		pokemon.put("Raticate", raticateInfo2);
		pokemon.put("Spearow", spearowInfo2);
		pokemon.put("Fearow", fearowInfo2);
		pokemon.put("Ekans", ekansInfo2);
		pokemon.put("Arbok", arbokInfo2);
		pokemon.put("Pikachu", pikachuInfo2);
		pokemon.put("Raichu", raichuInfo2);
		pokemon.put("Sandshrew", sandshrewInfo2);
		pokemon.put("Sandslash", sandslashInfo2);
		pokemon.put("NidoranF", nidoranfInfo2);
		pokemon.put("Nidorina", nidorinaInfo2);
		pokemon.put("Nidoqueen", nidoqueenInfo2);
		pokemon.put("NidoranM", nidoranmInfo2);
		pokemon.put("Nidorino", nidorinoInfo2);
		pokemon.put("Nidoking", nidokingInfo2);
		pokemon.put("Clefairy", clefairyInfo2);
		pokemon.put("Clefable", clefableInfo2);
		pokemon.put("Vulpix", vulpixInfo2);
		pokemon.put("Ninetales", ninetalesInfo2);
		pokemon.put("Jigglypuff", jigglypuffInfo2);
		pokemon.put("Wigglytuff", wigglytuffInfo2);
		pokemon.put("Zubat", zubatInfo2);
		pokemon.put("Golbat", golbatInfo2);
		pokemon.put("Oddish", oddishInfo2);
		pokemon.put("Gloom", gloomInfo2);
		pokemon.put("Vileplume", vileplumeInfo2);
		pokemon.put("Paras", parasInfo2);
		pokemon.put("Parasect", parasectInfo2);
		pokemon.put("Venonat", venonatInfo2);
		pokemon.put("Venomoth", venomothInfo2);
		pokemon.put("Diglett", diglettInfo2);
		pokemon.put("Dugtrio", dugtrioInfo2);
		pokemon.put("Meowth", meowthInfo2);
		pokemon.put("Persian", persianInfo2);
		pokemon.put("Psyduck", psyduckInfo2);
		pokemon.put("Golduck", golduckInfo2);
		pokemon.put("Mankey", mankeyInfo2);
		pokemon.put("Primeape", primeapeInfo2);
		pokemon.put("Growlithe", growlitheInfo2);
		pokemon.put("Arcanine", arcanineInfo2);
		pokemon.put("Poliwag", poliwagInfo2);
		pokemon.put("Poliwhirl", poliwhirlInfo2);
		pokemon.put("Poliwrath", poliwrathInfo2);
		pokemon.put("Abra", abraInfo2);
		pokemon.put("Kadabra", kadabraInfo2);
		pokemon.put("Alakazam", alakazamInfo2);
		pokemon.put("Machop", machopInfo2);
		pokemon.put("Machoke", machokeInfo2);
		pokemon.put("Machamp", machampInfo2);
		pokemon.put("Bellsprout", bellsproutInfo2);
		pokemon.put("Weepinbell", weepinbellInfo2);
		pokemon.put("Victreebel", victreebelInfo2);
		pokemon.put("Tentacool", tentacoolInfo2);
		pokemon.put("Tentacruel", tentacruelInfo2);
		pokemon.put("Geodude", geodudeInfo2);
		pokemon.put("Graveler", gravelerInfo2);
		pokemon.put("Golem", golemInfo2);
		pokemon.put("Ponyta", ponytaInfo2);
		pokemon.put("Rapidash", rapidashInfo2);
		pokemon.put("Slowpoke", slowpokeInfo2);
		pokemon.put("Slowbro", slowbroInfo2);
		pokemon.put("Magnemite", magnemiteInfo2);
		pokemon.put("Magneton", magnetonInfo2);
		pokemon.put("Farfetch'd", farfetchInfo2);
		pokemon.put("Doduo", doduoInfo2);
		pokemon.put("Dodrio", dodrioInfo2);
		pokemon.put("Seel", seelInfo2);
		pokemon.put("Dewgong", dewgongInfo2);
		pokemon.put("Grimer", grimerInfo2);
		pokemon.put("Muk", mukInfo2);
		pokemon.put("Shellder", shellderInfo2);
		pokemon.put("Cloyster", cloysterInfo2);
		pokemon.put("Gastly", gastlyInfo2);
		pokemon.put("Haunter", haunterInfo2);
		pokemon.put("Gengar", gengarInfo2);
		pokemon.put("Onix", onixInfo2);
		pokemon.put("Drowzee", drowzeeInfo2);
		pokemon.put("Hypno", hypnoInfo2);
		pokemon.put("Krabby", krabbyInfo2);
		pokemon.put("Kingler", kinglerInfo2);
		pokemon.put("Voltorb", voltorbInfo2);
		pokemon.put("Electrode", electrodeInfo2);
		pokemon.put("Exeggcute", exeggcuteInfo2);
		pokemon.put("Exeggutor", exeggutorInfo2);
		pokemon.put("Cubone", cuboneInfo2);
		pokemon.put("Marowak", marowakInfo2);
		pokemon.put("Hitmonlee", hitmonleeInfo2);
		pokemon.put("Hitmonchan", hitmonchanInfo2);
		pokemon.put("Lickitung", lickitungInfo2);
		pokemon.put("Koffing", koffingInfo2);
		pokemon.put("Weezing", weezingInfo2);
		pokemon.put("Rhyhorn", rhyhornInfo2);
		pokemon.put("Rhydon", rhydonInfo2);
		pokemon.put("Chansey", chanseyInfo2);
		pokemon.put("Tangela", tangelaInfo2);
		pokemon.put("Kangaskhan", kangaskhanInfo2);
		pokemon.put("Horsea", horseaInfo2);
		pokemon.put("Seadra", seadraInfo2);
		pokemon.put("Goldeen", goldeenInfo2);
		pokemon.put("Seaking", seakingInfo2);
		pokemon.put("Staryu", staryuInfo2);
		pokemon.put("Starmie", starmieInfo2);
		pokemon.put("Mr. Mime", mimeInfo2);
		pokemon.put("Scyther", scytherInfo2);
		pokemon.put("Jynx", jynxInfo2);
		pokemon.put("Electabuzz", electabuzzInfo2);
		pokemon.put("Magmar", magmarInfo2);
		pokemon.put("Pinsir", pinsirInfo2);
		pokemon.put("Tauros", taurosInfo2);
		pokemon.put("Magikarp", magikarpInfo2);
		pokemon.put("Gyarados", gyaradosInfo2);
		pokemon.put("Lapras", laprasInfo2);
		pokemon.put("Ditto", dittoInfo2);
		pokemon.put("Eevee", eeveeInfo2);
		pokemon.put("Vaporeon", vaporeonInfo2);
		pokemon.put("Jolteon", jolteonInfo2);
		pokemon.put("Flareon", flareonInfo2);
		pokemon.put("Porygon", porygonInfo2);
		pokemon.put("Omanyte", omanyteInfo2);
		pokemon.put("Omastar", omastarInfo2);
		pokemon.put("Kabuto", kabutopsInfo2);
		pokemon.put("Kabutops", kabutopsInfo2);
		pokemon.put("Aerodactyl", aerodactylInfo2);
		pokemon.put("Snorlax", snorlaxInfo2);
		pokemon.put("Articuno", articunoInfo2);
		pokemon.put("Zapdos", zapdosInfo2);
		pokemon.put("Moltres", moltresInfo2);
		pokemon.put("Dratini", dratiniInfo2);
		pokemon.put("Dragonair", dragonairInfo2);
		pokemon.put("Dragonite", dragoniteInfo2);
		pokemon.put("Mewtwo", mewtwoInfo2);
		pokemon.put("Mew", mewInfo2);
	}
	
	/* MoveData Class:
	 * moves Format:
	 * 
	 * Dictionary<String, Object>
	 * "Growl" : new Object[] {"type", "category", int power, int accuracy, int basePP, "effect"}
	 * 
	 */
}
