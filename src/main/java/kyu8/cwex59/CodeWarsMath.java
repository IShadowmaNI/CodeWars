package kyu8.cwex59;

/*

Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.

Goodluck :)

*/

import static java.lang.Math.*;

public class CodeWarsMath {

    public static int nearestSq(final int n) {

        return (int) pow(round(sqrt(n)), 2);
    }
}
