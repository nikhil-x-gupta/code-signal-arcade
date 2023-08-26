package arcade;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the
first half of the digits is equal to the sum of the second half.

        Given a ticket number n, determine if it's lucky or not.

        Example

        For n = 1230, the output should be
        solution(n) = true;
        For n = 239017, the output should be
        solution(n) = false.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer n

        A ticket number represented as a positive integer with an even number of digits.

        Guaranteed constraints:
        10 ≤ n < 106.

        [output] boolean

        true if n is a lucky ticket number, false otherwise.
*/

public class isLucky {

    public static boolean solution(int n) {
        int length = String.valueOf(n).length();
        int firstHalf = n / ((int) Math.pow(10, length / 2));
        int secondHalf = n % ((int) Math.pow(10, length / 2));
        return sumDigits(firstHalf) == sumDigits(secondHalf);
    }

    private static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    @Test
    public void testIsLucky() {
        int n = 239017;
        boolean expected = false;
        Assertions.assertEquals(expected, solution(n));
    }

}
