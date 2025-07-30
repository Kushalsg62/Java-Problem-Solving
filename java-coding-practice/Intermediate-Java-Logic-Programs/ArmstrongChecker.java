/*
Problem: Armstrong Number Checker

Description:
Given a number, check whether it is an Armstrong number.

An Armstrong number is one in which the sum of each digit raised
to the power of the number of digits is equal to the number itself.

Input:
A single line containing a number (as a string).

Output:
"Armstrong Number" if true, otherwise "Not an Armstrong Number"

Example:
Input:
153

Output:
Armstrong Number

Explanation:
1³ + 5³ + 3³ = 153
*/

import java.util.Scanner;

class ArmstrongChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int numN = Integer.parseInt(num);
        int length = num.length();
        int sum = 0;

        if (length == 1){
            System.out.println("Armstrong Number");
        } else {
            for (int i = 0; i < length; i++){
                char ch = num.charAt(i);
                int digit = Character.getNumericValue(ch);
                double power = Math.pow(digit, length);  // FIXED: Changed 3 → length
                sum += (int) power;
            }
            if (sum == numN){
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not an Armstrong Number");
            }
        }

        input.close();
    }
}
