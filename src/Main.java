
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage fenster) throws Exception {
        //---------------------------------------------
        // Instanzen erstellen
        //---------------------------------------------
        PassiveView passiveView = new PassiveView();
        Presenter presenter = new Presenter(passiveView);
        Model model = new Model(presenter);        
        passiveView.setPresenter(presenter);
        presenter.setModel(model);        
        
        //---------------------------------------------
        // Vorbereitungen zum Laden des Layouts
        //---------------------------------------------
        URL url = getClass().getResource("layout.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        //---------------------------------------------
        // Controller ist für Funktionlität zuständig
        //---------------------------------------------
        loader.setController(passiveView);

        //---------------------------------------------
        // Layout laden und in Fenster setzen
        //---------------------------------------------
        Parent parent = loader.load();
        fenster.setScene(new Scene(parent));

        //---------------------------------------------
        // Fenster anzeigen
        //---------------------------------------------
        fenster.setTitle("Ampel");
        fenster.setResizable(false);
        fenster.show();
    }
}
