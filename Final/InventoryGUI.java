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

/*
 * GUI Application for interacting with an Inventory. 
 * 
 * Includes Shopping and Administrative capabilites
 * 
 * Uses JavaFX package to construct the GUI.
 * JavaFX is based upon layouts and nodes. 
 * Layouts organize nodes according to templates.
 * Nodes allow interaction and include additonal layouts, buttons, text boxes, text displays, labels, etc.
 * 
 * See below for explanations about the GUI
 */

public class InventoryGUI extends Application implements EventHandler<ActionEvent>{
    
    /*
     * Creates an  Inventory object for use.
     */
    private static Inventory inventory = InventoryDatabase.getInventory();
    
    Cart cart = inventory.getCart();
    
    /*
     * Creates an UserList object for use.
     */
    
    static UserList userList = UserDatabase.getUsers();
    
    User user = userList.get(0);
    
    /*
     * General Node/Layout terminology
     *  - BorderPane : Layout manager with 5 regions with which to place nodes: Top, Botton, Center, Left, Right
     *  - HBox : Layout manager that organizes nodes horizontally
     *  - Label : Line of text
     *  - VBox : Layout manager that organizes nodes vertically
     *  - ScrollPane : A layout manager that organizes nodes vertically with a scrolling display
     *  - Text : Multiple lines of text
     *  - Button : A simple button
     *  - MenuButton : A drop down menu
     *  - MenuItem : A button that appears in the drop down menu of a MenuButton
     *  - TextField : A box for inputting text
     */
    
    /*
     * The following code creates all the nodes and layouts.
     * They are created here so they may be manipulated throughout the program.
     */
    
    BorderPane layout;
    
    // Top
    HBox topMenu;
    
    //Center
    Label topLabel = new Label (inventory.getName());
    VBox centerDisplay;
    ScrollPane centerText;
    Text text = new Text("Welcome to " + inventory.getName());
    
    //Right
    /*
     * The right side of the layout is occupied by Buttons.
     * Administrators and Customers will be presented different buttons therefore two layouts are needed for the right.
     */
    
    VBox rightMenuCust;
    VBox rightMenuAdmin;
    
    /*
     * Creates all the necessary buttons and menus
     */
    Button exitButton;
    Button printInventoryButton;
    Button printCartButton;
    MenuItem printUserButton;
    Button printHelpButton;
    MenuItem changeUserButton;
    Button addToCartButton;
    Button editCartItemButton;
    Button removeCartItemButton;
    Button inventoryInfoButton;
    MenuItem addFoodItemToInventoryButton;
    MenuItem addClothingItemToInventoryButton;
    MenuItem addMiscItemToInventoryButton;
    Button removeInventoryItemButton;
    Button editInventoryItemButton;
    Button searchBarButton;
    Button clearInventoryButton;
    Button clearCartButton;
    TextField searchBar;
    MenuButton userMenu;
    MenuButton addInventoryItemMenu;
    
    
    /*
     * Builds all the layouts and nodes.
     */
    
