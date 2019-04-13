package kyu8.cwex23;

/*

Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

 */

public class Solution {

    static String removeExclamationMarks(String s) {

        return s.replaceAll("!", "");
    }

}
