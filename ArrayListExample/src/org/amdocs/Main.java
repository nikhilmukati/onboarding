package org.amdocs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(200);
		numbers.add(400);
		numbers.add(100);
		numbers.add(300);
		numbers.add(500);
		
		System.out.println("size of arraylist is :-"+ numbers.size());
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("   ");
	   Collections.sort(numbers);
	   
	   for(int i : numbers) {
			System.out.println(i);
		}
		
	}

}
