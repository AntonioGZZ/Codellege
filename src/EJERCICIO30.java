import java.util.Scanner;

public class EJERCICIO30 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce una letra:");

	    String letra = input.nextLine();
	    
	    int letras = letra.length();
	    
	    if( letras == 1)
        {
        	if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u")
            {
                System.out.println("Es una Vocal");
            }
        	else 
        	{
        		System.out.println("Es una Consonante");
        	}

        }
        else 
        {     	
            System.out.println("Introduce solo una letra");
        }
	}

}
