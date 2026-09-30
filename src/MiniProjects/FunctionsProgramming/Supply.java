package MiniProjects.FunctionsProgramming;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class Supply {

    static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a+b;
        Random random = new Random();
        Supplier<Integer> provideRandNum = () -> random.nextInt(100)+1;
        BiConsumer<String, Integer> detail = (name, age) -> System.out.println(name+"'s age is "+age);
        BiPredicate<Integer, Integer> greater = (a, b)-> a > b;

        System.out.println(addition.apply(3, 4));
        System.out.println(provideRandNum.get());
        detail.accept("Shubham", 24);
        System.out.println(greater.test(5, 3));
    }
}
