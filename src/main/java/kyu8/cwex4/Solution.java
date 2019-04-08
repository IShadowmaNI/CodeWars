package kyu8.cwex4;
/*
Your job is to find the gravitational force between two spherical objects (obj1 , obj2).

input

Two arrays are give :
    -> arr_val (value array), consists of 3 elements
        -> 1st element : mass of obj 1
        -> 2nd element : mass of obj 2
        -> 3rd element : distance between their centers
    -> arr_unit (unit array), consists of 3 elements
        -> 1st element : unit for mass of obj 1
        -> 2nd element : unit for mass of obj 2
        -> 3rd element : unit for distance between their centers

mass units are :
    -> kilogram (kg)
    -> gram (g)
    -> milligram (mg)
    -> microgram (μg)
    -> pound (lb)

distance units are :
    -> meter (m)
    -> centimeter (cm)
    -> millimeter (mm)
    -> micrometer (μm)
    -> feet (ft)

Note
value of G = 6.67 x 10-11N.kg–2.m2

1ft = 0.3048m

1lb = 0.453592kg

return value must be Newton for force (obviously)

μ copy this from here to use it in your solution
 */

import static java.lang.Math.*;

public class Solution {

    public static double solution(double[] arrVal, String[] arrUnit) {
        double massObj1 = arrVal[0];
        double massObj2 = arrVal[1];
        double distanceBetweenTheirCenters = arrVal[2];

        if (!arrUnit[0].equals("kg")) {
            switch (arrUnit[0]) {
                case "g": {
                    massObj1 *= pow(10, -3);
                } break;
                case "mg": {
                    massObj1 *= pow(10, -6);
                } break;
                case "μg": {
                    massObj1 *= pow(10, -12);
                } break;
                default: {
                    massObj1 *= 0.453592;
                }
            }
        }

        if (!arrUnit[1].equals("kg")) {
            switch (arrUnit[1]) {
                case "g": {
                    massObj2 *= pow(10, -3);
                } break;
                case "mg": {
                    massObj2 *= pow(10, -6);
                } break;
                case "μg": {
                    massObj2 *= pow(10, -12);
                } break;
                default: {
                    massObj2 *= 0.453592;
                }
            }
        }

        if (!arrUnit[2].equals("m")) {
            switch (arrUnit[2]) {
                case "cm": {
                    distanceBetweenTheirCenters *= pow(10, -2);
                } break;
                case "mm": {
                    distanceBetweenTheirCenters *= pow(10, -3);
                } break;
                case "μm": {
                    distanceBetweenTheirCenters *= pow(10, -6);
                } break;
                default: {
                    distanceBetweenTheirCenters *= 0.3048;
                }
            }
        }

        return ((6.67 * pow(10, -11) * massObj1 * massObj2) / pow(distanceBetweenTheirCenters, 2));
    }

}