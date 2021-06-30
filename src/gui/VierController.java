package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class VierController {
	
	@FXML
	private Button btTest;
	
	public void onBtTestAction() {
		System.out.print("Click!");
	}
	

}
