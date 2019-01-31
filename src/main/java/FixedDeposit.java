public class FixedDeposit extends BankAccount {
    private int intrestRate = 3;
    final private int minTransactions = 30;
    final private int minDepositAmount=100000;
    private int tenure;

    FixedDeposit(int tenure,double balance,String customerId,String accountType)
    {
        super(customerId,accountType);
        if(checkBalance(balance))
        {

        }



        this.tenure=tenure;
    }

    public  deposit()
    {

    }
    public  double withdraw(double balance)
    {
                  return  43;
    };

    public  boolean checkBalance(double balance)
    {
        return this.minDepositAmount>balance;
    }



}
