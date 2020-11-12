package arrays.bidimensionales;

import java.util.Random;

public class ManejoArraysBidi {

	public static void main(String[] args) {

		final int TOPE = 100;
		int [][] biArray = new int[5][4];
		
		
//		//RELLENA LA MATRIZ CON NUMEROS ALEATORIOS
//		for (int i = 0; i < biArray.length; i++) {
//			for (int j = 0; j < biArray[4].length; j++) {
//				biArray[i][j]=aleatorio(TOPE);
//			}
//		}
//		
//		//PINTA LO QUE SE RELLENO ANTERIORMENTE
//		for (int i = 0; i < biArray.length; i++) {
//			for (int j = 0; j < biArray[4].length; j++) {
//				System.out.print(biArray[i][j]+ "\t");//La \t hace un espacio de tabulador
//				//biArray[0][1]=33;//podemos poner una posicion fija
//			}
//			System.out.println("" + "\n");
//
//		}

		
//		//QUIERO HACER UN FOR EACH CON RANDOM, Y NO ME SALE
//		for (int[] fila : biArray) {
//
//			for(int columna : fila) {
//				System.out.print(columna + "\t");
//			}
//			System.out.println("\n");
//		}
		
		
	
		//OTRO ARRAY PERO CON CHAR
//		char[][] mapaUsuario = new char[10][10];
//		char[][] mapaOrdenador = new char[10][10];
//
//		for (int i = 0; i < mapaUsuario.length; i++) {
//			for (int j = 0; j < mapaUsuario.length; j++) {
//				mapaUsuario[i][j]='A';
//			}
//		}
//
//		
//		for (int i = 0; i < mapaUsuario.length; i++) {
//			for (int j = 0; j < mapaUsuario.length; j++) {
//				System.out.print(mapaUsuario[i][j] + "\t");
//			}
//			System.out.println("" + "\n");
//		}
		
		
		
		

	}
	
	public static int aleatorio(int tope) {
		Random r = new Random();
		return r.nextInt(tope-1);
	}

}
