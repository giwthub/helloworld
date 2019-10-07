package study.java.javafx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{

	/**
	 * main方法不是必须的。
	 * 	当从一个不完全支持JavaFX的IDE中启动JavaFX程序的时候，可能需要main方法。
	 * 	当运行一个没有main方法的JavaFX应用时，JVM自动调用launch方法以运行应用程序。
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK,200,500);
		
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
