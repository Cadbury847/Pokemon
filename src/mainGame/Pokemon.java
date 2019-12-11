package mainGame;

import java.util.*;

import data.*;

public class Pokemon {

	String name, nature;
	String[] type, weaknesses, strengths, noEffect;
	
	public Dictionary<String, Integer> currentMoveSet = new Hashtable<String, Integer>();
	Dictionary<Integer,String> possibleMoves;
	boolean alive, captured, multiType, confused, paralyzed, burned, asleep, poisoned, strongPoison = false;
	public int currentHealth, level, HP, attack, defence, specialAttack, specialDefence, speed;
	private int oldAtk, oldDef, oldSpAtk, oldSpDef, oldSpeed, oldHp = 0;
	private int atkStage, defStage, speedStage, spDefStage, spAtkStage, evasionStage, accuracyStage = 0;
	private int HPIV, atkIV, defIV, speedIV, spDefIV, spAtkIV;
	int maxHealth;
	
	public Pokemon(String name, String[] type,  Dictionary<String, Integer> currentMoveSet, 
			Dictionary<Integer,String> possibleMoves, boolean alive, boolean captured, boolean multiType, int level) {
		this.name = name;
		this.type = type;
		this.currentMoveSet = currentMoveSet;
		this.possibleMoves = possibleMoves;
		this.alive = alive;
		this.captured = captured;
		this.multiType = multiType;
		this.level = level;
		
		if (multiType) {
			this.weaknesses = DataHandler.concatenate(TypeData.WEAKNESSES.get(type[0]), TypeData.WEAKNESSES.get(type[1]));
			this.strengths = DataHandler.concatenate(TypeData.STRENGTHS.get(type[0]), TypeData.STRENGTHS.get(type[1]));
			this.noEffect = DataHandler.concatenate(TypeData.NOEFFECT.get(type[0]), TypeData.NOEFFECT.get(type[1]));
		} else {
			this.weaknesses = TypeData.WEAKNESSES.get(type[0]);
			this.strengths = TypeData.STRENGTHS.get(type[0]);
			this.noEffect = TypeData.NOEFFECT.get(type[0]);
		}
		
		this.atkIV = Maths.randint(16);
		this.defIV = Maths.randint(16);
		this.speedIV = Maths.randint(16);
		this.spDefIV = Maths.randint(16);
		this.spAtkIV = Maths.randint(16);
		this.HPIV = Maths.setHPIV(this);
		
		this.attack = Maths.getNewStat(10, atkIV, 0, level, "");
		this.defence = Maths.getNewStat(55, defIV, 0, level, "");
		this.specialAttack = Maths.getNewStat(20, spAtkIV, 0, level, "");
		this.specialDefence = Maths.getNewStat(20, spDefIV, 0, level, "");
		this.speed = Maths.getNewStat(80, speedIV, 0, level, "");
		this.HP = Maths.getNewStat(20, HPIV, 0, level, "HP");
		
	}

	public boolean[] levelUp() {
		level += 1;
		oldAtk = attack;
		oldDef = defence;
		oldSpeed = speed;
		oldHp = HP;
		oldSpDef = specialDefence;
		oldSpAtk = specialAttack;
		
		attack = Maths.getNewStat(getBaseAtk(), getAttackIV(), getAttackXP(), level, "Atk");
		defence = Maths.getNewStat(getBaseDef(), getDefenceIV(), getDefenceXP(), level, "Def");
		speed = Maths.getNewStat(getBaseSpeed(), getSpeedIV(), getSpeedXP(), level, "Spd");
		specialDefence = Maths.getNewStat(getBaseSpDef(), getSpDefIV(), getSpDefXP(), level, "Sp.Def");
		specialAttack = Maths.getNewStat(getBaseSpAtk(), getSpAtkIV(), getSpAtkXP(), level, "Sp.Atk");
		HP = Maths.getNewStat(getBaseHP(), getHPIV(), getHPXP(), level, "HP");
		
		boolean[] retList = new boolean[] {attack > oldAtk, defence > oldDef, speed > oldSpeed, specialDefence > oldSpDef, specialAttack > oldSpAtk, HP > oldHp};
		
		return retList;
	}

	
	int getHP() {
		return HP;
	}
	
	int getAttack() {
		return attack;
	}
	
	int getDefence() {
		return defence;
	}
	
	int getSpeed() {
		return speed;
	}
	
	int getSpDef() {
		return specialDefence;
	}
	
	int getSpAtk() {
		return specialAttack;
	}

	private int getHPXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getSpAtkXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getSpDefXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getSpeedXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getDefenceXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getAttackXP() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getWeaknesses() {
		return weaknesses;
	}


	public String[] getNoEffect() {
		return noEffect;
	}


	public String[] getStrengths() {
		return strengths;
	}


	public int getAccuracyMod() {
		return accuracyStage;
	}


	public int getEvasionMod() {
		return evasionStage;
	}
	
	public int getAttackMod() {
		return atkStage;
	}
	
	public int getDefenceMod() {
		return defStage;
	}
	
	public int getSpeedMod() {
		return speedStage;
	}
	
	public int getSpDefMod() {
		return spDefStage;
	}
	
	public int getSpAtkMod() {
		return spAtkStage;
	}

	public String getName() {
		return name;
	}


	public int getAttackIV() {
		return atkIV;
	}
	
	public int getDefenceIV() {
		return defIV;
	}
	
	public int getSpeedIV() {
		return speedIV;
	}
	
	public int getSpAtkIV() {
		return spAtkIV;
	}
	
	public int getSpDefIV() {
		return spDefIV;
	}
	
	int getHPIV() {
		return HPIV;
	}
	
	public int getBaseAtk() {
		return (int) PokemonData.pokemon.get(name).get("baseAttack");
	}
	
	public int getBaseDef() {
		return (int) PokemonData.pokemon.get(name).get("baseDefence");
	}
	
	public int getBaseSpeed() {
		return (int) PokemonData.pokemon.get(name).get("baseSpeed");
	}
	
	public int getBaseHP() {
		return (int) PokemonData.pokemon.get(name).get("baseHp");
	}
	
	public int getBaseSpAtk() {
		return (int) PokemonData.pokemon.get(name).get("baseSp.Atk");
	}
	
	public int getBaseSpDef() {
		return (int) PokemonData.pokemon.get(name).get("baseSp.Def");
	}

	public int getStat(Object object) {
		if (object == "Special") {
			return specialAttack;
		} else {
			return attack;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
