import org.junit.Test;

import static org.junit.Assert.*;

public class DaoBankAccountTest {

    @Test
    public void createAccount() {
        BankAccount bankAccount=new FixedDeposit(4,6,"1234","fixedDeposit");
        DaoBankAccount daoBankAccount=new DaoBankAccount();
        daoBankAccount.createAccount(bankAccount);

    }
}