package org.study.udemyexamples;

// Testando precedencia dos sinais + e - combinados com ++ e --
public class Question13 {
    public static void main(String [] args) {
        int a = 100;
        System.out.println(-a++);

        int b = 100;
        System.out.println(-++b);

        int c = 100;
        System.out.println(- --c);
    }
}
