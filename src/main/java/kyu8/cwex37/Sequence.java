package kyu8.cwex37;

/*

Get the number n (n>0) to return the reversed sequence from n to 1.

Example : n=5 >> [5,4,3,2,1]

 */

public class Sequence {

    public static int[] reverse(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Give a n > 0!");
        }

        int[] rs = new int[n];
        int j = 0;

        for (int i = n; i > 0 ; i--) {
            rs[j] = i;
            j++;
        }

        return rs;
    }
}
