package com.ricardofarias.microtabela.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardofarias.microtabela.model.TabelaModel;

public interface TabelaRepository extends JpaRepository<TabelaModel, Long> {

}
