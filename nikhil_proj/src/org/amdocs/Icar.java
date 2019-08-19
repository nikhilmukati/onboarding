package org.amdocs;

public class Icar {

	private String carName;

	public Icar(String carName) {
		this.carName = carName;
	}
	
	public boolean getCarName(String carSearched) {
		if (carSearched == carName)
			return true;
		return false;
	}
	
}
