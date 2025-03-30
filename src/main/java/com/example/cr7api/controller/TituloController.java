package com.example.cr7api.controller;

import com.example.cr7api.model.Titulo;
import com.example.cr7api.repository.TituloRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titulos")
public class TituloController {

    private final TituloRepository repo;

    public TituloController(TituloRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Titulo> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Titulo> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Titulo create(@RequestBody Titulo titulo) {
        return repo.save(titulo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Titulo> update(@PathVariable Long id, @RequestBody Titulo updated) {
        return repo.findById(id).map(existing -> {
            existing.setNombre(updated.getNombre());
            existing.setAño(updated.getAño());
            existing.setClub(updated.getClub());
            return ResponseEntity.ok(repo.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (repo.findById(id).isPresent()) {
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
