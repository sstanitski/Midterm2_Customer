package MainApp;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainClass extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setTitle("Customer");
		showCustomer();
	}
    public void showCustomer() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getResource("../MainView/Customer.fxml"));
            AnchorPane customer = (AnchorPane) loader.load();
            Scene scene = new Scene(customer);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		
		launch(args);
	}
public Stage getPrimaryStage() {
    return primaryStage;
}
}


