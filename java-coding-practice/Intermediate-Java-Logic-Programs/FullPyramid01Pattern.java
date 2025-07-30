/*
Problem: Full Pyramid - 3 (0 and 1 Pattern)

Description:
Given an integer N, print a pyramid with N rows where each row contains 
increasing 1s centered and padded by 0s.

Input:
The first line of input is a single integer N.

Output:
A full pyramid pattern of 0s and 1s with 2*N - 1 columns and N rows.

Example:
Input:
5

Output:
000010000
000111000
001111100
011111110
111111111
*/

import java.util.Scanner;

class FullPyramid01Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        String zero;
        String one;
        
        for (int i = 1; i < N + 1; i++){
            zero = "0 ".repeat(N - i);
            one = "1 ".repeat(2 * i - 1);
            System.out.println(zero + one + zero);
        }
    }
}
