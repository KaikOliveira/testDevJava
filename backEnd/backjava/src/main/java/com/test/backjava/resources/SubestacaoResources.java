package com.test.backjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.backjava.models.Subestacao;
import com.test.backjava.repository.CadastroSubes;

@CrossOrigin(origins="http://localhost:3001")
@RestController
@RequestMapping(value="/api")
public class SubestacaoResources {

	
	@Autowired
	CadastroSubes cadastroSubes;
	
	@GetMapping("/cadastros")
	public List<Subestacao> listaSubestacao(){
		return cadastroSubes.findAll();
	}
	
	@GetMapping("/cadastros/{id_subestacao}")
	public List<Subestacao> listaSubestacaoId(@PathVariable(value="id_subestacao") long id_subestacao) {
		return cadastroSubes.findById(id_subestacao);
	}
	
	@PostMapping("/adicionar")
	public Subestacao salvaCadastro(@RequestBody Subestacao subestacao) {
		return cadastroSubes.save(subestacao);
	}
	
	@DeleteMapping("/cadastros")
	public void deleteCadastro(@RequestBody Subestacao subestacao) {
		cadastroSubes.delete(subestacao);
	}
	
	@PutMapping("/cadastros")
	public Subestacao editaCadastro (@RequestBody Subestacao subestacao ) {
		return cadastroSubes.save(subestacao);
	}
	

}
