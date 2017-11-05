package character;
/*This is the sub class for the Dwarf_Class. 
 * This is where I add some return statements. */
public class Character_Dwarf extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Dwarf() {
		super.name = "Dwarf";
		super.health = 100;
		super.damage = 40;
		super.magic = 30;
		super.defense = 50;
		super.boost = 50;
		super.weapon_damage = 60;
		super.armor = 50;
		super.intelligence = 30;
		super.speed = 50 ;
		super.strength = 60;
		super.resistance = 50;
	}
	
	// END NEW CONSTRUCTOR.
	
	public String user,speak;	//This variable controls what the users name is, which in this case is "Dwarf". 
	
	
	public String getSpeak(){
		return "I am a Dwarf";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
	
	/*The beginning of the get and set methods for the dwarf Class. 
	 * COMMENTED OUT FOR NOW UNLESS NEEDED LATER.
	 * 
	 * 
	public int getHealthDwarf(){
		dwarf.setHealth(100);	//I have given the dwarf 100 health. 
		return dwarf.getHealth();
	}
	
	public String getUserDwarf(){  
		dwarf.setName("Dwarf");	//This is where the user get's it's Classes name. 
		return dwarf.getName();
	}
	
	public int getDamageDwarf(){
		dwarf.setDamage(40);				//The dwarf has base damage level 40
		return dwarf.getDamage();
	}
	
	public int getMagicDwarf(){
		dwarf.setMagic(30);				//The dwarf has base magic level 30
		return dwarf.getMagic();
	}
	
	public int getDefenseDwarf(){
		dwarf.setDefense(50);				//The dwarf has base defense level 50
		return dwarf.getDefense();
	}
	
	public int getBoostDwarf(){
		dwarf.setBoost(50);				//The dwarf has base boost level 50
		return dwarf.getBoost();
	}
	
	public int getWeapon_DamageDwarf(){
		dwarf.setWeapon_Damage(60);		//The dwarf has base weapon damage level 60
		return dwarf.getWeapon_Damage();
	}
	
	public int getArmorDwarf(){
		dwarf.setArmor(50);				//The dwarf has base armor level 50
		return dwarf.getArmor();
	}
	
	public int getIntelligenceDwarf(){
		dwarf.setIntelligence(30);			//The dwarf has base intelligence level 30
		return dwarf.getIntelligence();
	}
	
	public int getSpeedDwarf(){
		dwarf.setSpeed(50);				//The dwarf has base speed level 50
		return dwarf.getSpeed();
	}
	
	public int getStrengthDwarf(){
		dwarf.setStrength(60);  		    //The dwarf has base strength level 60
		return dwarf.getStrength();
	}
	
	*/
}
