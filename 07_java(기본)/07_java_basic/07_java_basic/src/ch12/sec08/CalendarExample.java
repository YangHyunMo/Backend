package ch12.sec08;

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH) + 1;
        int week = now.get(Calendar.DAY_OF_WEEK) + 1;
        String w = null;
        switch (week) {
            case Calendar.SUNDAY: w = "일"; break;
            case Calendar.MONDAY: w = "월"; break;
            case Calendar.TUESDAY: w = "화"; break;
            case Calendar.WEDNESDAY:DAY: w = "수"; break;
            case Calendar.THURSDAY:DAY: w = "목"; break;
            case Calendar.FRIDAY:DAY: w = "금"; break;
            default: w = "토"; break;
        }

        int amPm = now.get(Calendar.AM_PM);
        String ap = null;
        if (amPm == Calendar.AM){
            ap = "오전";
        } else {
            ap = "오후";
        }

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.print(year + "년 ");
        System.out.print(month + "월 ");
        System.out.println(day + "일");
        System.out.print(w + "요일 ");
        System.out.println(ap + " ");
        System.out.print(hour + "시 ");
        System.out.print(minute + "분 ");
        System.out.print(second + "초");
    }
}
