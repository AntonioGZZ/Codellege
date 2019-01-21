import java.util.Scanner;

public class EJERCICIO17 {

	public static void main(String[] args) {

		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce la cantidad en pulgadas:");

	    double num1 = input.nextDouble();
	    
	    System.out.println("El resultado en metros es: " + (num1 * 0.0254));

	}

}
