//import java.time.LocalDate;
//import java.util.TimerTask;
//
//public class Savings extends BankAccount{
//
//
//    public double withdraw(double balance) {
//        if (minTransactions > noOfTransactions) {
//            System.out.println("balance withdrawn");
//            noOfTransactions=noOfTransactions+1;
//        } else {
//            System.out.println("you have crossed your transactional limit");
//            System.out.println("nOfTransactions" + " " + noOfTransactions);
//            System.out.println("nOfTransactions" + " " + minTransactions);
//        }
//    }
//
//    /*
//    depositing balance first checking wether not crossed th minimum transaction
//*/
//    public void deposit(double balance) {
//        if (minTransactions > noOfTransactions) {
//            noOfTransactions=noOfTransactions+1;
//            System.out.println("balance deposited");
//        } else {
//            System.out.println("you have crossed your transactional limit");
//            System.out.println("nOfTransactions" + " " + noOfTransactions);
//            System.out.println("nOfTransactions" + " " + minTransactions);
//        }
//
//    }
//    /*
//        setting minimumTransaction after every month to 0
//    */
//    private TimerTask setMinimumTransactions() {
//        return new TimerTask() {
//            public void run() {
//                LocalDate date = LocalDate.now();
//                String[] splitDate = date.toString().split("-");
//                if (splitDate[2].equals("23")) {
//                    System.out.println("hey");
//                    noOfTransactions = 0;
//                }
//
//            }
//        };
//
//    }
//    /*
//    scheduling the timer task
//    */
//
//    public void startMinimumTransaction() {
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(setMinimumTransactions(),110, 1111);
//    }
//    public int getMinTransactions()
//    {
//        return minTransactions;
//    }
//    public  int getNoOfTransactions(){
//        return  noOfTransactions;
//    }
//
//}
//



