package sliderBug.sliderShower;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Christopher Juerges on 16/02/17.
 */
public class SliderShower {
    private Parent root;
    private SliderShowerController controller;
    private Stage stage;
    private DoubleProperty sliderValueProp;

    public SliderShower() {
        sliderValueProp = new SimpleDoubleProperty(0);
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sliderShower.fxml"));
        try {
            root = loader.load();
            controller = loader.getController();
            stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root));

            sliderValueProp.bind(controller.getSliderValueProp());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DoubleProperty getSliderValueProp() {
        return sliderValueProp;
    }

    public void show() {
        stage.show();
    }
}
