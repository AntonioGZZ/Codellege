import java.util.Scanner;

public class EJERCICIO29 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

        System.out.println("Introduce el numero del mes (1-12)");

        int mes = input.nextInt();
        
		Scanner input2 =  new Scanner(System.in);
        
        System.out.println("Introduce el año");

        int año = input2.nextInt();

        switch(mes){

            case 1: System.out.println("Enero " + año + " Tiene 31 dias");
                break;
            case 2: 
            	if (año == 2016 || año == 2020 || año == 2024 || año == 2028 || año == 2012 || año == 2008 || año == 2004 ||año == 2000) {
            		System.out.println("Febrero " + año + " Tiene 29 dias");
            	}
            	else {
            		System.out.println("Febrero " + año + " Tiene 28 dias");
            	}
                break;
            case 3: System.out.println("Marzo " + año + " Tiene 31 dias");
                break;
            case 4: System.out.println("Abril " + año + " Tiene 30 dias");
                break;
            case 5: System.out.println("Mayo " + año + " Tiene 31 dias");
                 break;
            case 6: System.out.println("Junio " + año + " Tiene 30 dias");
                 break;
            case 7: System.out.println("Julio  " + año + " Tiene 31 dias");
                 break;
            case 8: System.out.println("Agosto " + año + " Tiene 31 dias");
                 break;
            case 9: System.out.println("Septiembre " + año + " Tiene 30 dias");
                 break;
            case 10: System.out.println("Octubre  " + año + " Tiene 31 dias");
                 break;
            case 11: System.out.println("Noviembre " + año + " Tiene 30 dias");
                 break;
            case 12: System.out.println("Diciembre  " + año + " Tiene 31 dias");
                 break;
            default: System.out.println("Introduce un numero valido");
            
        }

	}

}
