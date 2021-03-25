package Final;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class loginWindow {
    
    private static String username = "";
    private static String password = "";
    
    static User closedUser = new User("", false, false, 0, "", "");
    
    public static User display (UserList userList) {
        Stage loginStage = new Stage ();
        
        loginStage.initModality(Modality.APPLICATION_MODAL);
        loginStage.setTitle("Login");
        
        Label label = new Label ("Input your username and password");
        
        TextField usernameText = new TextField();
        usernameText.setPromptText("Enter username");

        TextField passwordText = new TextField();
        passwordText.setPromptText("Enter password");
        
        Button enterButton = new Button("Enter");
        enterButton.setOnAction(e -> {
            username = usernameText.getText();
            password = passwordText.getText();
            loginStage.close();
        });
        
        Button cancelButton = new Button("Cancel");
        cancelButton.setOnAction(e -> {
            loginStage.close();
        });
        
        VBox layout = new VBox (label, usernameText, passwordText, enterButton, cancelButton);
        layout.setPadding(new Insets(15, 15, 15, 15));
        layout.setSpacing(10);
        
        Scene scene = new Scene(layout, 250, 190);
        loginStage.setScene(scene);
        loginStage.showAndWait();
        
        if (username.equals("")) {
            return closedUser;
        } else {
            return userList.getLogin(username, password);
        }
    }
}
