package com.amdocs;

public class Main {

	public static void main(String[] args) {
		
		PaperWala paperWala = new PaperWala("Pune PaperWala Pvt Ltd.");
		paperWala.addSubscriber(new Subscriber("Parth"));
		paperWala.addSubscriber(new Subscriber("Ravi"));
		paperWala.addSubscriber(new Subscriber("Nikhil"));
		
		paperWala.notifyAllSubscribers("Times Of India");

	}

}
