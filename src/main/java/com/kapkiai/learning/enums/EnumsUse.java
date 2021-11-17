package com.kapkiai.learning.enums;

import java.util.EnumSet;
import java.util.Set;

public class EnumsUse {

    public static void main(String[] args){

        final Set<DayOfWeekPlain> dayOfWeekPlains = EnumSet.allOf(DayOfWeekPlain.class);
        System.out.println("EnumSet: " + dayOfWeekPlains);

        //Plain Enums
        boolean isWeekend = isWeekend(DayOfWeekPlain.SATURDAY);
        System.out.println("Is weekend? " + isWeekend);

        //Enums with fields
        boolean isWeekendField = isWeekendField(DaysOfTheWeekInstanceField.SUNDAY);
        System.out.println("Is Weekend Field? " + isWeekendField);

        //Enums with interface fields
        boolean isWeekendFieldInterface1 = isWeekendFieldInterface1(DaysOfWeekInterface.FRIDAY);
        System.out.println("Is Weekend Field? " + isWeekendFieldInterface1);

        //Enums with fields
        boolean isWeekendFieldInterface2 = isWeekendFieldInterface2(DaysOfWeekInstanceInterfaces.SATURDAY);
        System.out.println("Is Weekend Field? " + isWeekendFieldInterface2);

        //Interface Declaration
        DayOfWeek dayOfWeek = DaysOfWeekInstanceInterfaces.SATURDAY;
        System.out.println("Interface: " + dayOfWeek.isWeekend());
    }

    /**
    * Plain Enum
    * @param day to check if a day is weekend
    * @return boolean: true is a day is weekend otherwise fals
     * */
    public static boolean isWeekend(DayOfWeekPlain day){
        return day == DayOfWeekPlain.SATURDAY || day == DayOfWeekPlain.SUNDAY;
    }

    /**
     * Demonstrating Enums with Fields
     * @param day to check is a day is weekend
     * @return boolean: true is a day is weekend otherwise false
     */
    public static boolean isWeekendField(DaysOfTheWeekInstanceField day){
        return day.isWeekend();
    }

    /**
     * Demonstrating Enums implementing interfaces
     * @param day to check is a day is weekend
     * @return boolean: true is a day is weekend otherwise false
     */
    public static boolean isWeekendFieldInterface1(DaysOfWeekInterface day){
        return day.isWeekend();
    }

    /**
     * Demonstrating Enums implementing interfaces with Instance Fields
     * @param day to check is a day is weekend
     * @return boolean: true is a day is weekend otherwise false
     */

    public static boolean isWeekendFieldInterface2(DaysOfWeekInstanceInterfaces day){
        return day.isWeekend();
    }


//    public DayOfWeek dayOfWeek = new DayOfWeek() {
//        @Override
//        public boolean isWeekend() {
//            return true;
//        }
//
//    };
//
//    public DayOfWeek getDayOfWeek() {
//        return dayOfWeek;
//    }
//
}
