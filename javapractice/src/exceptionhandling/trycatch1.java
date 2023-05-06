package exceptionhandling;

public class trycatch1 {
 //catch block is not matched program terminated abnormally
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException ae)
		{
			System.out.println(10/2);
		}
	}

}
