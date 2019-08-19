package org.amdocs;

public class Address {
	
	public String doorNo;
	public String street;
	public String city;
	public String pinCode;
	
	public Address(String doorNo, String street, String city, String pinCode) {
			super();
			this.doorNo = doorNo;
			this.street = street;
			this.city = city;
			this.pinCode = pinCode;
		}
	@Override
	public String toString() {
		return "[doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	public Address() {
	}
}