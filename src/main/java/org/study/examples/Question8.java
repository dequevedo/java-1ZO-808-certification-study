package org.study.examples;

import java.time.LocalDateTime;

public class Question8 {
    public static void main(String... args) {
        StringBuilder builder = new StringBuilder("Leaves growing");
        do {
            builder.delete(0, 5);
        } while (builder.length() > 5);
        System.out.println(builder);
    }
}
