/*
Problem: Print Prime Numbers in a Given Range

Given two integers M and N, print all prime numbers between M and N (inclusive).

Input:
10 20

Output:
11
13
17
19

Explanation:
These are all prime numbers between 10 and 20.
*/

import java.util.Scanner;

class PrintPrimeNumbersInRange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();

        for (int i = M; i <= N; i++){
            int count = 0;
            for (int j = 2; j <= i; j++){
                if (i % j == 0){
                    count += 1;
                }
            }
            if (count == 1){
                System.out.println(i);
            }
        }
    }
}
