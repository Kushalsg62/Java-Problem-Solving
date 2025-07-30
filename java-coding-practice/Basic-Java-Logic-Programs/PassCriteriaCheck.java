/*
Problem:
Check if a candidate passes based on marks in three subjects M, P, and C.

Conditions for passing:
- Each subject score should be at least 35
- The sum of marks in any two subjects should be at least 90

Input:
40 50 30

Output:
True
*/

import java.util.Scanner;

public class PassCriteriaCheck {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int P = input.nextInt();
        int C = input.nextInt();
        if (((M >= 35) && (P >= 35) && (C >= 35)) && (((M + P) >= 90) || ((M + C) >= 90) || ((P + C) >= 90))){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
