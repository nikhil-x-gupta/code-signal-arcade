package arcade;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given an array of strings, return another array containing all of its longest strings.

        Example

        For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
        solution(inputArray) = ["aba", "vcd", "aba"].

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.string inputArray

        A non-empty array.

        Guaranteed constraints:
        1 ≤ inputArray.length ≤ 10,
        1 ≤ inputArray[i].length ≤ 10.

        [output] array.string

        Array of the longest strings, stored in the same order as in the inputArray.
*/

public class allLongestStrings {

    public static String[] solution(String[] inputArray) {
        List<String> longest = new ArrayList<String>();
        int max = 0;
        System.out.println(max);
        for (String string : inputArray) {
            if (string.length() == max) {
                longest.add(string);
            } else if (string.length() > max) {
                max = string.length();
                longest = new ArrayList<>();
                longest.add(string);
            }
            System.out.println(string);
        }
        String[] longestArray = new String[longest.size()];
        for (int i = 0; i < longest.size(); i++) {
            longestArray[i] = longest.get(i);
        }

        return longestArray;
    }

    @Test
    public void testAllLongestStrings() {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        String[] expected = {"aba", "vcd", "aba"};
        Assertions.assertArrayEquals(expected, solution(inputArray));
    }

}
