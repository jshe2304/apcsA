package Final;

/*
 * Constructs a UserList object.
 * 
 * This function is needed because the technology to save an UserList elsewhere has not been implemented. 
 */

public class UserDatabase {
    public static UserList getUsers () {
        User adm = new User ("adm1", true, false, 1234567890, "4321 Main Street, PV, CA, USA", "admin");
        User cust1 = new User ("cust1", false, false, 1234567890, "1234 Main Street, PV, CA, USA", "customer");
        User cust2 = new User ("cust2", false, true, 1234567890, "9876 Main Street, PV, CA, USA", "customer");
        // User adm2 = new User ("Joe", true, false, 1234567890, "1020 Main Street, PV, CA, USA", "joepassword");
        
        UserList userlist = new UserList();
        userlist.addUser(adm);
        userlist.addUser(cust1);
        userlist.addUser(cust2);
        // userlist.addUser(adm2);
        
        return userlist;
    }
}
