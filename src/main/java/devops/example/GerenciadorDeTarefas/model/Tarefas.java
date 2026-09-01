package devops.example.GerenciadorDeTarefas.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tarefas")
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String descricao;

    private String categoria;

    private String status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario tarefas;

    public Usuario getTarefas() {
        return tarefas;
    }

    public void setTarefas() {
        this.tarefas = tarefas;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao() {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }
}
