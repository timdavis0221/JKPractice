package com.jk.parking;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        java8();
        java();
    }

    private static void java8() {
        // Time with Zone
        Instant instant = Instant.now();
        System.out.println(instant);
        // Time in Local
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);
        // new Date Formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(localDateTimeNow));
        System.out.println(localDateTimeNow.plus(Duration.ofHours(3)));
        // useful method
        LocalDateTime otherTime = LocalDateTime.of(2019, 04, 22, 8, 00, 0);
        System.out.println(otherTime);
    }

    // old class provided before java 8
    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));

        String dateStr = "2019/04/22 23:00:00";
        try {
            Date parsedDate = sdf.parse(dateStr);
            System.out.println(parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }
}
