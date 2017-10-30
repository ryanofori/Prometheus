package character;
public class Weapons  {

	
	Character_Class weapon = new Character_Class();
	int damage,weight, Rusty_Axe;
	String name;
	
	public int getRusty_Axe_Damage(){
		weapon.setDamage(20);
		damage = weapon.getDamage();
		return damage;
	}
	
	public int getRusty_Axe_Weight(){
		weapon.setWeight(6);
		weight = weapon.getWeight();
		return weight;
	}
	
	public String getRustyAxe_Name(){
		return name = "Rusty Axe";
	}
	
	public int getPunch_Damage(){
		weapon.setDamage(10);
		damage = weapon.getDamage();
		return damage;
	}
	
	public String getPunch_Name(){
		return name = "Punch";
	}
	
}
