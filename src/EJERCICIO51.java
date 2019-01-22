import java.util.Scanner;

public class EJERCICIO51 {

	public static void main(String[] args) {

		prom();
		
	}

	public static void prom() {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el primer numero:");

	    double num1 = input.nextDouble();
	    
	    System.out.println("Introduce el segundo numero:");

	    double num2 = input.nextDouble();
	    
	    System.out.println("Introduce el tercer numero:");

	    double num3 = input.nextDouble();
	    
	    System.out.println((num1 + num2 + num3) / 3);

	  }
	}

