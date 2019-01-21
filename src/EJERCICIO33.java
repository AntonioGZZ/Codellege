import java.util.Scanner;

public class EJERCICIO33 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce un numero:");

	    int num1 = input.nextInt();
		
		System.out.println("numero insertado: ");
		
		int i;
		int a = 0;
		
		 System.out.println(num1);
		 
		 for (i=1;i<=num1;i++) {
			 
			 a = a + i;
			 
			 System.out.println (i);
			 
		 }
         
       System.out.println("la suma de los numeros de: \n" + num1 + " es " + a);
	}

}
