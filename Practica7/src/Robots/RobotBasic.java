
package Robots;

public abstract class RobotBasic {
    
    private String name;
    private String lastOperation = "Ninguna";
    public int batteryLvl = 0;

    public RobotBasic(String name) {
        this.name = name;
    }
    
    public void recharge(){
        lastOperation = "Recargar";
        batteryLvl = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastOperation() {
        return lastOperation;
    }

    public void setLastOperation(String lastOperation) {
        this.lastOperation = lastOperation;
    }

    public int getBatteryLvl() {
        return batteryLvl;
    }
        
    public void useBattery(int i){
    
        batteryLvl = batteryLvl - i;
    
    }
}
