package academy.devdojo.maratonajava.javacore.A28Formatacao.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
       Locale localeBR = new Locale("pt", "BR");
       Locale localeJP = new Locale("ja", "JP");
       Locale localeIT = new Locale("it", "IT");
       NumberFormat[] nfa = new NumberFormat[4];
       nfa[0] = NumberFormat.getCurrencyInstance();
       nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
       nfa[2] = NumberFormat.getCurrencyInstance(localeBR);
       nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
       double value = 10_000.9414;
       for(NumberFormat nf : nfa){
        System.out.println(nf.getCurrency().getDisplayName() + ": " + nf.format(value));
        }   
    }
}