/*
Problem: Print Prime Numbers Up to N

Given an integer N, print all the prime numbers between 2 and N (inclusive).

Input:
10

Output:
2
3
5
7

Explanation:
These are the prime numbers between 2 and 10.
*/

import java.util.Scanner;

class PrintPrimeNumbersUpToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 2; i <= N; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }
}
