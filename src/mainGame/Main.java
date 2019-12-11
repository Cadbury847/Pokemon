package mainGame;

import java.util.Dictionary;
import java.util.Hashtable;

import data.DataHandler;
import data.Maths;
import data.MoveData;

import data.PokemonData;
import data.TypeData;


public class Main {
	public static void main(String[] args) {
		
		
//		String[] test1 = new String[] {"1","2","3","4","5","6","7"};
//		String[] test2 = new String[] {"6","7","8","Carrot","1"};
//		
//		String[] testResult = DataHandler.concatenate(test1, test2);
//		for (String i : testResult) {
//			System.out.print(i + " ");
//		}
		System.out.println();
		
		TypeData.Initialize();
		//PokemonData.Initialize();
		MoveData.Initialize();
		
		int hpTest = Maths.getNewStat(50, 15, 0, 100, "HP");
		int atkTest = Maths.getNewStat(20, 15, 0, 100, "");
		int defTest = Maths.getNewStat(55, 15, 0, 100, "");
		int spdefTest = Maths.getNewStat(25, 15, 0, 100, "");
		int spdTest = Maths.getNewStat(30, 15, 0, 100, "");
		
		System.out.println(hpTest);
		System.out.println(atkTest);
		System.out.println(defTest);
		System.out.println(spdefTest);
		System.out.println(spdTest);
		System.out.println();
		
		Dictionary<String, Integer> currentMoves = new Hashtable<String, Integer>();
		currentMoves.put("Splash", 40);
		Dictionary<Integer,String> posMoves = new Hashtable<Integer,String>();
		posMoves.put(1, "Splash");
		
		Pokemon testPoke = new Pokemon("Arbok", new String[] {"Water"}, currentMoves, posMoves, true, true, false, 20);
		
		System.out.println(testPoke.getHPIV());
		System.out.println(testPoke.getAttackIV());
		System.out.println(testPoke.getDefenceIV());
		System.out.println(testPoke.getSpAtkIV());
		System.out.println(testPoke.getSpeedIV());
		System.out.println();
		
		System.out.println(testPoke.getHP());
		System.out.println(testPoke.getAttack());
		System.out.println(testPoke.getDefence());
		System.out.println(testPoke.getSpAtk());
		System.out.println(testPoke.getSpeed());
		System.out.println();
		
		
		System.out.println(MoveData.getEffect("Ember"));
		
		
		String[][] tempDict =  (String[][]) PokemonData.pokemon.get("Pikachu").get("possibleMoves");

		for (Object[] i : tempDict) {
			for (Object j : i) {
				String tempStr = j.toString();
				if (tempStr.contains("^")) {
					System.out.println(tempStr.substring(1));
					//System.out.println(i.length);
				}
				
			}
		}
		
		
		
		
	}
}
