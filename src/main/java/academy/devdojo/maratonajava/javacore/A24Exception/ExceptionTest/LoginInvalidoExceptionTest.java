package academy.devdojo.maratonajava.javacore.A24Exception.ExceptionTest;

import java.util.Scanner;
import academy.devdojo.maratonajava.javacore.A24Exception.Dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usuarioDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();
        if (!usuarioDB.equals(usuarioDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Login realizado com sucesso");
    }
}