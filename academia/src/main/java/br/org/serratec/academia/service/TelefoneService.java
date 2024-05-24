package br.org.serratec.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.Telefone;
import br.org.serratec.academia.repository.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	TelefoneRepository telefoneRepository;
	
	public List<Telefone> findAll() {
		return telefoneRepository.findAll();
		
	}
	
	
		
		
		
		//return telefoneRepository.findAll();
		
	
	

	
	public Telefone findById(Integer id) {
		//return telefoneRepository.findById(id).orElse(null);
		
		
		
		return telefoneRepository.findById(id).get();
	}
	
	public Telefone findByIdResumido2(Integer id) {
		return telefoneRepository.findById(id).get();
	}
	
	
		
		//if(telefone != null)
		//try {
			
			
			
		//}catch(IllegalArgumentException e) {
			//throw new IllegalArgumentException("Ocorreu uma exceção: "+ e);
		//}
		
		
		
	
	
	
	
	public Telefone save (Telefone telefone) {
		return telefoneRepository.save(telefone);
		
	}
	
	public Telefone update (Telefone telefone) {
		return telefoneRepository.save(telefone);
		
	}
	
	//public void delete(Telefone telefone) {
	 //telefoneRepository.delete(telefone);
//}
	
	
	public long count() {
		return telefoneRepository.count();
	}
	
	public boolean delete2 (Integer id) {
		if(telefoneRepository.existsById(id)) {
			telefoneRepository.deleteById(id);
			Telefone telefoneDeletado = telefoneRepository.findById(id).orElse(null);
			if (telefoneDeletado == null) {
				return true;
			} else {
				return false;
			}}
			else {
				return false;
			}
			
	
	
	
	
	}}


