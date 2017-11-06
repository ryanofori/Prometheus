package enemy;

import character.Character_Class;

public class Enemy_Siren extends Character_Class {
	
	//Enemy_Siren constructor 
	
	public Enemy_Siren() {             //Assigning attributes to the Siren
		super.name = "Siren";
		super.health = 100;
		super.damage = 100;
		super.magic = 100;
		super.defense = 20;
		super.weapon_damage = 30;
		super.armor = 30;
		super.intelligence = 100;
		super.speed = 80;
		super.resistance = 100;
		super.strength = 40;
	}

}
