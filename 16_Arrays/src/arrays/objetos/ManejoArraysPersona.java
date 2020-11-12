package arrays.objetos;

import java.util.Random;

public class ManejoArraysPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Estos dos arrays nos permitir·n obtener valores aleatorios para inicializar
		// los datos
		String[] nombres = { "JosÈ", "Antonio", "MartÌn", "Luis", "MarÌa", "Leticia", "Luisa" };
		String[] apellidos = { "PÈrez", "GÛmez", "LÛpez", "GarcÌa", "MuÒoz", "MartÌnez" };
		int[] edades = { 15, 54, 87, 25,41, 33 };
		//String nom = "Davo";
		// Creamos nuestro array de 5 elementos de tipo Persona
		Persona[] personas = new Persona[5];

		// Inicializamos los valores
		for (int i = 0; i < personas.length; i++) {
			// Obtenemos un nombre de una posiciÛn aleatoria
			String nombre = nombres[aleatorio(nombres.length)];
			// Obtenemos un apellido de una posiciÛn aleatoria
			String apellido = apellidos[aleatorio(nombres.length)];
			
			int edad = edades[aleatorio(nombres.length)];

			// Los usamos para crear una nueva persona
			personas[i] = new Persona(nombre, apellido, edad);
		}

		// Recorremos de nuevo el array, esta vez
		// para imprimir sus valores.
		for (Persona p : personas) {
			System.out.println(p);
		}

	}

	/*
	 * ESTE M…TODO DEVUELVE UN N⁄MERO ALEATORIO ENTRE 0 y TOPE-1.
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();
		return r.nextInt(tope - 1);
	}

}
