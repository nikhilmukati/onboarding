package org.amdocs;

public class Mobile {

	private Camera camera;
	
	public Mobile() {
		camera = new Camera();
	}
	
	public Mobile(Camera camera) {
		this.camera = camera;
	}
	
	
	public boolean startPhotoApp() {
		System.out.println("INside Camera StartPhotoApp method");
		
		if( camera.on() ) {
			System.out.println("Positive Code Path");
			System.out.println("Assume some hardware interaction happen here");
			return true;			
		}
		System.out.println("NEgative Code Path");
		System.out.println("Assume Some Hardware Falier and error log happend here");
		
		return false;
	}

}
