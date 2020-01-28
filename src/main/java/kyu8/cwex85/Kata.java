package kyu8.cwex85;

/*

        8kyu - Convert number to reversed array of digits

Convert number to reversed array of digits
Given a random number:

C#: long;
C++: unsigned long;
You have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]

 */

public class Kata {

    public static int[] digitize(long n) {

        String[] stringArray = Long.toString(n).split("");
        int[] intArray = new int[stringArray.length];

        for (int i = 0, j = stringArray.length-1  ; i < stringArray.length && j >= 0 ; i++, j--) {
            intArray[i] = Integer.parseInt(stringArray[j]);
        }

        return intArray;
    }
}
