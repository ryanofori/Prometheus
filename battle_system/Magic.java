package battle_system;
import character.Character_Class;
public class Magic {
	
	Character_Class magic = new Character_Class();
	
	public int get_Flameball(){
		magic.setMagic(30);
		return magic.getMagic();
	}

	public int get_Lightning_Bolt(){
		magic.setMagic(20);
		return magic.getMagic();
	}
	
	public String get_Lightning_Bolt_Name(){
		return "Lightning Bolt";
	}
	
	public String get_Flameball_Name(){
		return "Flameball";
	}
	

}
