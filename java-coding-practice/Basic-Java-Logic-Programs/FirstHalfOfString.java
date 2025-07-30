/*
Problem:
Given a string, print the first half of the string using substring.

Input:
Programming

Output:
Progra
*/

import java.util.Scanner;

public class FirstHalfOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int half = str.length() / 2;
        System.out.println(str.substring(0, half));
    }
}
