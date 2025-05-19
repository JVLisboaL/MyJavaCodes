package academy.devdojo.maratonajava.javacore.A28Formatacao.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15, 30, 20);
        LocalTime time2 = LocalTime.now();
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(ChronoField.CLOCK_HOUR_OF_AMPM.getFrom(time));

    }
}
