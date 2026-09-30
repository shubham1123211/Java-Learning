package ExceptionHandling;

import java.util.Scanner;

public class HandleBankBalance {
    public static void withdrawMoney(int money, int total) throws InsufficientBalanceException{
        if(money < total) {
            System.out.println("success");
        }else {
            throw new InsufficientBalanceException();
        }
    }
    static void main(String[] args) {
        System.out.print("Enter bank balance : ");
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        System.out.print("Enter amount to withdraw : ");
        int withdrawAmount = sc.nextInt();

        try {
            withdrawMoney(withdrawAmount, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
