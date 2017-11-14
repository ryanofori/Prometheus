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
	
	public static Enemy randomEnemy(){
		Enemy_Giant giant = new Enemy_Giant();
		Enemy_Goblin goblin = new Enemy_Goblin();
		Enemy_Grunt grunt = new Enemy_Grunt();
		Enemy_Halfling halfling = new Enemy_Halfling();
		Enemy_Necromancer necromancer = new Enemy_Necromancer();
		Enemy_Scorpion scorpion = new Enemy_Scorpion();
		Enemy_Shapeshifter shapeshifter = new Enemy_Shapeshifter();
		Enemy_Siren siren = new Enemy_Siren();
		Enemy_Troll troll = new Enemy_Troll();
		int rand = 0;
		
		Object[] enemy_object = {giant,goblin,grunt,halfling,necromancer,scorpion,shapeshifter,siren,troll};
		
		for(int counter = 0; counter < 1;counter++){
			rand = (int) (Math.random() * enemy_object.length);
		}
		
		return (Enemy) enemy_object[rand];
	}
	
	public void displayStats(){
		System.out.println("Character: "+name
				+ "\nHealth: "+ health
				+ "\nDamage: "+ damage
				+ "\nMagic: " + magic
				+ "\nDefense: " + defense
				+ "\nArmor: " + armor
				+ "\nIntelligence: " + intelligence
				+ "\nSpeed: " + speed
				+ "\nStrength: " + strength
				+ "\nResistance: " + resistance
				);
	}
	
	public String getName(){
		return name;
	}
	public int getBoost(){
		return boost;
	}
	public int getHealth(){
		return health;
	}
	
	public int getDamage(){
		return damage;
	}
	public int getMagic(){
		return magic;
	}
	public int getDefense(){
		return defense;
	}
	
	
	public int getArmor(){
		return armor;
	}
	
	public int getWeapon_Damage(){
		return weapon_damage;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getResistance() {
		return resistance;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	
	
	public int getSpeed(){
		return speed;
	}

}
