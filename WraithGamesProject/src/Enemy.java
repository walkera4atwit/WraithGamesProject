import java.util.ArrayList;

public class Enemy {
	
	//Added damage
	
public int damage;
public int rewardOnDeath;
public Tile currTile;
public int level;
public double hp; 
public double speed;
public String type;

public void damage(Player p) {
	int playerHP= p.getHP();
	playerHP=playerHP-damage;
}

public void move(ArrayList<Tile> pathPositions) {
	//need to know positions of the path tiles
	//currTile= currTile + speed;
	
}

public void endReached(boolean b, double hp) {
	if(b==true) {
		hp= hp-damage;
	}
}

public int getRewardOnDeath() {
	return rewardOnDeath;
}

public void  setRewardOnDeath(int newRewardOnDeath) {
	rewardOnDeath= newRewardOnDeath;
}

/*public Tile getCurrentTile() {
	return currTile;
}
public void setCurrentTile( Tile newCurrTile){
	currTile= newCurrTile;
}

*/

public int getLevel() {
	return level;
}

public void setLevel(int newLevel) {
	level= newLevel;
}

public double getHP() {
	return hp;
}

public void setHP(int newHP) {
	hp = newHP;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double newSpeed) {
	speed=newSpeed;
}

public String getType() {
	return type;
}

public void setType(String newType) {
	type = newType;
}

}