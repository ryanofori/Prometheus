package character;
/*This is the sub class for the warrior_Class. 
 * This is where I add some return statements. */
public class Character_Warrior  {
	
	Character_Class Warrior = new Character_Class();
	
	public String user;	//This variable controls what the users name is, which in this case is "Warrior". 
	
	public int health,magic,boost;	//Variable that hold the classes health, magic and boost. 

	public String speak(){
		return "I am a Warrior! ";
	}
	
	public String speak2(){
		return "I do: ";
	}
	
	public String speak3(){
		return "I have: ";
	}
	
	/*The beginning of the get and set methods for the Warrior Class. */
	public int getHealthWarrior(){
		Warrior.setHealth(120);	//I have given the warrior 120 health. 
		return health = Warrior.getHealth();
	}
	
	public String getUserWarrior(){  
		Warrior.setName("Warrior");	//This is where the user get's it's Classes name. 
		return user = Warrior.getName();
	}
	
	public int boostWarrior(){
		Warrior.setBoost(30);	//I am giving the warrior a boost of 30 health points at the end of each battle. 
		return boost = Warrior.getBoost();
	}	
	
	/*The end of the get and set methods for the Warrior Class. */
}