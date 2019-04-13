package kyu8.cwex31;

/*

Consider an array of sheep where some sheep may be missing from their place. We need a function that counts the number
    of sheep present in the array (true means present).

For example,
[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined

 */

public class Counter {

    public int countSheeps(Boolean[] arrayOfSheeps) {

        if (arrayOfSheeps == null || arrayOfSheeps.length == 0) {
            throw new IllegalArgumentException("Please put a valid array!");
        }

        int countSheeps = 0;
        for (boolean element : arrayOfSheeps) {
            if (element) {
                countSheeps ++;
            }
        }

        return countSheeps;
    }
}