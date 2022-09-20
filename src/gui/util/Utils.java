package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

	public static Stage currentStage(ActionEvent event) {
		return (Stage) ((Node) event.getSource()).getScene().getWindow(); //Para pegar o Stage onde o controler que recebeu o evento est�
		//por exemplo se clicar num bot�o pega o Stage daquele bot�o
	}
	
	
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		}catch (NumberFormatException e) {
			return null;
		}
	}
	
}
