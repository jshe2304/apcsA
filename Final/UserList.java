package Final;

import java.util.*;

public class UserList {
    
    private ArrayList<User> userList = new ArrayList<User>();

    public void addUser (User user) {
        if (findUser(user.getName()) == -1) {
            userList.add(user);
        }
    }
    
    public void removeUser (User user) {
        userList.remove(userList.indexOf(user));
    }
    
    public boolean nameInList(String name) {
        for (User user : userList) {
            if (user.getName() == name) {
                return true;
            }
        }
        return false;
    }
    
    public int findUser (String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
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
    
    public String toString() {
        String result = "";
        for (User user : userList) {
            result += user;
        }
        
        return result;
    }
}
