package kyu8.cwex43;

/*

Your function takes two arguments:
    1. current father's age (years)
    2.current age of his son (years)

Сalculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old).

 */

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {

        if (dadYears < 0 || sonYears < 0) {
            throw new IllegalArgumentException("Please give a valid age!");
        }

        return Math.abs(sonYears * 2 - dadYears);
    }
}
