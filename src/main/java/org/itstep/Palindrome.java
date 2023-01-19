package org.itstep;

public class Palindrome {
    public static boolean isPalindrome(String input) {
        if (input == null || input.isBlank()) {
            return false;
        }
        String originString = input.toLowerCase()
                .replaceAll("\\W", "")
                .replace("_", "");
        String reverseString = new StringBuilder(originString)
                .reverse().toString();
        return originString.equals(reverseString);
    }
}
