package com.strings;
/* Write a Java program to get the contents of a given string as a byte array. */

public class Question_2 {

    public static void main(String[] args)
    {
        String str = "This is a sample String.";

        byte[] byte_arr = str.getBytes();

        String new_str = new String(byte_arr);


        System.out.println("\nThe new String equals " +
                new_str + "\n");
    }
}
