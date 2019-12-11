package data;

import java.util.Dictionary;
import java.util.Hashtable;

public class TypeData {
	
	public static Dictionary<String, String[]> WEAKNESSES = new Hashtable<String, String[]>();
	public static Dictionary<String, String[]> NOEFFECT = new Hashtable<String, String[]>();
	public static Dictionary<String, String[]> STRENGTHS = new Hashtable<String, String[]>();
	
	public static void Initialize() {

		WEAKNESSES.put("Normal", new String[] {"Fighting"});
		WEAKNESSES.put("Fire", new String[] {"Water", "Ground", "Rock"});
		WEAKNESSES.put("Water", new String[] {"Electric", "Grass"});
		WEAKNESSES.put("Electric", new String[] {"Ground"});
		WEAKNESSES.put("Grass", new String[] {"Fire", "Ice", "Poison", "Flying", "Bug"});
		WEAKNESSES.put("Ice", new String[] {"Fire", "Fighting", "Rock"});
		WEAKNESSES.put("Fighting", new String[] {"Flying", "Psychic"});
		WEAKNESSES.put("Poison", new String[] {"Ground", "Psychic", "Bug"});
		WEAKNESSES.put("Ground", new String[] {"Water", "Grass", "Ice"});
		WEAKNESSES.put("Flying", new String[] {"Electric", "Ice", "Rock"});
		WEAKNESSES.put("Psychic", new String[] {"Bug"});
		WEAKNESSES.put("Bug", new String[] {"Fire", "Poison", "Flying", "Rock"});
		WEAKNESSES.put("Rock", new String[] {"Water", "Grass", "Fighting", "Ground"});
		WEAKNESSES.put("Ghost", new String[] {"Ghost"});
		WEAKNESSES.put("Dragon", new String[] {"Ice", "Dragon"});
		
		
		NOEFFECT.put("Normal", new String[] {"Ghost"});
		NOEFFECT.put("Ground", new String[] {"Electric"});
		NOEFFECT.put("Flying", new String[] {"Ground"});
		NOEFFECT.put("Psychic", new String[] {"Ghost"});
		NOEFFECT.put("Ghost", new String[] {"Normal","Fighting"});
		
		
		STRENGTHS.put("Normal", new String[] {});
		STRENGTHS.put("Fire", new String[] {"Fire", "Grass", "Bug"});
		STRENGTHS.put("Water", new String[] {"Fire", "Water", "Ice"});
		STRENGTHS.put("Electric", new String[] {"Electric", "Flying"});
		STRENGTHS.put("Grass", new String[] {"Water", "Electric", "Grass", "Ground"});
		STRENGTHS.put("Ice", new String[] {"Ice"});
		STRENGTHS.put("Fighting", new String[] {"Bug", "Rock"});
		STRENGTHS.put("Poison", new String[] {"Grass", "Fighting", "Poison"});
		STRENGTHS.put("Ground", new String[] {"Poison", "Rock"});
		STRENGTHS.put("Flying", new String[] {"Grass", "Fighting", "Bug"});
		STRENGTHS.put("Psychic", new String[] {"Fighting", "Psychic"});
		STRENGTHS.put("Bug", new String[] {"Grass", "Fighting", "Ground"});
		STRENGTHS.put("Rock", new String[] {"Normal", "Fire", "Poison", "Flying"});
		STRENGTHS.put("Ghost", new String[] {"Poison", "Bug"});
		STRENGTHS.put("Dragon", new String[] {"Fire", "Water", "Electric", "Grass"});
	}
}