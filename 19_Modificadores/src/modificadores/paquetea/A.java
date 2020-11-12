package modificadores.paquetea;

class A {//Su modificador de acceso esta por defecto, es decir que todas las clases del mismo paquete podrian accedes a esta clase A

	String a;

	A() {
		a = "Hola desde A";
	}

	void setA(String a) {
		this.a = a;
	}

	String getA() {
		return this.a;
	}

}
