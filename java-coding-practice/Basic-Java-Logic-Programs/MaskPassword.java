/*
Problem:
Given a password string, print the first and last character as-is,
and replace all middle characters with '*'.

Input:
kushal123

Output:
k*******3
*/

import java.util.Scanner;

public class MaskPassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int lengthPassword = str.length();
        int stars = lengthPassword - 2;
        System.out.print(str.charAt(0) + "*".repeat(stars) + str.charAt(lengthPassword - 1));
    }
}
