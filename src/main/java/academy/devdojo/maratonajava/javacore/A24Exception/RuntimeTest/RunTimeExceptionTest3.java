package academy.devdojo.maratonajava.javacore.A24Exception.RuntimeTest;

public class RunTimeExceptionTest3 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado no SO");
        }
        return null;
    }
}
