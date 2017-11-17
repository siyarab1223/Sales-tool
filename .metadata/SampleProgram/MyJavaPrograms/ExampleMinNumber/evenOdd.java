package ExampleMinNumber;

class evenOdd {

	public static void main(String[] args) {
		java.util.Scanner Scn =new java.util.Scanner(System.in);
		System.out.println("enter a number");
		int m=Scn.nextInt();
		EvenOdd(m);
	}
	public  static void EvenOdd(int m)
	{
		if(m%2==0)
		
		   			 System.out.printf("Even");
		 		
		else
			
			          System.out.printf("Odd");
			        
	
 	}

}
