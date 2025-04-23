package com.example.atividadeCurriculo.Controller;

import com.example.atividadeCurriculo.Model.Curriculo;
import com.example.atividadeCurriculo.Service.CurriculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoService curriculoService;

    @GetMapping("/listar")
    public List<Curriculo> listarTodos() {
        return curriculoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> buscarPorId(@PathVariable Long id) {
        Optional<Curriculo> curriculo = curriculoService.buscarPorId(id);
        return curriculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/salvar")
    public Curriculo salvar(@RequestBody Curriculo curriculo) {
        return curriculoService.salvar(curriculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        curriculoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}