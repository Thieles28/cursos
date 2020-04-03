package com.algamaney.api.repository.lancamento;

import com.algamaney.api.model.Lancamento;
import com.algamaney.api.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

     List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
