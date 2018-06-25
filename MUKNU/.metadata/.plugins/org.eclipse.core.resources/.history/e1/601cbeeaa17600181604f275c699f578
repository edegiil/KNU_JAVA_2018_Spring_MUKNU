package application.view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.json.simple.parser.ParseException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class RandomController implements Initializable, ControlledScreen {
	
	ScreensController myController;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	
	public void setScreenParent(ScreensController screenParent) {
		myController = screenParent;
	}
	
	@FXML
	private Text name, gate, menu, price, tel;
	
	@FXML
	public void goBack(ActionEvent event) {
        myController.setScreen(Main.mainID);
	}
	
	@FXML
	public void randomPick(ActionEvent event) throws FileNotFoundException, ParseException, IOException {
		
		Restaurant list = new Restaurant();
		
		list.Array();
		
		String[][] restaurant = list.restaurantList;
		
		int rand = (int) (Math.random() * restaurant.length);
		
		name.setText(restaurant[rand][0]);
		gate.setText(restaurant[rand][1]);
		menu.setText(restaurant[rand][5]);
		price.setText(restaurant[rand][2]);
		tel.setText(restaurant[rand][4]);
		System.out.println(restaurant[rand][0]);
	}
}
