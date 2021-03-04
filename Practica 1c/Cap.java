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

		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg);
		return (sc.nextLine());
	}
}