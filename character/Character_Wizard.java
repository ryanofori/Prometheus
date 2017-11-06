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
	
}
