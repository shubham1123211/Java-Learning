package ExceptionHandling.MiniBankSystem;

import java.util.Scanner;

public class BankTransaction {
    public static void withdrawAmount(int amount, int withdraw) throws InsufficientBalanceException, InvalidAmountException{
        if(withdraw > amount) {
            throw new InsufficientBalanceException();
        }
        if(withdraw <= 0) {
            throw new InvalidAmountException();
        }
        System.out.println("Withdraw successfully");
        System.out.println("Ramining balance : "+(amount-withdraw));

    }
    public static void processTransaction(int amount, int withdraw) throws InsufficientBalanceException, InvalidAmountException{
        withdrawAmount(amount, withdraw);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Amount in Bank account : ");
        int amount = sc.nextInt();
        System.out.print("Enter Amount to withdraw : ");
        int withdraw = sc.nextInt();

        try {
            processTransaction(amount, withdraw);
        }catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction proceeds");
        }
    }
}
