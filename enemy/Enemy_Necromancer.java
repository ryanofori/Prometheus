package enemy;

import character.Character_Class;

public class Enemy_Necromancer extends Character_Class {
	
//Enemy_Necromancer constructor
	
		public Enemy_Necromancer() {			//Assigning attributes to the Necromancer
			super.name = "Necromancer";
			super.health = 200;
			super.damage = 200;
			super.magic = 200;
			super.defense = 140;
			super.weapon_damage = 190;
			super.armor = 50;
			super.intelligence = 200;
			super.speed = 80;
			super.resistance = 200;
			super.strength = 190;
		}

}
