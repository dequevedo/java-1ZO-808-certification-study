package org.study.pdfexamples;

public class Question4 {
    public static void main(String... books) {
        int[] crossword [] = new int[10][20];
        for (int i = 0; i < crossword.length; i++) {
            for (int j = 0; j < crossword.length; j++) {
                crossword[i][j] = 'x';
            }
        }
        System.out.println(crossword.length);
    }
}
