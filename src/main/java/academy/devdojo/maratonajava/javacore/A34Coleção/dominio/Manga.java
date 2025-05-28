package academy.devdojo.maratonajava.javacore.A34Coleção.dominio;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manga other = (Manga) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this for < outroManga
        // se this for == a outroManga, retorna 0
        // positivo se o this for > outroManga

        // if (this.id < outroManga.getId()) {
        //     return -1;
        // } else if (this.id.equals(outroManga.getId())) {
        //     return 0;
        // } else {
        //     return 1;
        // }
        return this.nome.compareTo(outroManga.getNome());
        // return Double.compare(this.preco, outroManga.getPreco());
        // return this.id.compareTo(outroManga.getId());
    }
    
}
