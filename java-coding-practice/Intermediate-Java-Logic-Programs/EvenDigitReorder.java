/*
Problem Title: Even Digit Reordering

Description:
Given N numeric strings, process each number as follows:
- If the first digit is even, move all leading even digits to the end after encountering the first odd digit.
- If the first digit is odd, leave the number unchanged.

Input:
- An integer N
- A line with N space-separated strings (each representing a number)

Output:
- Transformed numbers printed in a single line

Example:
Input:
5
2468 1357 8642 9753 4826

Output:
2468 1357 8642 9753 2648
*/

import java.util.*;

class EvenDigitReorder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        
        String[] inputArray = input.nextLine().split(" ");
        ArrayList<String> opArray = new ArrayList<>();
        
        for(String eachElement : inputArray){
            if(Character.getNumericValue(eachElement.charAt(0)) % 2 == 0){
                String evenPart = "", restPart = "";
                
                for(int k = 0; k < eachElement.length(); k++){
                    int digit = Character.getNumericValue(eachElement.charAt(k));
                    if(digit % 2 == 0){
                        evenPart += eachElement.charAt(k);
                    } else {
                        restPart = eachElement.substring(k);
                        break;
                    }
                }
                
                opArray.add(restPart + evenPart);
            } else {
                opArray.add(eachElement);
            }
        }
        
        for(String s : opArray){
            System.out.print(s + " ");
        }

        input.close();
    }
}
