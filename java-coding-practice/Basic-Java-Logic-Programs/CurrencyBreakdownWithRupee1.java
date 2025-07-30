/*
Problem:
Break down a given amount using ₹500, ₹50, ₹10, and ₹1 notes.

Input:
Integer amount (e.g., 1361)

Output:
Number of notes/coins for each denomination.

Example:
Input: 1361
Output: 
500: 2 50: 1 10: 1 1: 1
*/

import java.util.Scanner;

public class CurrencyBreakdownWithRupee1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        int fiveHundred = amount / 500;
        amount %= 500;

        int fifty = amount / 50;
        amount %= 50;

        int ten = amount / 10;
        amount %= 10;

        int one = amount;

        System.out.print("500: " + fiveHundred + " ");
        System.out.print("50: " + fifty + " ");
        System.out.print("10: " + ten + " ");
        System.out.print("1: " + one);
    }
}
