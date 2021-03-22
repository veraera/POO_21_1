package AngryBirds;

import Tools.*;
import AngryBirds.*;
import java.util.ArrayList;
import java.util.List;

public class Practica4 {
    public static void main(String [] args){

        // Arreglos de opciones que se imprimen en consola.
        final String n0 [] = {"Nueva partida", "Salir"};
        final String n1 [] = {"Si", "No"};

        // Estos objetos sirven para que el usuario pueda
        // elgir un personaje de una lista determinada.
        MenuSelectBird menuSelectBirdToPlay = new MenuSelectBird();
        MenuSelectBird menuSelectBirdToLaunch = new MenuSelectBird();

        // Lista donde se guardan los objetos Pajaro
        // que el usuario selecciona para jugar.
        List <Pajaro> pajarosSeleccionados = new ArrayList<>();
        // Próximo personaje a lazar
        Pajaro launchingBird;

        TerminalManage.clearScreen(); 
        System.out.println("Angry birds\n\n");

        // Mientras que el usuario seleccione nueva partida se repite el ciclo.
        while(Menu.selOpcion(n0) == 0){
            menuSelectBirdToPlay.setDefaultAvailableBirds();
            System.out.println("Seleccione 3 personajes para jugar: \n");
            for(int i = 0; i < 3; i++){
                 System.out.println("Selecciona a tu pesonaje " + (i+1) + ":");
                 // Se agrega el personaje seleccionado por el
                 // usuario a la lista pajarosSelecciondos.
                 pajarosSeleccionados.add(menuSelectBirdToPlay.getABird());
                 TerminalManage.clearScreen();
            }

            menuSelectBirdToLaunch.setAvailableBirds(pajarosSeleccionados);
            for(int i = 0; i < 3; i++) {
                TerminalManage.clearScreen();
                if(i < 2){
                    System.out.println("Estos son tus personajes disponibles, cual quieres lanzar? ");
                    // El usuario selecciona un personaje,
                    // de la lista pajarosSeleccionados, para lanzar.
                    launchingBird = menuSelectBirdToLaunch.getABird();            
                }else{
                    // Cuando es el útlimo personaje disponible
                    // ya no se pide que el usuario seleccione uno.
                    System.out.println("Ultimo personaje !");
                    launchingBird = menuSelectBirdToLaunch.AvailableBirds.get(0);
                    menuSelectBirdToLaunch.AvailableBirds.clear();
                    TerminalManage.pause();
                }
                TerminalManage.clearScreen();
                System.out.println("Lanzando a " + launchingBird.getNombre());
                // El usuario selecciona si activar o no del personaje que lanzó.
                System.out.println("Quieres activar su poder "+ launchingBird.getPower() + "?");
                if(Menu.selOpcion(n1) == 0){
                    launchingBird.activatePower();
                    TerminalManage.pause();
                }

            }
            System.out.println("No tienes mas jugadores, partida terminada");
            TerminalManage.pause();
            TerminalManage.clearScreen();
        }
    }
}
