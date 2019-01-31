

import java.time.LocalDate;
import java.util.Random;

abstract class BankAccount {
    private double balance;
    private String CustomerId;
    private int accountNo;
    private int noOfTransactions;
    private LocalDate dateOfCreation;
    private static Random rand = new Random();
    private static int accountRandomNumber = rand.nextInt(453453534);
    private String accountType;
    abstract  double withdraw(double balance);
    abstract  void deposit(double balance);
    BankAccount(String customerId,String accountType)
    {
        this.accountNo=accountRandomNumber;
        accountRandomNumber=accountRandomNumber+1;
        this.dateOfCreation=LocalDate.now();
        this.CustomerId=customerId;
        this.accountType=accountType;
    }

    void setBalance(double balance)
    {
        if(balance>0)
        {
            this.balance=balance;
        }
    }

    double getBalance()
    {
            return balance;

    }
    LocalDate getDateOfCreation()
    {
        return this.dateOfCreation;
    }
    int getAccountNo()
    {
        return  this.accountNo;

    }
    String getAccountType()
    {
        return  accountType;
    }
    String getCustomerId()
    {
        return  this.CustomerId;
    }



}