    private void buildNodes () {
        
        
        centerText = new ScrollPane();
        centerText.setContent(text);
        
        /*
         * setOnAction(this) ensures that when each Button, etc. is interacted with, the program looks to the below handle() function to see what to do. 
         * setMinWidth() sets a minimum size for each Node.
         */
        
        printInventoryButton = new Button ("Inventory");
        printInventoryButton.setOnAction(this);
        printInventoryButton.setMinWidth(100);
        
        printCartButton = new Button ("Cart");
        printCartButton.setOnAction(this);
        printCartButton.setMinWidth(150);
        
        printUserButton = new MenuItem ("User Info");
        printUserButton.setOnAction(this);
        
        printHelpButton = new Button ("Help");
        printHelpButton.setOnAction(this);
        printHelpButton.setMinWidth(100);
        
        changeUserButton = new MenuItem ("Change User");
        changeUserButton.setOnAction(this);
        
        addToCartButton = new Button ("Add to Cart");
        addToCartButton.setOnAction(this);
        addToCartButton.setMinWidth(150);
        
        editCartItemButton = new Button ("Edit Item In Cart");
        editCartItemButton.setOnAction(this);
        editCartItemButton.setMinWidth(150);
        
        removeCartItemButton = new Button ("Remove Item From Cart");
        removeCartItemButton.setOnAction(this);    
        removeCartItemButton.setMinWidth(150);
        
        addFoodItemToInventoryButton = new MenuItem ("Add Food Item");
        addFoodItemToInventoryButton.setOnAction(this);
        
        addClothingItemToInventoryButton = new MenuItem ("Add Clothing Item");
        addClothingItemToInventoryButton.setOnAction(this);
        
        addMiscItemToInventoryButton = new MenuItem ("Add Misc Item");
        addMiscItemToInventoryButton.setOnAction(this);
        
        removeInventoryItemButton = new Button ("Remove Item");
        removeInventoryItemButton.setOnAction(this);
        removeInventoryItemButton.setMinWidth(150);
        
        editInventoryItemButton = new Button ("Edit Item");
        editInventoryItemButton.setOnAction(this);
        editInventoryItemButton.setMinWidth(150);
        
        inventoryInfoButton = new Button ("Inventory Info");
        inventoryInfoButton.setOnAction(this);
        inventoryInfoButton.setMinWidth(150);
        
        clearInventoryButton = new Button ("Clear Inventory");
        clearInventoryButton.setOnAction(this);
        clearInventoryButton.setMinWidth(150);
        
        clearCartButton = new Button ("Clear Cart");
        clearCartButton.setOnAction(this);
        clearCartButton.setMinWidth(150);
        
        searchBar = new TextField();
        searchBar.setPromptText("Search");
        searchBar.setPrefWidth(112);
        
        /*
         * Sets an image for display on a button.
         */
        searchBarButton = new Button();
        Image searchIcon = new Image(getClass().getResourceAsStream("Images\\searchicon.png"));
        searchBarButton.setGraphic(new ImageView(searchIcon));
        searchBarButton.setOnAction(this);
        
        /*
         * Set Alignment sets the text in the middle of the MenuButton.
         */
        userMenu = new MenuButton("User", null, printUserButton, changeUserButton);
        userMenu.setAlignment(Pos.CENTER);
        userMenu.setMinWidth(100);
        
        addInventoryItemMenu = new MenuButton ("Add Item", null, addFoodItemToInventoryButton, addClothingItemToInventoryButton, addMiscItemToInventoryButton);
        addInventoryItemMenu.setAlignment(Pos.CENTER);
        addInventoryItemMenu.setMinWidth(150);
    }
    
    /*
     * Building Layouts
     * 
     * The following functions build the layout of the GUI
     * 
     * The layouts are built using the nodes created above.
     * 
     * setSpacing() sets space between the nodes of a layout.
     * setPadding() sets space around the entire layout for when it is added to the BorderPane.
     * Insets are used to create empty space.
     */
    
    /*
     * Constructs the top section
     * 
     * Nodes are added to the HBox layout.
     */
    
    private void buildTop () {
        
        HBox searchMenu = new HBox(searchBar, searchBarButton);
        searchMenu.setSpacing(10);
        
        final Pane spacer = new Pane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        spacer.setMinSize(10, 1);
        
        topMenu = new HBox(printInventoryButton, userMenu, printHelpButton, spacer, searchMenu);
        topMenu.setSpacing(10);
        topMenu.setPadding(new Insets(15, 15, 15, 15));
    }
    
    /*
     * Constructs the center section
     * 
     * Nodes are added to a VBox.
     */
    
    private void buildCenter() {
        centerDisplay = new VBox(topLabel, centerText);
        centerDisplay.setSpacing(10);
        centerDisplay.setPadding(new Insets(15, 15, 15, 15));
    }
    
    /*
     * Constructs the right section
     * 
     * Appropriate buttons are added to the Customer layout and the Administrator layout.
     */
    
    private void buildRight() {
        rightMenuCust = new VBox(printCartButton, addToCartButton, editCartItemButton, removeCartItemButton, clearCartButton);
        rightMenuCust.setPrefWidth(175);
        rightMenuCust.setSpacing(10);
        rightMenuCust.setPadding(new Insets(15, 15, 15, 15));
        
        rightMenuAdmin = new VBox(inventoryInfoButton, addInventoryItemMenu, removeInventoryItemButton, editInventoryItemButton, clearInventoryButton);
        rightMenuAdmin.setPrefWidth(175);
        rightMenuAdmin.setSpacing(10);
        rightMenuAdmin.setPadding(new Insets(15, 15, 15, 15));
    }
    
    /*
     * Constructs the entire GUI
     * 
     * Top, Center, Right layouts are added to the BorderPane layout.
     * 
     * The function checks whether the User is an Administrator or a Customer and adds the appropriate layout to the BorderPane.
     */
    
