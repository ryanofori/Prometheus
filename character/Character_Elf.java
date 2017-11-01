package character;

public class Character_Elf {
	Character_Class elf = new Character_Class();
	
	
	public int getHealthElf(){
		elf.setHealth(100);	//I have given the elf 100 health. 
		return elf.getHealth();
	}
	
	public int getDamageElf(){
		elf.setDamage(100);	//I have given the elf 100 health. 
		return elf.getDamage();
	}
	
	public int getMagicElf(){
		elf.setMagic(100);	//I have given the elf 100 health. 
		return elf.getMagic();
	}
	
	public int getDefenseElf(){
		elf.setDefense(100);	//I have given the elf 100 health. 
		return elf.getDefense();
	}
	
	public int getBoostElf(){
		elf.setBoost(100);	//I have given the elf 100 health. 
		return elf.getBoost();
	}
	
	public int getWeapon_DamageElf(){
		elf.setWeapon_Damage(100);	//I have given the elf 100 health. 
		return elf.getWeapon_Damage();
	}
	
	public int getArmorElf(){
		elf.setArmor(100);	//I have given the elf 100 health. 
		return elf.getArmor();
	}
	
	public int getIntelligenceElf(){
		elf.setIntelligence(100);	//I have given the elf 100 health. 
		return elf.getIntelligence();
	}
	
}

/*
damage = 0;
magic = 0;
defense = 0;
boost = 0;
weapon_damage = 0;
armor = 0;
intelligence = 0;
speed = 0;
strength = 0;
speak = "";*/