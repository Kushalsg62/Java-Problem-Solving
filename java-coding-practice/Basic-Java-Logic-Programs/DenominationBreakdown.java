/*
Problem:
Break down an amount using minimum number of denominations:
Denominations used: ₹100, ₹50, ₹10, ₹1

Example:
Input: 289
Output:
100:2
50:1
10:3
1:9
*/

import java.util.Scanner;

public class DenominationBreakdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();

        int hundreds = amount / 100;
        System.out.println("100:" + hundreds);

        int remaining = amount % 100;

        int fifties = remaining / 50;
        System.out.println("50:" + fifties);

        remaining %= 50;

        int tens = remaining / 10;
        System.out.println("10:" + tens);

        int ones = remaining % 10;
        System.out.println("1:" + ones);
    }
}
