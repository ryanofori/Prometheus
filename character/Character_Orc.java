package character;
/*This is the sub class for the orc_Class. 
 * This is where I add some return statements. */
public class Character_Orc {
	
	Character_Class Orc = new Character_Class();
	
	public int health ,boost,magic;
	String user;
	
	public String speak(){
		return "I am a Orc! ";
	}
	
	public String speak2(){
		return "I do: ";
	}
	
	public String speak3(){
		return "I have: ";
	}
	
	public String getUserOrc(){  
		Orc.setName("Orc");
		return user = Orc.getName();
	}
	
	public int getOrcHealth(){		
		Orc.setHealth(100);
		return health = Orc.getHealth();
	}	
}