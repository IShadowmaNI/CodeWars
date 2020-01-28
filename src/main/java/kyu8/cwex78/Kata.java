package kyu8.cwex78;

/*

        8kyu - Reversed Strings

Complete the solution so that it reverses the string value passed into it.

Ex: Kata.solution("world") //returns "dlrow"

 */

public class Kata {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }
}
