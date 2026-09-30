package ExceptionHandling;

import java.util.Scanner;

public class ThrowsInMethod {
    public static void checkAge(int age) throws Exception{
        if(age >= 18) System.out.println("You are eligible");
        else throw new IllegalArgumentException("Under 18 not allowed");
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
