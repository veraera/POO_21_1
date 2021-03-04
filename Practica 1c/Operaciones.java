import java.util.ArrayList;

public class Operaciones{

	public static Alumno capturarAlu(String nombre, int matricula, int cantidadMaterias){
		Alumno al = new Alumno(nombre, matricula, cantidadMaterias);
		return(al);
	}

	public static void capturarCals(Alumno al){
		for(int i = 0; i < al.calificaciones.length; i++)
			al.calificaciones[i] = new Materia(Cap.Str("Ingresa el nombre de la materia "+(i+1)+": "), Cap.Flo("Ingresa la calificacion: "));
			System.out.println("\n");
	}

	public static void imprimirCals(Alumno al){
		for (Materia i : al.getCalificaciones()){
			System.out.println(i.getNombre()+": "+i.getCalificacion());
		}
			
	}

	public static float promedioCals(Alumno al){
		float promedio = 0;

		for (Materia i : al.getCalificaciones())
			promedio += i.getCalificacion();

		promedio = promedio/al.getCalificaciones().length;

		return promedio;
	}

	public static void masBaja(Alumno al){
		Materia baja = al.getCalificaciones()[0]; 

		for (Materia i : al.getCalificaciones()){
			if(baja.getCalificacion() > i.getCalificacion())
				baja = i;
		}
		System.out.println("\nCalificacion mas baja:\n"+baja.getNombre()+": "+baja.getCalificacion());
	}

	public static void masAlta(Alumno al){
		Materia alta = al.getCalificaciones()[0]; 
		
		for (Materia i : al.getCalificaciones()){
			if(alta.getCalificacion() < i.getCalificacion())
				alta = i;
		}
		System.out.println("\nCalificacion mas alta\n"+alta.getNombre()+": "+alta.getCalificacion());
	}

	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	} 

}