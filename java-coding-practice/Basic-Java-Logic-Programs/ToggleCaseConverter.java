/*
Problem: Toggle Case Converter

Given a string, convert all lowercase letters to uppercase and all uppercase letters to lowercase.
Spaces should remain unchanged.

Input:
HeLLo WoRLD

Output:
hEllO wOrld

Explanation:
Each character's case is flipped. Space remains the same.

*/

import java.util.Scanner;

class ToggleCaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int length = word.length();
        String newWord = "";

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (ch == ' ') {
                newWord += " ";
            } else if (Character.isLowerCase(ch)) {
                newWord += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                newWord += Character.toLowerCase(ch);
            }
        }

        System.out.println(newWord);
    }
}
