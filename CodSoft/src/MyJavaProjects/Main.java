package MyJavaProjects;

import java.util.Scanner;

class BankAccount{
     private  double balance;
     public BankAccount(double initialBalance){
         balance = initialBalance;
     }
     public double getBalance(){
         return balance;
     }
     public void deposit(double amount){
         balance += amount;
     }
     public boolean withdraw(double amount){
         if (amount <= balance){
             balance -= amount;
             return true;
         }return false;
     }
 }

 class ATM{
     private  BankAccount account;
     public ATM(BankAccount bankAccount){
         account = bankAccount;
     }
     public void displayMenu(){
         System.out.println("ATM Menu:-->> ");
         System.out.println("Press 1 for Check Balance");
         System.out.println("Press 2 for Deposit ");
         System.out.println("Press 3 for Withdraw ");
         System.out.println("Press 4 to EXIT ");
     }

     public void run(){
         Scanner sc = new Scanner(System.in);
         while (true){
             displayMenu();
             System.out.println("Select an Option:--> ");
             int choice = sc.nextInt();
             switch (choice){
                 case 1:
                     System.out.println("Your Balance : Rs "+ account.getBalance());
                     break;
                 case 2:
                     System.out.println("Enter AMount to Deposit :-->> ");
                     double depositAmount = sc.nextDouble();
                     account.deposit(depositAmount);
                     System.out.println("Deposit successful. Your Balance is Rs " +account.getBalance());
                     break;
                 case 3:
                     System.out.println("Enter Amount to Withdraw :-->> ");
                     double withdrawAmount = sc.nextDouble();
                     if (account.withdraw(withdrawAmount)){
                         System.out.println("Withdrawal Successful. Your Balance is Rs.  " +account.getBalance());
                     }else {
                         System.out.println("Insufficient Balance ");

                     }
                     break;
                 case 4:
                     System.out.println("Thankyou FOr using The ATM ");
                     sc.close();
                     return;
                 default:
                     System.out.println("You have entered Invalid Option , Please select a valid Option: ");


             }
         }
     }

 }


public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);

    }
}
