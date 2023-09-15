package com.strings;
/* How to check if one String is rotation of another String in java */
public class Question_4 {

        public static boolean isRotation(String s1, String s2) {

            if (s1.length() != s2.length() || s1.length() == 0) {
                return false;
            }

            String concatenated = s1 + s1;

            return concatenated.contains(s2);
        }

        public static void main(String[] args) {
            String s1 = "abcdef";
            String s2 = "defabc";

            if (isRotation(s1, s2)) {
                System.out.println(s2 + " is a rotation of " + s1);
            } else {
                System.out.println(s2 + " is not a rotation of " + s1);
            }
        }
    }

