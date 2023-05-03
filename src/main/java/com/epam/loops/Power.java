package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int powerOfNum = numberToPrint;
        for (int i =1; i<power; i++){
            powerOfNum *= numberToPrint;
        }
        System.out.println(powerOfNum);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
