package Zoo;

public class Oso extends Animal{

    public Oso(String name, int age, float weight) {
        super(name, age, weight);
    }
    
    @Override
    public void talk(){
        System.out.println("BRRRRRR (Sonido oso)");
    }
    
    public void fishing(){
        System.out.println("Pescando");
    }
    
}
