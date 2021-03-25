package Chapter6;

import java.text.NumberFormat;

public class Account {
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();

    private double RATE = 0.035; // interest rate of 3.5%

    private int acctNumber;
    private double balance;
    private String name;
    private String type;
    private int phone;
    private Account from;
    private Account to;
    Address2 CustAddr, WorkAddr;

    public Account (int phoneNum , int account, double initial,String owner, Address2 CustHomeAd) {
        phone = phoneNum;
        name = owner;
        //owner = name ;
        acctNumber = account;
        balance = initial;
        CustAddr = CustHomeAd;
    }

    public Account (int phoneNum ,String owner, int account, double initial, Address2 CustHomeAd, Address2 CustWorkAd) {
        phone = phoneNum;

        name = owner;
        acctNumber = account;
        balance = initial;
        CustAddr = CustHomeAd;
        WorkAddr = CustWorkAd;
    }

    public Account (String owner, int account, double initial) {
        name = owner;
        //owner = name ;
        acctNumber = account;
        balance = initial;
    }

    public Account (String owner, int account) {
        name = owner;
        acctNumber = account;

    }
    
    public Account (String owner, int account, double initial,String teacher) {
        name = owner;
        acctNumber = account;
        balance = initial;
        type = teacher;
    }

    public Account (String owner) {
        name = owner;
    }

//-----------------------------------------------------------------
// Validates the transaction, then deposits the specified amount
// into the account. Returns the new balance.
//-----------------------------------------------------------------
    public String deposit (double amount) {
        if (amount < 0) { // deposit value is negative
            System.out.println ();
            System.out.println ("Error: Deposit amount is invalid.");
            return (acctNumber + " " + fmt.format(amount));
        } else {
            balance = balance + amount;
            return "Balance : " + balance;
        }
    }
    
//-----------------------------------------------------------------
// Validates the transaction, then withdraws the specified amount
// from the account. Returns the new balance.
//-----------------------------------------------------------------

    public String withdraw (double amount, double fee) {
        amount += fee;

        if (amount < 0) { // withdraw value is negative

            System.out.println ();
            System.out.println ("Error: Withdraw amount is invalid.");
            System.out.println ("Account: " + acctNumber);
            return ("Requested: " + fmt.format(amount));
        } else if (amount > balance) {// withdraw value exceeds balance
            System.out.println ();
            System.out.println ("Error: Insufficient funds.");
            System.out.println ("Account: " + acctNumber);
            System.out.println ("Requested: " + fmt.format(amount));
            return ("Available: " + fmt.format(balance));
        } else {
            balance = balance - amount;
            return "Balance : " + balance;
        }
    }

    public double getBalance () {
        return balance;
    }

//-----------------------------------------------------------------
// Returns the account number.
//-----------------------------------------------------------------
    public int getAccountNumber () {
        return acctNumber;
    }

    public double Transfer( double amount , int fee , Account AcctFrom , Account AcctTo ) {
        AcctFrom.withdraw(amount, 10);
        AcctTo.deposit(amount);
        return balance;
    }
    
    public void changeName(String newName) {
        name = newName;
    }
    
    public void changeInterest(double newInterest) {
        RATE = newInterest;
    }
    
    public String returnInfo () {
        return "Name : " + name + "\n" + "Account : " + acctNumber + "\n" + "Balance : " + balance;
    }
    
    public String toString() {
        String result = "";
        result += "Phone Number : " + phone + "\n";
        result += "Name : " + name + "\n";
        result += "Account : " + acctNumber + "\n";
        result += "Balance : " + balance + "\n";
        result += "Home Address : " + CustAddr + "\n";
        result += "Work Address : " + WorkAddr;
        return result;
    }
}