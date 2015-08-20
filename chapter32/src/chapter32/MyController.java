package chapter32;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController implements Initializable {
@Override 
public void initialize(URL arg0, ResourceBundle arg1) {
// TODO Auto-generated method stub
}
@FXML
private Button next;
@FXML
private Button previous;
@FXML
private Button update;
@FXML
private Button insert;
@FXML
private Button clear;
@FXML
private TextField address;
@FXML
private TextField city;
@FXML
private TextField province;
@FXML
private TextField phone;
@FXML
private TextField firstname;
@FXML
private TextField lastname;
@FXML
private TextField mi;
@FXML
private TextField id;

public void previousBtn(ActionEvent event) 
		throws SQLException, ClassNotFoundException {
	   System.out.println("Driver loaded");
	   Connection connection = DriverManager.getConnection
	     ("jdbc:mariadb://127.0.0.1/database", "username", "password");
	   System.out.println("Database connected");
	   Statement statement = connection.createStatement();
	   ResultSet resultSet = statement.executeQuery
	     ("SELECT * FROM staff WHERE id = " + String.valueOf(Integer.parseInt(id.getText()) - 1));
	   while (resultSet.next()) {
		   id.setText(resultSet.getString(1));
		   lastname.setText(resultSet.getString(2));
		   firstname.setText(resultSet.getString(3));
		   mi.setText(resultSet.getString(4));
		   address.setText(resultSet.getString(5));
		   city.setText(resultSet.getString(6));
		   province.setText(resultSet.getString(7));
		   phone.setText(resultSet.getString(8));
	   }
}
public void nextBtn(ActionEvent event) 	
		throws SQLException, ClassNotFoundException {
	   System.out.println("Driver loaded");
	   Connection connection = DriverManager.getConnection
	     ("jdbc:mariadb://triosdevelopers.com/aaPHP2015", "aaPHP2015", "aaP@ssw0rd2015");
	   System.out.println("Database connected");
	   Statement statement = connection.createStatement();
	   ResultSet resultSet = statement.executeQuery
	     ("SELECT * FROM staff WHERE id = " + String.valueOf(Integer.parseInt(id.getText()) + 1));
	   if (resultSet.next()) {
		   id.setText(resultSet.getString(1));
		   lastname.setText(resultSet.getString(2));
		   firstname.setText(resultSet.getString(3));
		   mi.setText(resultSet.getString(4));
		   address.setText(resultSet.getString(5));
		   city.setText(resultSet.getString(6));
		   province.setText(resultSet.getString(7));
		   phone.setText(resultSet.getString(8));
	   }
	   connection.close();

}
public void updateBtn(ActionEvent event) 	    
		throws SQLException, ClassNotFoundException {
	   System.out.println("Driver loaded");
	   Connection connection = DriverManager.getConnection
	     ("jdbc:mariadb://triosdevelopers.com/aaPHP2015", "aaPHP2015", "aaP@ssw0rd2015");
	   System.out.println("Database connected");
	   Statement statement = connection.createStatement();
	   statement.executeQuery
	     ("UPDATE staff SET lastName = '" + lastname.getText() + "',firstName = '" + firstname.getText() + "',mi = '" + mi.getText() + "',address = '" + address.getText() + "',city = '" + city.getText() + "',prov = '" + province.getText() + "',telephone = '" + phone.getText() +"' WHERE id = " + id.getText() + ";");
	   System.out.println("User updated");
	   connection.close();

}
public void insertBtn(ActionEvent event) 
	    throws SQLException, ClassNotFoundException {
	   System.out.println("Driver loaded");
	   Connection connection = DriverManager.getConnection
	     ("jdbc:mariadb://triosdevelopers.com/aaPHP2015", "aaPHP2015", "aaP@ssw0rd2015");
	   System.out.println("Database connected");
	   Statement statement = connection.createStatement();
	   statement.executeQuery
	     ("INSERT INTO staff (id,lastName,firstName,mi,address,city,prov,telephone) VALUES (NULL,'" + lastname.getText() + "','" + firstname.getText() + "','" + mi.getText() + "','" + address.getText() + "','" + city.getText() + "','" + province.getText() + "','" + phone.getText() +"');");
	   System.out.println("User added");
	   connection.close();
}
public void clearBtn(ActionEvent event) {
id.setText("0");
address.setText("");
firstname.setText("");
lastname.setText("");
mi.setText("");
city.setText("");
province.setText("");
phone.setText("");
}
}