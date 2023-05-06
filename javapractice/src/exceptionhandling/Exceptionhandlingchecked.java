package exceptionhandling;

import java.io.FileInputStream;

public class Exceptionhandlingchecked {

	//The exceptions which are checked by compiler its shows information are called checked exception.
	//whether it is a checked  exception or unchecked exception are raised at run time.
	public static void main(String[] args) {
		System.out.println("Program stated");
		//Thread.sleep(1000);  interruptedException
       // FileInputStream fis = new FileInputStream("abc.txt"); FileNotFoundException
       System.out.println("rest of the application"); 
	}

}
