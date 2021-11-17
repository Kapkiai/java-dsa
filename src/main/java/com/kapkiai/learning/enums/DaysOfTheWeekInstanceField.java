package com.kapkiai.learning.enums;

public enum DaysOfTheWeekInstanceField {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    /**
    * Using enums with instance fields
    * Enums are extensible hence instance fields, methods and constructors are allowed
    * limitations: Enums do not support default no-args constructors
    * Note: All constructors must be private
    *
    * @author Mathew Kapkiai
    */

    //modifier omitted for brevity as by default enums constructors are private

    DaysOfTheWeekInstanceField(boolean bool){
        this.isWeekend = bool;
    }

    public boolean isWeekend(){
        return isWeekend;
    }

}
