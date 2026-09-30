package MiniProjects;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.zip.DeflaterOutputStream;

public class IsEvneOrOdd {
//    @FunctionalInterface
//    public interface NumberChecker{
//        boolean apply(int n);
//    }

    static <I> boolean processNumber(I num, Predicate<I> checker){
        return checker.test(num);
    }
    static void main() {
        /*NumberChecker evenChecker = n -> n % 2==0;
        NumberChecker positiveChecker = n -> n>0;
        NumberChecker greaterThanFifty = n -> n > 50;*/

        Predicate<Integer> evenChecker = n -> n % 2==0;
        Predicate<Integer> positiveChecker = n -> n > 0;
        Predicate<Integer> greaterThanFifty = n -> n > 50;
        Predicate<Double> greaterThan15 = n -> n > 15.5;
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        System.out.println("is even : "+processNumber(number, evenChecker));
        System.out.println("is positive : "+processNumber(number, positiveChecker));
        System.out.println("Is greater than 50 : "+processNumber(number, greaterThanFifty));

        Double num = sc.nextDouble();
        System.out.println("Is greater that 15.5 : "+processNumber(num, greaterThan15));

    }
}
