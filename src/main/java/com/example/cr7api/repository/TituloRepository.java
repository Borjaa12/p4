package com.example.cr7api.repository;

import com.example.cr7api.model.Titulo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TituloRepository {

    private Map<Long, Titulo> titulos = new HashMap<>();
    private Long currentId = 1L;

    public List<Titulo> findAll() {
        return new ArrayList<>(titulos.values());
    }

    public Optional<Titulo> findById(Long id) {
        return Optional.ofNullable(titulos.get(id));
    }

    public Titulo save(Titulo titulo) {
        if (titulo.getId() == null) {
            titulo.setId(currentId++);
        }
        titulos.put(titulo.getId(), titulo);
        return titulo;
    }

    public void deleteById(Long id) {
        titulos.remove(id);
    }
}
