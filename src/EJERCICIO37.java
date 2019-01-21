import java.util.Scanner;

public class EJERCICIO37 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el numero: ");

	    int num1 = input.nextInt();
	    
        int i;
        int a = 0;
        
        if (num1 % 2 == 0) 
        {
        	
    	    for (i=2;i<=10;i+=2)
    		{   
    	    	a = a + i;
    			System.out.println (i);
    		}
    	    System.out.println("La suma de los numeros es: " +a);
        	
        } 
        
        else 
        {
        		
        	for (i=1;i<=10;i+=2)
            {      
    	    	a = a + i;
    			System.out.println (i);
    		}
    	    System.out.println("La suma de los numeros es: " +a);
        }

	}

}
