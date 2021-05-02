package Zoo;

public class Vaca extends Animal{

    public Vaca(String name, int age, float weight) {
        super(name, age, weight);
    }

    @Override
    public void talk(){
        System.out.println("Muuuuu ");
    }
  
    
}
