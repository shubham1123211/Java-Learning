package ExceptionHandling;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Practice1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Enter operations : 1) Divide 2) Multiply : ");

        int op = sc.nextInt();
        try {
            double result =  a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Program executes succesfully");
        }

    }
}
