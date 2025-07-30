/*
Problem Title: Print Secondary Diagonal of Matrix

Description:
Given an N x N matrix, print the elements of the secondary diagonal (top-right to bottom-left).

Input:
- First line: Integer N (size of matrix)
- Next N lines: N integers each (matrix elements)

Output:
- Secondary diagonal elements separated by space

Example:
Input:
3
1 2 3
4 5 6
7 8 9

Output:
3 5 7
*/

import java.util.*;

class PrintSecondaryDiagonal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] matrix = new int[N][N];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            list.add(matrix[i][N - 1 - i]);
        }
        
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println();
        
        input.close();
    }
}
