package org.study.udemyexamples;

import java.io.FileNotFoundException;
import java.io.IOException;

//public class Question8 {
//    public static void main(String[] args) {
//        Super s = new Sub();
//        try {
//            s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.print("M");
//        } finally {
//            System.out.print("N");
//        }
//    }
//}

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
