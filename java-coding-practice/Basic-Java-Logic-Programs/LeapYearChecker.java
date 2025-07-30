/*
Problem:
Check if a given year is a leap year.

Leap Year Rules:
- Divisible by 4
- But not divisible by 100 unless divisible by 400

Examples:
2000 → True
1900 → False
2024 → True
*/

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else {
                System.out.println("True");
            }
        } else {
            System.out.println("False");
        }
    }
}
