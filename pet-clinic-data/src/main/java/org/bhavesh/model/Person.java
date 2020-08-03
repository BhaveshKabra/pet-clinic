package org.bhavesh.model;

public class Person extends BaseEntity {
	private String firstName;
	private String lirstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLirstName() {
		return lirstName;
	}
	public void setLirstName(String lirstName) {
		this.lirstName = lirstName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lirstName == null) ? 0 : lirstName.hashCode());
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
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lirstName == null) {
			if (other.lirstName != null)
				return false;
		} else if (!lirstName.equals(other.lirstName))
			return false;
		return true;
	}
	public Person(String firstName, String lirstName) {
		super();
		this.firstName = firstName;
		this.lirstName = lirstName;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
