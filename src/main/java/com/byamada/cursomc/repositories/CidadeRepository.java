package com.byamada.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byamada.cursomc.domain.Categoria;
import com.byamada.cursomc.domain.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
