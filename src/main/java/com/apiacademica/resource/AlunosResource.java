package com.apiacademica.resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/alunos")
public class AlunosResource {
	
	@GetMapping()
	public String listAlunoResource() { 
		return "Pedro";
		
	}
	
	@PostMapping()
	public void salvarAlunoResource(){
	}
	
	@PutMapping()
	public void atualizarAlunoResource() {
	}

	@DeleteMapping()
	public void excluirAlunoResource() {
    } 
}