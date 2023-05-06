package switchadvanced;

public class Switchvariables {

	public static void main(String[] args) {
		//variables are not allowed as case lables
		int a=10; int b=20;
		switch(a)
		{
		case a:System.out.println("Mahesh");
		case b:System.out.println("Raina");
		
		}
		
      //error:constant expression required.
	}

}
