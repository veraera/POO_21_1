public class Materia{

	String nombre;
	float calificacion;

	public Materia(String nombre, float calificacion){
		this.calificacion = calificacion;
		this.nombre = nombre;
	}
	public void setCalificacion(float calificacion){
		this.calificacion = calificacion;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public float getCalificacion(){
		return calificacion;
	}
}