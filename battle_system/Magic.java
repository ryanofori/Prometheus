package battle_system;
import character.Character_Class;
public class Magic {
	
	Character_Class magic = new Character_Class();
	int flameball;
	int lightning_bolt;
	
	public int flameball(){
		magic.setMagic(30);
		return flameball = magic.getMagic();
	}

	public int lightning_Bolt(){
		magic.setMagic(10);
		return lightning_bolt = magic.getMagic();
	}

}
