package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ventana2Controller {


	@FXML
	private Button buttonCerrarVentana;
	@FXML
	private Button buttonCerrarApp;
	
	@FXML
	private void onButtonCerrarVentanaClicked() {
	    Stage stage = (Stage) buttonCerrarVentana.getScene().getWindow();
	    stage.close();
	}
	
	@FXML
	private void onButtonCerrarAppClicked() {
	    System.exit(0);
	}


	
}
