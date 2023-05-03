package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        // a + b + c = 180;
        // where a, b and c are 3 angles of a Triangle.
        // Note: Also not that if any of the angle is 0, then those 3 angles can't form a Triangle,
        // so it's invalid Triangle.

        double sumOfSides = firstSide + secondSide + thirdSide;
        if ((int) sumOfSides == 180) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }
}
