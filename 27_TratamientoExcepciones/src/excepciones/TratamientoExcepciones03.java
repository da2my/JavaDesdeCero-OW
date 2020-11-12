/**
 * 
 */
package excepciones;

/**
 * @author Openwebinars
 *
 */
public class TratamientoExcepciones03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			int a = 2;
			int b = 1;//Prueba cambiando de 1 a 0
			int resultado = a/b;
			String mensaje = null;
			System.out.println(mensaje.length()); 			
		} catch(ArithmeticException ex) {//Error de divisi�n entre 0
//			ex.printStackTrace();
			System.err.println("Error: " + ex.getMessage());
		} catch(Exception ex) {//Error de null
			System.out.println("Se ha producido un error no esperado");
		}
		

	}

}
