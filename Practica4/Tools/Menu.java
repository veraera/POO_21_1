package Tools;

/**
 * Clase para imprimir menús en consola.
 */

public class Menu {


    // Retorna un valor númerico correspondiente a la posición de la
    // opción seleccionada por el usuario en el arreglo opciones.

    public static int selOpcion(String[] opciones){

        for(int i = 0; i < opciones.length; i++){
            System.out.println(i+1+" - "+opciones[i]);
        }

        return (Captura.Entero("\nIngrese selección: ")-1); 

    }
}
