
package Robots;

import Retaurant.Food;
import javax.swing.JOptionPane;

public class MagnumOpus extends RobotBasic implements Cutter, Cooker{
    
    public static CuttingTool cuttingTool = new CuttingTool();
    public static CoockingTool coockingTool = new CoockingTool();

    public MagnumOpus(String name) {
        super(name);
    }
    
    @Override
    public void cut(Food food, int pieces) {
        
        if(getBatteryLvl()-pieces >= 0){
            if(cuttingTool.cut(food, pieces)){
                useBattery(pieces);
                this.setLastOperation("Cortando "+ food.getName() + " en "+ pieces + "!!");
                JOptionPane.showMessageDialog(null, this.getLastOperation());
            }
        }else
            JOptionPane.showMessageDialog(null, "No hay suficiente bateria, recarga antes");
    
    }
    
    public void servir(Food food){
        if(food.isCooked()){
            System.out.println("Sirviendo " + food.getName());
        
        }else{
            if(food.isCutted())
                System.out.println("La comida no esta cocida!");
            else
                System.out.println("La comida no esta cocida ni cortada !!");
        }
    
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
