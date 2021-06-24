package AlunosResource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;;

@RequestMapping("/AlunosResource")
public class AlunosResource {
	
	@GetMapping()
	public void listAlunoResource() {
		
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