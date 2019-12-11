package data;

import java.util.Dictionary;
import java.util.Hashtable;

public class MoveData {

	public static Dictionary<String, Object[]> moves = new Hashtable<String, Object[]>();
	
	//String[] format = new String[] {"type", "category", int power, int accuracy, int pp, "Effect"};
	//https://pokemondb.net/move/generation/1
	private static Object[] absorb = new Object[] {"Grass", "Special", 20, 100, 20, "User recovers half the HP inflicted on opponent."};
	private static Object[] acid = new Object[] {"Poison", "Physical", 40, 100, 30, "33% chance to lower opponent's Defence."}; //1 stage
	private static Object[] acidArmour = new Object[] {"Poison", "Status", 0, 1000, 40, "Sharply raises user's Defence."};
	private static Object[] agility = new Object[] {"Psychic", "Status", 0, 1000, 30, "Sharply raises user's Speed."};
	private static Object[] amnesia = new Object[] {"Psychic", "Status", 0, 1000, 20, "Sharply raises user's Special Defence."};
	private static Object[] auroraBeam = new Object[] {"Ice", "Special", 65, 100, 20, "105 chance to lower opponent's Attack."}; //1 stage
	private static Object[] barrage = new Object[] {"Normal", "Physical", 15, 85, 20, "Hits 2-5 times in one turn."};
	//Barrage: 2 hits 3/8, 3 hits 3/8, 4 hits 1/8, 5 hits 1/8, each can crit independently
	private static Object[] barrier = new Object[] {"Psychic", "Status", 0, 1000, 30, "Sharply raises user's Defence."}; //2 stages
	private static Object[] bide = new Object[] {"Normal", "Physical", 0, 1000, 10, "User takes damage for 2-3 turns then strikes back double."};
	//Bide: typeless damage (hits ghosts), ignores accuracy/evasion, can hit during dig/fly
	private static Object[] bind = new Object[] {"Normal", "Physical", 15, 75, 20, "Traps oppenent, damaging them for 2-5 turns."};
	//Bind: 1/8 their max hp after each turn. 
	private static Object[] bite = new Object[] {"Normal", "Physical", 60, 100, 25, "30% chance to cause flinching."};
	private static Object[] blizzard = new Object[] {"Ice", "Special", 120, 90, 5, "10% chance to freeze opponent."};
	private static Object[] bodySlam = new Object[] {"Normal", "Physical", 85, 100, 15, "30% chance to paralyze opponent."};
	private static Object[] boneClub = new Object[] {"Ground", "Physical", 65, 85, 20, "10% chance to cause flinching."};
	private static Object[] bonemerang = new Object[] {"Ground", "Physical", 50, 90, 10, "Hits twice in one turn."};
	//Bonemerang: Each can crit independently
	private static Object[] bubble = new Object[] {"Water", "Special", 20, 100, 30, "10% chance to lower opponent's Speed."};
	private static Object[] bubbleBeam = new Object[] {"Water", "Special", 65, 100, 20, "10% chance to lower opponent's Speed."};
	private static Object[] clamp = new Object[] {"Water", "Physical", 35, 75, 10, "Traps opponent, damaging them for 2-5 turns."}; //1/8 per turn
	private static Object[] cometPunch = new Object[] {"Normal", "Physical", 18, 85, 15, "Hits 2-5 times in one turn."};
	//Comet Punch: 2 hits 3/8, 3 hits 3/8, 4 hits 1/8, 5 hits 1/8, each can crit independently
	private static Object[] confuseRay = new Object[] {"Ghost", "Status", 0, 100, 10, "Confuses opponent."};
	private static Object[] confusion = new Object[] {"Psychic", "Special", 50, 100, 25, "10% chance to confuse opponent."};
	private static Object[] constrict = new Object[] {"Normal", "Physical", 10, 100, 35, "10% chance to lower opponent's Speed."}; //1 stage
	private static Object[] conversion = new Object[] {"Normal", "Status", 0, 1000, 30, "Changes user's type to that of its opponent."};
	private static Object[] counter = new Object[] {"Fighting", "Physical", 0, 100, 20, "When hit by a Physical Attack, user strikes back with 2x power."};
	private static Object[] crabhammer = new Object[] {"Water", "Physical", 90, 85, 10, "High critical hit ratio."};
	private static Object[] cut = new Object[] {"Normal", "Physical", 50, 95, 30, "Can also be used to cut certain types of tree."};
	private static Object[] defenceCurl = new Object[] {"Normal", "Status", 0, 1000, 40, "Raises user's Defence."}; //1 stage
	private static Object[] dig = new Object[] {"Ground", "Physical", 60, 100, 10, "Digs underground on first turn, attacks on second. Can also be used to escape from caves."};
	private static Object[] disable = new Object[] {"Normal", "Status", 0, 55, 20, "Opponent can't use its last attack for 1-8 turns."};
	private static Object[] dizzyPunch = new Object[] {"Normal", "Physical", 70, 100, 10, ""};
	private static Object[] doubleKick = new Object[] {"Fighting", "Physical", 30, 100, 30, "Hits twice in one turn."}; //independent
	private static Object[] doubleSlap = new Object[] {"Normal", "Physical", 15, 85, 10, "Hits 1-5 times in one turn."};
	//Double Slap: 2 hits 3/8, 3 hits 3/8, 4 hits 1/8, 5 hits 1/8. independent
	private static Object[] doubleTeam = new Object[] {"Normal", "Status", 0, 1000, 15, "Raises user's Evasiveness."}; //1 stage
	private static Object[] doubleEdge = new Object[] {"Normal", "Physical", 100, 100, 15, "User receives recoil damage."};
	//Double Edge: 1/4 recoil
	private static Object[] dragonRage = new Object[] {"Dragon", "Special", 0, 100, 10, "Always inflicts 40HP."};
	private static Object[] dreamEater = new Object[] {"Psychic", "Special", 100, 100, 15, "User recovers half the HP inflicted on a sleeping opponent."};
	//Dream Eater: Only hits sleeping foes.
	private static Object[] drillPeck = new Object[] {"Flying", "Physical", 80, 100, 20, ""};
	private static Object[] earthquake = new Object[] {"Ground", "Physical", 100, 100, 10, "Power is doubled if opponent is underground from using Dig."};
	private static Object[] eggBomb = new Object[] {"Normal", "Physical", 100, 75, 10, ""};
	private static Object[] ember = new Object[] {"Fire", "Physical", 40, 100, 25, "10% chance to burn opponent."};
	private static Object[] explosion = new Object[] {"Normal", "Physical", 340, 100, 5, "User faints."}; 
	private static Object[] fireBlast = new Object[] {"Fire", "Special", 120, 85, 5, "10% chance to burn opponent."};
	private static Object[] firePunch = new Object[] {"Fire", "Physical", 75, 100, 15, "10% chance to burn opponent."};
	private static Object[] fireSpin = new Object[] {"Fire", "Special", 15, 70, 15, "Traps opponent, damaging them for 2-5 turns."}; //1/8 hp
	private static Object[] fissure = new Object[] {"Ground", "Physical", 0, 0, 5, "One-Hit-KO. Accuracy(%) = UserLevel - TargetLevel + 30"};
	private static Object[] flamethrower = new Object[] {"Fire", "Special", 955, 100, 15, "10% chance to burn opponent."};
	private static Object[] flash = new Object[] {"Normal", "Status", 0, 70, 20, "Lowers opponent's Accuracy. Can also be used to light up caves."}; //1 stage
	private static Object[] fly = new Object[] {"Flying", "Physical", 70, 95, 15, "Flies up on first turn, attacks on second turn. Can also be used to travel to previously visited towns and cities."};
	// //////////////////////////// GOT TO HERE //////////////////////////https://pokemondb.net/move/generation/1
	private static Object[] focusEnergy = new Object[] {"Normal", "Status", 0, 1000, 30, "Increases critical hit ratio."};
	private static Object[] furyAttack = new Object[] {"Normal", "Physical", 15, 85, 20, "Hits 2-5 times in one turn."};
	private static Object[] furySwipes = new Object[] {"Normal", "Physical", 18, 80, 15, "Hits 1-5 times in one turn."};
	private static Object[] glare = new Object[] {"Normal", "Status", 0, 100, 30, "Paralyzes opponent."};
	private static Object[] growl = new Object[] {"Normal", "Status", 0, 100, 40, "Lowers opponent's Attack."};
	private static Object[] growth = new Object[] {"Normal", "Status", 0, 1000, 40, "Raises user's Attack and Special Attack."};
	private static Object[] guillotine = new Object[] {"Normal", "Physical", 0, 1000, 5, "One-Hit-KO."};
	private static Object[] gust = new Object[] {"Flying", "Special", 40, 100, 35, "Hits Pokémon using Fly with double power."};
	private static Object[] harden = new Object[] {"Normal", "Status", 0, 1000, 30, "Raises user's Defence."};
	private static Object[] haze = new Object[] {"Ice", "Status", 0, 1000, 30, "Resets all stat changes."};
	private static Object[] headbutt = new Object[] {"Normal", "Physical", 70, 100, 15, "May cause flinching."};
	private static Object[] highJumpKick = new Object[] {"Fighting", "Physical", 130, 90, 10, "If it misses, the user loses half their HP."};
	private static Object[] hornAttack = new Object[] {"Normal", "Physical", 65, 100, 25, ""};
	private static Object[] hornDrill = new Object[] {"Normal", "Physical", 0, 1000, 5, "One-Hit-KO."};
	private static Object[] hydroPump = new Object[] {"Water", "Special", 110, 80, 5, ""};
	private static Object[] hyperBeam = new Object[] {"Normal", "Special", 150, 90, 5, "User must recharge next turn."};
	private static Object[] hyperFang = new Object[] {"Normal", "Physical", 80, 90, 15, "May cause flinching."};
	private static Object[] hypnosis = new Object[] {"Psychic", "Status", 0, 60, 20, "Puts opponent to sleep."};
	private static Object[] iceBeam = new Object[] {"Ice", "Special", 90, 100, 10, "May freeze opponent."};
	private static Object[] icePunch = new Object[] {"Ice", "Physical", 75, 100, 15, "May freeze opponent."};
	private static Object[] jumpKick = new Object[] {"Fighting", "Physical", 100, 95, 10, "If it misses, the user loses half their HP."};
	private static Object[] karateChop = new Object[] {"Fighting", "Physical", 50, 100, 25, "High critical hit ratio."};
	private static Object[] kinesis = new Object[] {"Psychic", "Status", 0, 80, 15, "Lowers opponent's Accuracy."};
	private static Object[] leechLife = new Object[] {"Bug", "Physical", 80, 100, 10, "User recovers half the HP inflicted on opponent."};
	private static Object[] leechSeed = new Object[] {"Grass", "Status", 0, 90, 10, "Drains HP from opponent each turn."};
	private static Object[] leer = new Object[] {"Normal", "Status", 0, 100, 30, "Lowers opponent's Defence."};
	private static Object[] lick = new Object[] {"Ghost", "Physical", 30, 100, 30, "May paralyze opponent."};
	private static Object[] lightScreen = new Object[] {"Phychic", "Status", 0, 1000, 30, "Halves damage from Special attacks for 5 turns."};
	private static Object[] lovelyKiss = new Object[] {"Normal", "Status", 0, 75, 10, "Puts opponent to sleep."};
	private static Object[] lowKick = new Object[] {"Fighting", "Physical", 0, 100, 20, "The heavier the opponent, the stronger the attack."};
	private static Object[] meditate = new Object[] {"Psychic", "Status", 0, 1000, 40, "Raises user's Attack."};
	private static Object[] megaDrain = new Object[] {"Grass", "Special", 40, 100, 15, "User recovers half the HP inflicted on opponent."};
	private static Object[] megaKick = new Object[] {"Normal", "Physical", 120, 75, 5, ""};
	private static Object[] megaPunch = new Object[] {"Normal", "Physical", 80, 85, 20, ""};
	private static Object[] metronome = new Object[] {"Normal", "Status", 0, 1000, 10, "User performs almost any move in the game at random. Good luck."};
	private static Object[] mimic = new Object[] {"Normal", "Status", 0, 1000, 10, "Copies the opponent's last move."};
	private static Object[] minimize = new Object[] {"Normal", "Status", 0, 1000, 10, "Sharple raises user's Evasiveness."};
	private static Object[] mirrorMove = new Object[] {"Flying", "Status", 0, 1000, 20, "User performs the opponent's last move."};
	private static Object[] mist = new Object[] {"Ice", "Status", 0, 1000, 30, "User's stats cannot be changed for a period of time."};
	private static Object[] nightShade = new Object[] {"Ghost", "Special", 0, 100, 15, "Inflicts damage equal to user's level."};
	private static Object[] payDay = new Object[] {"Normal", "Physical", 40, 100, 20, "A small amount of money is gained after the battle resolves."};
	private static Object[] peck =  new Object[] {"Flying", "Physical", 35, 100, 35, ""};
	private static Object[] petalDance = new Object[] {"Grass", "Special", 120, 100, 10, "User attacks for 2-3 turns but then becomes confused."};
	private static Object[] pinMissile = new Object[] {"Bug", "Physical", 25, 95, 20, "Hits 2-5 times in one turn."};
	private static Object[] poisonGas = new Object[] {"Poison", "Status", 0, 90, 40, "Poisons opponent."};
	private static Object[] poisonPowder = new Object[] {"Poison", "Status", 0, 75, 25, "Poisons opponent."};
	private static Object[] poisonSting = new Object[] {"Poison", "Physical", 15, 100, 35, "May poison the opponent."};
	private static Object[] pound = new Object[] {"Normal", "Physical", 40, 100, 35, ""};
	private static Object[] psybeam = new Object[] {"Psybeam", "Special", 65, 100, 20, "May confuse opponent."};
	private static Object[] psychic = new Object[] {"Psychic", "Special", 90, 100, 10, "May lower opponent's Special Defence."};
	private static Object[] psywave = new Object[] {"Psychic", "Special", 0, 80, 15, "Inflicts damage equal to 0.5-1.5 times user's level."};
	private static Object[] quickAttack = new Object[] {"Normal", "Physical", 40, 100, 30, "User attacks first."};
	private static Object[] rage = new Object[] {"Normal", "Physical", 20, 100, 20, "Raises user's Attack when hit."};
	private static Object[] razorLeaf = new Object[] {"Grass", "Physical", 55, 95, 25, "High critical hit ratio."};
	private static Object[] razorWind = new Object[] {"Normal", "Special", 80, 100, 10, "Charges on first turn, attacks on second. High critical hit ratio."};
	private static Object[] recover = new Object[] {"Normal", "Status", 0, 1000, 10, "User recovers half its max HP."};
	private static Object[] reflect = new Object[] {"Psychic", "Status", 0, 1000, 20, "Halves damage from Physical attacks for 5 turns."};
	private static Object[] rest = new Object[] {"Psychic", "Status", 0, 1000, 10, "User sleeps for 2 turns, but user is fully healed."};
	private static Object[] roar = new Object[] {"Normal", "Status", 0, 1000, 20, "In battles, the opponent is forced to switch. In the wild, Pokémon are forced to run."};
	private static Object[] rockSlide = new Object[] {"Rock", "Physical", 75, 90, 10, "May cause flinching."};
	private static Object[] rockThrow = new Object[] {"Rock", "Physical", 50, 90, 15, ""};
	private static Object[] rollingKick = new Object[] {"Fighting", "Physical", 60, 85, 15, "May cause flinching."};
	private static Object[] sandAttack = new Object[] {"Ground", "Status", 0, 100, 15, "Lowers opponent's Accuracy"};
	private static Object[] scratch = new Object[] {"Normal", "Physical", 40, 100, 35, ""};
	private static Object[] screech = new Object[] {"Normal", "Status", 0, 85, 40, "Sharply lowers opponent's Defence."};
	private static Object[] seismicToss = new Object[] {"Fighting", "Physical", 0, 100, 20, "Inflicts damage equal to user's level."};
	private static Object[] selfDestruct = new Object[] {"Normal", "Physical", 200, 100, 5, "User faints."};
	private static Object[] sharpen = new Object[] {"Normal", "Status", 0, 1000, 30, "Raises user's Attack."};
	private static Object[] sing = new Object[] {"Normal", "Status", 0, 55, 15, "Puts opponent to sleep."};
	private static Object[] skullBash = new Object[] {"Normal", "Physical", 130, 100, 10, "Raises Defence on first turn, attacks on second."};
	private static Object[] skyAttack = new Object[] {"Flying", "Physical", 140, 90, 5, "Charges on first turn, attacks on second. May cause flinching."};
	private static Object[] slam = new Object[] {"Normal", "Physical", 80, 75, 20, ""};
	private static Object[] slash = new Object[] {"Normal", "Physical", 70, 100, 20, "High critcal hit ratio."};
	private static Object[] sleepPowder = new Object[] {"Grass", "Status", 0, 75, 15, "Puts opponent to sleep."};
	private static Object[] sludge = new Object[] {"Poison", "Special", 65, 100, 20, "May poison opponent."};
	private static Object[] smog = new Object[] {"Poison", "Special", 30, 70, 20, "May poison opponent."};
	private static Object[] smokescreen = new Object[] {"Normal", "Status", 0, 100, 20, "Lowers opponent's Accuracy."};
	private static Object[] softBoiled = new Object[] {"Normal", "Status", 0, 1000, 10, "User recovers half its max HP."};
	private static Object[] solarBeam = new Object[] {"Grass", "Special", 120, 100, 10, "Charges on first turn, attacks on second."};
	private static Object[] sonicBoom = new Object[] {"Normal", "Special", 0, 90, 20, "Always inflicts 20HP."};
	private static Object[] spikeCannon = new Object[] {"Normal", "Physical", 20, 100, 15, "Hits 2-5 times in one turn."};
	private static Object[] splash = new Object[] {"Normal", "Status", 0, 1000, 40, "AKA 'Hop'."};
	private static Object[] spore = new Object[] {"Grass", "Status", 0, 100, 15, "Puts opponent to sleep."};
	private static Object[] stomp = new Object[] {"Normal", "Phyiscal", 65, 100, 20, "May cause flinching."};
	private static Object[] strength = new Object[] {"Normal", "Physical", 80, 100, 15, "Can also be used to push certain heavy objects around."};
	private static Object[] stringShot = new Object[] {"Bug", "Status", 0, 95, 40, "Sharply lowers opponent's Speed."};
	private static Object[] struggle = new Object[] {"null", "Physical", 50, 100, 999999999, "Only usable when all other moves' PP is gone. Hurts the user."};
	private static Object[] stunSpore = new Object[] {"Grass", "Status", 0, 75, 30, "Paralyzes opponent."};
	private static Object[] submission = new Object[] {"Fighting", "Physical", 80, 80, 20, "User receives recoil damage."};
	private static Object[] substitute = new Object[] {"Normal", "Status", 0, 1000, 10, "Uses HP to create a decoy that takes hits."};
	private static Object[] superFang = new Object[] {"Normal", "Physical", 0, 90, 10, "Always takes off half the opponent's HP."};
	private static Object[] supersonic = new Object[] {"Normal", "Status", 0, 55, 20, "Confuses opponent."};
	private static Object[] surf = new Object[] {"Water", "Special", 90, 100, 15, "Hits all adjacent Pokémon. Can also be used to cross bodies of water."};
	private static Object[] swift = new Object[] {"Normal", "Special", 60, 1000, 20, "Ignores Accuracy and Evasiveness."};
	private static Object[] swordsDance = new Object[] {"Normal", "Status", 0, 1000, 20, "Sharply raises user's Attack."};
	private static Object[] tackle = new Object[] {"Normal", "Physical", 40, 100, 35, ""};
	private static Object[] tailWhip = new Object[] {"Normal", "Status", 0, 100, 30, "Lowers opponent's Defence."};
	private static Object[] takeDown = new Object[] {"Normal", "Physical", 90, 85, 20, "User receives recoil damage."};
	private static Object[] teleport = new Object[] {"Psychic", "Status", 0, 1000, 20, "Allows user to flee wild battles; also warps player to last PokéCenter."};
	private static Object[] thrash = new Object[] {"Normal", "Physical", 120, 100, 10, "User attacks for 2-3 turns but then becomes confused."};
	private static Object[] thunder = new Object[] {"Electric", "Special", 110, 70, 10, "May paralyze opponent."};
	private static Object[] thunderPunch = new Object[] {"Electric", "Physical", 75, 100, 15, "May paralyze opponent."};
	private static Object[] thunderShock = new Object[] {"Electric", "Special", 40, 100, 30, "May paralyze opponent."};
	private static Object[] thunderWave = new Object[] {"Electric", "Status", 0, 90, 20, "Paralyzes opponent."};
	private static Object[] thunderbolt = new Object[] {"Electric", "Special", 90, 100, 15, "May paralyze opponent."};
	private static Object[] toxic = new Object[] {"Poison", "Status", 0, 90, 10, "Badly poisons opponent."};
	private static Object[] transform = new Object[] {"Normal", "Status", 0, 1000, 10, "User takes on the form and moves of the opponent."};
	private static Object[] triAttack = new Object[] {"Normal", "Special", 80, 100, 10, "May paralyze, burn, or freeze opponent."};
	private static Object[] twineedle = new Object[] {"Bug", "Physical", 25, 100, 20, "Hits twice in one turn. May poison opponent."};
	private static Object[] viceGrip = new Object[] {"Normal", "Physical", 55, 100, 30, ""};
	private static Object[] vineWhip = new Object[] {"Grass", "Physical", 45, 100, 25, ""};
	private static Object[] waterGun = new Object[] {"Water", "Special", 40, 100, 25, ""};
	private static Object[] waterfall = new Object[] {"Water", "Physical", 80, 100, 15, "May cause flinching."};
	private static Object[] whirlwind = new Object[] {"Normal", "Status", 0, 1000, 20, "In battles, the opponent is forced to switch. In the wild, Pokémon are forced to run."};
	private static Object[] wingAttack = new Object[] {"Flying", "Physical", 60, 100, 35, ""};
	private static Object[] withdraw = new Object[] {"Water", "Status", 0, 1000, 40, "Raises user's Defence."};
	private static Object[] wrap = new Object[] {"Normal", "Physical", 15, 90, 20, "Traps opponent, damaging them for 4-5 turns."};
	
	
	//private static Object[] acid = new Object[] {};
	
	
	public static void Initialize() {
		moves.put("Absorb", absorb);
		moves.put("Acid", acid);
		moves.put("Acid Armour", acidArmour);
		moves.put("Agility", agility);
		moves.put("Amnesia", amnesia);
		moves.put("Aurora Beam", auroraBeam);
		moves.put("Barrage", barrage);
		moves.put("Barrier", barrier);
		moves.put("Bide", bide);
		moves.put("Bind", bind);
		moves.put("Bite", bite);
		moves.put("Blizzard", blizzard);
		moves.put("Body Slam", bodySlam);
		moves.put("Bone Club", boneClub);
		moves.put("Bonemerang", bonemerang);
		moves.put("Bubble", bubble);
		moves.put("Bubble Beam", bubbleBeam);
		moves.put("Clamp", clamp);
		moves.put("Comet Punch", cometPunch);
		moves.put("Confuse Ray", confuseRay);
		moves.put("Confusion", confusion);
		moves.put("Constrict", constrict);
		moves.put("Conversion", conversion);
		moves.put("Counter", counter);
		moves.put("Crabhammer", crabhammer);
		moves.put("Cut", cut);
		moves.put("Defence Curl", defenceCurl);
		moves.put("Dig", dig);
		moves.put("Disable", disable);
		moves.put("Dizzy Punch", dizzyPunch);
		moves.put("Double Kick", doubleKick);
		moves.put("Double Slap", doubleSlap);
		moves.put("Double Team", doubleTeam);
		moves.put("Double-Edge", doubleEdge);
		moves.put("Dragon Rage", dragonRage);
		moves.put("Dream Eater", dreamEater);
		moves.put("Drill Peck", drillPeck);
		moves.put("Earthquake", earthquake);
		moves.put("Egg Bomb", eggBomb);
		moves.put("Ember", ember);
		moves.put("Explosion", explosion);
		moves.put("Fire Blast", fireBlast);
		moves.put("Fire Punch", firePunch);
		moves.put("Fire Spin", fireSpin);
		moves.put("Fissure", fissure);
		moves.put("Flamethrower", flamethrower);
		moves.put("Flash", flash);
		moves.put("Fly", fly);
		moves.put("Focus Energy", focusEnergy);
		moves.put("Fury Attack", furyAttack);
		moves.put("Fury Swipes", furySwipes);
		moves.put("Glare", glare);
		moves.put("Growl", growl);
		moves.put("Growth", growth);
		moves.put("Guillotine", guillotine);
		moves.put("Gust", gust);
		moves.put("Harden", harden);
		moves.put("Haze", haze);
		moves.put("Headbutt", headbutt);
		moves.put("High Jump Kick", highJumpKick);
		moves.put("Horn Attack", hornAttack);
		moves.put("Horn Drill", hornDrill);
		moves.put("Hydro Pump", hydroPump);
		moves.put("Hyper Beam", hyperBeam);
		moves.put("Hyper Fang", hyperFang);
		moves.put("Hypnosis", hypnosis);
		moves.put("Ice Beam", iceBeam);
		moves.put("Ice Punch", icePunch);
		moves.put("Jump Kick", jumpKick);
		moves.put("Karate Chop", karateChop);
		moves.put("Kinesis", kinesis);
		moves.put("Leech Life", leechLife);
		moves.put("Leech Seed", leechSeed);
		moves.put("Leer", leer);
		moves.put("Lick", lick);
		moves.put("Light Screen", lightScreen);
		moves.put("Lovely Kiss", lovelyKiss);
		moves.put("Low Kick", lowKick);
		moves.put("Meditate", meditate);
		moves.put("Mega Drain", megaDrain);
		moves.put("Mega Kick", megaKick);
		moves.put("Mega Punch", megaPunch);
		moves.put("Metronome", metronome);
		moves.put("Mimic", mimic);
		moves.put("Minimize", minimize);
		moves.put("Mirror Move", mirrorMove);
		moves.put("Mist", mist);
		moves.put("Night Shade", nightShade);
		moves.put("Pay Day", payDay);
		moves.put("Peck", peck);
		moves.put("Petal Dance", petalDance);
		moves.put("Pin Missile", pinMissile);
		moves.put("Poison Gas", poisonGas);
		moves.put("Poison Powder", poisonPowder);
		moves.put("Poison Sting", poisonSting);
		moves.put("Pound", pound);
		moves.put("Psybeam", psybeam);
		moves.put("Psychic", psychic);
		moves.put("Psywave", psywave);
		moves.put("Quick Attack", quickAttack);
		moves.put("Rage", rage);
		moves.put("Razor Leaf", razorLeaf);
		moves.put("Razor Wind", razorWind);
		moves.put("Recover", recover);
		moves.put("Reflect", reflect);
		moves.put("Rest", rest);
		moves.put("Roar", roar);
		moves.put("Rock Slide", rockSlide);
		moves.put("Rock Throw", rockThrow);
		moves.put("Rolling Kick", rollingKick);
		moves.put("Sand Attack", sandAttack);
		moves.put("Scratch", scratch);
		moves.put("Screech", screech);
		moves.put("Seismic Toss", seismicToss);
		moves.put("Self-Destruct", selfDestruct);
		moves.put("Sharpen", sharpen);
		moves.put("Sing", sing);
		moves.put("Skull Bash", skullBash);
		moves.put("Sky Attack", skyAttack);
		moves.put("Slam", slam);
		moves.put("Slash", slash);
		moves.put("Sleep Powder", sleepPowder);
		moves.put("Sludge", sludge);
		moves.put("Smog", smog);
		moves.put("Smokescreen", smokescreen);
		moves.put("Soft-Boiled", softBoiled);
		moves.put("Solar Beam", solarBeam);
		moves.put("SonicBoom", sonicBoom);
		moves.put("Spike Cannon", spikeCannon);
		moves.put("Splash", splash);
		moves.put("Spore", spore);
		moves.put("Stomp", stomp);
		moves.put("Strength", strength);
		moves.put("String Shot", stringShot);
		moves.put("Struggle", struggle);
		moves.put("Stun Spore", stunSpore);
		moves.put("Submission", submission);
		moves.put("Substitute", substitute);
		moves.put("Super Fang", superFang);
		moves.put("Supersonic", supersonic);
		moves.put("Surf", surf);
		moves.put("Swift", swift);
		moves.put("Swords Dance", swordsDance);
		moves.put("Tackle", tackle);
		moves.put("Tail Whip", tailWhip);
		moves.put("Take Down", takeDown);
		moves.put("Teleport", teleport);
		moves.put("Thrash", thrash);
		moves.put("Thunder", thunder);
		moves.put("Thunder Punch", thunderPunch);
		moves.put("Thunder Shock", thunderShock);
		moves.put("Thunder Wave", thunderWave);
		moves.put("Thunderbolt", thunderbolt);
		moves.put("Toxic", toxic);
		moves.put("Transform", transform);
		moves.put("Tri Attack", triAttack);
		moves.put("Twineedle", twineedle);
		moves.put("Vice Grip", viceGrip);
		moves.put("Vine Whip", vineWhip);
		moves.put("Water Gun", waterGun);
		moves.put("Waterfall", waterfall);
		moves.put("Whirlwind", whirlwind);
		moves.put("Wing Attack", wingAttack);
		moves.put("Withdraw", withdraw);
		moves.put("Wrap", wrap);
		
	}


	public static String getType(String move) {
		return (String) moves.get(move)[0];
	}
	
	public static String getCat(String move) {
		return (String) moves.get(move)[1];
	}

	public static int getPower(String move) {
		return (int) moves.get(move)[2];
	}
	
	public static int getAccuracy(String move) {
		return (int) moves.get(move)[3];
	}
	
	public static int getMaxPP(String move) {
		return (int) moves.get(move)[4];
	}
	
	public static String getEffect(String move) {
		return (String) moves.get(move)[5];
	}
	
	public static boolean getOrderChange(String move) {
		return (boolean) moves.get(move)[6];
	}
	
	public static boolean getRecoil(String move) {
		return (boolean) moves.get(move)[7];
	}
	
	public static boolean getMulti(String move) {
		return (boolean) moves.get(move)[8];
	}
	
	public static int[] getRange(String move) {
		return (int[]) moves.get(move)[9];
	}
}
