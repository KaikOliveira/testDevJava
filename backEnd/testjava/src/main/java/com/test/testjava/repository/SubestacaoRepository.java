package com.test.testjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.test.testjava.models.Subestacao;

public interface SubestacaoRepository extends JpaRepository<Subestacao, Long>  {

	
	List<Subestacao> findById(long ID_SUBESTACAO);
}
