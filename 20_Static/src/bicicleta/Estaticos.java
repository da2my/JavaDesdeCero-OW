/**
 * 
 */
package bicicleta;

/**
 * @author Openwebinars
 *
 */
public class Estaticos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bicicleta bici1 = new Bicicleta(21, 27, 0);
		Bicicleta bici2 = new Bicicleta(18, 24, 0);

		System.out.println(bici1);
		System.out.println(bici2);

		System.out.println("Total de bicicletas: "+Bicicleta.getNumeroDeBicicletas());// para saber el numero de bicis que tenemos ahora mismo.
																// Como se ve, solamente utilizando el nombre de la
																// clase "Bicicleta" se puede acceder al metodo
																// estatico.

	}

}
