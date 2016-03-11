package com.brainacad.oop.testenum2_12_1;

/**
 * Created by m18 on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        // task for Lab 2.12.1:
        for (MyDayOfWeek dayOfWeek : MyDayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }

        // task for Lab 2.12.2:
        System.out.println();
        System.out.println("task for Lab 2.12.2:");
        for (MyDayOfWeek dayOfWeek : MyDayOfWeek.values()) {
            switch (dayOfWeek) {
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java day: "+dayOfWeek);
            }
        }
    }
}
