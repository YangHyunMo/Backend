package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat d = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String d1 = d.format(now);
        System.out.println(d1);
    }
}
