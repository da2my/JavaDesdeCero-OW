package usodestringbuilder;

public class ConceptosStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		¿POR QUÉ STRINGBUILDER?
//				▸ String es inmutable. Es decir, es una clase cuyo valor una vez inicializado no se pude modificar
//				▸ Un objeto StringBuilder es un String que se puede modificar. Y por ende mas eficiente para cadenas que va a ser
//				  crearla y utilizarla tal cual	
//				▸ Métodos más eficientes. 

//		TAMAÑO Y CAPACIDAD//a la hora de constuir una instancia de tipo StringBuilder, tenemos que tener en cuenta estos conceptos 
//			▸ Tamaño: length(). (Igual que String) es decir el numero de caracteres que tenga
//			▸ Capacidad: número de caracteres que puede alojar. capacity() StringBuilder incorpora el concepto de capacidad,
//			  podemos crear una instancia de StringBuilder que tenga un tamaño menor a la capacidad que tenga, es decir al cual
//			  le quepan todavia mas caracteres, pueda alojar un nmero de caracteres superior. De hecho cuando nosotros creamos
//			  una instancia de StringBuilder con su constructor sin parametros, crea un StringBuilder vacio pero con una capacidad
//			  de 16 caracteres, es decir si invocaramos directamente al length() devolveria 0 pero si invocamos capacity() devolveria
//			  16

//		Constructor Descripción:
//		StringBuilder(): Crea uno vacío, con capacidad = 16
//		StringBuilder(CharSequence cs): Crea uno con los caracteres de cs, y 16 elementos
//		vacíos adicionales.
//		StringBuilder(int initialCapacity): Crea uno vacío, con la capacidad initialCapacity
//		StringBuilder(String s): Crea uno con los caracteres de s, y 16 elementos
//		vacíos adicionales.

//		TAMAÑO Y CAPACIDAD
//			// creates empty builder, capacity 16
//			StringBuilder sb = new StringBuilder();
//			// adds 9 character string at beginning
//			sb.append("Greetings"); 

//		MÉTODOS DE TAMAÑO Y
//		CAPACIDAD
//		Método Descripción
//		void setLength(int newLength): Cambia la longitud. Si newLength es menor que la
//		actual, los últimos caracteres, los que quedan a la derecha son truncados, es decir que se perderian.
//		Si es mayor, se añaden elementos vacíos.
//		
//		void ensureCapacity(int minCapacity): Nos asegura que la capacidad sea mayor o igual
//		que minCapacity.
//		
//		Algunos métodos, como append(), pueden aumentar, agregar la capacidad, añadir nuevos caracteres de nuestro StringBuilder.

		
//		OPERACIONES CON STRINGBUILDER
//		
//		Método Descripción
//		StringBuilder append(String s)
//		StringBuilder append(tipoPrimitivo t)
//		Añade el argumento que hemos pasado al
//		StringBuilder. Si el dato no es String, se
//		convierte antes de pasarlo.
//		
//		StringBuilder delete(int start, int end)
//		StringBuilder deleteCharAt(int index)
//		Eliminan una secuencia de caracteres o un
//		carácter.
//		
//		StringBuilder insert(int offset, String s)
//		StringBuilder insert(int offset,
//		tipoPrimitivo t)
//		Inserta el segundo argumento en la cadena.
//		El primer entero indica la posición. El offset lo q indica es la posicion a partir de la cual se va a insertar  
//		
//		StringBuilder replace(int start, int end,
//		String s)
//		void setCharAt(int index, char c)
//		Reemplaza un carácter o una serie de ellos
//		
//		StringBuilder reverse() Devuelve la cadena invertida
//		
//		String toString() Transforma el StringBuilder en un String. 

	}

}
