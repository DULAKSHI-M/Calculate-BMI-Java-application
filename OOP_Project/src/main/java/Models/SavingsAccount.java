package Models;


public class SavingsAccount extends BankAccount{
    
    private double IR;
    private boolean flag;
    public static int totSavings;
    public SavingsAccount(String o,int a,double b,double IR,boolean flag)
    {
        super(o,a,b);
        this.IR=IR;
        this.flag=flag;
        totSavings++;
    }
    public SavingsAccount()
    {
        this.IR=0;
        this.flag=false;
        totSavings++;
    }
    public double getBalance()
    {
        return (IR*super.getBalance())+super.getBalance();
    }
    @Override
    public String printAccount()
    {
        return super.getOwnerName()+" "+getBalance()+" "+IR+" "+flag;
    }

    public double getIR() {
        return IR;
    }

    public void setIR(double IR) {
        this.IR = IR;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
}
