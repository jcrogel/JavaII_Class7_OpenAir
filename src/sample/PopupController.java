package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
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
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PopupController {
    @FXML
    LineChart chart; // fx:id="chart";
    String country_code = "";

    public static void openWindow(String selected_code){

        Parent root = null;
        try {
            Stage window = new Stage();
            URL loc = PopupController.class.getResource("popup.fxml");
            FXMLLoader loader = new FXMLLoader(loc);
            root = loader.load();

            PopupController ctrl = (PopupController) loader.getController();
            ctrl.loadChart(selected_code);

            window.setTitle("Open Air - " + selected_code);
            window.setScene(new Scene(root, 600, 400));
            window.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String refresh(ArrayList<Float> list){

        XYChart.Series<String ,Float> series = new XYChart.Series<String, Float>();
        Float x = 0.0f;
        for(Float y: list){
            series.getData().add(new XYChart.Data<String, Float>(x.toString(), y));
            x = x + 1.0f;
        }

        this.chart.getData().add(series);

        return "";
    }

    public void loadChart(String selected_code){
        this.country_code = selected_code;

        CompletableFuture<ArrayList> cf = new CompletableFuture<ArrayList>();
        cf.supplyAsync(()->{ return this.country_code; }).thenApplyAsync(Measurements::readFromAPI).thenApply(this::refresh);

    }

}
