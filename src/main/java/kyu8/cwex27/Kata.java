package kyu8.cwex27;

/*

Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of
    negative numbers.

If the input array is empty or null, return an empty array.

Example:
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

 */

public class Kata {

    public static int[] countPositivesSumNegatives(int[] input) {

        int positiveSum = 0;
        int negativeSum = 0;

        if (input == null || input.length == 0) {

            return new int[] {};
        }

        for(int number : input) {
            if(number > 0) {
                positiveSum ++;
            } else {
                negativeSum += number;
            }
        }

        return new int[] {positiveSum, negativeSum};
    }
}