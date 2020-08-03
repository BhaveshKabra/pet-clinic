package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Vet;
import org.springframework.stereotype.Service;

@Service
public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
