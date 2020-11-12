package conthrows;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author Openwebinars
 *
 */
public class EjemploConThrows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			try {
				writeList();
				System.out.println("Fichero escrito correctamente");
			} catch (IOException e) {
				System.out.println("Error al intentar abrir un fichero de texto");
			}
	}
	
	public static void writeList() throws IOException{//throws IOException relanza hacia arriba la excepcion al metodo que lo invoca
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		
		for(int i = 0; i < 11; i++) {
			out.println("Mensaje nº " + i); 
		}
		
		out.close();//cerrar una instancia de un fichero, de un flujo de salida
	}

}
