package character;
public class Weapons  {

	Character_Class weapon = new Character_Class();
	
	public int getRusty_Axe_Damage(){
		weapon.setDamage(20);
		return weapon.getDamage();
	}
	
	public int getRusty_Axe_Weight(){
		weapon.setWeight(6);
		return weapon.getWeight();
	}
	
	public String getRustyAxe_Name(){
		return "Rusty Axe";
	}
	
	public int getPunch_Damage(){
		weapon.setDamage(10);
		return weapon.getDamage();
	}
	
	public String getPunch_Name(){
		return "Punch";
	}
	
	public int getBattle_Axe(){
		weapon.setDamage(20);
		return weapon.getDamage();
		
		}
	
	public int getBattle_Axe_Weight(){
		weapon.setWeight(10);
		return weapon.getWeight();
	}
	
}
