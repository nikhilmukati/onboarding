package org.amdocs;

public class Nikhilesh {
	private String name;
	private String designation;
	private String department;
	
	private Address address;


	public Nikhilesh() {
		
	}


	public Nikhilesh(String name, String designation, String department, Address address) {
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.address = address;
	
	}
	
	public String getName() {
		return null;
	}


	@Override
	public String toString() {
		return "Emplopyee [name=" + name + ", designation=" + designation + ", department=" + department + ", address="
				+ address + "]";
	}

}
