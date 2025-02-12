package br.org.serratec.academia.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.academia.entities.Instrutor;
import br.org.serratec.academia.service.InstrutorService;

@RestController
@RequestMapping("/instrutores")



	
	

	public class InstrutorController {

		@Autowired
		InstrutorService instrutorService;

		@GetMapping
		public ResponseEntity<List<Instrutor>> findAll() {
			return new ResponseEntity<>(instrutorService.findAll(), HttpStatus.OK);
		}

		//@GetMapping("/instrutor-resumido")
		//public ResponseEntity<List<InstrutorResumidoDto>> findAllInstrutorResumido() {
			//return new ResponseEntity<>(instrutorService.findAllInstrutorResumido(), HttpStatus.OK);

		//}

		@GetMapping("/{id}")
		public ResponseEntity<Instrutor> findById(@PathVariable Integer id) {
			Instrutor instrutor = instrutorService.findById(id);

			if (instrutor == null)
				return new ResponseEntity<>(instrutor, HttpStatus.NOT_FOUND);
			else
				return new ResponseEntity<>(instrutor, HttpStatus.OK);

		}
		
		

		@PostMapping
		public ResponseEntity<Instrutor> save(@RequestBody Instrutor instrutor) {
			return new ResponseEntity<>(instrutorService.save(instrutor), HttpStatus.CREATED);

		}

		@PutMapping
		public ResponseEntity<Instrutor> update(@RequestBody Instrutor instrutor) {
			return new ResponseEntity<>(instrutorService.update(instrutor), HttpStatus.OK);

		}

		@DeleteMapping("/{id}")
		public ResponseEntity<Void> delete(@PathVariable Integer id) {
			boolean deletado = instrutorService.delete2(id);
			if (deletado)
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}}

