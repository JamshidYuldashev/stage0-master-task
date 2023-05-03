package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String num = String.valueOf(number);
        int num1 = Integer.parseInt(num.substring(0, 1));
        int num2 = Integer.parseInt(num.substring(1, 2));
        int num3 = Integer.parseInt(num.substring(2, 3));
        int num4 = Integer.parseInt(num.substring(3, 4));
        System.out.println("Sum = " + (num1+num2+num3+num4));
    }

}
