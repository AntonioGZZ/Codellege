import java.util.Scanner;

public class EJERCICIO29 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

        System.out.println("Introduce el numero del mes (1-12)");

        int mes = input.nextInt();
        
		Scanner input2 =  new Scanner(System.in);
        
        System.out.println("Introduce el a�o");

        int a�o = input2.nextInt();

        switch(mes){

            case 1: System.out.println("Enero " + a�o + " Tiene 31 dias");
                break;
            case 2: 
            	if (a�o == 2016 || a�o == 2020 || a�o == 2024 || a�o == 2028 || a�o == 2012 || a�o == 2008 || a�o == 2004 ||a�o == 2000) {
            		System.out.println("Febrero " + a�o + " Tiene 29 dias");
            	}
            	else {
            		System.out.println("Febrero " + a�o + " Tiene 28 dias");
            	}
                break;
            case 3: System.out.println("Marzo " + a�o + " Tiene 31 dias");
                break;
            case 4: System.out.println("Abril " + a�o + " Tiene 30 dias");
                break;
            case 5: System.out.println("Mayo " + a�o + " Tiene 31 dias");
                 break;
            case 6: System.out.println("Junio " + a�o + " Tiene 30 dias");
                 break;
            case 7: System.out.println("Julio  " + a�o + " Tiene 31 dias");
                 break;
            case 8: System.out.println("Agosto " + a�o + " Tiene 31 dias");
                 break;
            case 9: System.out.println("Septiembre " + a�o + " Tiene 30 dias");
                 break;
            case 10: System.out.println("Octubre  " + a�o + " Tiene 31 dias");
                 break;
            case 11: System.out.println("Noviembre " + a�o + " Tiene 30 dias");
                 break;
            case 12: System.out.println("Diciembre  " + a�o + " Tiene 31 dias");
                 break;
            default: System.out.println("Introduce un numero valido");
            
        }

	}

}
