package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface BookActions{
    void run();
}

@FunctionalInterface
interface Operation{
    int AddTwoNumber(int a, int b);
}

public class FunctionallnterfaceDemon {

    public static Function<Integer, Integer> add =  (a)-> a+3;
    public static Function<Integer, Integer> sub =( Integer a)-> a-10;
    public static BiFunction<Integer, Integer, Integer> mul =   Integer::min;
    static void main(String[] args) {


//        System.out.println(add.apply(10));
//        System.out.println(sub.apply(30));


        System.out.println(mul.apply(343,623));
//        Operation op1 = (int a, int b) -> {return a+b;};
//        System.out.println(op1.AddTwoNumber(5, 6));

    }
}
