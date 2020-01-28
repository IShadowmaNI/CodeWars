package kyu8.cwex79;

/*

        8kyu - Beginner Series #2 Clock

Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.

Your task is to make 'Past' function which returns time converted to miliseconds.

#####Example:

Past(0, 1, 1) == 61000
Note! h, m and s will be only Natural numbers! Waiting for translations and Feedback! Thanks!

 */

import java.time.Duration;

public class Clock {

    public static int Past(int h, int m, int s) {
        if (h < 0 || m < 0 || s < 0) {
            throw new IllegalArgumentException("Please give only natural numbers!");
        }

        return (3600 * h + 60 * m + s) * 1000;
//      return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }
}
