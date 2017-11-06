package enemy;

import character.Character_Class;

public class Enemy_Halfling extends Character_Class {
	
//Enemy_Halfling constructor
	
	public Enemy_Halfling() {			//Assigning attributes to the Halfling
		super.name = "Halfling";
		super.health = 100;
		super.damage = 60;
		super.magic = 40;
		super.defense = 40;
		super.weapon_damage = 40;
		super.armor = 20;
		super.intelligence = 50;
		super.speed = 50;
		super.resistance = 80;
		super.strength = 40;
	}

}
