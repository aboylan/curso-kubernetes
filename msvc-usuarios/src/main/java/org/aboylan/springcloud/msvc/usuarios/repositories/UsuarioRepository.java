package org.aboylan.springcloud.msvc.usuarios.repositories;

import org.aboylan.springcloud.msvc.usuarios.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
