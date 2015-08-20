package chapter32;


	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.stage.Stage;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	
	public class Question1 extends Application {
	@Override
	public void start(Stage primaryStage) {
	try {
	Parent root = FXMLLoader.load(getClass().getResource("/chapter32/Question1.fxml"));
	Scene scene = new  Scene(root);
	   //BorderPane root = new BorderPane();
	//Scene scene = new Scene(root,400,400);
//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
	} catch(Exception e) {
	e.printStackTrace();
	}
	}
	public static void main(String[] args) {
	launch(args);
	}
	}
