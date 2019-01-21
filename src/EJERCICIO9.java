import java.util.Scanner;

public class EJERCICIO9 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el primer numero:");

	    double num1 = input.nextDouble();
	    
	    System.out.println("Introduce el segundo numero:");

	    double num2 = input.nextDouble();
	    
	    System.out.println("Introduce el tercer numero:");

	    double num3 = input.nextDouble();
	    
	    System.out.println("Introduce el cuarto numero:");

	    double num4 = input.nextDouble();
	    
	    System.out.println("Introduce el quinto numero:");

	    double num5 = input.nextDouble();
	    
	    System.out.println("Introduce el sexto numero:");

	    double num6 = input.nextDouble();
	    
	    System.out.println((num1 * num2 - num3 * num4) / (num5 - num6));

	}

}
