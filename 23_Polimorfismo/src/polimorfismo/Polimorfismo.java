package polimorfismo;

public class Polimorfismo {

	public static void main(String[] args) {
		
//		Al crear estas referencias de los objetos, diferente que en el caso de las Herencia, es decir haciendo que las referencias de todas las instancias sean Trabajador *1
		Trabajador trabajador;
		Trabajador empleado;
		Trabajador consultor;
		
		trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
		empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);
		consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);
		
		
//		saludar(trabajador);
//		saludar(empleado);
//		saludar(consultor);
		
		imprimirNombreYPaga(trabajador);
		imprimirNombreYPaga(empleado);
		imprimirNombreYPaga(consultor);
		

	}
	
	public static void saludar(Trabajador t) {//*1 podemos utilizar este metodo static para saludar a cualquier Trabajador
		System.out.println("Hola, " + t.getNombre());
	}
	
	public static void imprimirNombreYPaga(Trabajador t) {// *1 y con una referencia de tipo Trabajador, en el parametro de este metodo, nos habilita para poder imprimir nombre y paga a cualquier Trabajador
		System.out.printf("El trabajador %s tiene una paga de %.2f€ %n", t.getNombre(), t.calcularPaga());//cuando se invoca al metodo calcularPaga() este accede al metodo que esta hecho en cada una de las subclases ya que con el concepto de ocultación queda, valga la redundancia, oculto al metodo calcularPaga() de la superclase. Notese, ya que la superclase tiene tambien el metodo calcularpaga() si hay un objeto instanciado de Trabajador sera afectado por dicho metodo. Pero a los demas objetos queda oculto
	}

	
	
	/*
	 * POLIMORFISMO (conclusion)
	 * 
	 * Como podemos comprobar aqui, se ha producido este polimorfismo. Es decir en
	 * tiempo de ejecucion Java ha decidido cual es el tipo concreto de Trabajador,
	 * de Empleado o de Consultor y ha llamado al metodo calcularPaga() de cada uno
	 * de ellos.
	 */
}
