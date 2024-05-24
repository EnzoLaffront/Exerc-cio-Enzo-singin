package br.org.serratec.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.Instrutor;
import br.org.serratec.academia.repository.InstrutorRepository;



@Service

public class InstrutorService {
	
	@Autowired
	InstrutorRepository instrutorRepository;
	
	public List<Instrutor> findAll() {
		return instrutorRepository.findAll();
		
	}
	
	
		
		
		
		//return instrutorRepository.findAll();
		
	
	

	
	public Instrutor findById(Integer id) {
		//return instrutorRepository.findById(id).orElse(null);
		
		
		
		return instrutorRepository.findById(id).get();
	}
	
	public Instrutor findByIdResumido2(Integer id) {
		return instrutorRepository.findById(id).get();
	}
	
	
		
		//if(instrutor != null)
		//try {
			
			
			
		//}catch(IllegalArgumentException e) {
			//throw new IllegalArgumentException("Ocorreu uma exceção: "+ e);
		//}
		
		
		
	
	
	
	
	public Instrutor save (Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
		
	}
	
	public Instrutor update (Instrutor instrutor) {
		return instrutorRepository.save(instrutor);
		
	}
	
	//public void delete(Instrutor instrutor) {
	 //instrutorRepository.delete(instrutor);
//}
	
	
	public long count() {
		return instrutorRepository.count();
	}
	
	public boolean delete2 (Integer id) {
		if(instrutorRepository.existsById(id)) {
			instrutorRepository.deleteById(id);
			Instrutor instrutorDeletado = instrutorRepository.findById(id).orElse(null);
			if (instrutorDeletado == null) {
				return true;
			} else {
				return false;
			}}
			else {
				return false;
			}
			
	
	
	
	
	}}
	
	


