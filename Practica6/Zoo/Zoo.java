package Zoo;

import Tools.*;
import java.util.ArrayList;

public final class Zoo {
    
    private static ArrayList<Animal> animalesDelZoo = new ArrayList();
    final static String [] typesOfAnimals = {"Oso", "Vaca", "Perro", "Gato", "Pez"};
    
    public static void addAnimal (){
        
        Animal animal = null;
        System.out.println("INFORMACION DEL ANIMAL: \n\nQué tipo de animal es? \n");
        int sel = Menu.selOpcion(typesOfAnimals);
        String name = Captura.Cadena("Qué nombre tiene? ");
        int age = Captura.Entero("Qué edad tiene? ");
        float weight = Captura.Flotante("Cuánto pesa? ");
        
        // -1 para la numeración de las opciones 
        switch (sel){
            
            case 0 -> {animal = new Oso(name, age, weight);}
            case 1 -> {animal = new Vaca(name, age, weight);}
            case 2 -> {animal = new Perro(name, age, weight);}
            case 3 -> {animal = new Gato(name, age, weight);}
            case 4 -> {animal = new Pez(name, age, weight);}   
        
        }
        animalesDelZoo.add(animal);
    }
    
    public static Animal getAnimal( ){
        if(animalesDelZoo.isEmpty()){
            System.out.println("No hay animales");
            return null;
        }else{
            System.out.println("Elija animal: \n");
            Animal animal = animalesDelZoo.get(Menu.selOpcion(getArrayOfNames()));
            return animal;
        }
    }
    
    private static String [] getArrayOfNames(){
        String [] AvailableAnimalsS = new String [animalesDelZoo.size()];
            for(int i = 0; i < animalesDelZoo.size(); i++){
                AvailableAnimalsS [i] = animalesDelZoo.get(i).getName();
            }
        return AvailableAnimalsS;
    }
    
    public static void delateAnimal(){
        if(animalesDelZoo.isEmpty()){
            System.out.println("No hay animales");
        }else{
            System.out.println("Elija animal a elimnar: \n");
            animalesDelZoo.remove(Menu.selOpcion(getArrayOfNames()));
        }
    }
    
    public static void getInfo(){
        
        Animal animal = getAnimal();
        
        if(null != animal){
            TerminalManage.clearScreen();
            System.out.println("INFORMACION DEL ANIMAL: \n\n");
            System.out.println("Tipo de animal: " + animal.getClass().getSimpleName());
            System.out.println("Nombre: " + animal.getName());
            System.out.println("Edad: " + animal.getAge());
            System.out.println("Peso: " + animal.getWeight());
            System.out.println("Vacunado: " + animal.isVaccinated());
            System.out.println("Bañado: " + animal.isWashed());
        }
        
    }
    
    
    
    
}
