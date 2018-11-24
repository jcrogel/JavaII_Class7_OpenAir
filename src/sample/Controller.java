package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Controller {
        @FXML // fx:id="value_label";
        Label value_label;

        @FXML // fx:id="list_view";
        ListView list_view;
        Application current_app;

        public void pressed(Event evt) {
            CompletableFuture<String> cf = new CompletableFuture<String>();
            cf.supplyAsync(Country::readFromAPI).thenApply(this::refresh);
        }

        public int refresh(List<String> api_data){
            ObservableList<String> ol_data = FXCollections.observableArrayList(api_data);
            list_view.setItems(ol_data);
            return 0;
        }

        public void keyed(KeyEvent evt){
            String new_value = value_label.getText() + evt.getText();
            value_label.setText(new_value);
        }

        public void clicked(MouseEvent evt){
            String item = list_view.getSelectionModel().getSelectedItem().toString();
            String selected_item = item.split("\\(")[1].split("\\)")[0];
            URL loc = list_view.getClass().getResource("popup.fxml");
            PopupController.openWindow(selected_item);
        }
}
