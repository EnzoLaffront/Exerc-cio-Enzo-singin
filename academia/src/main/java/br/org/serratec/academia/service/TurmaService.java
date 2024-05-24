package br.org.serratec.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.Turma;
import br.org.serratec.academia.repository.TurmaRepository;

@Service

public class TurmaService {

	@Autowired
	TurmaRepository turmaRepository;
	
	public List<Turma> findAll() {
		return turmaRepository.findAll();
		
	}
	
	
		
		
		
		//return turmaRepository.findAll();
		
	
	

	
	public Turma findById(Integer id) {
		//return turmaRepository.findById(id).orElse(null);
		
		
		
		return turmaRepository.findById(id).get();
	}
	
	public Turma findByIdResumido2(Integer id) {
		return turmaRepository.findById(id).get();
	}
	
	
		
		//if(turma != null)
		//try {
			
			
			
		//}catch(IllegalArgumentException e) {
			//throw new IllegalArgumentException("Ocorreu uma exceção: "+ e);
		//}
		
		
		
	
	
	
	
	public Turma save (Turma turma) {
		return turmaRepository.save(turma);
		
	}
	
	public Turma update (Turma turma) {
		return turmaRepository.save(turma);
		
	}
	
	//public void delete(Turma turma) {
	 //turmaRepository.delete(turma);
//}
	
	
	public long count() {
		return turmaRepository.count();
	}
	
	public boolean delete2 (Integer id) {
		if(turmaRepository.existsById(id)) {
			turmaRepository.deleteById(id);
			Turma turmaDeletado = turmaRepository.findById(id).orElse(null);
			if (turmaDeletado == null) {
				return true;
			} else {
				return false;
			}}
			else {
				return false;
			}
			
	
	
	
	
	}}
	

