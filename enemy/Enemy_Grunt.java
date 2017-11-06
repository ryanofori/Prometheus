package enemy;

import character.Character_Class;

public class Enemy_Grunt extends Character_Class {
	
	//Enemy_Grunt constructor 
	
	public Enemy_Grunt() {             //Assigning attributes to the Grunt
		super.name = "Grunt";
		super.health = 100;
		super.damage = 20;
		super.magic = 20;
		super.defense = 20;
		super.weapon_damage = 20;
		super.armor = 20;
		super.intelligence = 20;
		super.speed = 20;
		super.resistance = 20;
		super.strength = 20;
	}
	
}
