package kyu8.cwex39;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {

    public static int[] mergeArrays(int[] first, int[] second) {

        return IntStream.concat(Arrays.stream(first), Arrays.stream(second))
                .sorted()
                .distinct()
                .toArray();
    }
}
