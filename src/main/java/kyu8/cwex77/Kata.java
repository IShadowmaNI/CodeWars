package kyu8.cwex77;

/*

    8kyu - Expressions Matter

Task
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets:
    +, *, ().

Consider an Example :
With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.

Notes
The numbers are always positive.
The numbers are in the range (1  ≤  a, b, c  ≤  10).
You can use the same operation more than once.
It's not necessary to place all the signs and brackets.
Repetition in numbers may occur .
You cannot swap the operands. For instance, in the given example you cannot get expression (1 + 3) * 2 = 8.

Input >> Output Examples:
expressionsMatter(1,2,3)  ==>  return 9
Explanation:
After placing signs and brackets, the Maximum value obtained from the expression (1+2) * 3 = 9.

expressionsMatter(1,1,1)  ==>  return 3
Explanation:
After placing signs, the Maximum value obtained from the expression is 1 + 1 + 1 = 3.

expressionsMatter(9,1,1)  ==>  return 18
Explanation:
After placing signs and brackets, the Maximum value obtained from the expression is 9 * (1+1) = 18.

 */

public class Kata {

    public static int expressionsMatter(int a, int b, int c)
    {
        if (a < 1 || a > 10 || b < 1 || b > 10 || c < 1 || c > 10) {
            throw new IllegalArgumentException("Please give a value within range: 1<= a,b,c <=10.");
        }

        int maximumValue = 0;

        if (a == 1 && c == 1) {
            maximumValue = a + b + c;
        } else if (a == 1) {
            maximumValue = (a + b) * c;
        } else if (b == 1) {
            if (a > c) {
                maximumValue = a * (b + c);
            } else {
                maximumValue = c * (b + a);
            }
        } else if (c == 1) {
            maximumValue = a * (b + c);
        } else {
            maximumValue = a * b * c;
        }

        return maximumValue;
    }
}
