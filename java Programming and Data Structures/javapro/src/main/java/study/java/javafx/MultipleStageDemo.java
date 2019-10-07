package study.java.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new Button("Scene"),500,500);
		primaryStage.setTitle("MultipleStageDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage"),500,400));
		stage.show();
	}
	public static void main(String[] args) throws Exception {
		Application.launch(args);
		
	}

}
