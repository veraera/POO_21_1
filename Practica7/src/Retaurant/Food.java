
package Retaurant;

public class Food {
    
    String name;
    double temperature;
    boolean cutted, cooked;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isCutted() {
        return cutted;
    }

    public void setCutted(boolean cutted) {
        this.cutted = cutted;
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    
    
    
}
