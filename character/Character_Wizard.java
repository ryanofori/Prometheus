package character;

public class Character_Wizard extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
		public Character_Wizard() {
			super.name = "Wizard";
			super.health = 100;
			super.damage = 60;
			super.magic = 100;
			super.defense = 10;
			super.boost = 50;
			super.weapon_damage = 40;
			super.armor = 20;
			super.intelligence = 100;
			super.speed = 50;
			super.strength = 40;
			super.resistance = 60;
		}
		
		// END NEW CONSTRUCTOR.
	
	
	public String getSpeak(){
		return "I am a Wizard";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
	
	/*The beginning of the get and set methods for the Wizard Class.
	 * COMMENTED OUT FOR NOW.
	 
	public int getHealthWizard(){
		wizard.setHealth(100);	//I have given the wizard 100 health. 
		return wizard.getHealth();
	}
	
	public String getUserWizard(){  
		wizard.setName("Wizard");	//This is where the user get's it's Classes name. 
		return wizard.getName();
	}
	
	public int getDamageWizard(){
		wizard.setDamage(60);				//The wizard has base damage level 60
		return wizard.getDamage();
	}
	
	public int getMagicWizard(){
		wizard.setMagic(100);				//The wizard has base magic level 100
		return wizard.getMagic();
	}
	
	public int getDefenseWizard(){
		wizard.setDefense(10);				//The wizard has base defense level 10
		return wizard.getDefense();
	}
	
	public int getBoostWizard(){
		wizard.setBoost(50);				//The wizard has base boost level 50
		return wizard.getBoost();
	}
	
	public int getWeapon_DamageWizard(){
		wizard.setWeapon_Damage(40);		//The wizard has base weapon damage level 40
		return wizard.getWeapon_Damage();
	}
	
	public int getArmorWizard(){
		wizard.setArmor(20);				//The wizard has base armor level 20
		return wizard.getArmor();
	}
	
	public int getIntelligenceWizard(){
		wizard.setIntelligence(100);			//The wizard has base intelligence level 100
		return wizard.getIntelligence();
	}
	
	public int getSpeedWizard(){
		wizard.setSpeed(50);				//The wizard has base speed level 50
		return wizard.getSpeed();
	}
	
	public int getStrengthWizard(){
		wizard.setStrength(40);  		    //The wizard has base strength level 40
		return wizard.getStrength();
	}
	*/
}
