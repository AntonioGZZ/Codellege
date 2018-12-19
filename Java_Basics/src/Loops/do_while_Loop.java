package Loops;

public class do_while_Loop {

	public static void main(String[] args) {
		
		 int Count = 0;

		 do{
			 Count = Count + 5;
			 
			 System.out.println("Count is ==> "+ Count);
			 
		 }while(Count < 25);

		 int CountOnce = 25;
		 
		 System.out.println("<==== Next Count ====>");
		 
		 do{
			 
			 CountOnce = CountOnce + 5;	
			 
			 System.out.println("Count is ==> "+ CountOnce);
			 
		 }while(CountOnce < 25);

	}

}
