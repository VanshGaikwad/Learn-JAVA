package com.ok.java.datatypes;

public class switch_statement
{
    public static void main(String[] args) {
        int day = 3;
        String dayname;

        switch( day ){
            case 1:
                dayname ="MONDAY";
                break;
            case 2:
                dayname ="TUESDAY";
                break;
            case 3:
                dayname ="WEDNESDAY";
                break;
            case 4:
                dayname ="THURSDAY";
                break;
            case 5:
                dayname ="FRIDAY";
                break;
            case 6:
                dayname ="SATURDAY";
                break;
            case 7:
                dayname ="SUNDAY";
                break;
            default:
                dayname="INVALID";

        }
        System.out.println(dayname);
    }
}
