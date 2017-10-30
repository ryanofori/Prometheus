package character;
/*This is the sub class for the orc_Class. 
 * This is where I add some return statements. */
public class Character_Orc{
	Character_Class orc = new Character_Class();
	
	public String getSpeak(){
		orc.setSpeak("I am an Orc");
		return orc.getSpeak();
	}
	
	public String getSpeak2(){
		orc.setSpeak2("I do: ");
		return orc.getSpeak2();
	}
	
	public String getSpeak3(){
		orc.setSpeak3("I have: ");
		return orc.getSpeak3();
	}
	
	public String getUserOrc(){  
		orc.setName("Orc");
		return orc.getName();
	}
	
	public int getOrcHealth(){		
		orc.setHealth(100);
		return orc.getHealth();
	}	
}