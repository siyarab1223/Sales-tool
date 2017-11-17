package ExampleMinNumber;

public class Factorial {

	public static void main(String[] args) {
		java.util.Scanner Scn= new java.util.Scanner(System.in);
		System.out.println("Enter a value");
		int n=Scn.nextInt();
		System.out.println("Factorial of 5 is" +Fact(n));

	}
     public static int Fact(int n)
     {
    	 int f=1;
     	 for(int i=n;i>1;i--)
    	 f=f*i;	
     	 return f;
     } 
}
