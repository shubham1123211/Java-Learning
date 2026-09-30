package MiniProjects.FunctionsProgramming;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FunctionalProcessor {
    public static <T, U, R> R operations(T a, U b, BiFunction<T, U, R> op) {
        return op.apply(a, b);
    }

    public static <T, U> boolean compare(T a, U b, BiPredicate<T, U> com) {
        return com.test(a, b);
    }

    static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addtion = (a, b) -> a+b;
        BiFunction<Integer, Integer, Integer> multiplication = (a, b)-> a*b;

        BiPredicate<Integer, Integer> isFirstGreater = (a, b) -> a > b;
        BiPredicate<Integer, Integer> isEqual = (a, b)-> a==b;

        BiConsumer<String, Integer> printName = (s, age) -> System.out.println("Name : " +s+ " and age is "+age);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        Integer num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        Integer num2 = sc.nextInt();
        sc.nextLine();

        System.out.println(operations(num1, num2, addtion));
        System.out.println(operations(num1, num2, multiplication));

        System.out.println(compare(num1, num2, isFirstGreater));
        System.out.println(compare(num1, num2, isEqual));

        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        Integer age = sc.nextInt();

        printName.accept(name, age);
    }
}
