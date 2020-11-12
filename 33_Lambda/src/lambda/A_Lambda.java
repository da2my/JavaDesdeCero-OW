/**
 * EJEMPLO DE USO DE EXPRESIONES LAMBDA PARA ORDENAR
 */
package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class A_Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);// lista de enteros a partir de un metodo
																			// static de la clase Arrays, que devuelve
																			// como una lista, una sucesion de elementos
																			// que le proporcionamos

		// 1º Forma: una clase que implementa comparator
//		 lista.sort(new MayorAMenor());

		// 2º Forma: una clase "anonima"
		// ¿Que? tal si ponemos el cursor sobre la instanciacion de la clase
		// anonima y pulsamos Ctrl+1?
		// Eclipse permite convertir esto en una expresion lambda automaticamente,
		// situandonos encima de Comparator, con "⌘+1" en Mac o "Ctrl+1" en Windows.
		// [ Se instancia y declara a la vez, solo utilizada en este punto del
		// codigo. Nos ahorraria el uso de un nuevo fichero, con una clase, con
		// nombre que no vamos a reutilizar nunca mas ]
//		lista.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return -(o1.compareTo(o2));// Sin embargo, el meollo de todo es esta linea de todo para decir que el
//											// orden es de esta manera
//			}
//
//		});

		// 3º Forma: una expresion lambda
		// Se puede hacer explicitamente escribiendo el codigo
		// Los tipos de datos ¡no son obligatorios! Se infieren del contexto
		// De esta manera a sort() en lugar de proporcionarle una instancia de una clase
		// que implementa una Interfaz, le proporcionamos una expresion Lambda. El uso
		// de la expresion Lambda aqui es posible porque la Interfaz Comparator es
		// Funcional, si la Interfaz tuviera 2,3,4 metodos por implementar posiblemente
		// no supiera cual escoger por eso las expresiones Lambda vienen aparejadas a
		// las Interfaces Funcionales
//		lista.sort((Integer n1, Integer n2) -> -(n1.compareTo(n2)));
		// Mas conciso seria ya que lista es un List de <Integer> y el metodo sort()
		// espera un Comparator del tipo de la lista, no seria necesario que nosotros le
		// indicaramos el tipo de los 2 argumentos sino que es capaz de asignarse a
		// traves del contexto
		lista.sort((n1, n2) -> -(n1.compareTo(n2)));

		for (Integer i : lista)
			System.out.println(i);

	}

}
