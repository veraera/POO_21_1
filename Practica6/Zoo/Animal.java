package Zoo;

public class Animal {
    
    String name;
    int age;
    float weight;
    boolean vaccinated = false, washed = false;

    public Animal(String name, int age, float weight) {
        
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    public void sleep()
    {
        
    }
    
    public void eat()
    {
        
    }
    
    public void move()
    {
        System.out.println("Caminando");
    }
    
    public void talk(){
    }
    
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isWashed() {
        return washed;
    }

    public void setWashed(boolean washed) {
        this.washed = washed;
    }
    
    
}
