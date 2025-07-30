/*
Problem Title: Diagonal Matrix Filter

Description:
Given an M x N matrix as input, print the matrix such that
only the elements on the main diagonal and anti-diagonal remain,
while all other elements are replaced with 0.

Input:
- Two integers M and N
- M rows each containing N integers (the matrix)

Output:
- The modified matrix where only diagonal and anti-diagonal elements are retained.

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
1 0 3
0 5 0
7 0 9
*/

import java.util.*;

class DiagonalMatrixFilter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        
        int[][] matrix = new int[M][N];
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                int value = input.nextInt();
                if(j == i || j == N - i - 1){
                    matrix[i][j] = value;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
