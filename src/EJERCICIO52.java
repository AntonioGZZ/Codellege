import java.util.Scanner;

public class EJERCICIO52 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce una frase");

	    String frase = input.nextLine();
		
		System.out.print("Number of words in the string: " + wordlength(frase)+"\n");
		
	}

	public static int wordlength(String frase) {
	
	    int conteo = 0;
	    
        if (!(" ".equals(frase.substring(0, 1))) || !(" ".equals(frase.substring(frase.length() - 1))))
        {
            for (int i = 0; i < frase.length(); i++)
            {
                if (frase.charAt(i) == ' ')
                {
                    conteo++;
                }
            }
            conteo = conteo + 1; 
        }
		return conteo;

	  }
	}
