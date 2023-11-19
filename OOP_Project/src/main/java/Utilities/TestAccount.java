package Utilities;

import Models.SavingsAccount;

public class TestAccount {

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        SavingsAccount s2 = new SavingsAccount("SLIIT",123,75000,0.25,false);
        System.out.println(""+s2.printAccount());
        System.out.println("Total Savings "+SavingsAccount.totSavings);
    }
}
