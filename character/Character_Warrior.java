package character;
/*This is the sub class for the warrior_Class. 
 * This is where I add some return statements. */
public class Character_Warrior{
	Character_Class warrior = new Character_Class();
	
	public String user,speak;	//This variable controls what the users name is, which in this case is "Warrior". 
	
	public int health;	//Variable that hold the classes health, magic and boost. 
	
	
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
		warrior.setHealth(120);	//I have given the warrior 120 health. 
		return warrior.getHealth();
	}
	
	public String getUserWarrior(){  
		warrior.setName("Warrior");	//This is where the user get's it's Classes name. 
		return warrior.getName();
	}
}