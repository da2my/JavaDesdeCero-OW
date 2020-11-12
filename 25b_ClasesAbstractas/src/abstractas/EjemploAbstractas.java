/**
 * 
 */
package abstractas;

/**
 * @author Openwebinars
 *
 */
public class EjemploAbstractas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//AbstractaSencilla abstracta = new AbstractaSencilla();//Es imposible hacer una instancia de AbstractaSencilla() puesto que esta definida como abstract
		AbstractaSencilla derivada = new Derivada();// Si podemos crear instancias de Derivada() ya que como cualquier tipo de herencia de clases, la clase AbstractaSencilla como el tipo de referencia en el que vamos a guardar esta instancia    
		
		derivada.saluda();

	}

}
