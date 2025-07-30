/*
Problem: Nth Divisor in Descending Order

Difficulty: Medium

Description:
Given two integers M and N, find the Nth divisor of M when its divisors are listed in descending order.

Input:
The first line contains two space-separated integers M and N.

Output:
Print the Nth divisor of M in descending order.

Example:
Input:
12 3

Output:
4

Explanation:
Divisors of 12 in descending order: 12, 6, 4, 3, 2, 1
The 3rd divisor is 4.
*/

import java.util.Scanner;

class NthDivisorDescending {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        String num = "";
        int count = 0;
        
        for (int i = M; i > 0; i--){
            if(M % i == 0){
                num = String.valueOf(i);
                count += 1;
                if (count == N){
                    break;
                }
            }
        }
        System.out.println(num);
    }
}
