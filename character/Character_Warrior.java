package character;
/*This is the sub class for the warrior_Class. 
 * This is where I add some return statements. */
public class Character_Warrior extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
		public Character_Warrior() {
			super.name = "Warrior";
			super.health = 100;
			super.damage = 50;
			super.magic = 20;
			super.defense = 50;
			super.boost = 50;
			super.weapon_damage = 60;
			super.armor = 50;
			super.intelligence = 50;
			super.speed = 70;
			super.strength = 60;
			super.resistance = 60;
		}
		
		// END NEW CONSTRUCTOR.
	
		public String getSpeak(){
			return "I am a Warrior";
		}
		
		public String getSpeak2(){
			return "I do: ";
		}
		
		public String getSpeak3(){
			return "I have: ";
		}
	
	
	/*The beginning of the get and set methods for the Warrior Class. 
	 * COMMENTED OUT FOR NOW.
	 * 
	 * 
	public int getHealth(){
		warrior.setHealth(100);	//I have given the warrior 100 health. 
		return warrior.getHealth();
	}
	
	public String getUser(){  
		warrior.setName("Warrior");	//This is where the user get's it's Classes name. 
		return warrior.getName();
	}
	
	public int getDamage(){
		warrior.setDamage(50);				//The warrior has base damage level 50
		return warrior.getDamage();
	}
	
	public int getMagic(){
		warrior.setMagic(20);				//The warrior has base magic level 20
		return warrior.getMagic();
	}
	
	public int getDefense(){
		warrior.setDefense(50);				//The warrior has base defense level 50
		return warrior.getDefense();
	}
	
	public int getBoost(){
		warrior.setBoost(50);				//The warrior has base boost level 50
		return warrior.getBoost();
	}
	
	public int getWeapon_Damage(){
		warrior.setWeapon_Damage(60);		//The warrior has base weapon damage level 60
		return warrior.getWeapon_Damage();
	}
	
	public int getArmor(){
		warrior.setArmor(50);				//The warrior has base armor level 50
		return warrior.getArmor();
	}
	
	public int getIntelligence(){
		warrior.setIntelligence(50);			//The warrior has base intelligence level 50
		return warrior.getIntelligence();
	}
	
	public int getSpeed(){
		warrior.setSpeed(70);				//The warrior has base speed level 70
		return warrior.getSpeed();
	}
	
	public int getResistance(){
		warrior.setResistance(60);
		return warrior.getResistance();
	}
	
	public int getStrength(){
		warrior.setStrength(60);  		    //The warrior has base strength level 60
		return warrior.getStrength();
	}
	*/
}