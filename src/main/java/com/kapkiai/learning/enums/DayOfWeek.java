package com.kapkiai.learning.enums;

public interface DayOfWeek {
    boolean isWeekend();


    enum DAYS {
        MONDAY(1, true),
        TUE(2, true),
        SAT(6, false);

        private int code;
        private boolean isWeekday;

        private DAYS(final int code, final boolean isWeekday){
            this.code = code;
            this.isWeekday = isWeekday;
        }


    }

}
