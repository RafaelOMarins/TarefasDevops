package devops.example.GerenciadorDeTarefas.repository;

import devops.example.GerenciadorDeTarefas.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
}
