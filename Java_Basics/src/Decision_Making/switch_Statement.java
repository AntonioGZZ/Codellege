package Decision_Making;

public class switch_Statement {
	public static void main(String[] args) {
		int iDay = 1;
		String sDay = "Lunes";
 
 		switch(iDay){
 			case 1:
 				System.out.println("Hoy es Lunes");
 				break;
			case 3:
				System.out.println("Hoy es Martes");
				break;
			case 4:
				System.out.println("Hoy es Miercoles");
				break;
			case 5:
				System.out.println("Hoy es Jueves");
				break;
			case 6:
				System.out.println("Hoy es Viernes");
				break;
			case 7:
				System.out.println("Hoy es Sabado");
				break;
			default:
				System.out.println("Hoy es Domingo");
				break;
 				}
 
 		switch(sDay){
			case "Monday":
				System.out.println("Hoy es Monday");
				break;
			case "Tuesday":
				System.out.println("Hoy es Tuesday");
				break;
			case "Wednesday":
				System.out.println("Hoy es Wednesday");
				break;
			case "Thursday":
				System.out.println("Hoy es Thursday");
				break;
			case "Friday":
				System.out.println("Hoy es Friday");
				break;
			case "Saturday":
				System.out.println("Hoy es Saturday");
				break;
			default:
				System.out.println("Hoy es Sunday");
				break;
 				}
	}
}
