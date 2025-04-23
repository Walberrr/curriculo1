package com.example.atividadeCurriculo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.model.Model;

@Repository
public interface IRepository extends JpaRepository<Model, Long> {
}