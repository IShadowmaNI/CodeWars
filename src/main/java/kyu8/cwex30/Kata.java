package kyu8.cwex30;

/*

Bob needs a fast way to calculate the volume of a cuboid with three values: length, width and the height of the cuboid.
    Write a function to help Bob with this calculation.

 */

public class Kata {

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {

        if (length < 0 || width < 0 || height < 0) {
            throw new IllegalArgumentException("Please give valid values for the cuboid!");
        }

        return length * width * height;
    }
}
