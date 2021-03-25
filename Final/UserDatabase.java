package Final;

public class UserDatabase {
    public static UserList getUsers () {
        User cust = new User ("Bob", false, false, 1234567890, "1234 Main Street, PV, CA, USA", "bobpassword");
        User adm = new User ("Bill", true, false, 1234567890, "4321 Main Street, PV, CA, USA", "billpassword");
        User cust2 = new User ("Phil", false, false, 1234567890, "9876 Main Street, PV, CA, USA", "philpassword");
        User adm2 = new User ("Joe", true, false, 1234567890, "1020 Main Street, PV, CA, USA", "joepassword");
        
        UserList userlist = new UserList();
        userlist.addUser(cust);
        userlist.addUser(adm);
        userlist.addUser(cust2);
        userlist.addUser(adm2);
        
        return userlist;
    }
}
