
package Zoo;

public class Veterinario {
    
    String name;
    float salary;

    public Veterinario(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void vaccinate (Animal animal){
        if(animal.isVaccinated()){
            System.out.println("Ya esta vacunado");
        }else{
            animal.setVaccinated(true);
            System.out.println("Vacundado!");
        }
    }
    
    public static void wash (Animal animal){
    
        animal.setWashed(true);
        System.out.println("Bañado!");
        
    }
    
    public static void makeAnimalMove(Animal animal){
        
        animal.move();
        
    }
    
    public static void makeAnimalTalk(Animal animal){
    
        animal.talk();
        
    }
}
