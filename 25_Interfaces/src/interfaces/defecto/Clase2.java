package interfaces.defecto;

public class Clase2 implements Interfaz {

	@Override
	public void metodo() {
		System.out.println("Otro metodo");
	}

	@Override
	public void metodoPorDefecto() {//Esta clase esta sobreescribiendo al metodo metodoPorDefecto()
		System.out.println("Mi propia implementacion del metodo por defecto");
	}
	
	
	
	

}
