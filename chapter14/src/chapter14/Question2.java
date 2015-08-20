package chapter14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Question2 extends Application {
	boolean turn = true;
	@Override
	public void start(Stage primaryStage) {
		LinePane lp = new LinePane();
		Scene scene = new Scene(lp, 500, 500);
	    primaryStage.setTitle("TicTacToe"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	    lp.setOnMousePressed(e -> {
	    	if (lp.setVis(turn,e.getX(), e.getY())) {
	    	if (turn == true) turn = false;
	    	else turn = true;
	    	}
	    });
	}
	public static void main(String[] args) {
		Application.launch(args);

	}

}
class LinePane extends Pane {
	Image image1 = new Image("x.gif");
	Image image2 = new Image("not.gif");
	ImageView imageView = new ImageView(image2);
	ImageView imageView2 = new ImageView(image1);
    ImageView imageView3 = new ImageView(image1);
    ImageView imageView4 = new ImageView(image1);
    ImageView imageView5 = new ImageView(image1);
    ImageView imageView6 = new ImageView(image1);
    ImageView imageView7 = new ImageView(image1);
    ImageView imageView8 = new ImageView(image1);
    ImageView imageView9 = new ImageView(image1);
    Line line1 = new Line(150, 20, 150, 450);
    Line line2 = new Line(300, 20, 300, 450);
    Line line3 = new Line(20, 150, 450, 150);
    Line line4 = new Line(20, 300, 450, 300);
    
	  public LinePane() {
	    line1.endXProperty().bind(widthProperty().divide(3));
	    line1.endYProperty().bind(heightProperty().subtract(20));
	    line1.startXProperty().bind(widthProperty().divide(3));
	    line1.setStrokeWidth(5);
	    line1.setStroke(Color.GREEN);
	    getChildren().add(line1);
	    
	    line2.endXProperty().bind(widthProperty().multiply(0.66));
	    line2.endYProperty().bind(heightProperty().subtract(20));
	    line2.startXProperty().bind(widthProperty().multiply(0.66));
	    line2.setStrokeWidth(5);
	    line2.setStroke(Color.GREEN);
	    getChildren().add(line2);
	    
	    line3.endYProperty().bind(heightProperty().multiply(0.33));
	    line3.endXProperty().bind(widthProperty().subtract(20));
	    line3.startYProperty().bind(heightProperty().multiply(0.33));
	    line3.setStrokeWidth(5);
	    line3.setStroke(Color.GREEN);
	    getChildren().add(line3);
	    
	    line4.endYProperty().bind(heightProperty().multiply(0.66));
	    line4.endXProperty().bind(widthProperty().subtract(20));
	    line4.startYProperty().bind(heightProperty().multiply(0.66));
	    line4.setStrokeWidth(5);
	    line4.setStroke(Color.GREEN);
	    getChildren().add(line4);
	    
	    imageView2.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView2.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView2.xProperty().bind(line1.startXProperty().add(20));
	    imageView2.setY(20);
		getChildren().add(imageView2);
		
		imageView.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView.xProperty().bind(line2.startXProperty().add(10));
	    imageView.setY(20);
		getChildren().add(imageView);
		
		imageView3.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView3.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView3.setX(20);
	    imageView3.setY(20);
		getChildren().add(imageView3);
		
		imageView4.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView4.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView4.setX(20);
	    imageView4.yProperty().bind(line3.startYProperty().add(20));
		getChildren().add(imageView4);
		
		imageView5.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView5.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView5.xProperty().bind(line2.startXProperty().add(10));
	    imageView5.yProperty().bind(line3.startYProperty().add(20));
		getChildren().add(imageView5);
		
		imageView6.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView6.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView6.xProperty().bind(line1.startXProperty().add(10));
	    imageView6.yProperty().bind(line3.startYProperty().add(20));
		getChildren().add(imageView6);
		
		imageView7.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView7.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView7.setX(20);
	    imageView7.yProperty().bind(line4.startYProperty().add(20));
		getChildren().add(imageView7);
		
		imageView8.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView8.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView8.xProperty().bind(line2.startXProperty().add(10));
	    imageView8.yProperty().bind(line4.startYProperty().add(20));
		getChildren().add(imageView8);
		
		imageView9.fitWidthProperty().bind(widthProperty().multiply(0.33).subtract(20));
	    imageView9.fitHeightProperty().bind(heightProperty().multiply(0.33).subtract(20));
	    imageView9.xProperty().bind(line1.startXProperty().add(10));
	    imageView9.yProperty().bind(line4.startYProperty().add(20));
		getChildren().add(imageView9);
		imageView.setVisible(false);
		imageView9.setVisible(false);
		imageView2.setVisible(false);
		imageView3.setVisible(false);
		imageView4.setVisible(false);
		imageView5.setVisible(false);
		imageView6.setVisible(false);
		imageView7.setVisible(false);
		imageView8.setVisible(false);
		  
	  }
	  public boolean setVis(boolean xo, double getx, double gety) {
		  ImageView aathing;
		  if (getx < line1.getEndX()) {
			  if (gety < line3.getEndY()) { aathing = imageView3;  }
			  else if (gety < line4.getEndY()) { aathing = imageView4; }
			  else { aathing = imageView7;  }
		  }
		  else if (getx < line2.getEndX()) {
			  if (gety < line3.getEndY()) { aathing = imageView2; }
			  else if (gety < line4.getEndY()) { aathing = imageView6;}
			  else { aathing = imageView9;  }			  
		  }
		  else {
			  if (gety < line3.getEndY()) { aathing = imageView;  }
			  else if (gety < line4.getEndY()) { aathing = imageView5; }
			  else { aathing = imageView8;  }			  
		  }
		  if (!aathing.isVisible()) {
			  if (xo) aathing.setImage(image1);
			  else aathing.setImage(image2);
			  aathing.setVisible(true);
			  return true;
		  }
		  return false;
		  
	  }
	  
	}
