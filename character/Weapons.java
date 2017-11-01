package character;
public class Weapons  {

	
	Character_Class weapon = new Character_Class();
	int damage,weight;
	int Rusty_Axe;
	
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
	public int getKick_Damage(){
		weapon.setDamage(10);
		return weapon.getDamage();
	}
		
	public String getKick_Name(){
		return "Kick";
}
	public int getSword_Damage(){
		weapon.setDamage(20);
		return weapon.getDamage();
	}
	
	public int getSword_Weight(){
		weapon.setWeight(6);
		return weapon.getWeight();
	}
	
	public String getSword_Name(){
		return "Sword";
}
	
	
}
