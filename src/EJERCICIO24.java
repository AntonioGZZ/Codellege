import java.util.Scanner;

public class EJERCICIO24 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce un numero:");

	    String str = input.nextLine();
	    
        Boolean cont = str.contains("-");
        
        if( cont == true )
        {
            System.out.println("Es negativo");
        }
         else
        {
            System.out.println("Es positivo");
        }

	}

}
