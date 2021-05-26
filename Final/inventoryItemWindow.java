package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;
import java.util.*;

/*
 * Displays a window to add Items to the inventory.
 * 
 * Parameters : String itemType that describes which Item child class it is
 *              int id that is used for the returned Item.
 * 
 * Explanatory fields accompanied by text boxes and check boxes for the various attributes of the Item classes. 
 * An Enter button passes the values to the main program
 * A Cancel button closes the window
 * 
 * Values inputted are passed into the main program. 
 * If a text box is empty, the window will return null to the main program.
 * 
 * See InventoryGUI for explanation of JavaFX GUI
 */

public class InventoryItemWindow {
    Label label;
    
    static boolean cancelled;
    
    static String name;
    static Location location;
    static double price;
    static int quantity;
    
    static boolean organic;
    static boolean adult;
    
    static String gender;
    static String size;
    
    static String department;
    
    public static Item display (String itemType, int id) {
        
        /*
         * Builds the nodes and the layouts.
         */
        
        Stage itemStage = new Stage ();

        /*
         * initModality() ensures that the User fills out or terminates this window before returning to the main program.
         */
        
        itemStage.initModality(Modality.APPLICATION_MODAL);
        itemStage.setTitle("Add Item To Inventory");
        
        Label label = new Label ("Input item information");
        
        TextField nameText = new TextField();
        nameText.setPromptText("Enter name");

        TextField floorText = new TextField();
        floorText.setPromptText("Enter floor");
        
        TextField rowText = new TextField();
        rowText.setPromptText("Enter row");
        
        TextField priceText = new TextField();
        priceText.setPromptText("Enter price");
        
        TextField quantityText = new TextField();
        quantityText.setPromptText("Enter quantity");
        
        CheckBox organicCheck = new CheckBox("Organic");
        
        CheckBox adultCheck = new CheckBox ("Alcohol");
        
        TextField genderText = new TextField();
        genderText.setPromptText("Enter Gender");
        
        TextField sizeText = new TextField();
        sizeText.setPromptText("Enter Size");
        
        TextField departmentText = new TextField();
        departmentText.setPromptText("Enter Department");
        
        Button enterButton = new Button("Enter");
        Button cancelButton = new Button("Cancel");
        
        /*
         * Lambda functions to handle the Enter and Cancel buttons.
         */
        
        enterButton.setOnAction(e -> {
            name = nameText.getText();
            location = new Location (Integer.parseInt(floorText.getText()), Integer.parseInt(rowText.getText()));
            price = Double.parseDouble(priceText.getText());
            quantity = Integer.parseInt(quantityText.getText());
            
            if (itemType.equals("food")) {
                organic = organicCheck.isSelected();
                adult = adultCheck.isSelected();
            } else if (itemType.equals("clothing")) {
                gender = genderText.getText();
                size = sizeText.getText();
            } else if (itemType.equals("misc")) {
                department = departmentText.getText();
            }
            
            itemStage.close();
        });

        cancelButton.setOnAction(e -> {
            itemStage.close();
            cancelled = true;
        });
        
        VBox layout = new VBox (label, nameText, floorText, rowText, priceText, quantityText);
        
        /*
         * Inserts nodes into the GUI layout according to the itemType parameter.
         * For example, if itemType equals 'food', the GUI must ask for the additional fields of Oragnic and Adult
         */
        
        if (itemType.equals("food")) {
            layout.getChildren().add(organicCheck);
            layout.getChildren().add(adultCheck);
        } else if (itemType.equals("clothing")){
            layout.getChildren().add(genderText);
            layout.getChildren().add(sizeText);
        } else if (itemType.equals("misc")) {
            layout.getChildren().add(departmentText);
        }
        
        layout.getChildren().add(enterButton);
        layout.getChildren().add(cancelButton);
        
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout);
        itemStage.setScene(scene);
        
        /*
         * showAndWait() ensures that the User fills out or terminates this window before returning to the main program.
         */
        
        itemStage.showAndWait();
        
        /*
         * Returns an Item object to the main program using the itemType parameter and the inputted values. 
         */
        
        if (!cancelled) {
            if (itemType.equals("food")) {
                return new Food(name, id, location, price, quantity, organic, adult);
            } else if (itemType.equals("clothing")){
                return new Clothing(name, id, location, price, quantity, gender, size);
            } else if (itemType.equals("misc")) {
                return new Misc(name, id, location, price, quantity, department);
            }
        } else {
            return null;
        }
        return null;
    }
}
