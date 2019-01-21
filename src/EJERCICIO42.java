import java.util.Arrays;

public class EJERCICIO42 {

	public static void main(String[] args) {
		
		String [] arr2 = {"Sergio","Martin","Patricia","Emiliano"};		   
		 
		String a = " ";
		 
	        for(int i = 0; i < arr2.length; i++)
	        {
	        	a = a + arr2[i];
	        }

	       if( a.contains("Sergio"))
	        {
	            System.out.println("Contiene el nombre introducido");
	        }
	        else
	        {
	            System.out.println("no contiene el nombre introducido");
	        } 
    }     

}