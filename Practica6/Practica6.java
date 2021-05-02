
import Tools.Menu;
import Zoo.*;

public class Practica6 {

    public static void main (String [] args){
    
        final String [] n_1 = {"Agregar animal", "Informacion de un animal", "Eliminar un animal", "Veterinario", "Salir"};
        final String [] n_2 = {"Vacunar animal", "Bañar animal", "Hace que se mueva el animal", "Hacer hablar al animal", "Salir"};
        
        int selector = 0;
        int selector_2 = 0;
        
        Animal animalEnVeterinario = null;
        
        do {      
           
            Tools.TerminalManage.clearScreen();
            selector = Menu.selOpcion(n_1);
            Tools.TerminalManage.clearScreen();
            switch(selector){               
                case 0 ->{Zoo.addAnimal();}
                case 1 ->{Zoo.getInfo();}
                case 2 ->{Zoo.delateAnimal();}
                case 3 ->{                
                    do {      
                        Tools.TerminalManage.clearScreen();
                        System.out.println("VETERINARIO\n\n");                       
                        selector_2 = Menu.selOpcion(n_2);
                        if(selector_2 != 4){
                            System.out.println("Qué animal?\n ");
                            animalEnVeterinario = Zoo.getAnimal();
                        }
                        switch(selector_2){
                            
                            case 0 ->{Veterinario.vaccinate(animalEnVeterinario);}
                            case 1 ->{Veterinario.wash(animalEnVeterinario);}
                            case 2 ->{Veterinario.makeAnimalMove(animalEnVeterinario);}
                            case 3 ->{Veterinario.makeAnimalTalk(animalEnVeterinario);}

                        }

                        if(selector_2 != 4){
                            Tools.TerminalManage.pause();
                        }

                    } while (selector_2 != 4);
                    
                }
            
            }
            
            if(selector != 4 && selector_2 != 4)
                Tools.TerminalManage.pause();
            
        } while (selector != 4);
        
    }
    
}
