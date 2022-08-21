package Mentoring._100622;

//        The Java class called Holiday is started below. An object of class Holiday represents a
//        holiday during the year. This class has three instance variables:
//        ● name, which is a String representing the name of the holiday
//        ● day, which is an int representing the day of the month of the holiday
//        ● month, which is a String representing the month the holiday is in
//
//        a) Write a constructor for the class Holiday, which takes a String representing the name, an
//        int representing the day, and a String representing the month as its arguments, and sets the
//        class variables to these values.
//
//        b) Write a method inSameMonth, which compares two instances of the class Holiday,and
//        returns the Boolean value true if they have the same month, and false if they do not.
//
//        c) Write a method avgDatewhich takes an array of base type Holiday as its argument, and
//        returns a double that is the average of the dayvariables in the Holiday instances in the
//        array. You may assume that the array is full (i.e. does not have any null entries).
//
//        d) Write a piece of code that creates a Holidayinstance with the name “Cumhuriyet Bayrami”,
//        with the day “29”, and with the month “Ekim”.

import java.util.ArrayList;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2) {

        if (holiday1.month.equalsIgnoreCase(holiday2.month)) {
            return true;
        } else {
            return false;
        }

    }

//    public static double avgDatewhich(ArrayList<Holiday> list){
//
//    }
}
