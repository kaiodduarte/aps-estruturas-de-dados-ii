package com.ui;

import com.compact.Compact;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class UIController implements Initializable {

	@FXML
	Label label;

	@FXML
	TextArea txtArea;

	@FXML
	Button btn;

	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

	@FXML
	public void clickButton() {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Result");
		alert.setHeaderText(null);

		Compact c = new Compact();
		c.UI(txtArea.getText());

		Label before = new Label("Before\n\n");
		TextArea textArea = new TextArea(c.getBefore());
		textArea.setEditable(false);
		textArea.setMaxHeight(c.getAfter().length());

		Label after = new Label("After\n\n");
		TextArea textArea1 = new TextArea(c.getAfter());
		textArea1.setEditable(false);
		textArea1.setMaxHeight(c.getAfter().length());

		Label sizeA = new Label("\nSize: " + c.getAfter().length() + "");
		Label line = new Label("\n\n");
		Label sizeB = new Label("\nSize: " + c.getBefore().length() * 8 + "");

		GridPane expContent = new GridPane();
		expContent.add(before, 0, 0);
		expContent.add(textArea, 0, 1);
		expContent.add(sizeB, 0, 2);
		expContent.add(line, 0, 3);
		expContent.add(after, 0, 4);
		expContent.add(textArea1, 0, 5);
		expContent.add(sizeA, 0, 6);

		alert.getDialogPane().setContent(expContent);
		alert.show();
	}

}
