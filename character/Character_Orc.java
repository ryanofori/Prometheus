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
	
}