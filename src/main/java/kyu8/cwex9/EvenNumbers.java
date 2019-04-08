package kyu8.cwex9;

/*

Complete the function which takes two arguments and returns all numbers which are divisible by given divisor.
    First argument is an array of numbers and the second is the divisor.

Example
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]

 */

public class EvenNumbers {

    public static int[] divisibleBy(int[] numbers, int divider) {
        int[] nrDivisible = new int[numbers.length];
        int i = 0;

        for(int number : numbers) {
            if (number % divider == 0) {
                nrDivisible[i++] = number;
            }
        }

        return nrDivisible;
    }
}
