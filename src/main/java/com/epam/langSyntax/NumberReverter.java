package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String str = String.valueOf(number);
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        number = Integer.parseInt(builder.toString());
        System.out.println(number);
    }
}
