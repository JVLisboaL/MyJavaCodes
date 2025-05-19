package academy.devdojo.maratonajava.javacore.A27Datas.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = now.plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = timeNow.minusHours(7);
        Duration duration = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(timeNow, timeMinus7Hours);
        System.out.println(duration.toDays());
        System.out.println(duration2.toHours());
    }
}
