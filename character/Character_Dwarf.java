package character;
/*This is the sub class for the Dwarf_Class. 
 * This is where I add some return statements. */
public class Character_Dwarf extends Character_Class {
	
	// NEW CONSTRUCTOR:
	
	public Character_Dwarf() {   
		super.name = "Dwarf";
		super.health = 100;
		super.magic = 30;
		super.armor = 50;
		super.speed = 50 ;
		super.strength = 60;
		super.resistance = 50;
	}
	
	// END NEW CONSTRUCTOR.
	
	public void levelUp(int exp1) {
		exp = exp1;
		while(exp >= MAX_EXP) {
			if(getLevel() >= 10) {
				break;
			}
			else{
				exp -= MAX_EXP;
				if(exp < 0) {
					exp = 0;
				}
				level++;
				MAX_EXP += 50;
				health += 11;
				health = getHealth();
				armor += 9;
				magic += 5;
				speed += 4;
				strength += 11;
				resistance += 10;
				System.out.println("You have leveled up!");
			}
		}
	}
	
	public String getSpeak(){
		return "I am a Dwarf";
	}
	
	public String getSpeak2(){
		return "I do: ";
	}
	
	public String getSpeak3(){
		return "I have: ";
	}
	
}
