package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button helloButton;

    @FXML
    private Label helloLabel;

    @FXML
    public void initialize() {
        helloButton.setOnAction(event -> helloLabel.setText("Bye"));
    }
    @FXML
    private Button firstButton;

    @FXML
    private Label firstLable;

    @FXML
    public void firstButtonAction(ActionEvent actionEvent) {
        firstButton.setOnAction(event -> firstLable.setText("First"));
    }

    public void secondButtonAction(ActionEvent actionEvent) {
        System.out.println("Second");
    }
}
