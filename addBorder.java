package arcade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Given a rectangular matrix of characters, add a border of asterisks(*) to it.

        Example

        For

        picture = ["abc",
                   "ded"]
        the output should be

        solution(picture) = ["*****",
                             "*abc*",
                             "*ded*",
                             "*****"]
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] array.string picture

        A non-empty array of non-empty equal-length strings.

        Guaranteed constraints:
        1 ≤ picture.length ≤ 100,
        1 ≤ picture[i].length ≤ 100.

        [output] array.string

        The same matrix of characters, framed with a border of asterisks of width 1.
*/

public class addBorder {

    public static String[] solution(String[] picture) {
        int height = picture.length + 2;
        int width = picture[0].length() + 2;
        String[] framed = new String[height];
        String horizontal = "*".repeat(width);
        framed[0] = framed[framed.length - 1] = horizontal;
        for (int i = 0; i < picture.length; i++) {
            StringBuilder line = new StringBuilder("*");
            line.append(picture[i]);
            line.append("*");
            framed[i + 1] = line.toString();
        }

        return framed;
    }

    @Test
    public void testAddBorder() {
        String[] picture = {"abc",
                            "ded"};
        String[] expected = {"*****",
                             "*abc*",
                             "*ded*",
                             "*****"};
        Assertions.assertArrayEquals(expected, solution(picture));
    }

}
