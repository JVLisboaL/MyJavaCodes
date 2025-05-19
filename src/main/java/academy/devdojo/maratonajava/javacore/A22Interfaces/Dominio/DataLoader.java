package academy.devdojo.maratonajava.javacore.A22Interfaces.Dominio;

public interface DataLoader {
    public abstract void loadData();
    default void checkPermission(){
        System.out.println("Checando permissões");
    }
}
