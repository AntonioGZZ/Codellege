package Operators;

public class Relational_Operators {

	public static void main(String[] args) {
		
		int Ten = 10;	
		int Twenty = 20;
		int Thirty = 30;

		System.out.println("Mayor que:");
		System.out.println(" Ten > Twenty ==> " + (Ten > Twenty));
		System.out.println(" Twenty > Ten ==> " + (Twenty > Ten));
		System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty));

		System.out.println("Mayor o equivalente a:");
		System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); 
		System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); 
		System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); 

		System.out.println("Menor que:");
		System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); 
		System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); 
		System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); 

		//less than or equal to
		System.out.println("Menor o equivalente a:");
		System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); 
		System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); 
		System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); 

		//equal to
		System.out.println("Equivalente a:");
		System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); 
		System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty+Ten)); 

		//not equal to
		System.out.println("Difente que:>");
		System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); 
		System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); 

	}

}
