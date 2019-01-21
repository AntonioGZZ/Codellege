import java.util.Scanner;

public class EJERCICIO22 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);

	    System.out.println("Introduce la distancia en metros: ");

	    int num1 = input.nextInt();
	    
	    System.out.println("Introduce la cantidad de horas: ");

	    int num2 = input.nextInt();
	    
	    System.out.println("Introduce la cantidad de minutos: ");

	    int num3 = input.nextInt();
	    
	    System.out.println("Introduce la cantidad de segundos :");

	    int num4 = input.nextInt();
	    
	    double HtM = num2 * 60;
	    
	    double MtS = HtM * 60;
	    
	    double MtS2 = num3 * 60;
	    
	    double res1 = num1 / (MtS + MtS2 + num4);
	    
	    
	    
	    double StH = (MtS + MtS2 + num4);
	    
	    double res2f = num1 / StH;
	    
	    double res2 = res2f / 0.000277778;
	    
	    double res2b = res2 / 1000;
	    
	    System.out.println("la velocidad en metros/segundo es: " + res1);
	    
	    System.out.println("la velocidad en kilometros/hora es: " + res2b);
	    
	    System.out.println("la velocidad en millas/h es: " + res2b / 1.60934);

	}

}
