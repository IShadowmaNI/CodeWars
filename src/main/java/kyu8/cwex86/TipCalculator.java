package kyu8.cwex86;

/*

        8kyu - Tip Calculator

Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.

You need to consider the following ratings:

Terrible: tip 0%
Poor: tip 5%
Good: tip 10%
Great: tip 15%
Excellent: tip 20%
The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:

"Rating not recognised" in Javascript, Python and Ruby...
...or null in Java
...or -1 in C#
Because you're a nice person, you always round up the tip, regardless of the service.

 */

public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
        switch(rating.toLowerCase()) {
            case "terrible" : return 0;
            case "poor" : return (int)Math.ceil(0.05 * amount);
            case "good" : return (int)Math.ceil(0.1 * amount);
            case "great" : return (int)Math.ceil(0.15 * amount);
            case "excellent" : return (int)Math.ceil(0.2 * amount);
            default: return null;
        }
    }
}
