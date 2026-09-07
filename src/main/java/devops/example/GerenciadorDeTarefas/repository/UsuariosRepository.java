package devops.example.GerenciadorDeTarefas.repository;

import devops.example.GerenciadorDeTarefas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
}
