package gui;

import gui.util.Alertas;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTeste;
	
	@FXML
	public void onBtTestAction() {
		Alertas.showAlert("Título do Alerta", null, "Conteúdo do Alerta", AlertType.ERROR);
	}

}
