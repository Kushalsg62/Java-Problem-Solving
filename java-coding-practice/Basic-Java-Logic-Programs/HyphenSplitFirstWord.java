/*
Problem: Hyphen Split First Word

Description:
Read a string and print the first word of the string with each character
separated by a hyphen (-). If there's only one word, hyphenate that.

Input:
A single line containing a sentence (string).

Output:
Characters of the first word separated by hyphens (no trailing hyphen).

Example:
Input:
Hello World

Output:
H-e-l-l-o
*/

import java.util.Scanner;

class HyphenSplitFirstWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int length = sentence.length();
        String newWord = "";

        for (int i = 0; i < length; i++){
            char ch = sentence.charAt(i);
            if (ch == ' '){
                break;
            } else {
                newWord += Character.toString(ch) + "-";
            }
        }

        int newLength = newWord.length();
        String result = "";
        for (int j = 0; j < newLength - 1; j++){
            result += newWord.charAt(j);
        }

        System.out.println(result);

        input.close();
    }
}
