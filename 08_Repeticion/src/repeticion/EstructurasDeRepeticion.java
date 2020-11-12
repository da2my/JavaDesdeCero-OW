package repeticion;

public class EstructurasDeRepeticion {

	public static void main(String[] args) {

		/*
		 * WHILE
		 * Se evalua expresion al inicion del bucle
		 */

//		int contador = 1;
//		while (contador < 11) {
//			System.out.println("Contador vale: "+ contador);
//			contador++;
//		}
//		
		/*
		 * DO WHILE
		 * Se evalua la expresion al final del bucle
		 * El cuerpo del bucle se ejecuta siempre, al menos, una vez
		 */
		
//		do {
//			System.out.println("Contador vale: "+ contador);
//			contador++;
//		} while (contador < 11);
		
		/*
		 * FOR
		 * Permite repetir un bloque de codigo un numero conocido a priori de veces
		 * Se puede hacer un bucle FOR con un bucle WHILE
		 * Cuando se trabaja con ARRAYS, se puede usar su variante FOR EACH
		 */
		
		for (int cont = 1; cont < 11; cont+=2) {
			System.out.println(cont);
		}
	}

}
