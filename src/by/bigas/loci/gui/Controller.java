package by.bigas.loci.gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    //Tab of "Training"
    @FXML
    private Tab trainTab;
    @FXML
    private Text resultText;
    @FXML
    private TextArea questionTextArea;
    @FXML
    private TextField answerTextArea;
    @FXML
    private ImageView questionImage;
    @FXML
    private Button variantA_Button;
    @FXML
    private Button variantB_Button;
    @FXML
    private Button variantC_Button;
    @FXML
    private Button variantD_Button;

    //Tab of "Desk"
    @FXML
    private Tab deskTab;
    @FXML
    private ComboBox categoryOfCardBox; //тут все текущие словари
    @FXML
    private TableView tableViev;
    @FXML
    private TableColumn backTableColumn;
    @FXML
    private TableColumn frontTableColumn;
    @FXML
    private TableColumn statusTableColumn;
    @FXML
    private GridPane gridForButtons;


    //Tab of "Help"
    @FXML
    private Tab helpTab;
    @FXML
    private TextArea helpInformationTextArea;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
       //this.answerTextArea.setVisible(true);
       visibleButtonABCD(true); //Видны кнопки и невидно дефиниции(true), false - всё наоборот
       /*this.answerTextArea.setOnAction(event -> {
           resultText.setVisible(true);
           resultText.setText("Вы тыкнули");
       });
       this.answerTextArea.setOnKeyPressed(event -> {
           if(event.getCode() == KeyCode.ENTER){
              this.AnswerSelected();
           }
       });*/
    }


    public void variantASelected(ActionEvent event)
    {
        this.resultText.setVisible(true);
        this.answerTextArea.setVisible(false);
        this.resultText.setText("Ты нажал на кнопку А");
    }

    public void variantBSelected(ActionEvent event)
    {
        this.resultText.setVisible(true);
        this.answerTextArea.setVisible(false);
        this.resultText.setText("Ты нажал на кнопку B");
    }

    public void variantCSelected(ActionEvent event)
    {
        this.resultText.setVisible(true);
        this.answerTextArea.setVisible(false);
        this.resultText.setText("Ты нажал на кнопку C");
    }

    public void variantDSelected(ActionEvent event)
    {
        this.resultText.setVisible(true);
        this.answerTextArea.setVisible(false);
        this.resultText.setText("Ты нажал на кнопку D");
    }

    public void visibleButtonABCD(boolean v)
    {
        this.variantA_Button.setVisible(v);
        this.variantB_Button.setVisible(v);
        this.variantC_Button.setVisible(v);
        this.variantD_Button.setVisible(v);
        this.answerTextArea.setVisible(!v);
    }

    public void answerSelected(ActionEvent event)
    {
        resultText.setVisible(true);
        resultText.setText("Вы ответили на вопрос");
    }
}
