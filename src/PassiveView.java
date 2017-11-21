
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class PassiveView implements Initializable {

    //---------------------------------------------
    // Membervariablen für Steuerelemente
    //---------------------------------------------        
    @FXML
    private Circle circleRot;

    @FXML
    private Circle circleGelb;

    @FXML
    private Circle circleGruen;

    @FXML
    private Button buttonWeiter;

    //---------------------------------------------
    // Sonstige Membervariablen
    //---------------------------------------------
    private Presenter presenter;    

    void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //---------------------------------------------
        // Eventhandler
        //---------------------------------------------    
        buttonWeiter.setOnAction(event -> {
            presenter.buttonWeiter();
        });

        //---------------------------------------------
        // Start
        //---------------------------------------------
    }

    public void rotAn() {
        circleRot.setFill(Color.RED);
    }

    public void rotAus() {
        circleRot.setFill(Color.BLACK);
    }

    public void gelbAn() {
        circleGelb.setFill(Color.YELLOW);
    }

    public void gelbAus() {
        circleGelb.setFill(Color.BLACK);
    }

    public void gruenAn() {
        circleGruen.setFill(Color.GREEN);
    }

    public void gruenAus() {
        circleGruen.setFill(Color.BLACK);
    }

}
