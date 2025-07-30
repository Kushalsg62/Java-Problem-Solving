/*
Problem:
Given a string and a number, print the last 3 characters of the string repeated 'n' times.

Input:
Developer
3

Output:
perperper
*/

import java.util.Scanner;

public class RepeatLastThreeChars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int num = input.nextInt();
        int lengthString = str.length();
        String lastThreeChar = str.substring(lengthString - 3);
        System.out.println(lastThreeChar.repeat(num));
    }
}
