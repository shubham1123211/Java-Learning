package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExpection {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {10, 20, 30, 40, 50};
        System.out.print("Enter index : ");


        try{
            int idx = sc.nextInt();
            System.out.println(marks[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println(e.getCause());
        }
    }
}
