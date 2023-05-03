package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String cur = "1";
        int space = cathetusLength;
        for (int i = 1; i<=cathetusLength; i++){
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            System.out.print(cur);
            cur = (i+1) + cur + (i+1);
            space--;
            if (i != cathetusLength) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
