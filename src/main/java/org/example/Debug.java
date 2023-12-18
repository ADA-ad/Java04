package org.example;

import java.util.List;
import java.util.Map;

public class Debug {
    public static void main(String[] args) {
        Map<Integer, String> studentById = Map.of(123, "takahashi", 234, "yamamoto", 345, "nakamura");
        System.out.println(studentById.get(2));

        List<Integer> ids = List.of(123, 234, 345, 456);

// 14行目にbreakpointを置いて、studentByIdのサイズとidsのサイズが不一致を発見
        for (int i = 0; i <= (ids.size() - 2); i++) {
            String name = studentById.get(ids.get(i));
            System.out.println(name.toUpperCase());
        }
    }
}
