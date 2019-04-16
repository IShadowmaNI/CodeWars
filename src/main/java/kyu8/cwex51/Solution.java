package kyu8.cwex51;

/*

Write a function called repeatStr which repeats the given string string exactly n times.

repeatStr(6, "I") // "IIIIII"
repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

 */

public class Solution {

    public static String repeatStr(final int repeat, final String string) {

        if (repeat <= 0 || string.equals("")) {
            return "";
        }

        String result = string;
        for (int i = 1; i < repeat; i++) {
            result = result + string;
        }

        return result;
    }
}
