package kyu8.cwex88;

/*

        8kyu - Sum Mixed Array

Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.

 */

import java.util.List;

public class MixedSum {

    public int sum(List<?> mixed) {

        int sum = 0;
        for (int i = 0; i < mixed.toArray().length; i++) {
            sum+= Integer.parseInt(mixed.toArray()[i].toString());
        }

        return sum;
//        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}
