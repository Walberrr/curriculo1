package com.example.atividadeCurriculo.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL)
    private List<Experiencia> experiencias;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL)
    private List<Educacao> educacoes;

    @OneToMany(mappedBy = "curriculo", cascade = CascadeType.ALL)
    private List<Habilidade> habilidades;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    public List<Educacao> getEducacoes() {
        return educacoes;
    }

    public void setEducacoes(List<Educacao> educacoes) {
        this.educacoes = educacoes;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }
}