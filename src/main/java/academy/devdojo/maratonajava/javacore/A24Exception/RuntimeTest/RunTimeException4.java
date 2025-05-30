package academy.devdojo.maratonajava.javacore.A24Exception.RuntimeTest;

import java.io.IOException;
import java.sql.SQLException;

public class RunTimeException4 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (Exception e) {
             e.printStackTrace();
        }   
    }
        private static void talvezLanceException() throws SQLException, IOException {
    
    }
}
