package arcade;
/*
Write a function that returns the sum of two numbers.

        Example

        For param1 = 1 and param2 = 2, the output should be
        solution(param1, param2) = 3.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] integer param1

        Guaranteed constraints:
        -1000 ≤ param1 ≤ 1000.

        [input] integer param2

        Guaranteed constraints:
        -1000 ≤ param2 ≤ 1000.

        [output] integer

        The sum of the two inputs.

*/

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class add {

    public static int solution(int param1, int param2) {
        return param1 + param2;
    }

    @Test
    public void testAdd() {
        int param1 = 1;
        int param2 = 2;
        int expected = 3;
        Assertions.assertEquals(expected, solution(param1, param2));
    }

}

