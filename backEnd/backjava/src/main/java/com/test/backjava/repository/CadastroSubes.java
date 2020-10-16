package com.test.backjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.backjava.models.Subestacao;

public interface CadastroSubes extends JpaRepository<Subestacao, Long> {
		
	
	List<Subestacao> findById(long id_subestacao);

	
}
