package Final;

import java.util.*;

/*
 * Represents the User base of the Inventory
 * 
 * Creates an ArrayList of User objects upon construction.
 */

public class UserList {
    
    private ArrayList<User> userList = new ArrayList<User>();
    
    /*
     * Returns the User at the given index.
     */
    
    public User get(int index) {
        if (index >= 0 && index < userList.size()) {
            return userList.get(index);
        } else {
            return null;
        }
    }
    
    /*
     * Returns the index of the User with the given name
     * 
     * Returns -1 if name not found
     */
    
    public int findUser (String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
    /*
     * Adds a User object to the ArrayList. 
     */
    
    public void addUser (User user) {
        if (findUser(user.getName()) == -1) {
            userList.add(user);
        }
    }
    
    /*
     * Removes a User from the ArrayList
     */
    
    public void removeUser (User user) {
        userList.remove(userList.indexOf(user));
    }
    
    /*
     * Checks if the given name is in the list or not.
     */
    
    public boolean nameInList(String name) {
        for (User user : userList) {
            if (user.getName() == name) {
                return true;
            }
        }
        return false;
    }
    
    /*
     * Returns the User in the ArrayList with the given name and password.
     * 
     * If no User is found with the given credentials, returns null.
     */
    
    public User getLogin (String name, String password) {
        int userIndex = findUser(name);
        
        if (userIndex != -1) {
            User foundUser = userList.get(userIndex);
            if (foundUser.comparePassword(password)) {
                return foundUser;
            }
        }
        return null;
    }
    
    /*
     * Returns all the Users in the ArrayList
     */
    
    public String toString() {
        String result = "";
        for (User user : userList) {
            result += user;
        }
        
        return result;
    }
}
