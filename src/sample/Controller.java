package sample;

import javafx.beans.binding.NumberBinding;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.naming.Binding;
import javax.script.Bindings;

public class Controller {


    //GUI-Elemente
    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @FXML
    private Label label;


    //Controller erstellt Presenter und übergibt eigene Referenz
    private Presenter presenter = new Presenter(this);


    //Methoden für Klick auf Button
    public void buttonGeklickt(ActionEvent actionEvent) {
        presenter.setStringProperty(textField.getText());
    }

    //Aktualisierung der Gui: Aufruf der Methode durch Presenter
    public void updateGui() {
        label.setText(presenter.getStringProperty());
        textField.clear();
    }
}
