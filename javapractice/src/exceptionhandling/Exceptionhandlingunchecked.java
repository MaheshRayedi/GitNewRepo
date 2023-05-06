package exceptionhandling;

public class Exceptionhandlingunchecked {
//the exceptions which are not checked by compiler and compiler unable to show msg these exceptions are raised to only runtime.uncheked exceptions are child class runtime exceptions.
	
	public static void main(String[] args) {
		System.out.println("Ratan World");
		// System.out.println(10/0);  AE
		
	//	int[] a = {10,20,30};    
	//	System.out.println(a[6]);  ArrayIndexOutOfBoundsException
		
	//	System.out.println("ratan".charAt(12)); StringIndexOutOfBoundsException
		
		//Integer i = Integer.valueOf("ten"); NumberFormatException
		System.out.println("Rest of application");

	}

}
