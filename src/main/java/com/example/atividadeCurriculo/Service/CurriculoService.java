package com.example.atividadeCurriculo.Service;

import com.example.atividadeCurriculo.Model.Curriculo;
import com.example.atividadeCurriculo.Repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    public List<Curriculo> listarTodos() {
        return curriculoRepository.findAll();
    }

    public Optional<Curriculo> buscarPorId(Long id) {
        return curriculoRepository.findById(id);
    }

    public Curriculo salvar(Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    public void deletar(Long id) {
        curriculoRepository.deleteById(id);
    }
}