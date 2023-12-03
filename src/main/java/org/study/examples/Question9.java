package org.study.examples;

public class Question9 {
    public static void main(String[] edges) {
        final String ceiling = "up";
        String floor = new String("up");
        final String wall = new String(floor);
        System.out.print((ceiling==wall)
                + " " + (floor==wall)
                + " " + ceiling.equals(wall));
    }
}
