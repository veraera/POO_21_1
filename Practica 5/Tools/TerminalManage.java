
package Tools;

import java.util.Scanner;

public class TerminalManage {
    
    public static void pause(){
        System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
        Scanner sc = new Scanner(System.in); 
        sc.nextLine();
    }
    
    public static void clearScreen() { 
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        
    } 
}
