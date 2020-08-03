package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService {
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
