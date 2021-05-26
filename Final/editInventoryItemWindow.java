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
 * Displays a window for editting an Item in the inventory.
 * 
 * Parameters : String itemType for identifying which type of Item to ask for.
 *              Item item from the main program for editing
 * 
 * Identical to the window for adding Items into the inventory.
 * Only difference is that the fields are filled out already for editing. 
 * See InventoryItemWindow.
 * 
 * See InventoryGUI for explanation of JavaFX GUI
 */

public class EditInventoryItemWindow {
    
    static boolean cancelled;
    
    static String name;
    static int id;
    static Location location;
    static int floor;
    static int row;
    static double price;
    static int quantity;
    
    static boolean organic;
    static boolean adult;
    
    static String gender;
    static String size;
    
    static String department;
    
    public static Item display (String itemType, Item item) {
        
        name = item.getName();
        id = item.getID();
        floor = item.getFloor();
        row = item.getRow();
        price = item.getPrice();
        
        if (item instanceof Food) {
            if (((Food) item).getOrganic()) {
                price = ((Food)item).getOrigPrice();
            }
        }
            
        quantity = item.getQuantity();
        
        if (item instanceof Food) {
            organic = ((Food) item).getOrganic();
            adult = ((Food) item).isAdult();
        } else if (item instanceof Clothing) {
            gender = ((Clothing) item).getGender();
            size = ((Clothing) item).getSize();
        } else if (item instanceof Misc) {
            department = ((Misc) item).getDepartment();
        } else {
            return null;
        }
        
        Stage itemStage = new Stage ();
        
        itemStage.initModality(Modality.APPLICATION_MODAL);
        itemStage.setTitle("Edit Item To Inventory");
        
        Label label = new Label ("Change Item Properties");
        
        /*
         * The existing values of the Item are added to the text boxes for editing.
         */
        
        TextField nameText = new TextField(name);
        nameText.setPromptText("Enter name");

        TextField floorText = new TextField(floor + "");
        floorText.setPromptText("Enter floor");
        
        TextField rowText = new TextField(row + "");
        rowText.setPromptText("Enter row");
        
        TextField priceText = new TextField(price + "");
        priceText.setPromptText("Enter price");
        
        TextField quantityText = new TextField(quantity + "");
        quantityText.setPromptText("Enter quantity");
        
        CheckBox organicCheck = new CheckBox("Organic");
        if (organic) {
            organicCheck.setSelected(true);
        }
        
        CheckBox adultCheck = new CheckBox ("Alcohol");
        if (adult) {
            adultCheck.setSelected(true);
        }
        
        TextField genderText = new TextField(gender + "");
        genderText.setPromptText("Enter Gender");
        
        TextField sizeText = new TextField(size + "");
        sizeText.setPromptText("Enter Size");
        
        TextField departmentText = new TextField(department + "");
        departmentText.setPromptText("Enter Department");
        
        Button enterButton = new Button("Enter");
        
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
        
        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            itemStage.close();
            cancelled = true;
        });
        
        VBox layout = new VBox (label, nameText, floorText, rowText, priceText, quantityText);
        
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
        itemStage.showAndWait();
        
        /*
         * Creates Item from itemType and inputted values.
         */
        
        if (!cancelled) {
            if (itemType.equals("food")) {
                if (organic) {
                    return new Food(name, id, location, price, quantity, organic, adult);
                } else {
                    return new Food(name, id, location, price, quantity, organic, adult);
                }
            } else if (itemType.equals("clothing")) {
                return new Clothing(name, id, location, price, quantity, gender, size);
            } else if (itemType.equals("misc")) {
                return new Misc(name, id, location, price, quantity, department);
            }
        } else {
            return item;
        }
        return null;
    }
}
