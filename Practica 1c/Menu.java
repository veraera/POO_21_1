public class Menu{

	String opciones[];

	public Menu (String[] opciones){
		this.opciones = opciones;
	}

	public static int selOpcion(String[] opciones){
		
		for(int i = 0; i < opciones.length; i++){
			System.out.println(i+1+" - "+opciones[i]);
		}

		return (Cap.Ent("Ingrese selección: ")); 

	}
}
