package com.example.atividadeCurriculo.Repository;

import com.example.atividadeCurriculo.Model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}