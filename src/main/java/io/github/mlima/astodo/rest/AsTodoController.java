package io.github.mlima.astodo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.mlima.astodo.model.AsTodo;
import io.github.mlima.astodo.repository.AsTodoRepository;

@RestController
@RequestMapping("/api/astodos")
public class AsTodoController {
	
	@Autowired
	private AsTodoRepository repository;
	
	@PostMapping
	public AsTodo save(@RequestBody AsTodo asTodo) {
		return repository.save(asTodo);
	}
	
	@GetMapping("{id}")
	public AsTodo getById(@PathVariable Long id) {
		return repository
				.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	

}
