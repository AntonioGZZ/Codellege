
public class EJERCICIO43 {

	public static void main(String[] args) {
			
			String [] arr2 = {"Sergio","Martin","Patricia","Emiliano"};		   
			 
			String a = " ";
			 
		        for(int i = 0; i < arr2.length; i++)
		        {
		        	a = a + i + " " + arr2[i] + " ";
		        }
		        
		        String nombre = "Sergio";

		       if( a.contains(nombre))
		        {
		            System.out.println("Contiene " + nombre);
		        }
		        else
		        {
		            System.out.println("no contiene" + nombre);
		        } 
	    }     

	}
