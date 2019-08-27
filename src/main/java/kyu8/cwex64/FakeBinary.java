package kyu8.cwex64;

/*

Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
    Return the resulting string.

 */

public class FakeBinary {

    public static String fakeBin(String numberString) {
        String[] digitsArray = numberString.split("");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < digitsArray.length; i++) {
            if (Integer.parseInt(digitsArray[i]) < 5) {
                output.append(0);
            } else {
                output.append(1);
            }
        }

        return output.toString();
        // Another option(regex):
        // return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
