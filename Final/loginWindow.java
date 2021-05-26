package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/*
 * Displays a login window.
 * 
 * Explanatory text accompanied by two text boxes for the username and password.
 * An Enter button passes the values to the main program
 * A Cancel button closes the window
 * 
 * Values inputted are passed into the main program. 
 * If a text box is empty, the window will return null to the main program.
 * 
 * See InventoryGUI for explanation of JavaFX GUI
 */

public class LoginWindow {
    
    private static String username = "";
    private static String password = "";
    
    public static String[] display () {
        Stage loginStage = new Stage ();
        
        /*
         * initModality() ensures that the User fills out or terminates this window before returning to the main program.
         */
        
        loginStage.initModality(Modality.APPLICATION_MODAL);
        loginStage.setTitle("Login");
        
        Label label = new Label ("Input your username and password");
        
        TextField usernameText = new TextField();
        usernameText.setPromptText("Enter username");

        PasswordField passwordText = new PasswordField();
        passwordText.setPromptText("Enter password");
        
        Button enterButton = new Button("Enter");
        Button cancelButton = new Button("Cancel");
        
        /*
         * Lambda functions to handle the Enter and Cancel buttons.
         */
        
        enterButton.setOnAction(e -> {
            username = usernameText.getText();
            password = passwordText.getText();
            loginStage.close();
        });
        
        cancelButton.setOnAction(e -> {
            loginStage.close();
        });
        
        VBox layout = new VBox (label, usernameText, passwordText, enterButton, cancelButton);
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout, 250, 190);
        loginStage.setScene(scene);
        
        /*
         * showAndWait() ensures that the User fills out or terminates this window before returning to the main program.
         */
        
        loginStage.showAndWait();
        
        if (username.equals("") || password.equals("")) {
            return null;
        } else {
            return new String[] {username, password};
        }
    }
}
