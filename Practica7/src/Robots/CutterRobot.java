
package Robots;

import Retaurant.Food;
import javax.swing.JOptionPane;

public class CutterRobot extends RobotBasic implements Cutter{
    
    CuttingTool cuttingTool = new CuttingTool();

    public CutterRobot(String name) {
        super(name);
    }

    @Override
    public void cut(Food food, int pieces) {
        
        if(getBatteryLvl( )- pieces >= 0){
            if(cuttingTool.cut(food, pieces)){
                useBattery(pieces);
                this.setLastOperation("Cortando "+ food.getName() + " en "+ pieces + "!!");
                JOptionPane.showMessageDialog(null, this.getLastOperation());
            }
        }else
            JOptionPane.showMessageDialog(null, "No hay suficiente bateria, recarga antes");
    
    }
    
}
