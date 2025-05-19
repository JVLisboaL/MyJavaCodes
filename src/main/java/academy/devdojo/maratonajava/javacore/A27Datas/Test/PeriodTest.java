package academy.devdojo.maratonajava.javacore.A27Datas.Test;

import java.time.LocalDate;
import java.time.Period;


public class PeriodTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period period = Period.between(now, nowAfterTwoYears);
        System.out.println(period);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        
    }
}
