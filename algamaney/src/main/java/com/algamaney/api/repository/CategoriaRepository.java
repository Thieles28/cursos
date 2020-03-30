package com.algamaney.api.repository;

import com.algamaney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByCodigo(Long codigo);
}
