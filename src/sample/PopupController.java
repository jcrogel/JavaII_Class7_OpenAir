package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class PopupController {
    @FXML
    LineChart chart; // fx:id="chart";

    public static void openWindow(String selected_code){

        Parent root = null;
        try {
            Stage window = new Stage();
            URL loc = new URL("file:/Users/moreno/dev/OpenAir/out/production/OpenAir/sample/popup.fxml");
            FXMLLoader loader = new FXMLLoader(loc);
            root = loader.load();

            PopupController ctrl = (PopupController) loader.getController();

            ArrayList<Float> list = Measurements.readFromAPI(selected_code);

            XYChart.Series<String ,Float> series = new XYChart.Series<String, Float>();
            Float x = 0.0f;
            for(Float y: list){
                series.getData().add(new XYChart.Data<String, Float>(x.toString(), y));
                x = x + 1.0f;
            }

            ctrl.chart.getData().add(series);


            window.setTitle("Open Air - " + selected_code);
            window.setScene(new Scene(root, 600, 400));
            window.show();

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

}
