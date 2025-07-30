/*
Problem: Even Digit Shift

Description:
For each number in the input:
- If the first digit is even, move all leading even digits to the end after the first odd digit is found.
- If the first digit is odd, leave the number unchanged.

Input:
- First line: Integer N (number of elements)
- Second line: N space-separated number strings

Output:
- Transformed numbers printed in a single line.

Example:
Input:
5
2468 1357 8642 9753 4826

Output:
2468 1357 8642 9753 2648
*/

import java.util.*;

class EvenDigitShift {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        
        String[] inputArray = input.nextLine().split(" ");
        ArrayList<String> resultList = new ArrayList<>();

        for(String number : inputArray){
            char firstChar = number.charAt(0);
            int firstDigit = firstChar - '0';

            if(firstDigit % 2 == 0){ // Starts with even digit
                StringBuilder evenPart = new StringBuilder();
                String remainder = "";

                for(int i = 0; i < number.length(); i++){
                    char ch = number.charAt(i);
                    int digit = ch - '0';

                    if(digit % 2 == 0){
                        evenPart.append(ch);
                    } else {
                        remainder = number.substring(i);
                        break;
                    }
                }

                resultList.add(remainder + evenPart.toString());
            } else {
                resultList.add(number);
            }
        }

        for(String s : resultList){
            System.out.print(s + " ");
        }

        input.close();
    }
}
