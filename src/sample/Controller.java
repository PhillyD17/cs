package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private MenuItem menuOpen;

    @FXML
    private MenuItem menuSave;

    @FXML
    private MenuItem menuClose;

    @FXML
    private MenuItem menuAdd;

    @FXML
    private MenuItem menuDelete;

    @FXML
    private MenuItem menuInstructions;

    @FXML
    private ListView<?> formulaList;

    @FXML
    private Button formulaSelect;

    @FXML
    private TextField var1;

    @FXML
    private TextField var2;

    @FXML
    private TextField var3;

    @FXML
    private Button calculate;

    @FXML
    private Text answer;

    @FXML
    void addFormula(ActionEvent event) {

    }

    @FXML
    void deleteFormula(ActionEvent event) {

    }

    @FXML
    void doClose(ActionEvent event) {

    }

    @FXML
    void doOpen(ActionEvent event) {

    }

    @FXML
    void doSave(ActionEvent event) {

    }

    @FXML
    void loadInstructions(ActionEvent event) {

    }

    @FXML
    void parseExpression(MouseEvent event) {

    }

    @FXML
    void setFormula(MouseEvent event) {

    }

}

