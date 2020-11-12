package tiposdatos;

public class TiposDatosLogicos {

	public static void main(String[] args) {

		/*OPERADORES LOGICOS CONDICIONALES
		 * && operador logico and
		 * || operador logico or
		 * ! negador
		 * ?: (Ternario) es comodo y simplifica el codigo. Si el primer operador es verdadero, devuelve el valor del segundo; en otro caso , devuelve el tercero
		 */
//		int valor1=1;
//		int valor2=2;
//		
//		if ((valor1==1)&&(valor2==2))
//			System.out.println("valor1 es 1 AND valor2 es 2");
//		if ((valor1==1)||(valor2==2))
//			System.out.println("valor1 es 1 OR valor2 es 2");
//		
//		//OPERADOR TERNARIO
//		int result;
//		boolean someCondition = false;
//		result = someCondition ? valor1 : valor2;// Si someCondition es true nos devolvera valo1 y Si someCondition es false nos devolvera valor2
//		System.out.println(result);
//		
//		
//		/*OPERADORES LOGICOS RELACIONALES
//		 * ==
//		 * !=
//		 * <
//		 * <=
//		 * >
//		 * >=
//		 */
//		
//		/*TIPOS DE DATOS DE CARACTERES
//		 * char -> Nos permite almacenar un caracter UNICODE (16 bits)
//		 * java.lang.String -> No es un tipo de dato basico, es un tipo de dato estructurado. Nos permite manejar cadena de caracteres inmutables
//		 */
//		
//		/*CAMBIOS DE TIPOS DE DATOS (CASTING)
//		 * En ocasiones, nos puede interesar realizar un cambio explicito de un tipo de dato.
//		 * Los tipos de datos deben ser compatibles
//		 */
		int a=5;
		int b=9;
		System.out.println(5/9);
		System.out.println(5d/9);// aqui puedo hacer casting directamente con la "d" porque son numeros
		System.out.println((double)a/b);// en cambio aqui para hacer casting es necesario hacerlo "(double)" 
		
		
		
	}

}
