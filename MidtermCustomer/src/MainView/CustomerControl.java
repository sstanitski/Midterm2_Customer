package MainView;

import MainApp.MainClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;

public class CustomerControl extends MainClass{

	@FXML
	private TextField firstName;
	@FXML
	private TextField middleInitial;
	@FXML
	private TextField lastName;
	@FXML
	private RadioButton male;
	@FXML
	private RadioButton female;
	@FXML
	private ToggleGroup gender;
	@FXML
	private TextField address;
	@FXML
	private TextField city;
	@FXML
	private ComboBox<String> state;
	@FXML
	private PasswordField zip;
	@FXML
	private Button save;
	@FXML
	private Button clear;
	
	
	@FXML
	private void initialize(){
		state.getItems().addAll("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming");
		firstName.addEventFilter(KeyEvent.ANY, maxLength(50));
		middleInitial.addEventFilter(KeyEvent.ANY, maxLength(1));
		lastName.addEventFilter(KeyEvent.ANY, maxLength(50));
		address.addEventFilter(KeyEvent.ANY, maxLength(50));
		city.addEventFilter(KeyEvent.ANY, maxLength(25));
		zip.addEventFilter(KeyEvent.ANY, maxLength(5));
	}

	public EventHandler<KeyEvent> maxLength(int i) {
		return new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent length){
				TextField text = (TextField) length.getSource();
				if (text.getText().length() >= i) {length.consume();}
				}
		};
	}
	@FXML
	private void handleClear(){
		firstName.clear();
		middleInitial.clear();
		lastName.clear();
		address.clear();
		city.clear();
		zip.clear();
		state.setValue(null);
		male.setSelected(false);
		female.setSelected(false);
		
	}
	@FXML
	private void handleSave(){
		String first = firstName.getText();
		String middle = middleInitial.getText();
		String last = lastName.getText();
		String addr = address.getText();
		String c = city.getText();
		String s = state.getValue();
		String z = zip.getText();
		String gend = ((TextInputControl) gender.getSelectedToggle()).getText();
		customer saveCustomer = new customer(first, middle, last, gend, addr, c, s, z);
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Save");
		alert.setHeaderText(null);
		alert.setContentText("Your save was successful");
		alert.showAndWait();
	}
}
