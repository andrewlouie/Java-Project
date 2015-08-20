package chapter14;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Question1 extends Application {
	@Override
	public void start(Stage primaryStage) {
	GridPane pane = new GridPane();
	pane.setAlignment(Pos.TOP_LEFT);
	pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));;
	pane.setHgap(5.5);;
	pane.setVgap(5.5);;
	Image image = new Image("flag1.gif");
	ImageView imageView2 = new ImageView(image);
	Image image2 = new Image("flag4.gif");
	imageView2.maxWidth(100);
	ImageView imageView3 = new ImageView(image2);
	Image image3 = new Image("flag5.gif");
	ImageView imageView4 = new ImageView(image3);
	Image image4 = new Image("flag6.gif");
	ImageView imageView5 = new ImageView(image4);
	pane.add(imageView2, 0, 0);
	pane.add(imageView3, 0, 1);
	pane.add(imageView4, 1, 0);
	pane.add(imageView5, 1, 1);
	Scene scene = new Scene(pane);
	primaryStage.setWidth(850);
	primaryStage.setHeight(500);
	primaryStage.setTitle("MyJavaFX");
	primaryStage.setScene(scene);
	primaryStage.show();
}
public static void main(String[] args) {
	Application.launch(args);
}
}
