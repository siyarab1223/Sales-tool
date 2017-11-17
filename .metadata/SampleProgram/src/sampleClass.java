
public class sampleClass {
static int EmpAge=25;  //Global variable
	public static void main(String[] args) {
		System.out.println("Hi.This would be my sample program");
		System.out.println("Please enter employee name");
		java.util.Scanner Scn=new java.util.Scanner(System.in);
		String EmpName= Scn.next();  //For taking input from user. Scn.next lets pgm stop and not continue unless a value is given
		System.out.println("Employee name is "+EmpName);
		int EmpAge=24;  //Local variable.Also try executing by commenting the local variable
		System.out.println("Employee Age is "+EmpAge);

	}

}
