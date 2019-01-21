import java.util.Scanner;

public class EJERCICIO26 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce el primer numero");

	    int num1 = input.nextInt();
	    
	    System.out.println("Introduce el segundo numero:");

	    int num2 = input.nextInt();
	    
	    System.out.println("Introduce el tercer numero");

	    int num3 = input.nextInt();
	    
	    if( num1 > num2 & num1 > num3 )
        {
            System.out.println(num1);
        }
        else if (num2 > num1 & num2 > num3)
        {
            System.out.println(num2);
        }
        else 
        {
        	System.out.println(num3);
        }

	}

}
