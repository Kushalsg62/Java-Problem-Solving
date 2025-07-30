/*
Problem:
Read a string and a number, then print the string followed by a space, repeated the given number of times.

Input:
Hello
3

Output:
Hello Hello Hello 
*/

import java.util.Scanner;

public class RepeatStringWithSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String addSpace = str + " ";
        int num = input.nextInt();
        System.out.println(addSpace.repeat(num));
    }
}
