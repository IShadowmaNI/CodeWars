package kyu8.cwex32;

/*

Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each
    of the following phrases each time a petal was torn:
    -> I love you
    -> a little
    -> a lot
    -> passionately
    -> madly
    -> not at all

When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
Your goal in this kata is to determine which phrase the girls would say for a flower of a given number of petals,
    where nb_petals > 0.

 */

public class Sid {

    public static String howMuchILoveYou(int nb_petals) {
        String girlPhrase;

        if (nb_petals < 0) {
            throw new IllegalArgumentException("Please enter a positive number of petals");
        }

        switch (nb_petals % 6) {
            case 1: {
                girlPhrase = "I love you";
                break;
            }
            case 2: {
                girlPhrase = "a little";
                break;
            }
            case 3: {
                girlPhrase = "a lot";
                break;
            }
            case 4: {
                girlPhrase = "passionately";
                break;
            }
            case 5: {
                girlPhrase = "madly";
                break;
            }
            case 0: {
                girlPhrase = "not at all";
                break;
            }
            default: {
                girlPhrase = "";
            }

        }

        return girlPhrase;
    }
}