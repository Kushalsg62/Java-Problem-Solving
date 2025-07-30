/*
Question:
Palindrome

Given a string, write a program to check whether it is a palindrome or not.
A palindrome is a word that reads the same backward as forward. The comparison should be case-insensitive.

Input:
A single line containing the string.

Output:
Print "True" if the string is a palindrome.
Print "False" if it is not.
*/

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toLowerCase();
        int length = word.length();
        String newWord = "";
        
        for (int i = 0; i < length; i++){
            char ch = word.charAt(length - 1 - i);
            newWord += Character.toString(ch);
        }
        
        if (word.equals(newWord)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
