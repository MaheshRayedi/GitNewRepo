package switchadvanced;

public class Switchbyte {

	public static void main(String[] args) {
		byte b=127;
		switch(b)
		{
		case 127:System.out.println("Mahesh");
		case 128:System.out.println("Raina");
		
		}
		//error:incompatialbe types:possible loosy conversion from int to byte.
		

	}

}
