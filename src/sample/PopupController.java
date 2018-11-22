package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class PopupController {
    public static void openWindow(String selected_code){

        Parent root = null;
        try {
            Stage window = new Stage();
            URL loc = new URL("file:/Users/moreno/dev/OpenAir/out/production/OpenAir/sample/popup.fxml");

            root = FXMLLoader.load(loc);
            window.setTitle("Open Air - " + selected_code);
            window.setScene(new Scene(root, 600, 400));
            window.show();
            Measurements.readFromAPI(selected_code);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
