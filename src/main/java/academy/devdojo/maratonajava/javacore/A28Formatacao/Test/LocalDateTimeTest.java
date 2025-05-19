package academy.devdojo.maratonajava.javacore.A28Formatacao.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate Date = LocalDate.parse("2025-04-15");
        LocalTime Time = LocalTime.of(9, 45, 21);
        System.out.println(localDateTime);
        System.out.println(Date);
        System.out.println(Time);
        LocalDateTime ldt1 = Date.atTime(Time);
        LocalDateTime ldt2 = Time.atDate(Date);
        System.out.println(ldt1);
        System.out.println(ldt2);
    }   
}
    