package character;
/*This is the sub class for the warrior_Class. 
 * This is where I add some return statements. */
public class Character_Warrior{
	Character_Class warrior = new Character_Class();
	
	public String user,speak;	//This variable controls what the users name is, which in this case is "Warrior". 
	
	
	public String getSpeak(){
		warrior.setSpeak("I am a Warrior");
		return warrior.getSpeak();
	}
	
	public String getSpeak2(){
		warrior.setSpeak("I do: ");
		return warrior.getSpeak();
	}
	
	public String getSpeak3(){
		warrior.setSpeak("I have: ");
		return warrior.getSpeak();
	}
	
	
	/*The beginning of the get and set methods for the Warrior Class. */
	public int getHealthWarrior(){
		warrior.setHealth(100);	//I have given the warrior 100 health. 
		return warrior.getHealth();
	}
	
	public String getUserWarrior(){  
		warrior.setName("Warrior");	//This is where the user get's it's Classes name. 
		return warrior.getName();
	}
	
	public int getDamageWarrior(){
		warrior.setDamage(50);				//The warrior has base damage level 50
		return warrior.getDamage();
	}
	
	public int getMagicWarrior(){
		warrior.setMagic(20);				//The warrior has base magic level 20
		return warrior.getMagic();
	}
	
	public int getDefenseWarrior(){
		warrior.setDefense(50);				//The warrior has base defense level 50
		return warrior.getDefense();
	}
	
	public int getBoostWarrior(){
		warrior.setBoost(50);				//The warrior has base boost level 50
		return warrior.getBoost();
	}
	
	public int getWeapon_DamageWarrior(){
		warrior.setWeapon_Damage(60);		//The warrior has base weapon damage level 60
		return warrior.getWeapon_Damage();
	}
	
	public int getArmorWarrior(){
		warrior.setArmor(50);				//The warrior has base armor level 50
		return warrior.getArmor();
	}
	
	public int getIntelligenceWarrior(){
		warrior.setIntelligence(50);			//The warrior has base intelligence level 50
		return warrior.getIntelligence();
	}
	
	public int getSpeedWarrior(){
		warrior.setSpeed(70);				//The warrior has base speed level 70
		return warrior.getSpeed();
	}
	
	public int getStrengthWarrior(){
		warrior.setStrength(60);  		    //The warrior has base strength level 60
		return warrior.getStrength();
	}
}