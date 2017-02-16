package sliderBug.main;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Created by Christopher Juerges on 16/02/17.
 */
public class MainController {
    @FXML
    private Label label;

    public void setText(String text) {
        label.setText(text);
    }
}
