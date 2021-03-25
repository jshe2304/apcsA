package Final;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class InventoryGUI extends Application implements EventHandler<ActionEvent>{
    
    private static Inventory inventory = InventoryDatabase.getInventory();
    
    static UserList userList = UserDatabase.getUsers();
    
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
    Button removeFromCartButton;
    
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle(inventory.getName());
        
        exitButton = new Button ("Exit");
        exitButton.setOnAction(e -> primaryStage.close());
        
        printInventoryButton = new Button ("Inventory");
        printInventoryButton.setOnAction(this);
        
        printCartButton = new Button ("Cart");
        printCartButton.setOnAction(this);
        
        printUserButton = new Button ("User");
        printUserButton.setOnAction(this);
        
        printHelpButton = new Button ("Help");
        printHelpButton.setOnAction(this);
        
        changeUserButton = new Button ("Change User");
        changeUserButton.setOnAction(this);
        
        addToCartButton = new Button ("Add to Cart");
        addToCartButton.setOnAction(this);
        
        removeFromCartButton = new Button ("Remove From Cart");
        removeFromCartButton.setOnAction(this);
        
        
        HBox topMenu = new HBox(exitButton);   
        
        
        VBox leftMenu = new VBox (printInventoryButton, printCartButton, printUserButton, printHelpButton, changeUserButton);
        leftMenu.setPrefWidth(125);
        leftMenu.setSpacing(10);
        
        printInventoryButton.setMinWidth(leftMenu.getPrefWidth() - 15);
        printCartButton.setMinWidth(leftMenu.getPrefWidth() - 15);
        printUserButton.setMinWidth(leftMenu.getPrefWidth() - 15);
        printHelpButton.setMinWidth(leftMenu.getPrefWidth() - 15);
        changeUserButton.setMinWidth(leftMenu.getPrefWidth() - 15);
        
        
        centerText = new ScrollPane();
        centerText.setContent(text);
        
        VBox centerDisplay = new VBox(topLabel, centerText);
        
        
        VBox rightMenu = new VBox(addToCartButton, removeFromCartButton);
        rightMenu.setPrefWidth(125);
        rightMenu.setSpacing(10);
        
        addToCartButton.setMinWidth(rightMenu.getPrefWidth() - 15);
        
        
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(15, 15, 15, 15));
        
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        borderPane.setCenter(centerDisplay);
        borderPane.setRight(rightMenu);
        
        
        Scene scene = new Scene (borderPane, 500, 500);
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
            
        } else if (event.getSource() == printHelpButton) {
            topLabel.setText("Help");
            text.setText(inventory.help()); 
            
        } else if (event.getSource() == changeUserButton) {
            User newUser = loginWindow.display(userList);
            if (newUser == null) {
                MessageWindow.display("Error", "User Does Not Exist");
            } else if (newUser.getName().length() > 0) {
                inventory.changeUser(newUser);
            }
            
        } else if (event.getSource() == addToCartButton) {
            int[] itemInfo = itemWindow.display("Add To Cart");
            inventory.addToCart(itemInfo[0], itemInfo[1]);
            
        } else if (event.getSource() == removeFromCartButton) {
            if (inventory.getCart().getSize() == 0) {
                MessageWindow.display("Error", "Cart is Empty");
            } else {
                int[] itemInfo = itemWindow.display("Remove From Cart");
                if (itemInfo[1] == -1) {
                    inventory.removeFromCart(itemInfo[0], itemInfo[1]);
                } else if (itemInfo[1] > 0) {
                    inventory.changeCartItemQuantity(itemInfo[0], itemInfo[1]);
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
        //System.out.println(inventory);
        launch(args);
        //System.out.println(userList); 
    }
}
