
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.Period;
import static java.time.Period.*;

class  DaoBankAccount
{
    private Connection connection=null;
    private  String query = "INSERT INTO bankaccount(customerId,dateOfCreation,accountType,accountNo,balance) VALUES (?,?,?,?,?)";

    DaoBankAccount()
    {
        Connect connect=Connect.getInstance();
        connection=connect.connection();
    }

    void createAccount(BankAccount bankAccount)
    {

        try {
            Date date = Date.valueOf(bankAccount.getDateOfCreation());
            PreparedStatement st = connection.prepareStatement(query);
            st.setString(1,bankAccount.getCustomerId());
            st.setDate(2,date);
            st.setString(3,bankAccount.getAccountType());
            st.setInt(4,bankAccount.getAccountNo());
            st.setDouble(5,bankAccount.getBalance());
            st.executeUpdate();

        }

        catch (Exception e)
        {
            System.out.println("exception occured"+e);
        }
    }


}

