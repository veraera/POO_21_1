
package Retaurant;

import Robots.RobotBasic;
import Robots.CoockerRobot;
import Robots.CutterRobot;
import Robots.MagnumOpus;
import java.util.ArrayList;

public class Kitchen {
    
     public static ArrayList <Food> coockingFoods = new ArrayList();
     public static CutterRobot cutter = new CutterRobot("Cortador");
     public static CoockerRobot coocker = new CoockerRobot("Cocinero");
     public static MagnumOpus magnus = new MagnumOpus("Magnum");
     
     public static void addFood(String name){     
         coockingFoods.add(new Food(name));        
     }
     
     public static Food getFood(int foodNumber){
         return coockingFoods.get(foodNumber);     
     }
     
     public static void removeFood(int foodNumber){
         coockingFoods.remove(foodNumber);
     }   
}
