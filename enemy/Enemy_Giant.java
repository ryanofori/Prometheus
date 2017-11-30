package enemy;

public class Enemy_Giant extends Enemy {
	
	
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
	
	public void levelUp(int exp) {
		while(exp >= MAX_EXP) {
			exp -= MAX_EXP;
			if(exp < 0) {
				exp = 0;
			}
			health += 15;
			magic += 3;
			speed += 6;
			strength += 10;
			resistance += 15;
			intelligence += 2;
		}
	}
}
