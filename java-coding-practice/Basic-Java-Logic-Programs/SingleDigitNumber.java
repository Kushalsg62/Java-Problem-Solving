/*
Problem: Single Digit Number

Description:
You are given a positive number N. Repeatedly add its digits until the result becomes a single digit.

Input:
- A single integer N.

Output:
- A single digit which is the result of repeated digit addition.

Example:
Input:
9875

Output:
2

*/

import java.util.*;

class SingleDigitNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inputNumber = input.nextLine();

        int sum = 0;

        for(int i = 0; i < inputNumber.length(); i++){
            sum += inputNumber.charAt(i) - '0';
        }

        while(sum >= 10){
            int tempSum = 0;
            String temp = String.valueOf(sum);
            for(int i = 0; i < temp.length(); i++){
                tempSum += temp.charAt(i) - '0';
            }
            sum = tempSum;
        }

        System.out.println(sum);
    }
}
