import Banco.*;
import Tools.*;

public class Practica5 {
    
    public static void main(String[] args) {
        
        String [] n0 = {"Crear cuenta nueva", "Acceder a cuenta existente", "Salir"};
        
        boolean finish = false;
        
        Banco banco = new Banco();
        
        System.out.println("Demo banco: \n\n");
        
        
        while(!finish){
            switch(Menu.selOpcion(n0)){

                case 0 -> {
                    banco.createAccount(Captura.Cadena("Ingrese nombre del titular: "), Captura.Flotante("Monto a depositar: $"), Captura.Cadena("Ingrese un pin para su cuenta: "));
                }
                case 1 ->{
                    banco.accederCuenta(Captura.Entero("Ingresa id de la cuenta: "), Captura.Cadena("Ingresa pin: "));
                    
                }
                case 2->{
                    finish = true;
                }
            }
            TerminalManage.clearScreen();
        }
    }
}
