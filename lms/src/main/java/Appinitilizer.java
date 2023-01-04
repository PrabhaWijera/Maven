import javafx.application.Application;
import javafx.stage.Stage;

import java.net.URL;

public class Appinitilizer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
     URL resource= this.getClass().getResource("/view/Mainform.fxml");//fxml file eka sujjest krnn
        //ctrl+ss mvm ghnna
        //edit configration--more option--> vm option
    }
}
