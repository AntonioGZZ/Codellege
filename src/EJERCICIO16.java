import java.util.Scanner;

public class EJERCICIO16 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce en grados farenheit:");

	    double num1 = input.nextDouble();
	    
	    double op = num1 - 32;
	    
	    double op2 = op * 5;
	    
	    System.out.println("El resultado en grados Celsius es: " + (op2 / 9));
	    		
	    

	}

}
