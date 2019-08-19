/**
 * 
 */
package org.Amdocs;
import java.util.Scanner;
/**
 * @author train
 *
 */
public class Addition {

	public int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
		int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
         
        Addition addition = new Addition();
        int result = addition.add(firstInput, secondInput);
        
        System.out.println(result);
	}

}
