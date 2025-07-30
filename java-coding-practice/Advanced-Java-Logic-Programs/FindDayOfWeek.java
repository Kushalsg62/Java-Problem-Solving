/*
Problem: Day Name - 2

Description:
Given the weekday of the first day of a month, determine the day of
the week for a particular date in that same month.

Input:
- The first line contains a string D (starting weekday)
- The second line contains an integer N (date in the month)

Output:
- A string representing the weekday of the Nth day of the month

Example:
Input:
Tuesday
3

Output:
Thursday
*/

import java.util.Scanner;

class FindDayOfWeek {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String D = input.nextLine();
        int N = input.nextInt();

        String[] weekdays = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };

        int index = 0;
        for (int i = 0; i < weekdays.length; i++) {
            if (weekdays[i].equalsIgnoreCase(D)) {
                index = i;
                break;
            }
        }

        int dayIndex = (index + (N - 1)) % 7;
        System.out.println(weekdays[dayIndex]);

        input.close();
    }
}
