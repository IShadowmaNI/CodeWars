package kyu8.cwex69;

/*

Complete the solution so that it reverses all of the words within the string passed in.

Example:

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
// should return "battle no requires which that is victory greatest The"

 */

public class ReverseWords {

    public static String reverseWords(String str){

        StringBuilder reverseString = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0 ; i--) {
            reverseString.append(words[i]);
            if (i > 0) {
                reverseString.append(" ");
            }
        }

        return reverseString.toString();
    }
}
