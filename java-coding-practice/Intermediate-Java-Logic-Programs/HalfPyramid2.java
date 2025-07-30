/*
Problem: Half Pyramid - 2

Write a program to print the numbers in the given N number of rows in the following half pyramid pattern.

Example:
Input:
5

Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

import java.util.Scanner;

class HalfPyramid2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 1;
        
        for (int i = 1; i <= N; i++){
            String num = "";
            for (int j = 1; j <= i; j++){
                num += (count++) + " ";
            }
            System.out.println(num);
        }
    }
}
