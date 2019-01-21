import java.util.Scanner;

public class EJERCICIO28 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

        System.out.println("Introduce el primer numero");

        double num1 = input.nextDouble();
        
        System.out.println("Introduce el segundo numero");

        Double num2 = input.nextDouble();
        
        if( num1 == num2 )
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son diferentes");
        }

	}

}
