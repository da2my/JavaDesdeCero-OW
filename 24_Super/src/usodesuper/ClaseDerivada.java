package usodesuper;


public class ClaseDerivada extends ClaseBase {
	
	private String otroMensaje;
	
	public ClaseDerivada() {
		super("Desde la clase derivada");
	}
	
	public ClaseDerivada(String mensaje, String otro) {//Este constructor tiene 2 funciones segun sus argumentos, 1. envolver el constructor de la claseBase con este, sobreescribiendolo, al utilizar super() y se ejecutaria correctamente. 2. o/y proporcionar otro mensaje utilizando su atributo propio de clase
		super(mensaje);
		this.otroMensaje = otro;
	}
	
	
	public void imprimir() {
		super.imprimir();
		//System.out.println("Saludo desde la clase derivada");
		System.out.println(otroMensaje);//Este mensaje se pasa desde el constructor
	}
}
