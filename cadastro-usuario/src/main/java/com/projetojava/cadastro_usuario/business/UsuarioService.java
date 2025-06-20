package com.projetojava.cadastro_usuario.business;


import com.projetojava.cadastro_usuario.infraestructure.entitys.Usuario;
import com.projetojava.cadastro_usuario.infraestructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public  void salvarUsuario(Usuario usuario){
        
    }
}
