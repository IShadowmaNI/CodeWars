package kyu8.cwex95;

/*

        8kyu - Area of a Square

Complete the function that calculates the area of the red square, when the length of the circular arc A is given
    as the input. Return the result rounded to two decimals.

Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

2 * pi  *r = 4 * A => r = 2 * A / pi => area = (2 * A / pi) ^ 2 ;

 */

import java.text.DecimalFormat;

public class Geometry {

    public static double squareArea(double A){

        return Double.parseDouble(String.format("%.2f",Math.pow((2 * A / Math.PI), 2)));
    }
}
