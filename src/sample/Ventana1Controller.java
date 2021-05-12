package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Ventana1Controller {

	@FXML
	private void onButtonAbrirClicked() {
		try {
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root,450,410);
			stage.setScene(scene);

			Ventana2Controller controller = loader.getController();
			controller.ponerNumeroEnVentana2(1);
			// Oculta los botones de cerrar/minimizar/maximizar
			stage.initStyle(StageStyle.UNDECORATED);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


}