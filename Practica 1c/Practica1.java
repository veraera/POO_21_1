import java.util.ArrayList;

public class Practica1{

	public static void main(String[] args){
		
		Alumno al1;
		int seleccion , seleccion1;

		//Menú
		String opc[] = {"Imprimir calificaciones y promedio de calificaciones", "Imprimir calificaciones y calificación más baja", "Imprimir calificaciones y calificación más alta", "Salir"};
		Menu menu = new Menu(opc);

		// Capturar objeto alumno nuevo y agregar a lista
		al1 = Operaciones.capturarAlu(Cap.Str("Ingresa nombre: "), Cap.Ent("Ingresa matricula: "), Cap.Ent("Cuantas materias? "));
		Operaciones.clearScreen();

		// Capturar calificaciones para todas las meterias del objeto alumno
		Operaciones.capturarCals(al1);
		Operaciones.clearScreen();
		
		do{

			seleccion = menu.selOpcion(opc);

			switch(seleccion){
				
				// Imprimir el arreglo de materias del objeto alumno
				case 1:
					Operaciones.imprimirCals(al1);
					System.out.println("\nPromedio: "+Operaciones.promedioCals(al1));
					Cap.Str("\nEnter para continuar");
				break;	
				// Imprimir el arreglo de materias y calificacion más baja del objeto alumno 
				case 2:
					Operaciones.imprimirCals(al1);
					Operaciones.masBaja(al1);
					Cap.Str("\nEnter para continuar");
				break;
				// Imprimir el arreglo de materias y calificacion más alta del objeto alumno 
				case 3:
					Operaciones.imprimirCals(al1);
					Operaciones.masAlta(al1);
					Cap.Str("\nEnter para continuar");
				break;
			}
			
			Operaciones.clearScreen();

		}while(seleccion != 4);
		
	}

}
