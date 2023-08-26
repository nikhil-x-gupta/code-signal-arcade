package arcade;
/*
Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

        Example

        For year = 1905, the output should be
        solution(year) = 20;
        For year = 1700, the output should be
        solution(year) = 17.
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer year

        A positive integer, designating the year.

        Guaranteed constraints:
        1 ≤ year ≤ 2005.

        [output] integer

        The number of the century the year is in.
*/

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class centuryFromYear {

    public static int solution(int year) {
        int century = year / 100;
        if (year % 100 != 0) {
            century++;
        }
        return century;
    }

    @Test
    public void testCenturyFromYear() {
        int year = 1905;
        int expected = 20;
        Assertions.assertEquals(expected, solution(year));
    }
}
