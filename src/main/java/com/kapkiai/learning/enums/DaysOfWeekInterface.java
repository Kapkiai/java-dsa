package com.kapkiai.learning.enums;

public enum DaysOfWeekInterface implements DayOfWeek {

    /**
    * Quit Verbose
    * Utilize instance variables, methods and constructor to make it less verbose
    */

    MONDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    },
    TUESDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    },
    WEDNESDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    },
    THURSDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    },
    FRIDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    },
    SATURDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    },
    SUNDAY() {
        @Override
        public boolean isWeekend(){
            return false;
        }
    };
}
