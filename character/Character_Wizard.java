package character;

public class Character_Wizard {
	Character_Class wizard = new Character_Class();
	

	
	
	public int getHealthElf(){
		wizard.setHealth(100);	//I have given the wizard 100 health. 
		return wizard.getHealth();
	}
}
