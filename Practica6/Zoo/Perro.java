
package Zoo;

public class Perro extends Animal{

    public Perro(String name, int age, float weight) {
        super(name, age, weight);
    }
    
    @Override
    public void talk(){
        System.out.println("Woaf !!");
    }
    
    
    
}
