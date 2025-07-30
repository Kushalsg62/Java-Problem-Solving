/*
Problem:
Given an employee's salary and years of service, print the bonus amount.
Bonus is 5% of salary if years of service > 5; otherwise, print "No bonus".

Input:
50000
6

Output:
2500.0
*/

import java.util.Scanner;

public class BonusEligibility {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int years = input.nextInt();
        if (years > 5){
            float bonus = (5 * salary / 100);
            System.out.println(bonus);
        }
        else{
            System.out.println("No bonus");
        }
    }
}
