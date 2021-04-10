package Tools;

public class Menu {

    public static int selOpcion(String[] opciones){

        for(int i = 0; i < opciones.length; i++){
            System.out.println(i+1+" - "+opciones[i]);
        }
        
        return (Captura.Entero("\nIngrese selección: ")-1); 
        
    }
}