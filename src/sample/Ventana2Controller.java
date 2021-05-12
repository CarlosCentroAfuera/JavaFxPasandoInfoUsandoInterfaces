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


	public void ponerNumeroEnVentana2(int numero) {
		System.out.println("Soy la ventana 2 y he recibido un " + numero);
	}



}
