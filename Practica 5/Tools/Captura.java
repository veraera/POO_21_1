package Tools;

import java.util.Scanner;

public class Captura {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int Entero(String msg){           
            System.out.print(""+msg);
            return (sc.nextInt());
    }

    public static float Flotante(String msg){
            System.out.print(""+msg);
            return (sc.nextFloat());
    }

    public static String Cadena(String msg){
            String captura;
            sc.nextLine();
            System.out.print(""+msg);
            captura = sc.nextLine();
            return (captura);
    }
        
}
