package org.bhavesh.service.map;

import java.util.Set;

import org.bhavesh.model.Owner;
import org.bhavesh.service.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Long id,Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


	@Override
	public Owner findByLastName(String lastName) {
		//map.values().forEach(element -> element.getLirstName().equals(lastName));
		return null;
	}

	@Override
	public Owner save(Owner owner) {
		super.save(owner.getId(), owner);
		return owner;
	}

}
