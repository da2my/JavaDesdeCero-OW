/**
 * 
 */
package abstractas.conmetodos;

/**
 * @author Openwebinars
 *
 */
public class EjemploAbstractaConMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DerivadaConMetodos derivada = new DerivadaConMetodos();
		derivada.saludar();
		derivada.saludo("Pepe");//esta implementado de la referencia concreta de la clase DerivadaConMetodos

	}

}

	