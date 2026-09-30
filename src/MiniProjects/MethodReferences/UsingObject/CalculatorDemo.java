package MiniProjects.MethodReferences.UsingObject;

import java.util.Scanner;
import java.util.function.Function;

public class CalculatorDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Calculator obj = new Calculator();
        Function<Integer, Integer> doubler = x -> obj.doubleNumber(x);
        Function<Integer, Integer> doDouble = obj::doubleNumber;

        System.out.println(doDouble.apply(n));

    }
}
