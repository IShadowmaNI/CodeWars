package kyu8.cwex26;

/*

Ask a small girl - "How old are you?". She always says strange things... Lets help her!

For correct answer program should return int from 0 to 9.

Assume test input string always valid and may look like "1 year old" or "5 years old", etc..
    The first char is number only.

 */

public class CharProblem {

    public static int howOld(final String herOld) {

        if(herOld.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid input!");
        }

        String[] wordsArray = herOld.split(" ");
        int age = -1;
        for(String word : wordsArray) {
            if(word.matches("\\d+")) {
                age = Integer.parseInt(word);
            }
        }

        return age;
    }
}
