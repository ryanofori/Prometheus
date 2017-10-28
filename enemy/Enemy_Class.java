package enemy;
/*This class hold all of the enemies stats. I am setting and getting methods. The battle_System
 * class calls on this one in order to grab the information of each method. */
import character.Character_Class;
public class Enemy_Class {
    Character_Class Enemy = new Character_Class();
	
	int enemy; //This variable is used to get the health of each enemy. 
	String EnemyName; //This variable is used to get the name of each enemy. 
	
	public int getGruntHealth(){  //The get and setter method for my Grunt. 
		Enemy.setHealth(70);
		return enemy = Enemy.getHealth();	
	}
	
	public int getGoblinHealth(){ 	//The get and setter method for my Goblin. 
		Enemy.setHealth(80);
		return enemy = Enemy.getHealth();
		
	}
	
	public int getHalfling(){ 	//The get and setter method for my Halfling. 
		Enemy.setHealth(90);
		return enemy = Enemy.getHealth();
		
	}
	
	public int getTrollsHealth(){	//The get and setter method for my Troll. 
		Enemy.setHealth(100);
		return enemy = Enemy.getHealth();
	}
	
	public int getScorpionHealth(){ 	//The get and setter method for my Scorpion. 
		Enemy.setHealth(110);
		return enemy = Enemy.getHealth();
	}
	/*End of each get and setter method for health of each enemy. */
	
	/*Everything below is the get and setter methods for each enemy name. */
	
	public String getGoblinName(){  
		Enemy.setName("Goblin");
		return EnemyName = Enemy.getName();
	}
	
	public String getScorpionName(){
		Enemy.setName("Scorpion");
		return EnemyName = Enemy.getName();
	}
	
	public String getTrollsName(){
		Enemy.setName("Troll");
		return EnemyName = Enemy.getName();
	}
	
	public String getHalflingName(){
		Enemy.setName("Halfling");
		return EnemyName = Enemy.getName();
	}
	
	public String getGruntName(){
		Enemy.setName("Grunt");
		return EnemyName = Enemy.getName();
	}
	
	
}