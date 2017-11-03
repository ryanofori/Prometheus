package character;

public class Character_Elf extends Characer_Class {
	
	// NEW CONSTRUCTOR:
	
		public Character_Elf() {
			super.name = "Elf";
			super.health = 100;
			super.damage = 60;
			super.magic = 60;
			super.defense = 40;
			super.boost = 50;
			super.weapon_damage = 60;
			super.armor = 70;
			super.intelligence = 80;
			super.speed = 80;
			super.strength = 60;
			super.resistance = 40;
		}
		
		// END NEW CONSTRUCTOR.
	
public String user,speak;	//This variable controls what the users name is, which in this case is "Warrior". 
	
	
	public String getSpeak(){
		elf.setSpeak("I am an Elf");
		return elf.getSpeak();
	}
	
	public String getSpeak2(){
		elf.setSpeak("I do: ");
		return elf.getSpeak();
	}
	
	public String getSpeak3(){
		elf.setSpeak("I have: ");
		return elf.getSpeak();
	}
	
	public int getHealthElf(){
		elf.setHealth(100);				//All characters start at 100 health
		return elf.getHealth();
	}
	
	public int getDamageElf(){
		elf.setDamage(60);				//The elf has base damage level 60
		return elf.getDamage();
	}
	
	public int getMagicElf(){
		elf.setMagic(60);				//The elf has base magic level 60
		return elf.getMagic();
	}
	
	public int getDefenseElf(){
		elf.setDefense(40);				//The elf has base defense level 40
		return elf.getDefense();
	}
	
	public int getBoostElf(){
		elf.setBoost(50);				//The elf has base boost level 50
		return elf.getBoost();
	}
	
	public int getWeapon_DamageElf(){
		elf.setWeapon_Damage(60);		//The elf has base weapon damage level 60
		return elf.getWeapon_Damage();
	}
	
	public int getArmorElf(){
		elf.setArmor(70);				//The elf has base armor level 70
		return elf.getArmor();
	}
	
	public int getIntelligenceElf(){
		elf.setIntelligence(80);			//The elf has base intelligence level 80
		return elf.getIntelligence();
	}
	
	public int getSpeedElf(){
		elf.setSpeed(80);				//The elf has base intelligence level 80
		return elf.getSpeed();
	}
	
	public int getStrengthElf(){
		elf.setStrength(60);  		    //The elf has base strength level 60
		return elf.getStrength();
	}
	
}