public class Practica3{

	public static void main(String [] args){

		// Varaibles para ingresar los datos
		
		String nombre;
		String fecha [] = new String [3];
		String entidadFederativa;
		String sexo;
		String claves [] = {"Aguascalientes	AS",
						"Baja California	BC",
						"Baja California Sur	BS",
						"Campeche	CC",
						"Chiapas	CS",
						"Chihuahua	CH",
						"Coahuila	CL",
						"Colima	CM",
						"Distrito Federal	DF",
						"Durango	DG",
						"Guanajuato	GT",
						"Guerrero	GR",
						"Hidalgo	HG",
						"Jalisco	JC",
						"México	MC",
						"Michoacan	MN",
						"Morelos	MS",
						"Nayarit	NT",
						"Nuevo León NL",
						"Oaxaca	OC",
						"Puebla	PL",
						"Querétaro	QT",
						"Quintana Roo	QR",
						"San Luis Potosí	SP",
						"Sinaloa	SL",
						"Sonora	SR",
						"Tabasco	TC",
						"Tlaxcala	TL",
						"Tamaulipas	TS",
						"Veracruz	VZ",
						"Yucatán	YN",
						"Zacatecas	ZS"
					};

		// Arreglo de 3 objetos Persona

		Persona personas [] = new Persona [3];

		System.out.println("El programa solicitara los datos de 3 personas: ");


		// Ciclo para ingresar la información de los 3 objetos Persona

		for (int i = 0 ; i < personas.length; i++){

			Cap.clearScreen();

			nombre = Cap.Str("Ingresa nombre completo de la persona "+ (i+1) + " iniciando con los nombres: ").toUpperCase();

			fecha[0] = Cap.Str("Ingresa los ultimos 2 digitos del anio de nacimiento: ");
			fecha[1] = Cap.Str("Ingresa 2 digitos correspondientes al numero del mes de nacimiento: ");
			fecha[2] = Cap.Str("Ingresa 2 digitos correspondientes al numero del dia de nacimiento: ");

			if(Cap.Str("Conoces la clave de sus entidad federativa (s/n) ? :").charAt(0) == 's'){
				entidadFederativa = Cap.Str("Ingresa la clave de la entidad federativa: ").toUpperCase();
			}else{
				entidadFederativa = claves[Menu.selOpcion(claves)-1];
				entidadFederativa = String.valueOf(entidadFederativa.charAt(entidadFederativa.length()-2)) + String.valueOf(entidadFederativa.charAt(entidadFederativa.length()-1));
			}
			
			sexo = Cap.Str("Ingrese sexo (H/M) : ").toUpperCase();

			personas[i] = new Persona (nombre, fecha, entidadFederativa, sexo);

		}

		// Calculando RFC y CURP

		personas[0].setCurp(Operaciones.generarCurpRfc(personas[0],0));
		personas[1].setRfc(Operaciones.generarCurpRfc(personas[1],1));
		personas[2].setCurp(Operaciones.generarCurpRfc(personas[2],0));
		personas[2].setRfc(Operaciones.generarCurpRfc(personas[2],1));

		Cap.clearScreen();

		// Imprimiendo resultados

		System.out.println("Persona 1: " + personas[0].getNombre()+"\nCURP: " + personas[0].getCurp());
		System.out.println("\nPersona 2: " + personas[1].getNombre()+"\nRFC: " + personas[1].getRfc());
		System.out.println("\nPersona 3: " + personas[2].getNombre()+"\nCURP: " + personas[2].getCurp() + "\nRFC: "+ personas[2].getRfc());

	}
}