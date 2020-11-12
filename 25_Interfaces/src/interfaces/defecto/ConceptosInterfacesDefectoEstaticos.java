package interfaces.defecto;

public class ConceptosInterfacesDefectoEstaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * MÉTODOS POR DEFECTO
		 * 
		 * ▸ Novedad en Java 8
		 * 
		 * ▸ default.
		 * 
		 * ▸ Un método puede tener una implementación por defecto, descrita en la
		 * interfaz. Hace que el interfaz tenga codigo, que en versiones anteriores no
		 * era posible
		 * 
		 * Aquellos metodos que sean por defecto deben incluir antes de modificador de
		 * acceso la palabra default, si una clase implemnta esta interfaz y no tiene
		 * ningun tipo de sentencia que añadir, es decir le vale la implementacion por
		 * defecto, no tiene la obligacion de sobreescribir esa implementacion por
		 * defecto
		 * 
		 * public interface Interfaz {
		 * 
		 * default public void metodoPorDefecto(){
		 * 
		 * System.out.println("Este es uno de los nuevos métodos por defecto");
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * MÉTODOS ESTÁTICOS
		 * 
		 * ▸ Novedad en Java 8
		 * 
		 * ▸ static.
		 * 
		 * ▸ Misma sintaxis que los métodos estáticos en clases
		 * 
		 * si queremos situar un codigo que sea estatico y que no este en una clase sino
		 * en una determinada interfaz tambien se pude hacer
		 * 
		 * public interface Interfaz {
		 * 
		 * public static void metodoEstatico() {
		 * 
		 * System.out.println("Método estático en un interfaz");
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
