package org.bhavesh.service.map;

import java.util.Set;

import org.bhavesh.model.Pet;
import org.bhavesh.service.CrudService;
import org.bhavesh.service.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
