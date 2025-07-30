/*
Problem: Subsequence

Description:
Given two strings, write a program to check if the second string is a
subsequence of the first string.

A string is considered a subsequence of another if it can be derived
by deleting some characters from the original string without changing
the order of the remaining characters.

Input:
- The first line of input contains a string (original string)
- The second line contains another string (to be checked)

Output:
- "Yes" if the second string is a subsequence of the first
- "No" otherwise

Example:
Input:
abcde
ace

Output:
Yes
*/

import java.util.Scanner;

class CheckSubsequence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstWord = input.nextLine();
        String secondWord = input.nextLine();
        int lengthFirstWord = firstWord.length();
        int lengthSecondWord = secondWord.length();
        int countYes = 0;
        int count = 0;

        for (int i = 0; i < lengthSecondWord; i++){
            char ch1 = secondWord.charAt(i);
            for (int j = count; j < lengthFirstWord; j++){
                char ch2 = firstWord.charAt(j);
                if (ch1 == ch2){
                    countYes += 1;
                    count += 1;
                    break;
                } else {
                    count += 1;
                }
            }
        }

        if (countYes == lengthSecondWord){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        input.close();
    }
}
