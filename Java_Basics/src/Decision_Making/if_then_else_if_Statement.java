package Decision_Making;

public class if_then_else_if_Statement {

	public static void main(String[] args) {

			String sDay = "Lunes";
			int iDay = 1;
	 
			if(sDay.equals("Domingo")){
				
				System.out.println("Hoy es Domingo");
				
			}else if(sDay.equals("Sabado")){
				
				System.out.println("Hoy no es Domingo");
				
			}else{
				
				System.out.println("Hoy es otro dia de la semana");
				
			}
	 
			if(iDay==7){
				
				System.out.println("Hoy es Domingo");
				
			}else if(iDay==6){
				
				System.out.println("Hoy es Sabado");
				
			}else{
				
				System.out.println("Hoy es otro dia de la semana");
				
			}

	}

}
