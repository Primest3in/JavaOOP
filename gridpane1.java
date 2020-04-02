package sherman.the.corporal;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gridpane1 extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(10);
        grid.setVgap(10);
        TextField tf = new TextField();
        tf.setPromptText("username");
        GridPane.setConstraints(tf, 0, 0);
        Button button = new Button("Next>>");
        Button button1 = new Button("<<go back");
        GridPane.setConstraints(button, 0, 1);
        GridPane.setConstraints(button1, 0, 2);
        grid.getChildren().addAll(tf,button1,button);
        Scene scene = new Scene(grid,500,300);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
