package com.example.atividadeCurriculo.Repository;

import com.example.atividadeCurriculo.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}