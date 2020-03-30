package com.algamaney.api.repository;

import com.algamaney.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    List<Pessoa> findByCodigo(Integer codigo);
}
