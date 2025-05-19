package academy.devdojo.maratonajava.javacore.A27Datas.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2025, Month.JANUARY, 1, 10, 10, 10);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(date, now));
        System.out.println(ChronoUnit.MONTHS.between(date, now));
        System.out.println(ChronoUnit.YEARS.between(date, now));
    }
}