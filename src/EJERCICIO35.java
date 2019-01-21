import java.util.Scanner;

public class EJERCICIO35 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el numero: ");

	    int num1 = input.nextInt();
	    
	    int i;
	    
	    for (i=1;i<=num1;i++)
		{      
			System.out.println ("El numero es: " + i + " y multiplicado al cubo de " + i + " es: " + Math.pow(i,3));
		}

	}

}
