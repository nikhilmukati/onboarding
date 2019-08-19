package org.amdocs;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public synchronized static Singleton getInstance() {
		
		if ( instance == null ) {
			instance = new Singleton();			
		}
		return instance;
	}
	
	public static void main (String arg[]) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		if (instance1 == instance2 ) {
			System.out.println("Both objects are same !");
		}else {
			System.out.println("Both objects are Diffrent !");
		}
	}
}
