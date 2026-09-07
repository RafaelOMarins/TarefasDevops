package devops.example.GerenciadorDeTarefas.service;

import devops.example.GerenciadorDeTarefas.model.Usuario;
import devops.example.GerenciadorDeTarefas.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuariosRepository usuariosRepository;

    /* criar logar, registrar, tentar usar o local */

    public Usuario buscarId(Long id) {
        return usuariosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id não encontrado!"));
    }

    public Usuario salvar(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    public void deletar(Long id) {
        usuariosRepository.deleteById(id);
    }
}
