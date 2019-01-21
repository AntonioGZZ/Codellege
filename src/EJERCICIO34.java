import java.util.Scanner;

public class EJERCICIO34 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el primer numero: ");

	    int num1 = input.nextInt();
	    
	    System.out.println("Introduce el segundo numero: ");

	    int num2 = input.nextInt();
	    
	    System.out.println("Introduce el tercer numero: ");

	    int num3 = input.nextInt();
	    
	    System.out.println("Introduce el cuarto numero: ");

	    int num4 = input.nextInt();
	    
	    System.out.println("Introduce el quinto numero: ");

	    int num5 = input.nextInt();
	    
	    System.out.println("Se introducieron los numeros:\n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5);
	    
	    int res = num1 + num2 + num3 + num4 + num5;
	    
	    System.out.println("La suma de los 5 numeros es: " + res);
	    
	    System.out.println("El promedio es: " + res / 5);

	}

}
