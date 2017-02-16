package sliderBug.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sliderBug.sliderShower.SliderShower;

/**
 * Created by Christopher Juerges on 16/02/17.
 */
public class Main extends Application{
    private MainController controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("main.fxml"));
        Parent root = loader.load();
        controller = loader.getController();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.show();

        showSlider();
    }

    private void showSlider() {
        SliderShower sliderShower = new SliderShower();
        sliderShower.show();
        sliderShower.getSliderValueProp().addListener(((observable, oldValue, newValue) -> {
            controller.setText(Double.toString((double)newValue));
        }));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
