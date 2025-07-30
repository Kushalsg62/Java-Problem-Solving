/*
Problem:
Print the corresponding day of the week for a number using switch.

Input:
1 → Monday  
7 → Sunday  
Other → Invalid Number

Examples:
Input: 5  
Output: Friday

Input: 0  
Output: Invalid Number
*/

import java.util.Scanner;

public class DayOfWeekSwitch {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
