package wraith;

public class TowerTile extends Tile {


	public Tower tower;
	public boolean hasTower;

	//Need to display the image used;
	
	public TowerTile(int x, int y){
		//Some kind of basic dirt image
		super(x,y);
	}
	
	/*public TowerTile() {
		//Allows setting of a new image.
	}*/ 
	
	public Tower getTower() {
		return tower;
	}

}
