package sliderBug.sliderShower;

import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;

/**
 * Created by Christopher Juerges on 16/02/17.
 */
public class SliderShowerController {
    @FXML
    private Slider sliderUI;

    DoubleProperty getSliderValueProp() {
        return sliderUI.valueProperty();
    }
}
