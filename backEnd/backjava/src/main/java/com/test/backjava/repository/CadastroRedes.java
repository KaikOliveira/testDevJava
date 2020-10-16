package com.test.backjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.backjava.models.RedeMt;


public interface CadastroRedes extends JpaRepository<RedeMt, Long>{

	List<RedeMt> findById(long id_rede_mt);
}
