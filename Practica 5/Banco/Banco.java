package Banco;

import java.util.ArrayList;
import Tools.*;
    
public class Banco {
    
    private ArrayList <Cuenta> cuentasExistentes = new ArrayList<>();
    
   
    public int createAccount(String name, float saldo, String pin){
        
        cuentasExistentes.add( new Cuenta(name, saldo, pin) );
        TerminalManage.clearScreen();
        System.out.println("Cuenta creada con exito, recuerde sus datos de acceso:");
        System.out.println("Id:" + (cuentasExistentes.size()-1) + "\tPin: " + pin);
        TerminalManage.pause();
        return(cuentasExistentes.size());
        
    }
    
    public void accederCuenta(int id, String pin){
        
        if (id > cuentasExistentes.size()-1) {
            System.out.println("No existe ninguna cuenta con ese id");
            TerminalManage.pause();
        }else{
            if (cuentasExistentes.get(id).getPin().equals(pin)) {
                TerminalManage.clearScreen();
                manejoCuenta(cuentasExistentes.get(id));

            }else{
                System.out.println("Pin incorrecto");
                TerminalManage.pause();
            }
        }
    }
    
    private void manejoCuenta (Cuenta cuenta){ 
        String [] n1 = {"Consultar saldo", "Retirar", "Salir"};
        float retiro;
        boolean finish = false;
        
        while(!finish){
            
            System.out.println("Titular: " + cuenta.getName());
            
            switch(Menu.selOpcion(n1)){
                
                case 0 -> {
                    System.out.println("Su saldo es de: $" + cuenta.getSaldo());
                    TerminalManage.pause();
                }

                case 1 -> {
                    retiro = Captura.Flotante("Cantidad a retirar: $");
                    if (retiro > cuenta.getSaldo()){
                        System.out.println("No cuenta con fondos suficientes");                        
                    }else{
                        System.out.println("Retiro exitoso");
                        cuenta.setSaldo(cuenta.getSaldo()-retiro);
                    }
                    TerminalManage.pause();
                }

                case 2 -> {
                    finish = true;
                }
            }
            TerminalManage.clearScreen();
        }
    }
}
