package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/*
 * Displays a window asking for confirmation.
 * 
 * Parameters : String message for communicating with the user.
 * 
 * Confirm button sends confirmation to the main program.
 * Cancel button closes the window.
 * 
 * See InventoryGUI for explanation of JavaFX GUI
 */

public class ConfirmationWindow {
    
    static boolean confirmation = false;
    
    public static boolean display (String message) {
        Stage itemStage = new Stage ();
        
        itemStage.initModality(Modality.APPLICATION_MODAL);
        itemStage.setTitle("Confirm");
        
        Label label = new Label ("Are you sure you want to " + message + "?");
        
        Button confirmButton = new Button("Confirm");
        confirmButton.setOnAction(e -> {
            confirmation = true;
            itemStage.close();
        });
        
        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            itemStage.close();
        });
        
        VBox layout = new VBox (label, confirmButton, cancelButton);
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout);
        itemStage.setScene(scene);
        itemStage.showAndWait();
        
        return confirmation;
    }
}