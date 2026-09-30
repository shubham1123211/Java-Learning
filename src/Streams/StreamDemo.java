package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    static void main(String[] args) {
//        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "John", "Harry"));
//
//        for(int i = 0; i < names.size(); i++) {
//            if(names.get(i).charAt(0) == 'J') {
//                System.out.println(names.get(i));
//                break;
//            }
        List<String> names = new ArrayList<>(
                Arrays.asList("Alice", "Bob", "John", "Harry")
        );

//        System.out.println(names.stream().forEach(System.out::println));
//        }
        names.stream().filter(x -> x.startsWith("J")).forEach(System.out::println);
    }
}

