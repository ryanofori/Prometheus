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
	
}