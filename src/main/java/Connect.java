import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {

    static Connect connect=new Connect();
    private Connect()
        {

        }
    public  Connection connection()
    {

        String url="jdbc:mysql://localhost:3306/mydb";
        String uname="root";
        String pass="Mat$444c1";

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,uname,pass);
            System.out.println("connection successful");
            return connection;
        }
        catch (Exception e){
            System.out.println("exception occoured");
        }
        return null;
    }

    public  static Connect getInstance()
        {
            return  connect;
        }


}