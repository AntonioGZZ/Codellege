import java.util.Scanner;

public class EJERCICIO19 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce los minutos");
	    
	    int year = 525600;   //minutos en un a�o
	    
	    int day = 1440;      //minutos en un dia

	    int num1 = input.nextInt();
	    
	    int op1 = num1 / year;   //se sacan los a�os que hay en la cantidad de minutos introducida (el resultado es 6)
	    
	    int op2 = year * op1;    //se sacan los minutos que hay en ese a�o (6 x la cantidad de minutos del a�o)
	    
	    int op3 = num1 - op2;    // se le resta esa cantidad al numero instroducido para obtener la cantidad que no completo a ser un a�o
	    
	    int op4 = op3 / day;     //se dividen los minutos restantes entre la cantidad de minutos que tiene un a�o para sacar la cantidad de dias
	    		
	    
	    System.out.println("en " + num1 + " minutos hay " + op1 + " a�os " + op4 + " dias");

	}

}
