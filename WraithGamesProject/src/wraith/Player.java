package wraith;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Player extends Application{
	double hp;
	boolean hellMode = false;
	boolean pause = false;
	String name;
	int bank;
	int waveNumber;
	int gameSpeed;
	public static void main(String[] args) {
		
		
		
	}
	
	public int sellTower(int money) {
		//call the sell method from the tower class
		//Use the addmoney method during this to add to the player money count
		
		return money;
	}
	
	public boolean pause(boolean pause) { 
		
		
		return false;
	}
	
	public int addmoney(int money) {
		
		
		return money;
	}
	
	public int subMoney(int money) {
		
		
		return money;
	}
	
	public void buildBoard() {
		
		
	}
	
	public void updateBoard() {
		
	}
	
	public void loop() {
		boolean pause = false;
	}
	
	public void damage(int dmg) {
		this.hp -= dmg;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Button btn = new Button();
		
		root.getChildren().add(btn);
		btn.setOnAction(e->{
			System.out.printf("Test");
		});
		Scene scene = new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	
	

}
