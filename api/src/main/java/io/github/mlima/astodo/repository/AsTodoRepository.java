package io.github.mlima.astodo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.mlima.astodo.model.AsTodo;

public interface AsTodoRepository extends JpaRepository<AsTodo, Long> {
	
}
