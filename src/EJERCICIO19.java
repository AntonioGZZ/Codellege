import java.util.Scanner;

public class EJERCICIO19 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce los minutos");
	    
	    int year = 525600;   //minutos en un año
	    
	    int day = 1440;      //minutos en un dia

	    int num1 = input.nextInt();
	    
	    int op1 = num1 / year;   //se sacan los años que hay en la cantidad de minutos introducida (el resultado es 6)
	    
	    int op2 = year * op1;    //se sacan los minutos que hay en ese año (6 x la cantidad de minutos del año)
	    
	    int op3 = num1 - op2;    // se le resta esa cantidad al numero instroducido para obtener la cantidad que no completo a ser un año
	    
	    int op4 = op3 / day;     //se dividen los minutos restantes entre la cantidad de minutos que tiene un año para sacar la cantidad de dias
	    		
	    
	    System.out.println("en " + num1 + " minutos hay " + op1 + " años " + op4 + " dias");

	}

}
