/*
Problem: First Prime Number in Range

Description:
Write a program to find the first prime number in the given range of M to N.
If there are no prime numbers, print "No prime numbers in the given range".

Input:
- The first line contains a positive integer M.
- The second line contains a positive integer N.

Output:
- Print the first prime number in the range [M, N] inclusive,
  or print "No prime numbers in the given range" if none found.

Example:
Input:
10
20

Output:
11
*/

import java.util.Scanner;

class FirstPrimeInRange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        boolean found = false;

        for (int i = M; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("No prime numbers in the given range");

        input.close();
    }
}
