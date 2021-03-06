package kyu8.cwex75;

/*

    8kyu - Stringy Strings

Write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.

the string should start with a 1.

a string with size 6 should return :'101010'.

with size 4 should return : '1010'.

with size 12 should return : '101010101010'.

The size will always be positive and will only use whole numbers.

 */

public class Kata {

    public static String stringy(int size) {

        if (size < 0) {
            throw new IllegalArgumentException("Wrong length using size " + size);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sb.append("1");
            } else {
                sb.append("0");
            }
        }

        return sb.toString();
    }

}
