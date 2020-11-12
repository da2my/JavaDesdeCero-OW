package array;

public class ManejoArrays {

	public static void main(String[] args) {

		/*
		 * QUE ES UN ARRAY?
		 * 
		 * Es un contenedor de elementos de un mismo tipo, con un tamaño fijo
		 * 
		 * Su longitud se establece en el momento de crearlo
		 * 
		 * Cada item de un array se suele llamar elemento
		 * 
		 * Se comienza a contar en cero
		 * 
		 * nos permitira albergar diferentes elementos en cada posicion de ese array
		 */

		/*
		 * CREACION DE UN ARRAY
		 * 
		 * Debemos indicar el tipo de dato y el tamaño
		 * 
		 * Tenemos que usar el operador new
		 * 
		 * int [] unArray = new int [10];
		 * 
		 * "int" Tipo de dato del array | "[]" los corchetes indican que es un array |
		 * "unArray" nombre del array | "int" tipo de dato del array |"[]" tamaño del
		 * array
		 * 
		 * 
		 */

		/*
		 * OPERADOR []
		 * 
		 * Nos permite accder a una posicionm concreta de un array
		 * 
		 * Es de lectura y escritura
		 * 
		 */

//		//Asignacion de un elemento
//		int [] unArray = new int[1];
//		unArray [1] = 100;
//		
//		//Lectura de un elemento
//		System.out.println(unArray[1]);

		/*
		 * INICIALIZACION DE UN ARRAY
		 * 
		 * Consiste en darle valores iniciales
		 * 
		 * Lo podemos hacer de varias formas:
		 * 
		 * -----Elemento a elemento
		 * 
		 * -----Atajo mediante la sintaxis con { }
		 * 
		 * -----Mediante un bucle (cuando la lógica del programa lo permita).
		 */

		// CREACION EN INICIALIZACION ELEMENTO A ELEMENTO
		int [] unArray = new int[10];
//		unArray[0] = 100;
//		unArray[1] = 200;
//		unArray[2] = 300;
//		unArray[3] = 400;
//		unArray[4] = 500;
//		unArray[5] = 600;
//		unArray[6] = 700;
//		unArray[7] = 800;
//		unArray[8] = 900;
//		unArray[9] = 1000;
//		
//		//Recorrido de todos los valores del array con un for
		for (int i = 0; i < unArray.length; i++) {
			System.out.println(unArray[i]);
		}	
//		//Recorrido de todos los valores del array con un for each
//		for(int j : unArray) {
//			System.out.println(j);
//		}

		// CREACION EN INICIALIZACION CON EL ATAJO { }
		// En este caso, el tamaño lo determina la cantida de valores que inicializamos
//		System.out.println("***[Array normal con for each]***" + "\n");
//		
//		int[] unArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//
//		// Recorrido de todos los valores de un array don el bucle for each
//		for (int i : unArray) {
//			System.out.println(i);
//		}
//		
//		System.out.println("\n");

		/*
		 * ARRAY DE OBJETOS
		 * 
		 * Podemos crear un array de cualquier clase
		 * 
		 * La sintaxis es identica a los tipos primitivos
		 * 
		 * Persona [] unArray = new Persona[10];
		 * 
		 * La iniciacion requiere del uso de new
		 * 
		 * unArray [1] = new Persona(...);
		 */

		/*
		 * ARRAYs MULTIDIMENSIONALES
		 * 
		 * Podemos crear arrays de más de una dimensión.
		 * 
		 * Tan solo tenemos que añadir otra pareja de corchetes.
		 * 
		 * int[][] biArray = new int[10][20];
		 * 
		 * Para acceder a sus elementos, tenemos que usar también el doble corchete.
		 * 
		 * biArray[3][4] = 78;
		 * 
		 * Para recorrerlos necesitamos bucles anidados.
		 * 
		 * for (int i = 0; i < biArray.length; i++) { for (int j = 0; i <
		 * biArray[0].length; j++) { System.out.println(unArray[i][j]); } }
		 */
//		System.out.println("***[Array bidimensional]***" + "\n");
//		
//		int[][] biArray = new int[6][7];
//
//		biArray[3][4] = 78;
//		
//		for (int i = 0; i < biArray.length; i++) {
//			for (int j = 0; j < biArray[0].length; j++) {
//				System.out.print(biArray[i][j] + "\t");
//			}
//			System.out.println("" + "\n");
//		}

	}

}
