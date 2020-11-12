package modificadores;

import paquetec.C;

public class Modificadores {

	public static void main(String[] args) {
		
//		A a = new A(); //A no es accesible, aunque estÈ en un subpaquete
		B b = new B();
		System.out.println(b.b); // Esta opciÛn no suele ser recomendable
		System.out.println(b.getB());

		C c = new C();
		// System.out.println(c.c); //Si intentamos acceder al atributo, error
		System.out.println(c.getC());
		
	}

}
