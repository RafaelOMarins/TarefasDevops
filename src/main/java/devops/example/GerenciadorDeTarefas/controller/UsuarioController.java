package devops.example.GerenciadorDeTarefas.controller;

import devops.example.GerenciadorDeTarefas.model.Usuario;
import devops.example.GerenciadorDeTarefas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario) {
      return usuarioService.salvar(usuario);
    }

    @GetMapping ("/{id}")
    public Usuario buscarId(@PathVariable Long id) {
        return usuarioService.buscarId(id);
    }

    @DeleteMapping ("/{id}")
    public void deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
    }


}
