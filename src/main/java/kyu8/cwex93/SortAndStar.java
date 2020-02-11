package kyu8.cwex93;

/*

        8kyu - Sort and Star

You will be given an vector of string(s). You must sort it alphabetically (case-sensitive!!) and then return
    the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.

 */


import java.util.Arrays;

public class SortAndStar {

    public static String twoSort(String[] s) {

        char[] word = Arrays.stream(s).sorted().findFirst().get().toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            if (i == word.length - 1) {
                result.append(word[i]);
                break;
            }

            result.append(word[i]).append("***");
        }

        return result.toString();

        // or
//        Arrays.sort(s);
//        return String.join("***", s[0].split(""));
    }
}
