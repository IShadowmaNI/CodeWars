package kyu8.cwex57;

/*

You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched
    their heads and tails around!

Save the animals by switching them back. You will be given an array which will have three values (tail, body, head).
    It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with
    the same exact logics - simples!

 */

import java.util.Arrays;
import java.util.Collections;

public class WrongEndHead {

    public static String[] fixTheMeerkat(String[] arr) {

//        Method 1:
//        String temp;
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}
