package arcade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/*
Given two strings, find the number of common characters between them.

        Example

        For s1 = "aabcc" and s2 = "adcaa", the output should be
        solution(s1, s2) = 3.

        Strings have 3 common characters - 2 "a"s and 1 "c".

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string s1

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        1 ≤ s1.length < 15.

        [input] string s2

        A string consisting of lowercase English letters.

        Guaranteed constraints:
        1 ≤ s2.length < 15.

        [output] integer
*/

public class commonCharacterCount {

    public static int solution(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int commonCount = 0;
        for (int i = 0; i < sb1.length(); i++) {
            for (int j = 0; j < sb2.length(); j++) {
                if (sb1.charAt(i) == ' ') {
                    continue;
                }
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    commonCount++;
                    System.out.println(sb1.charAt(i));
                    System.out.println(sb2.charAt(j));
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    sb1.insert(i, ' ');
                    sb2.insert(j, ' ');
                }
            }
        }
        return commonCount;
    }

    @Test
    public void testCommonCharacterCount() {
        String s1 = "aabcc";
        String s2 = "adcaa";
        int expected = 3;
        Assertions.assertEquals(expected, solution(s1, s2));
    }

}
