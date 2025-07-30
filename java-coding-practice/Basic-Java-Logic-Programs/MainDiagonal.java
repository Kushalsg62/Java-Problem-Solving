/*
Problem: Print Main Diagonal Elements of a Matrix

Description:
Given a matrix of size M x N, print the main diagonal elements in list format.

Input:
- Two integers M and N
- M lines, each containing N integers

Output:
- A list containing the main diagonal elements

Example:
Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
[1, 5, 9]
*/

import java.util.*;

class MainDiagonal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int[][] arr = new int[M][N];
        
        for(int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                arr[i][j] = input.nextInt();
            }
        }
        
        System.out.print("[");
        for (int i = 0; i < Math.min(M, N); i++){
            System.out.print(arr[i][i]);
            if (i < Math.min(M, N) - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

        input.close();
    }
}
