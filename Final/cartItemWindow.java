package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/*
 * Displays a window for adding an Item to the Cart.
 * 
 * Explanatory text accompanied by two text boxed for Item index and quantity.
 * An Enter button passes the values to the main program.
 * A Cancel button closes the window
 * 
 * Values entered are passed into the main program in the form of an Array.
 * If a box is empty, the window will return null to the main program.
 * 
 */

public class CartItemWindow {
    
    private static int index = -1;
    private static int quantity = -1;
    
    public static int[] display (String message) {
        Stage itemStage = new Stage ();
        
        itemStage.initModality(Modality.APPLICATION_MODAL);
        itemStage.setTitle(message);
        
        Label label = new Label ("Input item index and quantity");
        
        TextField indexText = new TextField();
        indexText.setPromptText("Enter index");

        TextField quantityText = new TextField();
        quantityText.setPromptText("Enter quantity");
        
        Button enterButton = new Button("Enter");
        enterButton.setOnAction(e -> {
            index = Integer.parseInt(indexText.getText()) - 1;
            quantity = Integer.parseInt(quantityText.getText());
            itemStage.close();
        });
        
        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            itemStage.close();
        });
        
        VBox layout = new VBox (label, indexText, quantityText, enterButton, cancelButton);
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout);
        itemStage.setScene(scene);
        itemStage.showAndWait();
        
        if (index == -1 || quantity == -1) {
            return null;
        } else {
            return new int[] {index, quantity};
        }
    }
}
