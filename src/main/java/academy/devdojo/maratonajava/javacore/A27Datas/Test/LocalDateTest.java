package academy.devdojo.maratonajava.javacore.A27Datas.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.APRIL.getValue());
        LocalDate date = LocalDate.of(2025, Month.APRIL, 15);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.isLeapYear());
        System.out.println(date.isBefore(LocalDate.now()));
        System.out.println(date.isAfter(LocalDate.now()));
    }
}
