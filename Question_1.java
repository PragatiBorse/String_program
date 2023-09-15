package com.strings;
import java.util.HashMap;
import java.util.Map;

public class Question_1 {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int startIndex = 0;

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

            if (charIndexMap.containsKey(currentChar)) {
                startIndex = Math.max(startIndex, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
}
