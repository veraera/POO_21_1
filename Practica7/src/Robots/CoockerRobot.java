
package Robots;

import Retaurant.Food;
import javax.swing.JOptionPane;


public class CoockerRobot extends RobotBasic implements Cooker{
    
    public static CoockingTool coockingTool = new CoockingTool();

    public CoockerRobot(String name) {
        super(name);
    }

    @Override
    public void setTemperature(Food food, int temperature) {
       
        if(getBatteryLvl() - (temperature/10) >= 0){
            if(coockingTool.cook(food, temperature)){
                this.useBattery(temperature/10);
                this.setLastOperation("Cocinando "+ food.getName() + " a "+ temperature + " grados C");
                JOptionPane.showMessageDialog(null, this.getLastOperation());
            }
        }else
            JOptionPane.showMessageDialog(null, "No hay suficiente bateria, recarga antes");
    }
}
