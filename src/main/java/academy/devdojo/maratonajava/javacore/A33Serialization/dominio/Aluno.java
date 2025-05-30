package academy.devdojo.maratonajava.javacore.A33Serialization.dominio;

import java.io.Serializable;
import java.io.Serial;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo viradão no jiraya";
    private transient Turma turma;
    // colocar private transient para que a senha não serialize por ser conteudo sensivel
    
    public Aluno(Long id, String nome, String password, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.password = password;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" + 
                "id=" + id + 
                ", nome=" + nome + '\'' +
                ", password=" + password + '\'' +
                ", NOME_ESCOLA=" + NOME_ESCOLA + '\'' +
                ", turma=" + turma + '\'' +
                "}";
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
