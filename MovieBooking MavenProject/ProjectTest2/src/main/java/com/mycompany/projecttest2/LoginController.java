/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.projecttest2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chonl
 */
public class LoginController implements Initializable{
    @FXML
    private PasswordField signIn_password;

    @FXML
    private TextField signIn_username;
    
    @FXML
    private Button LoginButton;
    //private static Scene scene;
    
    @FXML
    private void switchToMainBooking() throws IOException {
        App.setRoot("MainWindowBooking");
        // Retrieve the controller instance from the scene
       /* FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindowBooking.fxml"));
        Parent root = loader.load();
         Scene scene = new Scene(root);
    MainWindowBookingController controller = (MainWindowBookingController) scene.getUserData();
    
    // Set the username on the controller
    String username = signIn_username.getText();
    controller.setUsername(username);
                */
    }
      
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        LoginButton.setOnAction(event->{
            try {
                switchToMainBooking();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        //String username = signIn_username.getText();
        //MainWindowBookingController.ShowUsername(username);
    }    
    
}
