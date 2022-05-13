package com.in28Minutes.conditionals.switchexercise;

public class SwitchExercise {
    public boolean isWeekDay(int dayNum) {
        if (dayNum >= 0 && dayNum <= 6) {
            return true;
        }
        return false;
    }

    public String determineNameOfMonth(int monthNum) {
        String month;
        switch (monthNum) {

            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "Novemeber";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Enter a valid input";
        }
        return month;
    }

    public String determineNameOfDay(int dayNum) {
        String day;
        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Enter a valid day";
        }

        return day;
    }
}
