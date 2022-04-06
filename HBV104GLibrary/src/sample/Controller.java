package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button addButton;
    @FXML
    private ListView usersListView;
    @FXML
    private ListView reservationsListView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField emailTextField;
    private DataFactory dataFactory = new DataFactory();
    private ObservableList<Passenger> passengers = FXCollections.observableArrayList();

    public void initialize(URL url, ResourceBundle resourceBundle) {
        passengers = dataFactory.getPassenger();
        usersListView.setItems(passengers);
    }
}
