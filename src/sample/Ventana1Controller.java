package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Ventana1Controller {

	Persona persona = new Persona("Rodolfo", 55);

	@FXML
	Label labelNombre, labelEdad;

	@FXML
	public void initialize(){
		actualizarUi();
	}

	@FXML
	private void onButtonAbrirClicked() {
		try {
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root,450,410);
			stage.setScene(scene);

			Ventana2Controller controllerVentana2 = loader.getController();
			controllerVentana2.enviarPersona(persona);
			controllerVentana2.enviarController1(this);
			// Oculta los botones de cerrar/minimizar/maximizar
			stage.initStyle(StageStyle.UNDECORATED);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void actualizarUi(){
		labelNombre.setText(persona.nombre);
		labelEdad.setText(String.valueOf(persona.edad));
	}


}