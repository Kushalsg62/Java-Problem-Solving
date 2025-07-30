/*
Problem: Sum of Both Diagonals of a Square Matrix

Description:
Given a square matrix of size N x N, write a program to calculate the sum of both its diagonals.

Input:
- First line contains an integer N (size of the matrix).
- The next N lines contain N integers each, representing the matrix.

Output:
- A single integer — the sum of both diagonals.

Note:
- If N is odd, the center element will be counted twice.

Example:
Input:
3
1 2 3
4 5 6
7 8 9

Output:
25

*/

import java.util.*;

class MatrixDiagonalSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[][] matrix = new int[N][N];
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = input.nextInt();
                if(i == j || j == N - i - 1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
