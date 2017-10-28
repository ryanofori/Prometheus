package battle_system;
import character.Character_Class;
public class Lightning_Bolt extends Magic {
	Character_Class magic = new Character_Class();
	
	int lightning_bolt;
	
	public int lightning_Bolt(){
		magic.setMagic(10);
		return lightning_bolt = magic.getMagic();
		
	}

}
