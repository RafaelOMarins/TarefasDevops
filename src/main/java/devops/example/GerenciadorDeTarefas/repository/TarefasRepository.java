package devops.example.GerenciadorDeTarefas.repository;

import devops.example.GerenciadorDeTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository<Tarefa, Long> {
}
