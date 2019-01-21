import java.util.Scanner;

public class EJERCICIO36 {
		
		public static void main(String[] args) {
			
			Scanner input =  new Scanner(System.in);

		    System.out.println("Introduce el numero: ");

		    int num1 = input.nextInt();
			
			int i;
			
			for (i = 0; i <= num1; i++) {
				
				System.out.println(num1 + " x " + i + " = " + num1 * i );
				  
				}
			
			

		}

	}

