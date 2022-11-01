package br.ifba.gincana.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.ifba.gincana.backend.model.ProvaModel;
import br.ifba.gincana.backend.repository.ProvaRepository;

@RestController
@RequestMapping("/provas")
public class ProvaController {
	
	@Autowired
	private ProvaRepository repository;
	
	@GetMapping("/listall")
	public List<ProvaModel> listall() {
		List<ProvaModel> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
    public ProvaModel findById(@PathVariable Long id) {
		Optional<ProvaModel> obj = repository.findById(id);
		if ( obj.isPresent() )
			return obj.get();
        return null;
    }
	
	@PostMapping
	public ProvaModel insert (@RequestBody ProvaModel prova) {
		ProvaModel result = repository.save(prova);
		return result;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ProvaModel> delete(@PathVariable Long id) {
		repository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProvaModel> update(@PathVariable Long id, @RequestBody ProvaModel provaModel) {
		var p = repository.findById(id);
        if (p.isPresent()) {
            var prova = p.get();
            
            if (provaModel.getNomeProva() != null)
            	prova.setNomeProva(provaModel.getNomeProva());
            
            if (provaModel.getDescricaoProva() != null)
            	prova.setDescricaoProva(provaModel.getDescricaoProva());
            
            if (provaModel.getDataProva() != null)
            	prova.setDataProva(provaModel.getDataProva());
            
            if (provaModel.getHorarioProva() != null )
            	prova.setHorarioProva(provaModel.getHorarioProva());
            
            repository.save(prova);
            return ResponseEntity.ok(prova);
        } else {
        	return ResponseEntity.notFound().build();
        }
	}
}
