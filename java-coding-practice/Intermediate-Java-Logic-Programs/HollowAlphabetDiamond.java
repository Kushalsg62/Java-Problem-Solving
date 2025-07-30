/*
Problem: Hollow Diamond Alphabet Pattern

Description:
Given a number N, print a hollow diamond pattern made of uppercase alphabets.
The pattern consists of N rows in the top half and N-1 rows in the bottom half,
forming a symmetric hollow diamond.

Input:
- A single positive integer N (number of rows in the upper half)

Output:
- Hollow diamond alphabet pattern as per the given size

Example (N = 5):

    A
   B B
  C   C
 D     D
E       E
 D     D
  C   C
   B B
    A

Note:
- Characters increase from 'A' up to the center row and decrease afterward.
- The pattern has left spaces and inner hollow spaces appropriately aligned.
*/

import java.util.Scanner;

class HollowAlphabetDiamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String leftSpace;
        String hollowSpace;
        int unicode = 65;

        for (int i = 1; i <= N; i++) {
            leftSpace = " ".repeat(N - i);
            char ch = (char) (unicode++);
            if (i == 1) {
                System.out.println(leftSpace + ch);
            } else {
                hollowSpace = " ".repeat(2 * (i - 1) - 1);
                System.out.println(leftSpace + ch + hollowSpace + ch);
            }
        }

        for (int i = 1; i < N; i++) {
            leftSpace = " ".repeat(i);
            char ch = (char) (--unicode);
            if (i == N - 1) {
                System.out.println(leftSpace + ch);
            } else {
                hollowSpace = " ".repeat(2 * (N - i) - 3);
                System.out.println(leftSpace + ch + hollowSpace + ch);
            }
        }

        input.close();
    }
}
