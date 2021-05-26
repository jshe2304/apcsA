package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/*
 * Displays a window to get an index number.
 * 
 * Parameters : String message for communicating with the User.
 * 
 * Explanatory text accompanied by one text box for the index number.
 * An Enter button passes the values to the main program
 * A Cancel button closes the window
 * 
 * Values inputted are passed into the main program. 
 * If the text box is empty, the window will return null to the main program.
 */

public class GetIndexWindow {
    
    private static int index = -1;
    
    public static Integer display (String message) {
        Stage itemStage = new Stage ();
        
        /*
         * initModality() ensures that the User fills out or terminates this window before returning to the main program.
         */
        
        itemStage.initModality(Modality.APPLICATION_MODAL);
        itemStage.setTitle(message);
        
        Label label = new Label ("Input item index");
        
        TextField indexText = new TextField();
        indexText.setPromptText("Enter index");
        
        Button enterButton = new Button("Enter");
        Button cancelButton = new Button("Cancel");
        /*
         * Lambda functions to handle the Enter and Cancel buttons.
         */
        
        enterButton.setOnAction(e -> {
            index = Integer.parseInt(indexText.getText()) - 1;
            itemStage.close();
        });

        cancelButton.setOnAction(e -> {
            itemStage.close();
        });
        
        VBox layout = new VBox (label, indexText, enterButton, cancelButton);
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout);
        itemStage.setScene(scene);
        
        /*
         * showAndWait() ensures that the User fills out or terminates this window before returning to the main program.
         */
        
        itemStage.showAndWait();
        
        if (index == -1) {
            return null;
        } else {
            return index;
        }
    }
}
