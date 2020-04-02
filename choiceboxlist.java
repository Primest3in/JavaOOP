package sherman.the.corporal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class choiceboxlist extends Application{

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Image image = new Image(new FileInputStream("C:\\Users\\Mahbub Hasan\\Pictures\\Screenshots\\aaa.png"));
        ImageView imv = new ImageView(image);
        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.getItems().addAll("Apple","Banana","Orange","Milk","PineApple");
        cb.setValue("Apple");
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        Button button = new Button("",imv);
     //   button.setBackground(Background.EMPTY);
        layout.getChildren().addAll(cb,button);
        Scene scene = new Scene(layout,500,300);
        
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
