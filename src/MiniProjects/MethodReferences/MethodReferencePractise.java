package MiniProjects.MethodReferences;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferencePractise {
    public static int square(int a){
        return a*a;
    }
    static void main(String[] args) {
        Function<Integer, Integer> sqOfNum = (a)-> square(a);
        Function<Integer, Integer> mrSqOfNum = MethodReferencePractise::square;
        System.out.println(sqOfNum.apply(5));
        System.out.println(mrSqOfNum.apply(10));
    }
}
