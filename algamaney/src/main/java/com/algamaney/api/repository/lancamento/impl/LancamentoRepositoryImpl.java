package com.algamaney.api.repository.lancamento.impl;

import com.algamaney.api.model.Lancamento;
import com.algamaney.api.model.Lancamento_;
import com.algamaney.api.repository.filter.LancamentoFilter;
import com.algamaney.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LancamentoRepositoryImpl implements LancamentoRepositoryQuery {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Lancamento> criteria = builder.createQuery(Lancamento.class);
        Root<Lancamento> root = criteria.from(Lancamento.class);

        // criar as restrições
        Predicate[] predicates = criarRestricoes(lancamentoFilter, builder, root);
        criteria.where(predicates);

        TypedQuery<Lancamento> query = manager.createQuery(criteria);
        return query.getResultList();
    }

    private Predicate[] criarRestricoes(LancamentoFilter lancamentoFilter, CriteriaBuilder builder, Root<Lancamento> root) {
        List<Predicate> predicates = new ArrayList<>();
        if(!StringUtils.isEmpty(lancamentoFilter.getDescricao())) {
            predicates.add(builder.like(
               builder.lower(root.get(Lancamento_.descricao)), "%" + lancamentoFilter.getDescricao().toLowerCase() + "%"
            ));
        }

        if(lancamentoFilter.getDataVencimentoDe() != null) {
           predicates.add(
                   builder.greaterThanOrEqualTo(root.get(Lancamento_.dataVencimento), lancamentoFilter.getDataVencimentoDe())
           );
        }

        if(lancamentoFilter.getDataVencimentoAte() != null) {
            predicates.add(
              builder.lessThanOrEqualTo(root.get(Lancamento_.dataVencimento), lancamentoFilter.getDataVencimentoAte())
            );
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

}