    private void buildLayout() {
        
        buildTop();
        
        buildCenter();
        
        buildRight();
        
        layout = new BorderPane();
        layout.setPadding(new Insets(15, 15, 15, 15));
        
        layout.setTop(topMenu);
        layout.setCenter(centerDisplay);
        
        if (user.isAdmin()) {
            layout.setRight(rightMenuAdmin);
        } else {
            layout.setRight(rightMenuCust);
        }
        
    }
    
    /*
     * The start() function is required to be overriden by JavaFX's Application class, which must be a parent of any JavaFX program.
     * 
     * Stage represents the actual window and is required as a parameter.
     * Scene is the format of the Stage, and uses a layout as well as optional dimensions to specify the appearance of the Stage.
     * 
     * Builds the nodes and the layout. The layout is then assigned to the scene which is assigned to the Stage.
     * Stage.show() displays the window.
     */
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        
        primaryStage.setTitle(inventory.getName());
        
        buildNodes();
        
        buildLayout();
        
        Scene scene = new Scene (layout, 800, 500);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
    /*
     * handle() is a function required by the EventHandler interface that this JavaFX program implements. 
     * 
     * EventHandler deals with what happens when the User interacts with the GUI
     * i.e : clicking a button
     * 
     * To specify which button does what, use the ActionEvent.getSource() function to find the source of the event. 
     * See Below
     */
    
