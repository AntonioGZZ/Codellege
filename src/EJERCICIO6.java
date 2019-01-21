import java.util.Scanner;

public class EJERCICIO6 {
	
	public static void main (String [] args) {
	
	Scanner input =  new Scanner(System.in);

    System.out.println("Introduce el primer numero:");

    int num1 = input.nextInt();
    
    System.out.println("Introduce el segundo numero:");

    int num2 = input.nextInt();
    
    int resta = num1 - num2;
    
    System.out.println("El resultado de la suma es: " + (num1 + num2));
    
    System.out.println("El resultado de la resta es: " + resta);
    
    System.out.println("El resultado de la multiplicacion es: " + num1 * num2);
    
    System.out.println("El resultado de la division es: " + num1 / num2);
    
    System.out.println("El residuo es: " + num1 % num2);

    
	 }

}
