package exceptionhandling;

public class Exceptionpropogration {
     void m3()
     {  try
     {
    	 System.out.println(10/0); 
     }
    	catch(ArithmeticException ae)
     {
    		System.out.println(ae.toString());
    		ae.printStackTrace();
     }
    	 
     }
     void m2()
     {  m3();
    	 
     }
     void m1()
     {  m2();
    	 
     }
	public static void main(String[] args) {
		
	}

}
