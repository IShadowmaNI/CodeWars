package kyu8.cwex87;

/*

        8kyu - Well of Ideas - Easy Version

For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one
    or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good
    ideas, as is often the case, return 'Fail!'.

 */

public class Kata {

    public static String well(String[] x) {

        int nrOccurrences = 0;

        for(String word : x) {
            if(word.equals("good")) {
                nrOccurrences++;
            }
        }

        return (nrOccurrences == 0) ? "Fail!" : (nrOccurrences <= 2 && nrOccurrences > 0) ? "Publish!" : "I smell a series!";
    }
}
