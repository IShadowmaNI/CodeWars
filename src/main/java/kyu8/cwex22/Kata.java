package kyu8.cwex22;

/*

Description:
Remove n exclamation marks in the sentence from left to right. n is positive integer.

Examples:
remove("Hi!",1) === "Hi"
remove("Hi!",100) === "Hi"
remove("Hi!!!",1) === "Hi!!"
remove("Hi!!!",100) === "Hi"
remove("!Hi",1) === "Hi"
remove("!Hi!",1) === "Hi!"
remove("!Hi!",100) === "Hi"
remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"

 */

public class Kata {

    public static String remove(String s, int n) {

        if (!s.contains("!") || n <= 0) {
            return s;
        }

        for (int i = 0; i < n; i++) {
            s = s.replaceFirst("!", "");
        }

        return s;
    }
}
