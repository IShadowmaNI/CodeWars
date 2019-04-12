package kyu8.cwex18;
/*

Summation:
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer
    greater than 0.

For example:
summation(2) -> 3
1 + 2
summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8

 */

import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Please put a positive number!");
        }

        return IntStream.range(1, n+1).sum();
    }
}
