package sherman.the.corporal;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gridpane extends Application {
    

    @Override
    public void start(Stage Stage) 
    {
        GridPane grid = new GridPane();
        grid.setPadding( new Insets(350,500,500,500));
        grid.setHgap(10);
        grid.setVgap(10);
        Label label1 = new  Label("Username: ");
        GridPane.setConstraints(label1, 0, 0);
        Label label2 = new Label("Password: ");
        GridPane.setConstraints(label2, 0, 1);
        TextField tf1 = new TextField("Mahbub");
        GridPane.setConstraints(tf1, 1, 0);
        TextField tf2 = new TextField();
        //tf2.setPromptText("username");
        tf2.setPromptText("Password");
        GridPane.setConstraints(tf2, 1, 1);
        Button button = new Button("Sign in");
        GridPane.setConstraints(button, 1, 2);
        grid.getChildren().addAll(label1,label2,tf1,tf2,button);
        Scene scene = new Scene(grid,1400,700);
        Stage.setScene(scene);
        Stage.show();
        
    }
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
