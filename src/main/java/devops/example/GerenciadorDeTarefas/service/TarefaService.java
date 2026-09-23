package devops.example.GerenciadorDeTarefas.service;

import devops.example.GerenciadorDeTarefas.model.Tarefa;
import devops.example.GerenciadorDeTarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    TarefasRepository tarefasRepository;

    public Tarefa salvar(Tarefa tarefa) {
        return tarefasRepository.save(tarefa);
    }

    public Tarefa buscarPorId(Long id) {
        return tarefasRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada!"));
    }

    public void deletar(Long id) {
        tarefasRepository.deleteById(id);
    }
}
