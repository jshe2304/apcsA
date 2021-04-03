package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class cartItemWindow {
    
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
        
        Scene scene = new Scene(layout, 250, 190);
        itemStage.setScene(scene);
        itemStage.showAndWait();
        
        return new int[] {index, quantity};
    }
}
