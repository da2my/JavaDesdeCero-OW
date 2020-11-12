package herencia;

public class Herencia {

	public static void main(String[] args) {

		Trabajador trabajador;
		Empleado empleado;
		Consultor consultor;

		trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
		empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);//Accedemos a Empleado a traves de una referencia de tipo Empleado
		consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);//Accedemos a Consultor a traves de una referencia de tipo Consultor

//		System.out.println(trabajador);
		System.out.println(empleado);
		System.out.println(empleado.calcularPaga());
//		System.out.println(consultor);
//		System.out.println(consultor.calcularPaga());

	}

}
