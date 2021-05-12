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

	private Ventana1Controller controllerVentana1;

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

	@FXML
	private void onButtonPasarInfoClicked() {
		System.out.println("He recibido el click en la ventana 2 y quiero pasar info a la ventana 1");
		controllerVentana1.ponerStringEnVentana1("Hola");
	}

	public void enviarController1(Ventana1Controller ventana1Controller) {
		controllerVentana1 = ventana1Controller;
	}
}
