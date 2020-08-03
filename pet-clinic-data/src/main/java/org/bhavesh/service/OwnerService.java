package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService 
{
	Owner findById(Long id);
	
	Owner save();
	
	Set<Owner> findAll();
}
