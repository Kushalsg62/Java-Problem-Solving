/*
Problem: Half Pyramid - 4

Given an integer N as a starting number and K as input,
print a half-pyramid pattern of numbers in reverse order.

Input:
First line: Integer M (starting number)
Second line: Integer N (number of rows)

Example:
Input:
5
4

Output:
14
13 12
11 10 9
8 7 6 5

Explanation:
The pattern prints a reverse half pyramid starting from:
count = M + totalElements - 1

Where totalElements = N * (N + 1) / 2

*/

import java.util.Scanner;

class HalfPyramid4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        long count = N * (N + 1) / 2 + M - 1;

        for (int i = 1; i <= N; i++){
            String num = "";
            for (int j = 1; j <= i; j++){
                num += count + " ";
                count--;
            }
            System.out.println(num);
        }
    }
}
