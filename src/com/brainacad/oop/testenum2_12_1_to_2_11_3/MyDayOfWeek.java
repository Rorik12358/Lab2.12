package com.brainacad.oop.testenum2_12_1_to_2_11_3;

/**
 * Created by m18 on 11.03.2016.
 */
public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    // Lab2.12.3:
    public MyDayOfWeek nextDay(){
        int index = this.ordinal();
        if(index != MyDayOfWeek.values().length-1) {
            return MyDayOfWeek.values()[index + 1];
        }
        else return SUNDAY;
    }
}
