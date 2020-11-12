/**
 * EJEMPLO DEL USO DEL API STREAM JUNTO CON EXPRESIONES LAMBDA
 */
package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class C_ApiStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1º Imprimir todos los elementos de la lista

//		lista
//			.stream()
//				.forEach(System.out::println);

		// 2º Imprimir solo los mayores o iguales que 5. filter()
		// Se puede utilizar el API STREAM a partir del Stream que tienen todas
		// las colecciones.
		// Podriamos transformar una lista con un metodo .stream() de la
		// Interfaz Stream.
		// Stream es una Interfaz, que es parametrizada y en nuestro caso es un Stream
		// de numeros enteros para poder trabajar con ella.
//		lista
//			.stream()
//			.filter((x) -> x >= 5)
//			.forEach(System.out::println);

		// 3º Imprimir solo los mayores o iguales que 5, ordenados inversamente
//		lista
//			.stream()
//			.filter((x) -> x >= 5)
//			.sorted((n1, n2) -> -(n1.compareTo(n2)))
//			.forEach(System.out::println);

		// 4º Sumar todos los elementos mayores o igual que 5. Se puede agruapar todos
		// los valores en un solo valor haciendo antes una transformacion de los
		// distintos valores, lo que se conoce como un "mapeo"
		int resultado = lista
								.stream()
								.mapToInt(v -> v.intValue())
								.filter((x) -> x >= 5)
								.sum();
		System.out.println(resultado);

	}

}
