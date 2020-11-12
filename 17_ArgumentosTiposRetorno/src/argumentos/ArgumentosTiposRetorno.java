package argumentos;

import java.awt.Rectangle;

public class ArgumentosTiposRetorno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		imprimeMensajes("En un lugar", "de La Mancha");
		imprimeMensajes("de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo");
		imprimeMensajes("...");
		imprimeMensajes();

		// Especifica un punto, como su nombre indica, en el plano cartesiano
//		Punto p = new Punto(4, 6);
//		System.out.println(p);

		// Esto define la construccion de un rectangulo en el plano cartesiano
//		Punto p1 = new Punto(0, 5);
//		Punto p2 = new Punto(5, 5);
//		Punto p3 = new Punto(0, 0);
//		Punto p4 = new Punto(5, 0);
//		Rectangulo r = new Rectangulo(p1, p2, p3, p4);

		// Otra forma de construir el rectangulo
//		Rectangulo r = new Rectangulo(new Punto(0, 5), new Punto(5, 5), new Punto(0, 0), new Punto(5, 0));

//		System.out.println(r);
	}

	public static void imprimeMensajes(String... mensajes) {// Metodo definido con Varargs || Se puede recibir otro tipo
															// de argumento junto con el varargs pero tiene que ser siempre antes
															// de el
		for (String mensaje : mensajes) {
			System.out.print(mensaje + " ");
		}
		System.out.println("");

	}
}
