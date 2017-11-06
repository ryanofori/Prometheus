package enemy;
import character.Character_Class;

public class Enemy_Giant extends Character_Class {
	
	
	// Enemy_Giant constructor
	
	public Enemy_Giant() {			//Assigning attributes to the Giant
		super.name = "Giant";
		super.health = 200;
		super.damage = 160;
		super.magic = 60;
		super.defense = 190;
		super.weapon_damage = 100;
		super.armor = 200;
		super.intelligence = 10;
		super.speed = 30;
		super.resistance = 80;
		super.strength = 190;
	}

}
