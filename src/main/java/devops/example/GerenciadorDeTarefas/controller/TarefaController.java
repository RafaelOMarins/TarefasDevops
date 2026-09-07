package devops.example.GerenciadorDeTarefas.controller;

import devops.example.GerenciadorDeTarefas.model.Tarefa;
import devops.example.GerenciadorDeTarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);
    }

    @GetMapping ("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return tarefaService.buscarPorId(id);
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id) {
        tarefaService.deletar(id);
    }
}
