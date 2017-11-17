package ExampleMinNumber;

public class GreatestNumber {

	public static void main(String[] args) {
		java.util.Scanner Scn= new java.util.Scanner(System.in);
		System.out.println("Enter value of a");
		int a=Scn.nextInt();
		System.out.println("Enter value of b");
		int b=Scn.nextInt();
		GreatestN(a,b);
	    int c=a+b;
		System.out.println("Sum of Numbers between a and b"+Sum1to10(c));
		System.out.println(divisibleBy3(a,b));

	}
	public static void GreatestN(int a, int b)
	{
		if(a<b)
			System.out.println(b+"is greater");
		else
			System.out.println(a+"is greater");
	}
	public static int Sum1to10(int c)
	{
		int Sum=0;
		for (int i=0;i<=c;i++)
			{
		 Sum=Sum+i;
			}
		return Sum;
	}
	public static int divisibleBy3(int a, int b)
	{
		int sum=0;
		for(int i=a;i<=b;i++)
		{
				if(i%3==0)
				sum=sum+i;
		}
		return sum;
	}
}
