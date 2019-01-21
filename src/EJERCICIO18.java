import java.util.Scanner;

public class EJERCICIO18 {

	public static void main(String[] args) {

		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce un numero entre 0 y 1000:");

	    int num1 = input.nextInt();
	    
	  // int op1 = 1000 / num1;
	    
	    int op2 = num1 / 100;
	    
	    int op3 = num1 % 10;
	    
	    int op35 = num1 / 10;
	    
	    int op4 = op35 % 10;
	    
	    
	    if( num1 < 1000 & num1 >= 0)
	    	
        {
		    System.out.println("La suma de los numeros introducidos es : " + (op2 + op3 + op4));   

        }
        else if (num1 == 1000)
        	
        {
            System.out.println("La suma de los numeros introducidos es : " + 1);
        }
	    
        else {
        	System.out.println("El numero debe estar entre 0 y 1000");
        }
	    


	}

}
