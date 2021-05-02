
package Robots;

import Retaurant.Food;
import javax.swing.JOptionPane;

public class CuttingTool {
    
    public boolean cut(Food food, int pieces) {
        if(food != null){
            if(!food.isCutted()){
                food.setCutted(true);
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Ya esta cortado !");
                return false;
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay comida seleccionada");
            return false;
        }
    }
    
}
