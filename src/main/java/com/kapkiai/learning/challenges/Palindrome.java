package com.kapkiai.learning.challenges;

/**
 * Valid Palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 *
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class Palindrome {

    public static void main(String[] args){
        String TEST1 = "A man, a plan, a canal: Panama";
        String TEST2 = "race a car";
        String TEST3 = " ";
        System.out.println("Is palindrome: " + isPalindrome(TEST1));
        System.out.println("Is palindrome: " + isPalindrome(TEST2));
        System.out.println("Is palindrome: " + isPalindrome(TEST3));
        System.out.println("Is palindrome: " + isPalindrome2(TEST1));
        System.out.println("Is palindrome: " + isPalindrome2(TEST2));
        System.out.println("Is palindrome: " + isPalindrome2(TEST3));
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     * @param s string to check for palindrome
     * @return true or false
     */
    public static boolean isPalindrome(String s){
        if (s == null){
            return false;
        }
        if (s.strip().equals("")){
            return true;
        }

        StringBuilder cleanInput = new StringBuilder();
        for (char c : s.toCharArray()){
            if(isAlphaNum(c)){
                cleanInput.append(c);
            }
        }
        return cleanInput.toString().toLowerCase().equals(reverseString(cleanInput.toString().toLowerCase()));

    }

    public static String reverseString(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            res.insert(0, str.charAt(i));
        }
        return res.toString();
    }

    /**
     * Space complexity: O(1)
     * Time complexity: O(1)
     * @param s string to check
     * @return true or false
     */

    public static boolean isPalindrome2(String s)
    {
        int start=0,end=s.length()-1;

        while(start<end)
        {
            while(start<end && !isAlphaNum(s.charAt(start))) start++;
            while(start<end && !isAlphaNum(s.charAt(end))) end--;

            if(lowerCase(s.charAt(start))!=lowerCase(s.charAt(end)))
                return false;

            start++;
            end--;
        }

        return true;

    }

    static char lowerCase(char c)
    {
        if(65<=c && c<=90)
            return (char)(c+32);
        else
            return c;
    }

    public static boolean isAlphaNum(char c){
        return (c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
