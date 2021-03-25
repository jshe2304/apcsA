package Chapter6;


/**
 * Write a description of class AccountDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccountDriver {
    public static void main(String[] args) {
        
        Address2 home = new Address2("1st Street", "PV", "CA", 12345);
        Address2 work = new Address2("2nd Street", "LA", "CA", 56789);
        Account acct1 = new Account(1231231234, "John Doe", 12345, 100, home, work);
        acct1.deposit(1);
        System.out.println(acct1.returnInfo());
        //System.out.println(acct1);
    }
}
