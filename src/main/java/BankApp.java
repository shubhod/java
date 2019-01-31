import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BankApp {
//    private static Random rand = new Random();
//    private static int customerIdRandomNumber = rand.nextInt(45345344);
//    private String customerId;
//    private int balance;
//    private Connection connection;
//    Scanner sc = new Scanner(System.in);
//
//    void register(String name, int phoneNumber) {
//        String query = "INSERT INTO customer (customerId,customerName,phoneNumber) VALUES (?, ?, ?)";
//        connection = Connect.connection();
//        customerIdRandomNumber = customerIdRandomNumber + 1;
//        customerId = name + Integer.toString(customerIdRandomNumber);
//        try {
//            PreparedStatement st = connection.prepareStatement(query);
//            st.setString(1, customerId);
//            st.setString(2, name);
//            st.setLong(3, phoneNumber);
//            st.executeUpdate();
//        } catch (Exception e) {
//            System.out.println("exception occured" + e);
//        }
//
//    }
//
//    public void askDetails() {
//        System.out.println("enter the customerId");
//        customerId = sc.nextLine();
//        System.out.println("enter the balance");
//        balance = sc.nextInt();
//    }

//    void createAccount()
//    {
//        try {
//            System.out.println("press 1 to open savings account or 2 FD or 3 currentAccount");
//            int choice = sc.nextInt();
//            askDetails();
//            if (choice == 1) {
//                System.out.println("enter the tenure");
//                int tenure = sc.nextInt();
//                try {
//                    //newCustomer.createFixedDepositAccount(balance,tenure,customerId);
//                } catch (TenureException tenureException) {
//                    System.out.println("invalid tenure or balance");
//                    createAccount();
//                }
//
//            } else if (choice == 2) {
////                askDetails();
////                newCustomer.createSavingsAccount(balance);
//            } else if (choice == 3) {
////                askDetails();
////                newCustomer.createCurrentAccount(balance);
//            } else {
//                System.out.println("you have given wrong input please please retry");
//                createAccount();
//            }
//        } catch (Exception e) {
////            System.out.println("please try again");
////            sc.next();
////            createAccount();
//        }
//
//
//    }
//    }

}