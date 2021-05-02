
package Robots;

import Retaurant.Food;
import javax.swing.JOptionPane;

public class CoockingTool {
    
    public boolean cook(Food food, int temperature){
        
        if(food != null){
            if(!food.isCooked()){
                if(food.isCutted()){
                    food.setTemperature(temperature);
                    food.setCooked(true);
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "No puede cocinarse, aún no esta cortado !");
                    return false;
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ya esta cocida");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay comida seleccionada");
            return false;
        }
    }
    
}

