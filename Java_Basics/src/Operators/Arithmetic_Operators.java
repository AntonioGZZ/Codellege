package Operators;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		int a;
		int b = 10;
		int c = 5;
		
		a = b + c;
		System.out.println("El valor de 'a' al usar '+' es " + a);
		a = b - c;
		System.out.println("El valor de 'a' al usar '-' es " + a);
		a = b * c;
		System.out.println("El valor de 'a' al usar '*' es " + a);
		a = b / c;
		System.out.println("El valor de 'a' al usar '/' es " + a);
		a = b % c;
		System.out.println("El valor de 'a' al usar '%' es " + a);
		b++;
		System.out.println("El valor de 'b' al usar '++' es " + b);
		c--;
		System.out.println("El valor de 'c' al usar '--' es " + c);

	}

}
