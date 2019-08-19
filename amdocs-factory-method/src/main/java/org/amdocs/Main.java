package org.amdocs;

public class Main {

	public static void main(String[] args) {
		
		IMobile mobile = Mobilefactory.getMobile("OnePlus5");
		mobile.call();

	}

}
