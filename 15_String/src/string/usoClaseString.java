package string;

public class usoClaseString {

	public static void main(String[] args) {


		//LONGITUD DE UNA CADENA DE CARACTERES
//		String saludos = "Hola a todos";
//		System.out.println(saludos.length());
		
		//CONCATENAR
//		String nombre = "Mi nombre es ".concat("Davo");
//		String nombre2 = "Mi nombre es " + "Davo";
//		System.out.println(nombre);
//		System.out.println(nombre2);
		
		//MAYUSCULAS - MINUSCULAS
//		String cadena = "En un lugar de La Mancha";
//		System.out.println(cadena);
//		System.out.println(cadena.toLowerCase());
//		System.out.println(cadena.toUpperCase());
		
		//STRING FORMAT
//		String nombre = "Davo";
//		String apellidos = "Mena";
//		String mensaje = "Que tal estas?";
		
//		System.out.println("Hola, soy " + nombre + " " + apellidos + ", y quiero saludarte diciendote " + mensaje);
		
//		String str = String.format("Hola, soy %s %s y quiero saludarte diciendote %s", nombre, apellidos, mensaje);
//		System.out.println(str);
//		System.out.printf("Hola, soy %s %s y quiero saludarte diciendote %s", nombre, apellidos, mensaje);

		//METODOS DE COMPARACION
		String quijote = "En un lugar de La Mancha";
		
		System.out.println(quijote.endsWith("La Mancha"));//true si la cadena de caracteres que le pasamos como argumentos es el final de la cadena de caracteres sobre la que estamos llamando al metodo  		
		System.out.println(quijote.startsWith("En un lugar"));//true si	la cadena de caracteres sobre la cual estamos llamando al metodo comienza como la que le proporcionamos como argumento	
		System.out.println(quijote.contains("lugar"));//busca en medio de la cadena de caracteres para indicar si contiene esa secuencia de caracteres y devuelve true
		
		
	}
}
