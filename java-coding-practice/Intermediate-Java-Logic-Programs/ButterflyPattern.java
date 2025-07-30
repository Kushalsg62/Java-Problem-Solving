/*
Problem: Butterfly Pattern

Description:
Given an integer N, print a butterfly pattern with 2*N rows. 
Each row consists of a symmetric pattern of asterisks separated 
by spaces to form a butterfly-like shape.

Input:
The first line contains an integer N.

Output:
A butterfly pattern consisting of 2*N rows.

Example:
Input:
4

Output:
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *
*/

import java.util.Scanner;

class ButterflyPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String star;
        String space;
        
        for (int i = 1; i <= N; i++){
            star = "* ".repeat(i);
            space = "  ".repeat(2 * (N - i));
            System.out.println(star + space + star);
        }
        
        for (int j = 1; j <= N; j++){
            star = "* ".repeat(N - j + 1);
            space = "  ".repeat(2 * (j - 1));
            System.out.println(star + space + star);
        }
    }
}
