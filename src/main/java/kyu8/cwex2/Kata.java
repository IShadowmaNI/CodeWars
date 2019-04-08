package kyu8.cwex2;
/*
 * TODO Simple, given a string of words, return the length of the shortest word(s).
 *
 * String will never be empty and you do not need to account for different data types.
 *
 */

public class Kata {

    public static int findShort(String input) {
        String[] arrayOfWords = input.split("\\s+");
        int min = arrayOfWords[0].length();
        for(int i = 1; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() < min) {
                    min = arrayOfWords[i].length();
            }
        }

        return min;
    }

}
