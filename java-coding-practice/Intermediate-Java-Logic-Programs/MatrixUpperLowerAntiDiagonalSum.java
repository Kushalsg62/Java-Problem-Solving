/*
Problem Title: Matrix Anti-Diagonal Upper & Lower Sum

Description:
Given a square matrix of size N x N, write a program to:
1. Calculate the sum of all elements in the upper triangle 
   (including the anti-diagonal).
2. Calculate the sum of all elements in the lower triangle 
   (including the anti-diagonal).

Input:
- First line: Integer N (size of matrix)
- Next N lines: N integers each (space-separated)

Output:
- First line: Sum of upper triangle (i + j <= N - 1)
- Second line: Sum of lower triangle (i + j >= N - 1)

Example:
Input:
3
1 2 3
4 5 6
7 8 9

Output:
15
35

*/

import java.util.*;

class MatrixUpperLowerAntiDiagonalSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int matrix[][] = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        int sumUpper = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N - i; j++){
                sumUpper += matrix[i][j];
            }
        }
        System.out.println(sumUpper);
        
        int sumLower = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i + j >= N - 1){
                    sumLower += matrix[i][j];
                }
            }
        }
        System.out.println(sumLower);
        
        input.close();
    }
}
