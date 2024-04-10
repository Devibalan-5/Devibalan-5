public class BankAccount{
    private int accountNo;
    private String accountHolderName;
    private double balance;

    //Constructor for accountno
    public BankAccount(int accountNo)
    {
        this.accountNo=accountNo;
    }
    //Constructor for accountNo, accountHolderName
    public BankAccount(int accountNo,String accountHolderName)
    {
        this.accountNo=accountNo;
        this.accountHolderName=accountHolderName;
    }
    //Full initialization constructor 
    public BankAccount(int accountNo,String accountHolderName,double balance)
    {
        this.accountNo=accountNo;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    //Get Method
    public int getAccountNo()
    {
        return accountNo;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public double getBalance()
    {
        return balance;
    }

}