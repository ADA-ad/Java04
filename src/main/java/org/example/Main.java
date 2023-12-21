package org.example;

import java.io.Serializable;

import java.util.*;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        filter
        List<Integer> filteredInts = Stream.of(25, 15, 75, 35, 40, 5, 65, 78)
                .filter(i -> i > 30)
                .toList();
        System.out.println(filteredInts);

//        map
        List<String> foodlist = new ArrayList<>(Arrays.asList("chocolate", "cake", "cheesecake", "pudding", "cookie",
                "pancake"));


        Map<String, Integer> map = foodlist.stream().collect(Collectors.toMap(s -> s, String::length));
            System.out.println(map);


//        anyMatch
        Stream<Integer> number = Stream.of(25, 15, 75, 35, 40, 5, 65);
        boolean oneIsEven = number.anyMatch(i -> i % 2 == 0);
        System.out.println(oneIsEven);






//        Listに変換
        Stream<String> books = Stream.of("lordOfTheRings","hobbit","harryPotter","gameOfThrones");

        List<String> bookList = books.toList();
        System.out.println(bookList);

//        skip
        Stream<? extends Serializable> Subjects = Stream.of("国語", 60, "英語", 70 ,"数学", 80);

        long count = Subjects.skip(1).count();



        System.out.println(count);

//        generate/ iterate

        Stream.generate(() -> "こんにちは").limit(6).forEach(System.out::println);

        List<Integer> intsFrom0To9 = Stream.iterate(0, n -> n + 1).limit(10).toList();
        System.out.println(intsFrom0To9);
    }
}
