package com.izdebski.localdate;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {
    public static void main(String[] args) {

        //getLocalDateDemo1();
        DayOfWeek dayOfWeek = LocalDate.parse("2019-03-01").getDayOfWeek();
        System.out.println(dayOfWeek);

        int dayOfMonth = LocalDate.parse("2019-03-01").getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println();

        LocalDate thisYear = LocalDate.now();
        System.out.println(thisYear.isLeapYear());

        LocalDate previousYear = LocalDate.now().minusYears(1);
        System.out.println(previousYear.isLeapYear());

        boolean before = LocalDate.parse("2018-03-01").isBefore(LocalDate.parse("2019-02-28"));
        System.out.println(before);

        boolean after = LocalDate.parse("2019-03-01").isAfter(LocalDate.parse("2019-02-28"));
        System.out.println(after);
        System.out.println("-------------------------------");

        LocalDateTime atStartOfDay = LocalDate.parse("2019-03-01").atStartOfDay();
        System.out.println(atStartOfDay);

        LocalDate with = LocalDate.parse("2019-03-01").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
    }

        private static void getLocalDateDemo1(){
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        Clock clock = Clock.systemDefaultZone();
        LocalDate localDate2 = LocalDate.now(clock);
        System.out.println(localDate2);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        LocalDate localDate3 = LocalDate.now(zoneId);
        System.out.println(localDate3);

        System.out.println("------------------------");
        LocalDate localDate4 = LocalDate.of(2019, 03, 02);
        System.out.println(localDate4);

        LocalDate localDate5= LocalDate.parse("2019-03-05");

        System.out.println(localDate5);

        LocalDate localDate6 = localDate5.plusDays(2);
        System.out.println(localDate6);

        LocalDate minus = localDate5.minus(2, ChronoUnit.DAYS);
        System.out.println(minus);
    }
}
