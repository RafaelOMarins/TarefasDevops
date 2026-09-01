package devops.example.GerenciadorDeTarefas.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;


@Entity
@Table(name = "usuario")


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Nullable
    private String nome;

    @Nullable
    private String senha;

    @Nullable
    private String email;


    public Long getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

}
