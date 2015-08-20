package chapter15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

	public class Question4 extends Application {
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		TextField tf = new TextField();
		tf.setMaxWidth(50);
		TextField tf2 = new TextField();
		tf2.setMaxWidth(50);
		pane.add(tf2, 2, 0);
		pane.add(tf, 0, 0);
		ComboBox<String> cbo = new ComboBox<>();
		cbo.getItems().addAll("+","-","x","/");
		cbo.setValue("+");
		pane.add(cbo, 1, 0);
		TextField tf3 = new TextField();
		tf3.setMaxWidth(50);
		Button calcBtn = new Button("Calculate");
		pane.add(calcBtn, 1, 2);
		calcBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				try {
				float a = Float.parseFloat(tf.getText());
				float b = Float.parseFloat(tf2.getText());
				switch(cbo.getValue()) {
					case "+":tf3.setText(Float.toString(a+b)); return;
					case "-":tf3.setText(Float.toString(a-b)); return; 
					case "x":tf3.setText(Float.toString(a*b)); return;
					case "/":tf3.setText(Float.toString(a/b)); return;
				} }
				catch (NumberFormatException ex) {
				tf3.setText("Error");	
				}
			}
		});
		pane.add(new Label("Result:"), 0,3);
		pane.add(tf3, 1, 3);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
