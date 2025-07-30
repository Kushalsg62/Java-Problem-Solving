/*
Problem Title: Check for Caesar Cipher Rotation

Description:
Given two strings S and T of the same length, determine whether T can be obtained from S 
by rotating each character of S by the same number of positions in the alphabet (mod 26).
This is essentially checking whether T is a Caesar cipher of S with a consistent shift.

Input:
- First line: String S (lowercase)
- Second line: String T (lowercase)

Output:
- "Yes" if T is a Caesar cipher rotation of S
- "No" otherwise

Example:
Input:
abc
def

Output:
Yes

Another Example:
Input:
aab
ccd

Output:
No

BUT
If:
Input:
abc
deg

Output:
No

*/

import java.util.*;

class CheckCaesarCipherRotation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        String T = input.nextLine();

        char sCharacterFirst = S.charAt(0);
        char tCharacterFirst = T.charAt(0);

        int sNumFirst = (int) sCharacterFirst;
        int tNumFirst = (int) tCharacterFirst;

        int consistentShift = (tNumFirst - sNumFirst + 26) % 26;

        boolean isConsistent = true;

        for(int i = 0; i < S.length(); i++){
            int sChar = (int) S.charAt(i);
            int tChar = (int) T.charAt(i);

            int currentShift = (tChar - sChar + 26) % 26;

            if(currentShift != consistentShift){
                isConsistent = false;
                break;
            }
        }

        System.out.println(isConsistent ? "Yes" : "No");
        input.close();
    }
}
