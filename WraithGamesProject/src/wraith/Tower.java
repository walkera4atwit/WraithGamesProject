package wraith;

public class Tower {
	public static int atkSpeed;
	public static int level;
	public static int range;
	public static int damage;
	public int aoe;
	public String type;

	public static void attack(Enemy e) {
		e.hp = e.hp - damage;
	}

	//TODO: better upgrading system
	public static void upgrade() {
		level = level + 1; // level +1 instead of level * 2 in case we want a level 3  
		atkSpeed = atkSpeed * 2;
		range = range * 2;
		damage = damage * 2;
	}

//do we want this to be tied to the player
//to allow for the "Sale" of the tower
	public static void sell() {
		//in this, destroy the instance of the tower	
	}

	public int getAttackSpeed() {
		return atkSpeed;
	}

	public int getLevel() {
		return level;
	}

	public int getRange() {
		return range;
	}

	public int getDamage() {
		return damage;
	}

	public int getAOE() {
		return aoe;
	}

	public String getType() {
		return type;
	}
}
