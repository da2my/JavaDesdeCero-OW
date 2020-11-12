package array;

import java.util.Arrays;
import java.util.Random;

public class ManejoMetodosClassArrays {

	public static void main(String[] args) {
		int[] array = new int[100];

		// ARRAY DE 100 POSICIONES
		for (int i = 0; i < array.length; i++) {
			array[i] = aleatorio(100);
		}

		printArray(array);

		// Podemos crear otro array, copia del primero, ampliando su longitud
		int[] otroArray = Arrays.copyOf(array, 200);

		// Podemos ordenar los elementos de un array
		Arrays.sort(otroArray);
		System.out.println("");
		System.out.println("Array ordenado");
		printArray(otroArray);

		// PosiciÛn de un n˙mero aleatorio, si es que est·
		int num = aleatorio(100);
		// int pos = Arrays.binarySearch(array, num);//esta linea de codigo tiene un
		// error
		int pos = Arrays.binarySearch(otroArray, num);// Se puede realizar una busqueda binaria sobre una coleccion
														// ordenada para poder localizar un numero aleatorio si es que
														// esta dentro del array
		System.out.println("");
		if (pos >= 0)
			System.out.printf("El elemento " + num + " esta contenido en el array, en la posiciÛn " + pos);
		else
			System.out.println("El elemento " + num + " no esta en el array");

		// JAVA SE 8
		// El mÈtodo parallelsort realiza una ordenaciÛn m·s r·pida para arrays
		// muy largos
		int[] arrayGrande = new int[123456];
		// Este mÈtodo sirve para inicializar un array con valores
		// y usa una expresiÛn lambda, que aprenderemos a crear
		// en la ˙ltima lecciÛn del curso
		Arrays.parallelSetAll(arrayGrande, i -> aleatorio(12345));
		Arrays.parallelSort(arrayGrande);
	}

	/*
	 * ESTE M…TODO DEVUELVE UN N⁄MERO ALEATORIO ENTRE 0 y TOPE-1.
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();
		return r.nextInt(tope - 1);
	}

	/*
	 * Este mÈtodo imprime un array, indicando para cada elemento su valor y su
	 * posiciÛn
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "[" + i + "]  ");
			if (i > 0 && i % 10 == 0)
				System.out.println("");
		}
		System.out.println("");
	}

}
