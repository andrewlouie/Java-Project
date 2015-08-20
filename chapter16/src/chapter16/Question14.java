package chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Question14 extends Application {
private Label main = new Label("Programming is fun");
private ComboBox<String> cbo = new ComboBox<>();
private ComboBox<String> cbo2 = new ComboBox<String>();
private CheckBox bold = new CheckBox();
private CheckBox italic = new CheckBox();

@Override
public void start(Stage primaryStage) {
	StackPane pane = new StackPane();
	HBox hBox = new HBox();
	Label fontlabel = new Label("Font Name");
	cbo.getItems().setAll(Font.getFamilies());
	cbo.setMaxWidth(120);
	Label sizelabel = new Label("Font Size");
	cbo.setValue(Font.getDefault().getFamily());
	cbo2.getItems().addAll("8","10","12","18","24","36","50","60","72");
	cbo2.setValue("12");
	hBox.getChildren().addAll(fontlabel,cbo,sizelabel,cbo2);
	HBox hBox2 = new HBox();
	hBox2.setAlignment(Pos.CENTER);
	hBox2.getChildren().add(main);
	HBox hBox3 = new HBox();
	Label blabel = new Label("Bold");
	Label ilabel = new Label("Italic");
	hBox3.getChildren().addAll(bold,blabel,italic,ilabel);
	hBox3.setAlignment(Pos.CENTER);
	cbo.setOnAction(e -> handler1());
	cbo2.setOnAction(e -> handler1());
	bold.setOnAction(e -> handler1());
	italic.setOnAction(e -> handler1());
	BorderPane myPane = new BorderPane();
	myPane.setCenter(pane);
	myPane.setTop(hBox);
	myPane.setCenter(hBox2);
	myPane.setBottom(hBox3);
	Scene scene = new Scene(myPane, 200, 150);
	primaryStage.setMinWidth(320);
	primaryStage.setTitle("Font Selector");
	primaryStage.setScene(scene);
	primaryStage.show();
}


public static void main(String[] args) {
	Application.launch(args);

}
private void handler1() {
	Font fontBoldItalic = Font.font(cbo.getValue(), 
		      FontWeight.BOLD, FontPosture.ITALIC, Float.parseFloat(cbo2.getValue()));
    Font fontBold = Font.font(cbo.getValue(), 
		      FontWeight.BOLD, FontPosture.REGULAR, Float.parseFloat(cbo2.getValue()));
	Font fontItalic = Font.font(cbo.getValue(), 
		      FontWeight.NORMAL, FontPosture.ITALIC, Float.parseFloat(cbo2.getValue()));
	Font fontNormal = Font.font(cbo.getValue(), 
		      FontWeight.NORMAL, FontPosture.REGULAR, Float.parseFloat(cbo2.getValue()));
	if (bold.isSelected() && italic.isSelected()) main.setFont(fontBoldItalic);
	else if (bold.isSelected()) main.setFont(fontBold);
	else if (italic.isSelected()) main.setFont(fontItalic);
	else main.setFont(fontNormal);
}
}
