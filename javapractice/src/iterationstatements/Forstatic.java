package iterationstatements;

public class Forstatic {

	   static boolean m1()
	   {
		   return true;
		  
	   }
	   static int m2()
	   {
		   return 10;
		   
	   }
	public static void main(String[] args) {
		  for(int i=Forstatic.m2();Forstatic.m1();i++)
		  {
			  System.out.println("Mahesh="+i);
		  }
			  

	}

}
