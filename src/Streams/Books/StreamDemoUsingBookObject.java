package Streams.Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoUsingBookObject {
    static void main(String[] args) {
        List<Book> books = new ArrayList<> (List.of(
                new Book("Fiction", 2015, 450.0, "The Alchemist"),
                new Book("Science", 2020, 650.0, "A Brief History of Time"),
                new Book("Fiction", 2018, 550.0, "The Kite Runner"),
                new Book("Technology", 2022, 800.0, "Clean Code"),
                new Book("History", 2010, 500.0, "Sapiens"),
                new Book("Science", 2019, 700.0, "Cosmos"),
                new Book("Technology", 2016, 600.0, "Effective Java"),
                new Book("Fiction", 2021, 400.0, "1984"),
                new Book("History", 2014, 550.0, "The Silk Roads"),
                new Book("Technology", 2023, 900.0, "Designing Data-Intensive Applications")
            )
        );
        //Print Books cheaper than 600
        books.stream()
                .filter(book -> book.price < 600)
                .forEach(System.out::println);

        //Convert Book title to uppercase
        books.stream()
                .map(book -> book.title.toUpperCase())
                .forEach(System.out::println);
        //Sorting : books by publication year
        books.stream()
                .sorted(Comparator.comparing(book -> book.publicationYear))
                .forEach(System.out::println);
        //Distinct : Remove duplicate title
        books.stream()
                .distinct()
                .forEach(System.out::println);
        //Limit : Display only 3 books
        System.out.println("DISPLAY STARTING 3 BOOKS ONLY");
        books.stream()
                .limit(3)
                .forEach(System.out::println);
        //Skip : Skip 2 books
        System.out.println("SKIP STARTING TWO BOOKS");
        books.stream()
                .skip(2)
                .forEach(System.out::println);

        //Total cost of all booking in the book store
        double ans =  books.stream()
                .map(book -> book.price)
                .reduce((double) 0, Double::sum);
        System.out.println(ans);
        //Collecting books into a list of titles
        List<String> titleNames = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(titleNames);

        //Grouping books by category
        Map<String, List<Book>> newList  = books.stream()
                .collect(Collectors.groupingBy(book -> book.category));
        System.out.println(newList);
    }
}