    @Override
    public void handle (ActionEvent event) {
        
        /*
         * Changes the center scrolling text to display the Inventory's toString();
         */
        if (event.getSource() == printInventoryButton) {
            topLabel.setText("Inventory");
            text.setText(inventory.toString(user.isAdmin()));
        /*
         * Changes the center scrolling text to display the Cart's toString()
         */
        
        } else if (event.getSource() == printCartButton) {
            topLabel.setText("Cart");
            text.setText(inventory.getCart().toString());
        
        /*
         * Changes the center scrolling text to display the User's toString()
         */
        
        } else if (event.getSource() == printUserButton) {
            topLabel.setText("User Information");
            text.setText(user.toString());
        
        /*
         * Changes the center scrolling text to display the Inventory's help() 
         */
            
        } else if (event.getSource() == printHelpButton) {
            topLabel.setText("Help");
            text.setText(inventory.help(user.isAdmin())); 
        
        /*
         * Logs in a new User.
         * 
         * Opens the LoginWindow, which prompts for username and password
         * Window returns the input as a two-value Array of Strings.
         * 
         * Inputs the credentials to the UserList's getLogin function.
         * getLogin() returns a User if the credentials are valid, null if they are not.
         * 
         * A null return (invalid credentials) opens a window informing the user that the credentials are invalid.
         * A valid User returned by getLogin() (valid credentials) is made the User of the Inventory and the GUI buttons are updated to match the role. 
         */
        
        } else if (event.getSource() == changeUserButton) {
            String[] credentials = LoginWindow.display();
            User newUser = userList.getLogin(credentials[0], credentials[1]);
            if (newUser == null) {
                MessageWindow.display("Error", "User Does Not Exist");
            } else {
                user = newUser;
                if (user.isAdmin()) {
                    layout.setRight(rightMenuAdmin);
                } else {
                    layout.setRight(rightMenuCust);
                }
            }
        
        /*
         * Adds an Item to the Cart
         * 
         * Opens the CartItemWindow which prompts for item index and quantity.
         * Window returns the values as a two-value Array of Integers
         * 
         * Input is checked to ensure validity.
         * Item is added to Cart
         * Food Items with the Adult boolean as true will not be added if User is not an adult.
         * 
         * All issues with the input are communicated to the User through a MessageWindow.
         */
        
        } else if (event.getSource() == addToCartButton) {
            if (inventory.getSize() != 0) {
                int[] itemInfo = CartItemWindow.display("Add To Cart");
                Item item = inventory.get(itemInfo[0]);
                if (item.getQuantity() > itemInfo[1]) {
                    if (item instanceof Food) {
                        if (((Food)item).isAdult()) {
                            System.out.println(user.isAdult());
                            if (user.isAdult()) {
                                inventory.addToCart(itemInfo[0], itemInfo[1]);
                            } else {
                                MessageWindow.display("Error", "Not old enough to purchase");
                            }
                        } else {
                            inventory.addToCart(itemInfo[0], itemInfo[1]);
                        }
                    } else {
                        inventory.addToCart(itemInfo[0], itemInfo[1]);
                    }
                } else {
                    MessageWindow.display("Error", "Quantity exceeds supply");
                }
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
        
        /*
         * Edits an Item in the User's Cart.
         * 
         * Opens the CartItemWindow which prompts for item index and quantity.
         * Window returns the values as a two-value Array of Integers
         * 
         * Input is checked to ensure validity. 
         * Cart Item quantity is changed
         * 
         * All issues with the input are communicated to the User through a MessageWindow.
         */
         
        } else if (event.getSource() == editCartItemButton) {
            if (inventory.getCart().getSize() == 0) {
                MessageWindow.display("Error", "Cart is Empty");
            } else {
                int[] itemInfo = CartItemWindow.display("Edit Item Quantity");
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
            
        /*
         * Removes an Item from the Cart.
         * 
         * Opens GetIndexWindow which prompts for Item index.
         * Window returns an Integer.
         * 
         * Input is checked to ensure validity.
         * Item is removed from the Cart
         *
         * All issues with the input are communicated to the User through a MessageWindow.
_        */
        
        } else if (event.getSource() == removeCartItemButton) {
            if (inventory.getCart().getSize() == 0) {
                MessageWindow.display("Error", "Cart is Empty");
            } else {
                Integer index = GetIndexWindow.display("Remove Item From Cart");
                
                if (index == null) {
                    MessageWindow.display("Error", "Index not valid");
                } else {
                    inventory.removeCartItem(index);
                }
            }
            
        /*
         * Changes center scrolling text to display various information fields relevant to Administrators.
         * 
         * Inventory Size, Item count, and total value
         */
        
        } else if (event.getSource() == inventoryInfoButton) {
            String result = "Inventory Information\n";
            result += "Size: " + inventory.getSize() + " items\n";
            result += "Total Number of Items: " + inventory.totalItems() + "\n";
            result += "Total Value: $" + inventory.totalPrice();
            text.setText(result);
        
        /*
         * The following functions add an Item to the Inventory.
         * 
         * Each of the three types of Items have their own buttons.
         * Each button is nearly the same, but they each open different InventoryItemWindow configurations to construct each respective type of Item.
         * 
         * Opens InventoryItemWindow which prompts the User for relevant fields necessary to create an Item object.
         * InventoryItemWindow returns a constructed Item object or null if the User's input is incomplete.
         * 
         * InventoryItemWindow asks for the Item type (Food, Clothing, Misc) in order to prompt the User for the correct fields. 
         * InventoryItemWindow asks for a unique ID to use to construct the Item object. The Inventory class has the generateID() function that is capable of generating a unique ID. 
         * 
         * Any invalidities or errors are communicated to the User using a MessageWindow.
         */
            
        } else if (event.getSource() == addFoodItemToInventoryButton) {
            if (inventory.getSize() != 0) {
                Item item = InventoryItemWindow.display("food", inventory.generateID());
                if (item != null) {
                    if (inventory.uniqueName(item.getName())) {
                        inventory.add(item);
                    } else if (!inventory.uniqueName(item.getName())) {
                        MessageWindow.display("Error", "Item name already exists");
                    }
                }
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
        
        } else if (event.getSource() == addClothingItemToInventoryButton) {
            if (inventory.getSize() != 0) {
                Item item = InventoryItemWindow.display("clothing", inventory.generateID());
                if (item != null) {
                    if (inventory.uniqueName(item.getName())) {
                        inventory.add(item);
                    } else if (!inventory.uniqueName(item.getName())) {
                        MessageWindow.display("Error", "Item name already exists");
                    }
                }
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
            
        } else if (event.getSource() == addMiscItemToInventoryButton) {
            if (inventory.getSize() != 0) {
                Item item = InventoryItemWindow.display("misc", inventory.generateID());
                if (item != null) {
                    if (inventory.uniqueName(item.getName())) {
                        inventory.add(item);
                    } else if (!inventory.uniqueName(item.getName())) {
                        MessageWindow.display("Error", "Item name already exists");
                    }
                }
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
            
        /*
         * Removes an Item from the Inventory
         * 
         * Index is checked to ensure validity.
         * Item is removed from the Inventory
         *
         * All issues with the input are communicated to the User through a MessageWindow.
         */
        } else if (event.getSource() == removeInventoryItemButton) {
            if (inventory.getSize() != 0) {
                int index = GetIndexWindow.display("Remove Item From Inventory");
                if (index == -1 || !inventory.validIndex(index)) {
                    MessageWindow.display("Error", "Index does not exist");
                } else if (inventory.validIndex(index)) {
                    inventory.remove(index);
                }
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
            
        /*
         * Edits the fields of an Item in the Inventory.
         * 
         * Opens the GetIndexWindow to prompt the User for the index of the Item to edit.
         * 
         * Once a valid index is inputted, the Item is referenced for use.
         * 
         * Item is check to find its type using instanceof. 
         * 
         * EditInventoryItemWindow is opened.
         * EditInventoryItemWindow is the same as the InventoryItemWindow, which is used to add an Item.
         * A String describing the Item type as well as the reference Item are passed into EditInventoryItemWindow. 
         * 
         * EditInventoryItemWindow returns either null if canceled, or an edited Item.
         * Even if no changes are made, an Item is returned.
         * 
         * The Item returned is set at the index of the original Item. 
         * 
         * All issues with the input are communicated to the User through a MessageWindow.
         */
        
        } else if (event.getSource() == editInventoryItemButton) {
            if (inventory.getSize() != 0) {
                Integer index = GetIndexWindow.display("Edit Item In Inventory");
                if (index != null || inventory.validIndex(index)) {
                    Item item = inventory.get(index);
                    
                    if (item != null) {
                        if (item instanceof Food) {
                            item = EditInventoryItemWindow.display("food", item);
                        } else if (item instanceof Clothing) {
                            item = EditInventoryItemWindow.display("clothing", item);
                        } else if (item instanceof Misc) {
                            item = EditInventoryItemWindow.display("misc", item);
                        }
                        inventory.set(index, item);
                    } else {
                        MessageWindow.display("Error", "Input item information again");
                    }
                } else {
                    MessageWindow.display("Error", "Index does not exist");
                }
                
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
        
        /*
         * Extracts a String from the searchBar text box, searches for a corresponding Item, and returns its index.
         * 
         * String is extracted from searchBar using getText().
         * 
         * String is parsed for an Integer, which if successful, indicates that the User wishes to search using an ID.
         * The inputted ID is checked to ensure validity (5-digit number).
         * 
         * ID is matched to an index of an Item in the Inventory using find()
         * If find() does not find a matching Item, it returns -1
         * 
         * The matched index is returned to the User using a MessageWindow.
         * 
         * A try-catch statement is used.
         * If the Integer parse fails to find an Integer and throws an exception, the program does not throw the error and instead moves on to the catch statement.
         * 
         * All issues with the input are communicated to the User through a MessageWindow.
         */
            
        } else if (event.getSource() == searchBarButton) {
            String input = searchBar.getText();
            if (input.length() != 0) {
                try {
                    int ID = Integer.parseInt(input);
                    if (ID <= 99999 && ID > 9999) {
                        int index = inventory.find(ID);
                    
                        if (index != -1) {
                            MessageWindow.display("Search", "Index : " + (index + 1));
                        } else {
                            MessageWindow.display("Search", "ID not found");
                        }
                    } else {
                        MessageWindow.display("Search", "ID Invalid");
                    }
                } catch (NumberFormatException e) {
                    int index = inventory.find(input);
                    if (index != -1) {
                        MessageWindow.display("Search", "Index : " + (index + 1));
                    } else {
                        MessageWindow.display("Search", "Name not found");
                    }
                }
            }
        
        /*
         * Clears the Inventory.
         * 
         * Opens a ConfirmationWindow which prompts the User for a confirmation to clear the Inventory
         * 
         * If the Inventory is empty, the User is communicated this via a MessageWindow
         */
            
        } else if (event.getSource() == clearInventoryButton) {
            if (inventory.getSize() != 0) {
                boolean confirmed = ConfirmationWindow.display("clear the inventory");
                if (confirmed) {
                    inventory.clearAll();
                }
            } else {
                MessageWindow.display("Error", "Inventory Empty");
            }
        
        /*
         * Clears the Cart.
         * 
         * Opens a ConfirmationWindow which prompts the User for a confirmation to clear the Cart
         * 
         * If the Cart is empty, the User is communicated this via a MessageWindow
         */
        
        } else if (event.getSource() == clearCartButton) {
            if (cart.getSize() != 0) {
                boolean confirmed = ConfirmationWindow.display("clear the cart");
                if (confirmed) {
                    inventory.clearCart();
                }
            } else {
                MessageWindow.display("Error", "Cart Empty");
            }
            
        }
    }
    
    /*
     * Launches the GUI.
     * 
     * This is the simplest way to launch the program.
     * 
     * JavaFX enables the start() function to be run by simply calling launch(args).
     */
    
    /*
     * Make sure to read the README.txt file before running this program.
     */
    
    public static void main(String[] args) {
        launch(args);
    }
}
