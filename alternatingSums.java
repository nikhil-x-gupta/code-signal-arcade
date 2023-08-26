package arcade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Several people are standing in a row and need to be divided into two teams. The first person goes into team 1,
the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

        You are given an array of positive integers - the weights of the people. Return an array of two integers,
        where the first element is the total weight of team 1, and the second element is the total weight of team 2
        after the division is complete.

        Example

        For a = [50, 60, 60, 45, 70], the output should be
        solution(a) = [180, 105].

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.integer a

        Guaranteed constraints:
        1 ≤ a.length ≤ 105,
        45 ≤ a[i] ≤ 100.

        [output] array.integer
*/

public class alternatingSums {

    public static int[] solution(int[] a) {
        int[] output = new int[2];
        boolean team1 = true;
        for (int p : a) {
            if (team1) {
                output[0] += p;
                team1 = !team1;
            } else {
                output[1] += p;
                team1 = !team1;
            }
        }
        return output;
    }

    @Test
    public void testAlternatingSums() {
        int[] a = {50, 60, 60, 45, 70};
        int[] expected = {180, 105};
        Assertions.assertArrayEquals(expected, solution(a));
    }

}
