//http://toolsqa.com/java/basic-java-programming/arrays/

package main.java.misc;

public class PassArrayToMethod {

	public static void main(String[] args) {
		// Declare Array
		String aCars[] = {"Maruti","BMW","Hyundai","Honda"};
		// Calling Print Array method and passing an Array as a parameter
		Print_Array(aCars);
		

	}
	// Create Print_Array Function
	private static void Print_Array(String[] myArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<myArray.length;i++){
			System.out.println(myArray[i]);
			
		
	}
	}
}
