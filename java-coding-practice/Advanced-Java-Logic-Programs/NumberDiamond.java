/*
Problem: Number Diamond

Difficulty: Hard

Description:
Given an integer N as input, write a program to print a number diamond of 2*N - 1 rows as shown below.

Note:
There is a space after each number.

Input:
5

Output:
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1
*/

import java.util.Scanner;

class NumberDiamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        for (int i = 1; i <= N; i++){
            String space = " ".repeat(N - i);
            System.out.print(space);
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for (int i = 1; i < N; i++){
            String space = " ".repeat(i);
            System.out.print(space);
            for (int j = 1; j <= N - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
