package com.projetojava.cadastro_usuario.infraestructure.repository;

import com.projetojava.cadastro_usuario.infraestructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


}
