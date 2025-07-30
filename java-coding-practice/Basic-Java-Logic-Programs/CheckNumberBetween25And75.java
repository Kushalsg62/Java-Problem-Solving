/*
Problem:
Check if a given number is strictly between 25 and 75.

Input:
50

Output:
True

Input:
20

Output:
False
*/

import java.util.Scanner;

public class CheckNumberBetween25And75 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String betweenNo = (num > 25 && num < 75) ? "True" : "False";
        System.out.println(betweenNo);
    }
}
