/**
 * EJEMPLO DE USO DEL M�TODO FOREACH JUNTO CON EXPRESIONES LAMBDA
 */
package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class B_Foreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1º Forma clasica de imprimir los elementos de una lista
//		for(Integer i: lista)
//			System.out.println(i);

		// 2º Uso de forEach. Nos va a permitir el uso de expresiones Lambda. Podriamos
		// decir que forEach() espera la Interfaz Consumer que nos permite un metodo
		// accept(), representado por "e" elementos, que no devuelve nada asi que
		// nosotros le dariamos cada
		// elemento del ArrayList, es decir de lista a traves de List, ademas se
		// sobreentenderia el tipo y no haria falta ponerlo
//		lista.forEach(e -> System.out.println(e));

		// 3º Uso de referencias a metodos con ::
		// Esta es una abreviatura de la expresion Lambda anterior
//		lista.forEach(System.out::println);

		// 4º Uso de un bloque de sentencias que suma un valor fijo a los
		// elementos de la lista. Expresion Lambda con mas de una sentecia para hacer
		// algun tipo de operaciones como este ejemplo
		lista.forEach((e) -> {
			e = e + 1;
			System.out.println(e);
		});

	}

}
