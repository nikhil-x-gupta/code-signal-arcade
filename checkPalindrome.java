package arcade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
