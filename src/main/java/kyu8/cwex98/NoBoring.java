package kyu8.cwex98;

/*

        8kyu - No zeros for heroes

Numbers ending with zeros are boring.

They might be fun in your world, but not here.

Get rid of them. Only the ending ones.

1450 -> 145
960000 -> 96
1050 -> 105
-1050 -> -105

Zero alone is fine, don't worry about it. Poor guy anyway

 */

import java.util.stream.Stream;

public class NoBoring {

    public static int noBoringZeros(int n) {

        return n == 0 ? n : Integer.parseInt(Integer.toString(n).split("0+$")[0]);

        // or
//        if (n == 0)
//            return n;
//
//        while (n % 10 == 0)
//            n /= 10;
//
//        return n;
    }
}
