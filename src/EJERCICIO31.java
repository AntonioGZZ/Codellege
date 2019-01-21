import java.util.Scanner;

public class EJERCICIO31 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el año: ");

	    int year = input.nextInt();
	       
        boolean Leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (Leap)
        {
        	System.out.println (year + " Es un año biciesto");
        } 
        else
        {
        	System.out.println (year + " no es un año biciesto");
        }
    }

}

