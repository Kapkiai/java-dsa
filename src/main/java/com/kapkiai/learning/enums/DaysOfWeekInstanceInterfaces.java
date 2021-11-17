package com.kapkiai.learning.enums;

public enum DaysOfWeekInstanceInterfaces implements DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    /**
    * Better as it is less verbose
    * Utilizing instance variables and constructors
    */
    DaysOfWeekInstanceInterfaces(boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    @Override
    public boolean isWeekend(){
        return isWeekend;
    }
}
