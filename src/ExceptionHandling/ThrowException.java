package ExceptionHandling;


import java.util.Scanner;

public class ThrowException {
    static void main(String[] args) {
        System.out.print("Enter total bank amount : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        System.out.print("Enter amount to withdraw : ");
        int withdraw = sc.nextInt();

        try{
            if(withdraw <= amount && withdraw >= 0) {
                System.out.println(withdraw + " withdraw successfully");
                System.out.println("Remaining balance : "+ (amount-withdraw));
            }else{
                throw new IllegalArgumentException("Invalid withdraw amount");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
