package arcade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

        Input strings will always be well-formed with matching ()s.

        Example

        For inputString = "(bar)", the output should be
        solution(inputString) = "rab";
        For inputString = "foo(bar)baz", the output should be
        solution(inputString) = "foorabbaz";
        For inputString = "foo(bar)baz(blim)", the output should be
        solution(inputString) = "foorabbazmilb";
        For inputString = "foo(bar(baz))blim", the output should be
        solution(inputString) = "foobazrabblim".
        Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
        Input/Output

        [execution time limit] 3 seconds (java)

        [memory limit] 1 GB

        [input] string inputString

        A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all
        parentheses in inputString form a regular bracket sequence.

        Guaranteed constraints:
        0 ≤ inputString.length ≤ 50.

        [output] string

        Return inputString, with all the characters that were in parentheses reversed.
*/

public class reverseInParentheses {

    public static String solution(String inputString) {
        String s = inputString;

        while (s.contains("(")){

            s = s.replace("("+s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))+")",
                    new StringBuffer(s.substring(s.lastIndexOf("(")+1, s.indexOf(")", s.lastIndexOf("(")))).reverse().toString());
        }
        return s;
    }
/* Initial attempted recursive solution

     public static String solution(String inputString) {
         int i = 0;
         String output = "";
         while (i < inputString.length()) {
             System.out.println(i);
             System.out.println(output);
             char ch = inputString.charAt(i); // Get next character from inputString
             if (ch == '(') { // When a parentheses is reached, go to reverse helper method
                 List<Object> flipString = reversePar(inputString.substring(i + 1));
                 output += flipString.get(0);
                 i += ((String) flipString.get(0)).length() + (int) flipString.get(1) + 1; // Shift past the nested string to the next character
             } else if (ch == ')') {
                 i++;
                 continue;
             } else {
                 output += ch;
                 i++;
             }
         }
         System.out.println(output);
         return output;
     }

     private static List<Object> reversePar(String inputString) { // Get a string to reverse
         StringBuilder flipped = new StringBuilder();
         char ch = inputString.charAt(0);
         int i = 1;
         int step = 0;
         while (ch != ')') {
             if (ch == '(') { // If another nested parantheses is found, recurse for the nested substring (not adding 1 to i because we've introduced an offset)
                 List<Object> newFlipped = reversePar(inputString.substring(i));
                 step += (int) newFlipped.get(1);
                 flipped.append(newFlipped.get(0));
                 i += ((String) newFlipped.get(0)).length() + 1; // Shift past the nested string and the ending parantheses to the next character
             } else {
                 flipped.append(ch);
             }
             ch = inputString.charAt(i);
             i++;
         }
         step++;
         System.out.println(flipped);
         flipped.reverse();
         System.out.println(flipped);
         List<Object> reverseResult = Arrays.asList(flipped.toString(), step);
         return reverseResult;
     }*/

    @Test
    public void testReverseInParentheses() {
        String inputString = "foo(bar(baz))blim";
        String expected = "foobazrabblim";
        Assertions.assertEquals(expected, solution(inputString));
    }

}
