package Arrays;

public class Array_from_a_Method {

	 
		public static void main(String[] args) {
			
			String[] aMake = ReturnArray();
			
			for(int i = 0;i<=aMake.length-1;i++){
				
				System.out.println("Printing all the values of an Array ==> " + aMake[i]);
				
				}
			
			}
	 
		public static String[] ReturnArray() {
			
			String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};  
			
			  return aArray;
			  
			}
		
		}