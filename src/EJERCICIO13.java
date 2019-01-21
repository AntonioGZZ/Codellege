import java.util.Scanner;

public class EJERCICIO13 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el primer numero:");

	    double num1 = input.nextDouble();
	    
	    System.out.println("Introduce el segundo numero:");

	    double num2 = input.nextDouble();
	    
       System.out.println("El area es: " + num1 * num2);
       
       System.out.println("El perimetro es: " + 2 * (num1 + num2));

	}

}
