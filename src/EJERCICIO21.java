import java.util.Scanner;

public class EJERCICIO21 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el peso en libras:");

	    double num1 = input.nextDouble();
	    
	    System.out.println("Introduce la altura en pulgadas:");

	    double num2 = input.nextDouble();
	    
	    System.out.println("El indice de masa corporal es: " + num1 / num2);

	}

}
