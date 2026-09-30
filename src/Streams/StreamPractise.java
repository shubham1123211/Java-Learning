package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractise {
    static void main(String[] args) {
        List<String> myList = new ArrayList<> (Arrays.asList("Alice", "Bob", "Harry"));

        Stream<String> stream = myList.stream();


    }
}
