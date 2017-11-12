package enemy;

public class Enemy {
	protected String name;
	protected int health,damage,magic,defense,boost, weapon_damage,armor, intelligence, speed, strength, resistance;
	
	public Enemy() {  // Default Values.
		name = "Enemy";
		health = 100;
		damage = 0;
		magic = 0;
		defense = 0;
		boost = 0;
		weapon_damage = 0;
		armor = 0;
		intelligence = 0;
		speed = 0;
		strength = 0;
		resistance = 0;
	}

}
