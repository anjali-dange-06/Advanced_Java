package com.demo;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        // Predicate with Integer
        // Predicate<Integer> p = (i) -> {
        //     return i > 60;
        // };
        //
        // boolean ans = p.test(111);
        // System.out.println(ans);

        // Predicate with String
        Predicate<String> str = (i) -> {
            return i.length() > 5;
        };

        boolean anss = str.test("anjali");

        System.out.println(anss);


        // Predicate to check starting character
        Predicate<String> st = (j) -> {
            return j.startsWith("h");
        };

        boolean isstart = st.test("handsome");

        System.out.println(isstart);
    }
}