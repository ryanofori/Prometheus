package battle_system;

public class Formulas {
	int pdd,weapon_variable,weapon_proficiency,strength,weapon_damage;	
	
	public int getWeapon_variable(){
		return weapon_variable;
	}
	
	public int getWeapon_Proficiency(){
		return weapon_proficiency;
	}
	
	
	public int getStrength(){
		return strength;
	}
	
	public int getWeapon_Damage(){
		return weapon_damage;
	}
	
	public int getPhysicalDamageDealt(){
		 pdd = weapon_variable * (weapon_proficiency*(strength+weapon_damage));
		 return pdd;
			 
	}

}
