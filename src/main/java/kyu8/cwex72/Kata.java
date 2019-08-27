package kyu8.cwex72;

/*

Write a function that returns the total surface area and volume of a box as an array: [area, volume]

 */

public class Kata {

    public int[] getSize(int w,int h,int d) {

        int[] solution = new int[2];

        solution[0] = 2 * (w * h + h * d + w * d);
        solution[1] = w * h * d;

        return solution;
    }
}
