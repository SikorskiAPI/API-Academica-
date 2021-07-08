package com.apiprova.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiprova.domain.Cotacao_milho_2021;
import com.apiprova.repository.Cotacao_milho_2021Repository;;

@RestController
@RequestMapping("/v1/cotacao_milho_2021")
public class Cotacao_milho_2021Resource {
	
	@Autowired
	private Cotacao_milho_2021Repository repository;
	
	@GetMapping()
	public ResponseEntity<Object> listCotacao_milho_2021(){
		return ResponseEntity.
				status(HttpStatus.OK).
				body( repository.findAll());
		
	}
	
	@PostMapping()
	public void salvarCotacao_soja_2021(@RequestBody Cotacao_milho_2021 cm){

		repository.save(cm);
	
	}
	
	@PutMapping()
	public void atualizarCotacao_milho_2021() {
	}

	@DeleteMapping()
	public void excluirCotacao_milho_2021() {
    } 
}