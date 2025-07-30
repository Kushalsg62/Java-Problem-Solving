/*
Problem: Composite Number Checker

Given an integer N, check whether it is a composite number.
A composite number has more than two factors.

Input:
10

Output:
True

Explanation:
Factors of 10 = 1, 2, 5, 10 → Total: 4 > 2 → Composite
*/

import java.util.Scanner;

class IsCompositeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;

        for (int i = 1; i < N + 1; i++) {
            if (N % i == 0) {
                count += 1;
            }
        }

        if (count > 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
