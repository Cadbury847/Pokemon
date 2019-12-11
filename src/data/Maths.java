package data;

import java.util.Random;

import mainGame.Pokemon;

public class Maths {

	private static int getE(int statEXP) {
		int retVal = (int) Math.floor(Math.min(255, Math.floor(Math.sqrt(Math.max(0, statEXP -1)) + 1)) / 4);
		return retVal;
	}
	
	
	public static int getNewStat(int b, int i, int statEXP, int l, String stat) {
		
		int newStat;
		
		if (stat == "HP") {
			newStat = (int) Math.floor((2 * (b + i) + getE(statEXP)) * l / 100 + l + 10);
		} else {
			newStat = (int) Math.floor((2 * (b + i) + getE(statEXP)) * l / 100 + 5);
		}
		
		return newStat;
	}
	
	public static int setHPIV(Pokemon pokemon) {
		int x = 0;
		
		if ((pokemon.getAttackIV() & 1) == 0) {
			x += 8;
		}
		if ((pokemon.getDefenceIV() & 1) == 0) {
			x += 4;
		}
		if ((pokemon.getSpeedIV() & 1) == 0) {
			x += 2;
		}
		if ((pokemon.getSpAtkIV() & 1) == 0) {
			x += 1;
		}
		
		return x;
	}
	
	public static int randint(int x) {
		
		Random random = new Random();
		int randint = random.nextInt(x);
		
		return randint;
	}

}
