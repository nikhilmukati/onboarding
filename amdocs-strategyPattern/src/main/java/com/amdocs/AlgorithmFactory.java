package com.amdocs;



public class AlgorithmFactory {
	
	public static IAlgorithm getAlgorithm(int algo) {
		
		IAlgorithm algorithm = null;
		
		if ( algo == 1)
			algorithm = new QuickSort();
		else if (algo == 3)
			algorithm = new HeapSort();
		else if ( algo == 2)
			algorithm = new InsertionSort();
		else 
			algorithm = new Nullalgorithm();
		return algorithm;
	}
}
