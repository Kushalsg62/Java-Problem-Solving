/*
Problem Title: First Word with At Least Two Vowels

Description:
Given a list of space-separated words, print the first word that contains at least 2 vowels.
Use Java Stream API to perform this efficiently.

Input:
- First line: Integer N (number of words)
- Second line: N space-separated words

Output:
- The first word that contains at least 2 vowels
- If no such word exists, print "Not Found"

Example:
Input:
5
code java stream output good

Output:
code

Another Example:
Input:
4
my try gym sky

Output:
Not Found

*/

import java.util.*;

class FirstWordWithTwoVowels {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();

        String[] words = input.nextLine().split(" ");

        Optional<String> opt = Arrays.stream(words)
                                     .filter(n -> countVowels(n) >= 2)
                                     .findFirst();

        opt.ifPresentOrElse(
            x -> System.out.println(x),
            () -> System.out.println("Not Found")
        );

        input.close();
    }

    public static int countVowels(String word){
        return (int) word.toLowerCase()
                         .chars()
                         .filter(ch -> "aeiou".indexOf(ch) >= 0)
                         .count();
    }
}
