/**
 * 
 */
package excepciones;

/**
 * @author Openwebinars
 *
 */
public class TratamientoExcepciones04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String[] mensajes = { "En un lugar", "de La Mancha", "de cuyo nombre", "no quiero acordarme" };
		String[] mensajes = { "En un lugar", null, "de cuyo nombre", "no quiero acordarme",
				"no ha mucho tiempo viv�a" };
		try {
			for (int i = 0; i < 5; i++) {// Prueba cambiando el valor del final del recorrido
				System.out.println(mensajes[i].toUpperCase());
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {// la | nos permite darle un tratamiento
																			// comun a estas dos excepciones
			System.err.println("Tratamiento comun a las excepciones");
		}
		System.out.println("Mensaje final");

	}

}
