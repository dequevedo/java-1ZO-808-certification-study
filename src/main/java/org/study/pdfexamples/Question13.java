package org.study.pdfexamples;

public class Question13 {
    static int[][] game;

    public static void main(String args[]) {
        game[3][3] = 6; //NullPointer here
        Object[] obj = game;
        obj[3] = 'X';
        System.out.println(game[3][3]);
    }
}
