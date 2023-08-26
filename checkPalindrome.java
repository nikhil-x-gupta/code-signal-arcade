package arcade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given the string, check if it is a palindrome.

        Example

        For inputString = "aabaa", the output should be
        solution(inputString) = true;
        For inputString = "abac", the output should be
        solution(inputString) = false;
        For inputString = "a", the output should be
        solution(inputString) = true.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A non-empty string consisting of lowercase characters.

        Guaranteed constraints:
        1 ≤ inputString.length ≤ 105.

        [output] boolean

        true if inputString is a palindrome, false otherwise.
*/

public class checkPalindrome {

    public static boolean solution(String inputString) {
        int i = 0;
        int j = inputString.length() - 1;
        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    @Test
    public void testCheckPalindrome() {
        String inputString = "aabaa";
        boolean expected = true;
        Assertions.assertEquals(expected, solution(inputString));
    }

}
