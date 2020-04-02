package sherman.the.corporal;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.stage.Stage; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.scene.canvas.*; 
import javafx.scene.web.*; 
import javafx.scene.layout.*; 
import javafx.scene.image.*; 
import java.io.*; 
import javafx.geometry.*; 
import javafx.scene.Group; 
  
public class Background_1 extends Application { 
  
    // launch the application 
    public void start(Stage stage) 
    { 
  
        try { 
  
            // set title for the stage 
            stage.setTitle("creating Background"); 
  
            // create a label 
            Label label = new Label("Name : "); 
  
            // create a text field 
            TextField textfield = new TextField(); 
  
            // set preferred column count 
            textfield.setPrefColumnCount(10); 
  
            // create a button 
            Button button = new Button("OK"); 
  
            // add the label, text field and button 
            HBox hbox = new HBox(label, textfield, button); 
  
            // set spacing 
            hbox.setSpacing(10); 
  
            // set alignment for the HBox 
            hbox.setAlignment(Pos.CENTER); 
  
            // create a scene 
            Scene scene = new Scene(hbox, 280, 280); 
  
            // create a input stream 
            FileInputStream input = new FileInputStream("C:\\Users\\Mahbub Hasan\\Pictures\\Screenshots\\aaaa.png"); 
  
            // create a image 
            Image image = new Image(input); 
  
            // create a background image 
            BackgroundImage backgroundimage = new BackgroundImage(image,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundRepeat.NO_REPEAT,  
                                             BackgroundPosition.DEFAULT,  
                                                BackgroundSize.DEFAULT); 
  
            // create Background 
            Background background = new Background(backgroundimage); 
  
            // set background 
            hbox.setBackground(background); 
  
            // set the scene 
            stage.setScene(scene); 
  
            stage.show(); 
        } 
  
        catch (Exception e) { 
  
            System.out.println(e.getMessage()); 
        } 
    } 
  
    // Main Method 
    public static void main(String args[]) 
    { 
  
        // launch the application 
        launch(args); 
    } 
} 