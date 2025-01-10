package org.example;

public class fizYbuz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fiz Y buz");
            } else if (i % 3 == 0) {
                System.out.println("fiz");
            } else if (i % 5 == 0) {
                System.out.println("buz");
            } else {
                System.out.println(i);
            }
        }

    }

}
