package com.strings;

/* Write a Java program to find all interleavings of given strings. */

public class Question_3 {
    public static void findInterleavings(String s1, String s2, String interleaving) {
        if (s1.length() == 0 && s2.length() == 0) {
            System.out.println(interleaving);
            return;
        }

        if (s1.length() > 0) {
            findInterleavings(s1.substring(1), s2, interleaving + s1.charAt(0));
        }

        if (s2.length() > 0) {
            findInterleavings(s1, s2.substring(1), interleaving + s2.charAt(0));
        }
    }

    public static void main(String[] args) {
        String s1 = "WX";
        String s2 = "YZ";

        System.out.println("The given strings are: " + s1 + " " + s2);
        System.out.println("The interleavings strings are: ");
        findInterleavings(s1, s2, "");
    }
}

