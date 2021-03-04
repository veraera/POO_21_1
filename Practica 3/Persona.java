public class Persona{

	String nombre, curp, rfc, sexo, entidadFederativa;
	String fechaNacimiento [] = new String [3];

	public Persona(String nombre, String [] fechaNacimiento, String entidadFederativa, String sexo){

		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
		setEntidadFederativa(entidadFederativa);
		setSexo(sexo);

	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setCurp(String curp){
		this.curp = curp;
	}
	public void setRfc(String rfc){
		this.rfc = rfc;
	}
	public void setFechaNacimiento(String [] fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setSexo(String sexo){
		this.sexo = sexo ;
	}
	public void setEntidadFederativa(String entidadFederativa){
		this.entidadFederativa = entidadFederativa;
	}
	public String getNombre(){
		return nombre;
	}
	public String getCurp(){
		return curp;
	}
	public String getRfc(){
		return rfc;
	}
	public String [] getFechaNacimiento(){
		return fechaNacimiento;
	}
	public String getSexo(){
		return sexo ;
	}
	public String getEntidadFederativa(){
		return entidadFederativa;
	}
}
