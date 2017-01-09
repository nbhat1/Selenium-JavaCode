package main.java.misc;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] aMake = {"audi","mercediez", "BMW", "Toyota"}; 
		int length = aMake.length;
		System.out.println("Length of array is" + " " +length);
		
		System.out.println("First elemnt in array is " + aMake[0]);
		
		String aAudi = aMake[0];
		System.out.println("First elemnt in array is" + " " + aAudi);
		
		for(int i=0;i<aMake.length;i++){
			System.out.println(aMake[i]);
		}
		
	}

}
