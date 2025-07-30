/*
Problem:
Convert the given number of days into equivalent years, weeks, and days.

Input:
500

Output:
1
19
5

Explanation:
500 days = 1 year (365 days) + 19 weeks (133 days) + 5 days.
*/

import java.util.Scanner;

public class ConvertDaysToYearsWeeksDays {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int years = num / 365;
        int remainingYearDays = num % 365;
        int weeks = remainingYearDays / 7;
        int days = remainingYearDays % 7;
        System.out.println(years);
        System.out.println(weeks);
        System.out.println(days);
    }
}
