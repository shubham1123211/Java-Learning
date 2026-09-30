package MiniProjects.FunctionsProgramming;

import javax.swing.plaf.FontUIResource;
import java.util.Scanner;
import java.util.function.Function;

public class Calculations {
    static <T, R> R doCalculation(T number, Function<T, R> operation) {
        return operation.apply(number);
    }
    static void main(String[] args) {
        Function<Integer, Integer> square = n -> n*n;
        Function<Integer, Integer> cube = n -> n*n*n;
        Function<Integer, Integer> doubleValue = n -> 2*n;

        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        System.out.println("square : "+doCalculation(number, square));
        System.out.println("Cube : "+doCalculation(number, cube));
        System.out.println("doubleValue : "+ doCalculation(number, doubleValue));
    }
}
