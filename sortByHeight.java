package arcade;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to
rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

        Example

        For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
        solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.integer a

        If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person
        standing in the ith position.

        Guaranteed constraints:
        1 ≤ a.length ≤ 1000,
        -1 ≤ a[i] ≤ 1000.

        [output] array.integer

        Sorted array a with all the trees untouched.
*/

public class sortByHeight {

    public static int[] solution(int[] a) {
        List<Integer> people = new ArrayList<>();
        int[] sorted = new int[a.length];
        System.arraycopy(a, 0, sorted, 0, a.length);
        for (int p : a) {
            if (p != -1) {
                people.add(p);
            }
        }
        Collections.sort(people);
        int pCount = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == -1) {
                continue;
            }
            sorted[i] = people.get(pCount);
            pCount++;
        }
        return sorted;
    }

    @Test
    public void testSortByHeight(){
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] expected = {-1, 150, 160, 170, -1, -1, 180, 190};
        Assertions.assertArrayEquals(expected, solution(a));
    }

}
