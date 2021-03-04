public class Alumno{

	String nombre;
	int matricula;
	Materia calificaciones[];

	public Alumno(String nombre, int matricula, int cantidadMaterias){

		setNombre(nombre);
		setMatricula(matricula);
		calificaciones = new Materia [cantidadMaterias];
		
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	public void setCalificaciones(Materia [] calificaciones){
		this.calificaciones = calificaciones;
	}
	public String getNombre(){
		return nombre;
	}
	public int getMatricula(){
		return matricula;
	}
	public Materia [] getCalificaciones(){
		return calificaciones;
	}
}
