package main.java.misc;

public class breakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int i=1; i<=10;i++){
			if (i==6){
				break;
			} 
			System.out.println(i);
			
		}*/
		// Do not print 3 in below array & break this loop.
		
		/*
		 int [] a = {1,2,3,4,5};
		for (int i=0; i<a.length;i++)
		{
			//System.out.println(a[i]);
			if (a[i]!=3){
				//break;
			System.out.println(a[i]);	
			} //System.out.println(a[i]);
			
		}*/
		
		int [] a = {1,2,3,4,5};
		for (int i=0; i<a.length;i++) 
			{
				if (a[i]!=3){ // try with if (a[i]==3) it will print 1,2,4,5
				//break;
				continue; // continue will check if condition is true , 
				//if condition is true it exits current condition & continue starting execution of for loop.
				
			} System.out.println(a[i]);
			
		}
		
	}

}
