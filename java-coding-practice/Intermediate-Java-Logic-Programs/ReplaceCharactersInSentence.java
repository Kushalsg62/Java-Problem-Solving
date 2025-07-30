/*
Problem: Replacing Characters of Sentence

Description:
You are given a string S. Write a program to replace each letter in the string
with the next letter in the English alphabet.

Note:
- Uppercase letters should be replaced with uppercase letters.
- Lowercase letters should be replaced with lowercase letters.
- Spaces must be preserved as-is.
- No special characters or digits are assumed in input.

Input:
- A single line string (can contain spaces)

Output:
- Modified string with every letter replaced by the next letter

Example:
Input:
Hello World

Output:
Ifmmp Xpsme
*/

import java.util.Scanner;

class ReplaceCharactersInSentence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String N = input.nextLine();
        int length = N.length();
        String word = "";

        for (int i = 0; i < length; i++){
            char ch = N.charAt(i);
            if (ch == ' '){
                word += ch;
            } else if (Character.isLetter(ch)){
                int unicode = (int) ch;
                int unicodeAdd = unicode + 1;
                word += (char) unicodeAdd;
            }
        }

        System.out.println(word);
        input.close();
    }
}
