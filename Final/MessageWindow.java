package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/*
 * Displays a window with the given message and title as well as a close button.
 * 
 * See InventoryGUI for explanation of JavaFX GUI
 */

public class MessageWindow {
    public static void display (String title, String message) {
        Stage loginStage = new Stage ();
        
        /*
         * initModality() ensures that the User terminates this window before returning to the main program.
         */
        
        loginStage.initModality(Modality.APPLICATION_MODAL);
        loginStage.setTitle(title);
        
        Label label = new Label(message);
        
        Button closeButton = new Button("Close");
        
        /*
         * Lambda function for the close button.
         */
        
        closeButton.setOnAction(e -> loginStage.close());
        
        VBox layout = new VBox (label, closeButton);
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(15, 15, 15, 15));
        
        Scene scene = new Scene(layout);
        loginStage.setScene(scene);
        
        /*
         * showAndWait() ensures that the User terminates this window before returning to the main program.
         */
        
        loginStage.showAndWait();
    }
}
