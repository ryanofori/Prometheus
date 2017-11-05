package character;
/*This is the sub class for the orc_Class. 
 * This is where I add some return statements. */
public class Character_Orc extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Orc() {
			super.name = "Orc";
			super.health = 100;
			super.damage = 60;
			super.magic = 30;
			super.defense = 80;
			super.boost = 50;
			super.weapon_damage = 80;
			super.armor = 70;
			super.intelligence = 10;
			super.speed = 10;
			super.strength = 90;
			super.resistance = 30;
	}
		
		// END NEW CONSTRUCTOR.
	
	public String getSpeak(){
		return "I am an Orc";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
	/* COMMENTED OUT FOR NOW.
	
	public String getUser(){  
		orc.setName("Orc");             
		return orc.getName();
	}
	
	public int getHealth(){		
		orc.setHealth(100);
		return orc.getHealth();
	}	
	
	public int getDamageOrc(){
		orc.setDamage(60);				//The orc has base damage level 60
		return orc.getDamage();
	}
	
	public int getMagicOrc(){
		orc.setMagic(30);				//The orc has base magic level 30
		return orc.getMagic();
	}
	
	public int getDefenseOrc(){
		orc.setDefense(80);				//The orc has base defense level 80
		return orc.getDefense();
	}
	
	public int getBoostOrc(){
		orc.setBoost(50);				//The orc has base boost level 50
		return orc.getBoost();
	}
	
	public int getWeapon_DamageOrc(){
		orc.setWeapon_Damage(80);		//The orc has base weapon damage level 80
		return orc.getWeapon_Damage();
	}
	
	public int getArmorOrc(){
		orc.setArmor(70);				//The orc has base armor level 70
		return orc.getArmor();
	}
	
	public int getIntelligenceOrc(){
		orc.setIntelligence(10);			//The orc has base intelligence level 10
		return orc.getIntelligence();
	}
	
	public int getSpeedOrc(){
		orc.setSpeed(10);				//The orc has base speed level 10
		return orc.getSpeed();
	}
	
	public int getStrengthOrc(){
		orc.setStrength(90);  		    //The orc has base strength level 90
		return orc.getStrength();
	}
	
	*/
}