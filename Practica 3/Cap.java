import java.util.*;

public class Cap{

	public static int Ent(String msg){

		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg);
		return (sc.nextInt());
	}

	public static float Flo(String msg){

		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg);
		return (sc.nextFloat());
	}

	public static String Str(String msg){
		String captura;
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg);
		captura = sc.nextLine();
		return (captura);
	}

	public static void clearScreen() { 
		System.out.println("PRESIONE ENTER PARA CONTINUAR");
		Scanner sc = new Scanner(System.in); 
		sc.nextLine();
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	} 
}