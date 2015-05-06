package bindingex;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private TextField plusField1;
    @FXML
    private TextField plusField2;

    @FXML
    private Label result;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        StringProperty textProp = plusField1.textProperty();

        result.textProperty().bind(textProp);
    }
}