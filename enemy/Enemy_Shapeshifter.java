package enemy;

import character.Character_Class;

public class Enemy_Shapeshifter extends Character_Class {
	
	//Enemy_Shapeshifter constructor 
	
	public Enemy_Shapeshifter() {             //Assigning attributes to the Shapeshifter
		super.name = "Shapeshifter";
		super.health = 180;
		super.damage = 120;
		super.magic = 180;
		super.defense = 150;
		super.weapon_damage = 40;
		super.armor = 70;
		super.intelligence = 180;
		super.speed = 100;
		super.resistance = 150;
		super.strength = 80;
	}

}
