package kyu8.cwex81;

/*

        8kyu - Grasshopper - Grade book

Complete the function so that it finds the mean of the three scores passed to it and returns the letter value associated with that grade.

Numerical Score	Letter Grade
90 <= score <= 100	'A'
80 <= score < 90	'B'
70 <= score < 80	'C'
60 <= score < 70	'D'
0 <= score < 60	'F'
Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.

 */

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {

        if ((s1 > 100 || s1 < 0) || (s2 > 100 || s2 < 0) || (s3 > 100 || s3 < 0)) {

            throw new IllegalArgumentException("Please give a valid score: [0, 100]!");
        }

        int mean = (s1 + s2 + s3) / 3;

        if (mean >= 90) {
            return 'A';
        }
        if (mean >= 80) {
            return 'B';
        }
        if (mean >= 70) {
            return 'C';
        }
        if (mean >= 60) {
            return 'D';
        }

        return 'F';
    }
}
