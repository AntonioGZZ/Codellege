package Operators;

public class Assignment_Operator {
	
	public static void main(String[] args) {
		
		int speed = 80; 
		int distance = 20; 
		int time = 10; 
		String name = "ToolsQA";
		boolean isGood = true; 

		System.out.println("El valor en speed es : " + speed);
		System.out.println("El valor en distance es : " + distance);
		System.out.println("El valor en time es : " + time);
		System.out.println("El valor en name es : " + name);
		System.out.println("El valor en isGood es : " + isGood);
		
		//se reemplazaran los valores
 
		speed = 100;
		time = distance; 
		name = "ForumsQA"; 
		isGood = false; 
		
		System.out.println("El valor en speed es : " + speed);
		System.out.println("El valor en time es : " + time);
		System.out.println("El valor en name es : " + name);
		System.out.println("El valor en isGood es : " + isGood);
 
		speed = distance = 0; 
		System.out.println("Value stored in the speed variable is : " + speed);
 
	}

}
