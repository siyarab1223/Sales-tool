
public class DataMember {
	static int i=10;

	public static void main(String[] args) {
				System.out.println("Global variable i="+i);// Even if value not given to i ,it prints default value as it is static member
               LocalI();
               Boolean();
               ConcatenationOperations();
	}
	public static void LocalI()
	{
		int i=20;
		System.out.println("local variable i="+i);
	}
  public static void Boolean()
  {
	int a=3;
	System.out.println(a>=1 && a<=4);
  }
  public static void ConcatenationOperations()
      {
	  System.out.println("ab"+"cd");
	  System.out.println("ab"+3);
	  System.out.println("3"+4);
	  System.out.println("3"+4+5);
	  System.out.println(3+4+"5"); //Execution from left to right as two operators are same
	  }
  }

