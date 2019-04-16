package kyu8.cwex48;

/*

Given an array of integers, return a new array with each value doubled.

For example:
    [1, 2, 3] --> [2, 4, 6]

For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.

 */

import java.util.Arrays;

public class Maps {

    public static int[] map(int[] arr) {

        return Arrays.stream(arr)
                .map(x -> x * 2)
                .toArray();
    }
}
