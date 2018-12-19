package Arrays;

public class Array_to_a_Method {

	public static void main(String[] args) {
		
		String [] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

		Print_Array(aMake);
 
	}
 
	public static void Print_Array(String []array){
 
		for(int i = 0;i<=array.length-1;i++){
			
			System.out.println("Printing all the values of an Array ==> " + array[i]);
			
		}
		
	}

}
