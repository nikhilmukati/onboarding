package org.amdocs;

import java.util.HashMap;

public class Contacts {

	private HashMap<String, String> contacts;
	
	
	public Contacts() {
		this.contacts = new HashMap<String, String>();
	}	
	
	public void addContacts(String name, String mobileNo){
		contacts.put(mobileNo, name);
	}
	
	public String findNameByContact(String mobileNo) {
		String name = contacts.get(mobileNo);
		if(name == null)
			return mobileNo;
		return name;
	}

	 

	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		contacts.addContacts("nikhil", "9617582004");
		contacts.addContacts("ravi the tiger", "8999777556");
		
		String name = contacts.findNameByContact("8999777556");
		System.out.println(name);
		
		System.out.println(contacts.findNameByContact("9617582456"));
		
		name = contacts.findNameByContact("9617582004");
		System.out.println(name);
	}

}
