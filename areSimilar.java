package arcade;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

        Given two arrays a and b, check whether they are similar.

        Example

        For a = [1, 2, 3] and b = [1, 2, 3], the output should be
        solution(a, b) = true.

        The arrays are equal, no need to swap any elements.

        For a = [1, 2, 3] and b = [2, 1, 3], the output should be
        solution(a, b) = true.

        We can obtain b from a by swapping 2 and 1 in b.

        For a = [1, 2, 2] and b = [2, 1, 1], the output should be
        solution(a, b) = false.

        Any swap of any two elements either in a or in b won't make a and b equal.

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.integer a

        Array of integers.

        Guaranteed constraints:
        3 ≤ a.length ≤ 105,
        1 ≤ a[i] ≤ 1000.

        [input] array.integer b

        Array of integers of the same length as a.

        Guaranteed constraints:
        b.length = a.length,
        1 ≤ b[i] ≤ 1000.

        [output] boolean

        true if a and b are similar, false otherwise.
*/

public class areSimilar {

    public static boolean solution(int[] a, int[] b) {
        int comp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                comp++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            if (comp <= 2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Test
    public void testAreSimilar() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        boolean expected = true;
        Assertions.assertEquals(expected, solution(a, b));
    }

}
