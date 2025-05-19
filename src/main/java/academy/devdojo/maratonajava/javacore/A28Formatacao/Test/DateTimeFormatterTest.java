package academy.devdojo.maratonajava.javacore.A28Formatacao.Test;

import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        LocalDate parse1 = LocalDate.parse("20150205", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);
        LocalDate parse2 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        System.out.println(parse2);
        LocalDate parse3 = LocalDate.parse("2015-02-05+05:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(parse3);
        
    }
}