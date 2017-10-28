package character;
//Health of the Orc is 100 and Magic is 30
//Health of the Warrior is 120 and Magic is 50. 
//This class currently is not relevant. It is not working the way I had expected it to. 

public class Level_Up_System {

	int health;
	
	Character_Class User = new Character_Class();
	
	public int Orclevel2(){
		User.setHealth(110);
		return health = User.getHealth();
	}
	
	public int Orclevel3(){
		User.setHealth(120);
		return health = User.getHealth();
	}
	
	
	

}
