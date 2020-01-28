package kyu8.cwex82;

/*

        8kyu - Squash the bugs

Simple challenge - eliminate all bugs from the supplied code so that the code runs and outputs the expected value.
    Output should be the length of the longest word, as a number.

There will only be one 'longest' word.

 */

public class Kata {

    public static int findLongest(final String str) { // replaced ( with {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) { // replaced > with < and i + with i++
            if (spl[i].length() > longest) { // replaced spl(i) with spl[i]
                longest = spl[i].length();
            } // replaced ) with }
        }
        return longest;
    } // replaced ) with }
}
