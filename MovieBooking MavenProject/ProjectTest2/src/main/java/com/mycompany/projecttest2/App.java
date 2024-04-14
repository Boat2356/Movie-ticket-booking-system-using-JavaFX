package com.mycompany.projecttest2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */

public class App extends Application {

   private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //d 640 dl 480
        scene = new Scene(loadFXML("MainWindowBooking"), 1027, 683);
        
        stage.setScene(scene);
        stage.show();
                
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        
        /*FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Parent root = loader.load();
        
        // Get reference to controller instance
        MainWindowBookingController controller = loader.getController();
        
        // Set the root and controller for the scene
        scene.setRoot(root);
        scene.setUserData(controller);*/
        
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}