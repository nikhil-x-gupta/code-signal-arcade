package arcade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
Given a string, find out if its characters can be rearranged to form a palindrome.

        Example

        For inputString = "aabb", the output should be
        solution(inputString) = true.

        We can rearrange "aabb" to make "abba", which is a palindrome.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        1 ≤ inputString.length ≤ 50.

        [output] boolean

        true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
*/

public class palindromeRearranging {

    public static boolean solution(String inputString) {
        // Approach: Count appearances of each letter in the string. In a palindrome, there should be an even number of each letter, with one odd allowed if the string has an odd length.
        int[] alph = new int[26]; // Create array to count letters
        for (int i = 0; i < inputString.length(); i++) { // Iterate through string
            alph[inputString.charAt(i) - 'a']++; // Subtract 'a' from the character to get its numeric position in the alphabet and increment its count by one
        }

        int count = 0;
        for (int j = 0; j < alph.length; j++) {
            if(alph[j] % 2 != 0) {
                count++; // If the count of a letter is odd, increment
            }
        }
        return count <= 1; // If the count of odd letters is greater than 1, then it is not a palindrome
    }

    @Test
    public void testPalindromeRearranging() {
        String inputString = "aabb";
        boolean expected = true;
        Assertions.assertEquals(expected, solution(inputString));
    }
}
