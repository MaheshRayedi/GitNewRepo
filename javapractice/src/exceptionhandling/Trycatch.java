package exceptionhandling;

public class Trycatch {
  //program with try and catch block
	public static void main(String[] args) {
		System.out.println("Ratan World");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		System.out.println("Rest of app");
	}

}
