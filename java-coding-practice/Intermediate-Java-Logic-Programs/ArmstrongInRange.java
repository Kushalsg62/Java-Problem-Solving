/*
Problem: Armstrong Numbers Between Two Intervals

Description:
Print all Armstrong numbers between two given integers A and B (inclusive).
An N-digit number is an Armstrong number if it is equal to the sum of its digits raised to the power N.

Input:
Two integers A and B

Output:
All Armstrong numbers in the range [A, B], separated by space.
Print -1 if none exist.

Example:
Input:
150
160

Output:
153
*/

import java.util.Scanner;

class ArmstrongInRange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int count = 0;

        for (int i = A; i <= B; i++){
            String num = String.valueOf(i);
            int length = num.length();
            int sum = 0;

            for (int j = 0; j < length; j++){
                char ch = num.charAt(j);
                int digit = Character.getNumericValue(ch);
                sum += Math.pow(digit, length);
            }

            if (sum == i){
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0){
            System.out.println("-1");
        }

        input.close();
    }
}
