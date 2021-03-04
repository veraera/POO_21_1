public class Operaciones{

	public static String generarCurpRfc(Persona p, int opcion){

		String primerNombre, primerApellido, segundoApellido, base = "", homo;
		String[] _nombre = p.nombre.split(" ");
		int i = 0;

		primerNombre = _nombre[0];
		primerApellido = _nombre[_nombre.length-2];
		segundoApellido = _nombre[_nombre.length-1];
		base = base + primerApellido.charAt(0) + primerVocalde(primerApellido) + segundoApellido.charAt(0) + primerNombre.charAt(0);
		base = base + p.fechaNacimiento[0]+ p.fechaNacimiento[1] + p.fechaNacimiento[2];

		if (opcion == 0){
			base = base + p.sexo + p.entidadFederativa;
			base = base + primerConsonantede(primerApellido) + primerConsonantede(segundoApellido) + primerConsonantede(primerNombre);
			base = base + (int) (Math.random()*10) + (int) (Math.random() * 10);
		}else{
			homo = String.valueOf((char) ('a' + Math.random() * ('z'-'a' + 1))) + String.valueOf((char) ('a' + Math.random() * ('z'-'a' + 1)));
			homo = homo.toUpperCase();
			base = base + homo + (int) (Math.random()*10);
		}

		return base;
	}

	public static char primerVocalde(String str){
		int i = 0;
		do{ i++; } while (!(esVocal(str.charAt(i))));
		return str.charAt(i);
	}

	public static char primerConsonantede(String str){
		int i = 0;
		do{ i++; } while (esVocal(str.charAt(i)));
		return str.charAt(i);
	}

	public static boolean esVocal(char ch){

		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
			return true;
		}else{return false;}

	}


}