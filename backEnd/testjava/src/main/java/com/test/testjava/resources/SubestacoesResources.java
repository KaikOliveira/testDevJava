package com.test.testjava.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testjava.repository.SubestacaoRepository;

@RestController
@RequestMapping(value="/sub")
public class SubestacoesResources {
	
	@Autowired
	SubestacaoRepository subestacaoRepository;
	
	
}
