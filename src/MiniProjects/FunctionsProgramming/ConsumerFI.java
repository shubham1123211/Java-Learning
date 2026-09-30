package MiniProjects.FunctionsProgramming;

import java.util.function.Consumer;
import java.util.Scanner;

public class ConsumerFI {
    public static <T> void show(T s, Consumer<T> consumer) {
        consumer.accept(s);
    }
    static void main(String[] args) {
        Consumer<String> HelloMassage = s -> System.out.println("Hello "+s);
        Consumer<String> upperCase = s -> System.out.println("Your name is : "+s.toUpperCase());
        Consumer<String> returnLength = s -> System.out.println("There are total " +s.length() + " Alphabets in your name");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        show(name, HelloMassage);
        show(name, upperCase);
        show(name, returnLength);

    }
}
