package kyu8.cwex14;

/*

If you can't sleep, just count sheep!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
    Input will always be valid, i.e. no negative integers.

 */

public class Kata {

    public static String countingSheep(int num) {

        if (num < 1) {
            throw new IllegalArgumentException("Give a positive number!");
        }

        String murmur = new String();
        for (Integer i = 1; i <= num; i++) {
            murmur += i.toString() + " sheep...";
        }

        return murmur;

    }
}
