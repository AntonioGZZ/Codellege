import java.util.Scanner;

public class EJERCICIO11 {

	public static void main(String[] args) {
		
		final double pi = 3.1416;
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el numero:");

	    double radio = input.nextDouble();
	    
	    double diametro = radio * 2;
	    
	    double op = (Math.pow(radio,2));
	    
	    System.out.println("El perimetro es: " + pi * diametro);
	    
	    System.out.println("El area es: " + pi * op);

	}

}
