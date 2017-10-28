package character;
public class Character_Class  {
	private int health,damage,magic,defense,boost,endurance, weapon_damage,armor;
	private int intelligence,wisdom,speed,strength,resistance,weight;
	private String name;
	public Character_Class(){   //These are the defaults stats, just in case I didn't set one up 
		health = 0;        // in the main_Class.
		damage = 0;
		magic = 0;
		defense = 0;
		boost = 0;
		endurance = 0;
		weapon_damage = 0;
		armor = 0;
		intelligence = 0;
		wisdom = 0;
		speed = 0;
		strength = 0;
		resistance = 0;
		weight = 0;
	}
	
	public void setEndurance(int e){
		endurance = e;
	}
	
	public void setWeapon_Damage(int wd){
		weapon_damage = wd;
	}
	
	public void setArmor(int a){
		armor = a;
	}
	public void setHealth(int h){
		health = h;
	}
	public void setDamage(int d){
		damage = d;
	}
	public void setMagic(int m){
		magic = m;
	}
	public void setDefense(int def){
		defense = def;
	}
	public void setBoost(int boo){
		boost = boo;
	}
	
	public void setName(String usr){
		name = usr;
	}
	
	public void setWeight(int w){
		weight = w;
	}
	
	public String getName(){
		return name;
	}
	public int getBoost(){
		return boost;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getDamage(){
		return damage;
	}
	public int getMagic(){
		return magic;
	}
	public int getDefense(){
		return defense;
	}
	
	public int getEndurance(){
		return endurance;
	}
	
	public int getArmor(){
		return armor;
	}
	
	public int getWeapon_Damage(){
		return weapon_damage;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	
	public int getWisdom(){
		return wisdom;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getResistance(){
		return resistance;
	}
	
	public int getWeight(){
		return weight;
	}
}