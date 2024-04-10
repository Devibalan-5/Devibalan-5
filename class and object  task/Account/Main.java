public class Main
{
    public static void main(String[] args)
    {
        BankAccount account1 = new BankAccount(45365 );
        BankAccount account2 = new BankAccount(27836 ,"Devibalan ; ");
        BankAccount account3 = new BankAccount(63254 ,"Roki ; ",54365);
    
        System.out.println("Account1 : AccountNo = "+account1.getAccountNo());
        System.out.println("Account2 : AccountNo = "+account2.getAccountNo()+"; AccountHolderName = "+account2.getAccountHolderName());
        System.out.println("Account3 : AccountNo = "+account3.getAccountNo()+"; AccountHolderName = "+account3.getAccountHolderName()+" Balance = "+account3.getBalance());


    }
}