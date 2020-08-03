package org.bhavesh.model;

import java.time.LocalDate;

public class Pet {
	private PetType pettype;
	private Owner owner;
	private LocalDate localDate;
	public PetType getPettype() {
		return pettype;
	}
	public void setPettype(PetType pettype) {
		this.pettype = pettype;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localDate == null) ? 0 : localDate.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result + ((pettype == null) ? 0 : pettype.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (localDate == null) {
			if (other.localDate != null)
				return false;
		} else if (!localDate.equals(other.localDate))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (pettype != other.pettype)
			return false;
		return true;
	}
	public Pet(PetType pettype, Owner owner, LocalDate localDate) {
		super();
		this.pettype = pettype;
		this.owner = owner;
		this.localDate = localDate;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
