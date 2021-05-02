
package Zoo;

public class Pez extends Animal{

    public Pez(String name, int age, float weight) {
        super(name, age, weight);
    }
    
    @Override
    public void talk(){
        System.out.println("Blup blup (Ruido de pez)");
    }
    
    @Override
    public void move(){
        System.out.println("Nadando");
    }
    
}
