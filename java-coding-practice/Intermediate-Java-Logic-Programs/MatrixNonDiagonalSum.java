/*
Problem: Sum of Non-Diagonal Elements in a Square Matrix

Description:
Given a square matrix of size N x N, write a program to calculate the sum of all elements 
excluding both primary and secondary diagonals.

Input:
- First line contains an integer N (size of the matrix).
- The next N lines contain N integers each, representing the matrix.

Output:
- A single integer — the sum of all non-diagonal elements.

Example:
Input:
3
1 2 3
4 5 6
7 8 9

Output:
20

Explanation:
Matrix:
1 2 3
4 5 6
7 8 9

*/

import java.util.*;

class MatrixNonDiagonalSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[][] matrix = new int[N][N];
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = input.nextInt();
                if(i == j || j == N - i - 1){
                    continue;
                } else {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
