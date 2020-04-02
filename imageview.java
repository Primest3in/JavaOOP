package sherman.the.corporal;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import javafx.application.Application; 
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;  

public  class imageview extends Application {

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException
    {
        Scene scene1,scene2;
        Button button1 = new Button("Tap");
        Button button2 = new Button("Tap");
        
        Image image = new Image(new FileInputStream("C:/Users/Mahbub Hasan/Pictures/Screenshots/a.png"));
        ImageView imageView = new ImageView(image);
        
        Group layout1 = new Group();
        layout1.getChildren().addAll(button1,imageView);
        scene1 = new Scene(layout1,500,300);
        
        VBox layout2 = new VBox();
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2,500,300);
            
        button1.setOnAction(e -> {stage.setScene(scene2);});
        button2.setOnAction(e -> {stage.setScene(scene1);});
        
        stage.setScene(scene1);
        stage.show();
        
        
        
        
    }
            
}