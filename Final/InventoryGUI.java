
package Final;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ScrollPane;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.geometry.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class InventoryGUI extends Application implements EventHandler<ActionEvent>{
    
    private static Inventory inventory = InventoryDatabase.getInventory();
    
    Cart cart = inventory.getCart();
    
    static UserList userList = UserDatabase.getUsers();
    
    
    BorderPane borderPane;
    VBox rightMenuCust;
    VBox rightMenuAdmin;
    HBox topMenu;
    VBox centerDisplay;
    Label topLabel = new Label (inventory.getName());
    ScrollPane centerText;
    Text text = new Text("Welcome to " + inventory.getName());
    
    
    Button exitButton;
    Button printInventoryButton;
    Button printCartButton;
    Button printUserButton;
    Button printHelpButton;
    Button changeUserButton;
    Button addToCartButton;
    Button editCartItemButton;
    Button removeCartItemButton;
    Button inventoryInfoButton;
    Button addFoodItemToInventoryButton;
    Button addClothingItemToInventoryButton;
    Button addMiscItemToInventoryButton;
    Button removeInventoryItemButton;
    Button editInventoryItemButton;
    TextField searchBar;
    Button searchBarButton;
    
    private void buildNodes () {
        
        centerText = new ScrollPane();
        centerText.setContent(text);
        
        printInventoryButton = new Button ("Inventory");
        printInventoryButton.setOnAction(this);
        printInventoryButton.setMinWidth(100);
        
        printCartButton = new Button ("Cart");
        printCartButton.setOnAction(this);
        printCartButton.setMinWidth(150);
        
        printUserButton = new Button ("User");
        printUserButton.setOnAction(this);
        printUserButton.setMinWidth(100);
        
        printHelpButton = new Button ("Help");
        printHelpButton.setOnAction(this);
        printHelpButton.setMinWidth(100);
        
        changeUserButton = new Button ("Change User");
        changeUserButton.setOnAction(this);
        changeUserButton.setMinWidth(100);
        
        addToCartButton = new Button ("Add to Cart");
        addToCartButton.setOnAction(this);
        addToCartButton.setMinWidth(150);
        
        editCartItemButton = new Button ("Edit Item In Cart");
        editCartItemButton.setOnAction(this);
        editCartItemButton.setMinWidth(150);
        
        removeCartItemButton = new Button ("Remove Item From Cart");
        removeCartItemButton.setOnAction(this);    
        removeCartItemButton.setMinWidth(150);
        
        addFoodItemToInventoryButton = new Button ("Add Food Item");
        addFoodItemToInventoryButton.setOnAction(this);
        addFoodItemToInventoryButton.setMinWidth(150);
        
        addClothingItemToInventoryButton = new Button ("Add Clothing Item");
        addClothingItemToInventoryButton.setOnAction(this);
        addClothingItemToInventoryButton.setMinWidth(150);
        
        addMiscItemToInventoryButton = new Button ("Add Misc Item");
        addMiscItemToInventoryButton.setOnAction(this);
        addMiscItemToInventoryButton.setMinWidth(150);
        
        removeInventoryItemButton = new Button ("Remove Item");
        removeInventoryItemButton.setOnAction(this);
        removeInventoryItemButton.setMinWidth(150);
        
        editInventoryItemButton = new Button ("Edit Item");
        editInventoryItemButton.setOnAction(this);
        editInventoryItemButton.setMinWidth(150);
        
        inventoryInfoButton = new Button ("Inventory Info");
        inventoryInfoButton.setOnAction(this);
        inventoryInfoButton.setMinWidth(150);
        
        searchBar = new TextField();
        searchBar.setPromptText("Search");
        searchBar.setPrefWidth(112);
        
        searchBarButton = new Button();
        searchBarButton.setMaxSize(12, 12);
        Image searchIcon = new Image(getClass().getResourceAsStream("Images\\searchicon.png"));
        searchBarButton.setGraphic(new ImageView(searchIcon));
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle(inventory.getName());
        
        
        buildNodes();
        
        
        HBox searchMenu = new HBox(searchBar, searchBarButton);
        searchMenu.setSpacing(10);
        
        final Pane spacer = new Pane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        spacer.setMinSize(10, 1);
        
        topMenu = new HBox(printInventoryButton, printUserButton, printHelpButton, spacer, searchMenu);
        topMenu.setSpacing(10);
        topMenu.setPadding(new Insets(15, 15, 15, 15));

        
        centerDisplay = new VBox(topLabel, centerText);
        centerDisplay.setSpacing(10);
        centerDisplay.setPadding(new Insets(15, 15, 15, 15));

        
        rightMenuCust = new VBox(printCartButton, addToCartButton, editCartItemButton, removeCartItemButton);
        rightMenuCust.setPrefWidth(175);
        rightMenuCust.setSpacing(10);
        rightMenuCust.setPadding(new Insets(15, 15, 15, 15));
        
        
        rightMenuAdmin = new VBox(inventoryInfoButton, addFoodItemToInventoryButton, addClothingItemToInventoryButton, addMiscItemToInventoryButton, removeInventoryItemButton, editInventoryItemButton);
        rightMenuAdmin.setPrefWidth(175);
        rightMenuAdmin.setSpacing(10);
        rightMenuAdmin.setPadding(new Insets(15, 15, 15, 15));
        
        
        borderPane = new BorderPane();
        borderPane.setPadding(new Insets(15, 15, 15, 15));
        
        borderPane.setTop(topMenu);
        borderPane.setCenter(centerDisplay);
        borderPane.setRight(rightMenuAdmin);
        
        if (inventory.getUser().isAdmin()) {
            borderPane.setRight(rightMenuAdmin);
        } else {
            borderPane.setRight(rightMenuCust);
        }
        
        Scene scene = new Scene (borderPane, 800, 500);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
    @Override
    public void handle (ActionEvent event) {
        if (event.getSource() == printInventoryButton) {
            topLabel.setText("Inventory");
            text.setText(inventory.toString());
            
        } else if (event.getSource() == printCartButton) {
            topLabel.setText("Cart");
            text.setText(inventory.getCart().toString());
            
        } else if (event.getSource() == printUserButton) {
            topLabel.setText("User Information");
            text.setText(inventory.getUser().toString());
            centerDisplay.getChildren().add(changeUserButton);
            
        } else if (event.getSource() == printHelpButton) {
            topLabel.setText("Help");
            text.setText(inventory.help()); 
            
        } else if (event.getSource() == changeUserButton) {
            User newUser = loginWindow.display(userList);
            if (newUser == null) {
                MessageWindow.display("Error", "User Does Not Exist");
            } else if (newUser.getName().length() > 0) {
                inventory.changeUser(newUser);
                if (inventory.getUser().isAdmin()) {
                    borderPane.setRight(rightMenuAdmin);
                } else {
                    borderPane.setRight(rightMenuCust);
                }
            }
            
        } else if (event.getSource() == addToCartButton) {
            int[] itemInfo = cartItemWindow.display("Add To Cart");
            inventory.addToCart(itemInfo[0], itemInfo[1]);
            
        } else if (event.getSource() == editCartItemButton) {
            if (inventory.getCart().getSize() == 0) {
                MessageWindow.display("Error", "Cart is Empty");
            } else {
                int[] itemInfo = cartItemWindow.display("Edit Item Quantity");
                int index = itemInfo[0];
                int quantity = itemInfo[1];
                if (!inventory.validIndex(index)) {
                    MessageWindow.display("Error", "Index does not exist");
                } else if (quantity == 0) {
                    inventory.removeCartItem(index);
                } else if (quantity < 0) {
                    MessageWindow.display("Error", "Quantity cannot be changed. Try again");
                } else if (quantity > (inventory.get(inventory.find(cart.get(index).getName())).getQuantity() + cart.get(index).getQuantity())) {
                    MessageWindow.display("Error", "Quantity cannot be changed. Try again");
                } else {
                    inventory.changeCartItemQuantity(itemInfo[0], itemInfo[1]);
                }
            }
            
        } else if (event.getSource() == removeCartItemButton) {
            if (inventory.getCart().getSize() == 0) {
                MessageWindow.display("Error", "Cart is Empty");
            } else {
                int item = getIndexWindow.display("Remove Item From Cart");
                inventory.removeCartItem(item);
            }
        } else if (event.getSource() == inventoryInfoButton) {
            String result = "Inventory Information\n";
            result += "Size: " + inventory.getSize() + " items\n";
            result += "Total Number of Items: " + inventory.totalItems() + "\n";
            result += "Total Value: $" + inventory.totalPrice();
            text.setText(result);
            
        } else if (event.getSource() == addFoodItemToInventoryButton) {
            Item item = inventoryItemWindow.display("food", inventory.generateID());
            if (item != null) {
                if (inventory.uniqueName(item.getName())) {
                    inventory.add(item);
                } else if (!inventory.uniqueName(item.getName())) {
                    MessageWindow.display("Error", "Item name already exists");
                }
            }
        
        } else if (event.getSource() == addClothingItemToInventoryButton) {
            Item item = inventoryItemWindow.display("clothing", inventory.generateID());
            if (item != null) {
                if (inventory.uniqueName(item.getName())) {
                    inventory.add(item);
                } else if (!inventory.uniqueName(item.getName())) {
                    MessageWindow.display("Error", "Item name already exists");
                }
            }
            
        } else if (event.getSource() == addMiscItemToInventoryButton) {
            Item item = inventoryItemWindow.display("misc", inventory.generateID());
            if (item != null) {
                if (inventory.uniqueName(item.getName())) {
                    inventory.add(item);
                } else if (!inventory.uniqueName(item.getName())) {
                    MessageWindow.display("Error", "Item name already exists");
                }
            }

        } else if (event.getSource() == removeInventoryItemButton) {
            int index = getIndexWindow.display("Remove Item From Inventory");
            if (index == -1 || !inventory.validIndex(index)) {
                MessageWindow.display("Error", "Index does not exist");
            } else if (inventory.validIndex(index)) {
                inventory.remove(index);
            }
        
        } else if (event.getSource() == editInventoryItemButton) {
            int index = getIndexWindow.display("Edit Item In Inventory");
            if (index != -1 && inventory.validIndex(index)) {
                Item item = inventory.get(index);
                
                if (item != null) {
                    if (item instanceof Food) {
                        item = editInventoryItemWindow.display("food", item);
                    } else if (item instanceof Clothing) {
                        item = editInventoryItemWindow.display("clothing", item);
                    } else if (item instanceof Misc) {
                        item = editInventoryItemWindow.display("misc", item);
                    }
                    inventory.set(index, item);
                } else {
                    MessageWindow.display("Error", "Input item information again");
                }
            } else {
                MessageWindow.display("Error", "Index does not exist");
            }
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
