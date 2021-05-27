package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ventana2Controller {


	@FXML
	private Button buttonCerrarVentana;
	@FXML
	private Button buttonCerrarApp;

	private ComponenteUIActualizable componenteUIActualizable;


	Persona persona;
	@FXML
	private void onButtonCerrarVentanaClicked() {
	    Stage stage = (Stage) buttonCerrarVentana.getScene().getWindow();
	    stage.close();
	}
	
	@FXML
	private void onButtonCerrarAppClicked() {
	    System.exit(0);
	}


	public void enviarPersona(Persona persona) {
		this.persona = persona;
	}

	@FXML
	private void onButtonEnvejecerlicked() {
		persona.edad++;
		componenteUIActualizable.actualizarUi();
	}

	public void enviarController1(ComponenteUIActualizable componenteUIActualizable) {
		this.componenteUIActualizable = componenteUIActualizable;
	}

}
