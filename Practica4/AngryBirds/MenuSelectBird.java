package AngryBirds;
import Tools.Menu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase para seleccionar un objeto de tipo Pajaro
 * de una lista de personajes disponibles.
 */

public class MenuSelectBird extends Menu{
    
    public List<Pajaro> AvailableBirds;
    Pajaro selectedBird;

    // Retorna el objeto Pajaro seleccionado por el usuario de la lista AvailableBirds
    public Pajaro getABird(){
        int n = selOpcion(getArrayOfNames());
        selectedBird = AvailableBirds.get(n);
        AvailableBirds.remove(n);
        return selectedBird;
    }

    // Crea un arreglo con los nombres de los objetos Pajaro en la lista AvailbleBirds
    public String [] getArrayOfNames(){
        String [] AvailableBirdsS = new String [AvailableBirds.size()];
        for(int i = 0; i < AvailableBirds.size(); i++){
            AvailableBirdsS [i] = AvailableBirds.get(i).getNombre();
        }
        return AvailableBirdsS;
    }

    public List<Pajaro> getAvailableBirds() {
        return AvailableBirds;
    }

    public void setAvailableBirds(List<Pajaro> AvailableBirds) {
        this.AvailableBirds = AvailableBirds;
    }

    // Asigna un valor por defecto a AvailbleBirds
    public void setDefaultAvailableBirds() {
        this.AvailableBirds = new ArrayList<Pajaro>(
            Arrays.asList(new Red(7), new Blue(4), new Chuck(5), new Matilda(12), new Plata(2))
        );
    }
    
    
}
