package kyu8.cwex44;

public class CodeWars {

    public static long strCount(String str, char letter) {

        return str.chars()
                .filter(c -> c == letter)
                .count();
    }
}
