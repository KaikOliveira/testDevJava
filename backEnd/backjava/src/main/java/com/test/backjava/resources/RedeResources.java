package com.test.backjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.backjava.models.RedeMt;
import com.test.backjava.repository.CadastroRedes;



@RestController
@RequestMapping(value="/apirede")
public class RedeResources {

	
	@Autowired
	CadastroRedes cadastroRedes;
	
	@GetMapping("/redes")
	public List<RedeMt> listaRedes(){
		return cadastroRedes.findAll();
	}
	
	@GetMapping("/redes/{id_rede_mt}")
	public List<RedeMt> listaRedesId(@PathVariable(value="id_rede_mt")long id_rede_mt){
		return cadastroRedes.findById(id_rede_mt);
	}
	
	@PostMapping("/add")
	public RedeMt salvarRede(@RequestBody RedeMt redeMt) {
		return cadastroRedes.save(redeMt);
	}
	
	@DeleteMapping("/redes")
	public void deleteRede(@RequestBody RedeMt redeMt) {
		cadastroRedes.delete(redeMt);
	}
	
	@PutMapping("/redes")
	public RedeMt editaRede(@RequestBody RedeMt redeMt) {
		return cadastroRedes.save(redeMt);
	}
}
