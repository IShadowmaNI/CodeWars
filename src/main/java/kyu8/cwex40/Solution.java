package kyu8.cwex40;

/*

You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

Array can contain numbers or strings. X can be either.

Return true if the array contains the value, false if not.

 */

public class Solution {

    public static boolean check(Object[] a, Object x) {

        // return Arrays.asList(a).contains(x);

        for (Object value : a) {
            if (value.equals(x)) {
                return true;
            }
        }

        return false;
    }
}
