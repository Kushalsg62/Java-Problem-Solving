/*
Problem:
Given marks scored in three subjects M, P, and C, check if the candidate is eligible based on the following conditions:

- All three marks are at least 60 and total is at least 180
OR
- Sum of M and P is at least 120
OR
- Sum of C and P is at least 110

Print "True" if eligible, else "False".

Input:
65 70 50

Output:
True
*/

import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int P = input.nextInt();
        int C = input.nextInt();
        if ((((M >= 60) && (P >= 60) && (C >= 60)) && ((M + P + C) >= 180)) || (((M + P) >= 120) || ((C + P) >= 110))){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
