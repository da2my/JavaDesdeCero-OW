package excepciones;

public class ConceptosExcepciones {

	public static void main(String[] args) {

//		EXCEPCIÓN
//		▸ Situación excepcional.
//		▸ Altera la ejecución normal del programa.
//		▸ El método donde sucede crea un objeto,
//		llamado objeto de excepción, y se lo pasa a
//		alguien que pueda tratarlo. 
//		
//		Al producirse esa situacion excepcional, el metodo donde sucede crea un objeto
//		especial; que recoge de alguna manera informacion sobre esa situacion excepcional, 
//		llamado objeto de excepcion y se lo pasa a alguien para que pueda tratarlo.
//		
//		El metodo donde sucede el error es posible que vaya pasando ese objeto de excepcion
//		a diferentes metodos que traten de encontrar alguno que sea capaz de manejar la excepcio
//		
//		Si existe algun metodo tenga el mecanismo necesario para manejar esa excepcion, 
//		sera quien recoga ese objeto para darme el tratamiento que corresponda 
//		
//		Si no llegara a existir ese objeto seria la maquina de JVM la que le daria un tratamiento 
//		por defecto a cualquier excepcion. Ese tratamiento por defecto pasa por imprimir, lo que se 
//		conoce como, la traza de la pila y finalizar la ejecucion del programa
//		
//		La traza de la pila sería imprimir el metodo actual donde nos encontramos, imprimirndo alguna
//		informacion sobre ese error. Y a raiz de ahi el metodo sobre el que habiamos llamado, y el que
//		habiamos llamado anteriormente ... etc. Hasta llegar al metodo main.
		
		
//		USO DE EXCEPCIONES
//		▸ Permiten separar el código de tratamiento
//		de errores del código normal.
//		▸ Evitan que haya errores inadvertidos.
//		▸ Permiten la propagación de los errores.
//		▸ Permiten agrupar en un lugar común el
//		tratamiento de errores. 
		
		
//		TIPOS DE EXCEPCIONES
//		▸ Checked Exceptions:
//		excepciones que son recogidas
//		y tratadas por programas bien
//		escritos. Es decir que no han
//		sido error del programador
//		▸ Error: son externos a la
//		aplicación, y no nos podemos
//		anticipar a ellos.
//		▸ Runtime error: situaciones
//		internas a la aplicación, y de
//		las que no nos podemos
//		recuperar 

		
//		TIPOS DE EXCEPCIONES
//		Usaremos Checked Exceptions cuando:
//		▸ La excepción es la única manera de detectar el
//		error.
//		▸ No queremos que pase inadvertido
//		
//		Usaremos Unchecked Exceptions cuando:
//		▸ Podemos intentar mejorar el código para que no
//		suceda dicho error
//		▸ La excepción sirve para detectar y corregir usos
//		indebidos de la clase.
//		▸ Errores internos ante los que poco podemos
//		hacer. 

		
//		TRATAMIENTO DE EXCEPCIONES
//		
//		try {
//		 instrucciones;
//		} catch (Exception e) {
//		 instruccinoes;
//		} finally {
//		 instrucciones
//		} 
		
//		TRATAMIENTO DE EXCEPCIONES
//		▸ finally no es obligatorio.
//		▸ Puede haber más de un catch.
//		▸ Los tipos de excepción deben ir de más
//		concretos a más genéricos. 
//		Porque si hay varios bloques catch y el primero es de una clase de excepcion
//		muy generico, por ejemplo la clase Exception, directamente ese bloque va a 
//		recoger el tratamiento de esa excepcion  
//		▸ El operador | nos permite tratar más de un
//		tipo de excepción en un mismo catch. 
		
		
//		BLOQUE TRY
//		▸ Debe envolver, encerrar las sentencias que son
//		susceptibles de provocar uno o varios
//		tipos de excepción.
//		▸ Debemos agrupar las sentencias que
//		vayan a tener un tratamiento idéntico de
//		la situación excepcional. 
	
		
		
//		BLOQUE CATCH
//		▸ Puede haber uno, o más de uno.
//		▸ Nos permite definir los manejadores de las
//		excepciones.
//		▸ Cada bloque maneja uno o varios tipos de
//		excepción. Con el operador |
	
		
		
//		BLOQUE FINALLY
//		▸ Se ejecuta siempre (si venimos de try o de
//		catch).
//		▸ Se suele utilizar como código que asegura
//		el cierre de recursos abiertos (ficheros,
//		bases de datos, …).	
		
//		EXCEPCIONES MÁS COMUNES
//
//		ArithmeticException: Errores en operaciones aritméticas
//		ArraryIndexOutOfBoundsException: Índice de array fuera de los límites
//		ClassCastException: Intento de convertir una clase a traves de un casting a un tipo que no es correcto, incompatible
//		IllegalArgumentException: Argumento ilegal en la llamada a un
//		método
//		IndexOutOfBoundsException: Índice fuera de colección,no de un array
//		NegativeArraySizeException: Tamaño de array negativo
//		NullPointerException: Uso de referencia nula
//		NumberFormatException: Formato de número incorrecto
//		StringIndexOutOfBounds: Índice usado en String fuera de los límites 		
		
//		CLASES DE EXCEPCIÓN
//		▸ Heredan métodos de Throwable.
//		▸ Constructores que incluyen la posibilidad
//		de paso de un mensaje.
//		▸ Métodos para obtener información sobre la
//		excepción.
//		▸ printStackTrace() es el método que se
//		invoca cuando no se da un tratamiento a una excepción y que imprime la traza de la pila.
//		https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html 
		
		
		
		//LANZAMIENTO Y PROPAGACION DE EXCEPCIONES
		
//		LANZAMIENTO DE EXCEPCIONES
//		▸ Cualquier código puede lanzar
//		excepciones (hecho por java, por nosotros
//		o de terceros).
//		▸ Si no vamos a tratar las excepciones en un
//		método, tenemos que indicar que se
//		relanzarán hacia arriba (throws), es decir en alguno
//		de los metodos que nos ha invocado.
		
//		USO DE THROWS
//		▸ Un método cuyo código puede producir
//		excepciones puede capturarlas y tratarlas,
//		o relanzarlas para que sea otro quien las
//		trate.
//		Esto suele ser comun cuando nosotros estamos programando algun tipo de clases, 
//		como clases de servicio esos servicios se podrian utilizar para app de escritorio, web o api rest
//		entonces podriamos plantearnos el hecho de que esa exception no la tratemos nosotros dentro del servicio
//		sino que el mensaje que va a visualizar sea el usuario, se pueda propagar, de esa manera podriamos delegar 
//		en la clase que nos ha invocado el tratamiento de la excepcion y el poder decir: continua la ejecucion de esta manera,
//		visualiza este mensaje 
//		
//		▸ throws. Lista separada por comas de tipos
//		de excepción. Nos va a permitir relanzar una excepcion, por ejemplo en este caso, la firma que tenemos
//		seria un metodo qe escribiría una lista presumiblemente en un fichero y que puede que produzca algun 
//		tipo de excepcion de tipo IO (input/output) y que no queremos darle tratamiento en este metodo sino que queremos
//		relanzar, es decir seria el metodo que llamara a writeList() el encargado de tratar esa excepcion
//		
//		public static void writeList() throws IOException {
//		
//		}
		
		
//		EXCEPCIONES PROPIAS
//		▸ Podemos crear nuestros propios tipos,
//		extendiendo a Exception.
//		▸ Nos permiten manejar nuestras propias
//		situaciones.
//		Nos sirve para dar tratamiento asociado a nuestra logica de negocio, entendemos logica de negocio, a lo mas esencial
//		y propio caracteristico de nuestro sistema.
//		Por ejemplo en un sistema bancario de cuentas corrientes y la posibilidad de hacer traspasos entre cuentas de nuestra 
//		entidad, podriamos tener una excepcion que nos indicara cuando una cuenta al hacer un traspaso o al
//		sacar dinero de un cajero se queda con saldo negativo y podriamos crear una excepcion de tipo saldo negativo 
//		
//		public class SaldoNegativoException extends Exception {
//		
//		 public SaldoNegativoException(double saldo) {
//		 super("La cuenta ha quedado en descubierto (" +
//		 Double.toString(saldo) + ")");
//		 }
//		}
		
//		USO DE THROW
//		▸ Nos permite lanzar una excepción en un
//		momento determinado.
//		▸ También se puede usar en el bloque catch,
//		para tratar una excepción, pero aun así
//		relanzarla.
//		
//		public void sacarDinero(double cantidad) throws SaldoNegativoException {
//		 saldo -= cantidad;
//		 if (saldo < 0) {
//		 throw new SaldoNegativoException(saldo);
//		 }
//		}
	
	}

}
