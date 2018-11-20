package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Controller {
        @FXML // fx:id="value_label";
        Label value_label;

        @FXML // fx:id="list_view";
        ListView list_view;

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

}
