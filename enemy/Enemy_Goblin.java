package enemy;
import character.Character_Class;

public class Enemy_Goblin extends Character_Class {
	
	//Enemy_Goblin constructor
	
	public Enemy_Goblin() {         //assigning attributes to the Goblin
		super.name = "Goblin";
		super.health = 100;
		super.damage = 40;
		super.magic = 30;
		super.defense = 50;
		super.weapon_damage = 50;
		super.armor = 40;
		super.intelligence = 60;
		super.speed = 40;
		super.resistance = 40;
		super.strength = 40;
	}

}
