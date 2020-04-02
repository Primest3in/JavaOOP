package sherman.the.corporal;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class backgroundimage extends Application {

    @Override
    public void start(Stage stage) {
    ChoiceBox<String> choice = new ChoiceBox<>();
    choice.getItems().addAll("Apple","Banana","Milk","Chicken","Hamburger");
    Label label = new Label();
    label.setText("Select");
    Button button = new Button("Order");
    HBox hbox = new HBox(label,choice);
    
    
    hbox.setSpacing(10);
    Scene scene = new Scene(hbox,500,300);
    stage.setScene(scene);
    stage.show();
    
    
    }
    public static void main(String[] args) {
        launch(args);
    }
}