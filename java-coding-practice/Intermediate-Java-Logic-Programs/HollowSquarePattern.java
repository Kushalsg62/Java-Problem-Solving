/*
Problem:
Print a hollow square pattern with '*'.

Example:
Input: 5

Output:
* * * * *  
*       *  
*       *  
*       *  
* * * * *
*/

import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                System.out.println("* ".repeat(num));
            } else {
                System.out.println("* " + "  ".repeat(num - 2) + "*");
            }
        }
    }
}
