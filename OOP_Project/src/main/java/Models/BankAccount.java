package Models;

public class BankAccount {

    private String OwnerName;
    private int AccountNumber;
    private double Balance;

    public BankAccount(String OwnerName, int AccountNumber, double Balance) {
        this.OwnerName = OwnerName;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public BankAccount() {
        this.OwnerName = null;
        this.AccountNumber = 0;
        this.Balance = 0;
    }
    
    public String printAccount()
    {
        return OwnerName+" "+AccountNumber+" ("+Balance+")";
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public double getBalance() {
        return Balance;
    }
    

}
