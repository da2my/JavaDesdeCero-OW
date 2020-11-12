package interfaces.defecto;

public interface Interfaz {

	public void metodo();// Es un metodo abstracto, es decir de los cuales damos su firma pero no la
							// implementacion

	default public void metodoPorDefecto() {// esta implementacion por defecto hace que si una clase implementa
											// interfaz, si no quiere darle cuerpo al metodo por defecto pues no tiene
											// obligacion de implementarlo y si llamamos a metodo por defecto en una
											// instancia de esa clase se ejecutaria el codigo que tiene por defecto
		System.out.println("Este es uno de los nuevos metodos por defecto");
	}

	public static void metodoEstatico() {// este metodo estatico se puede invocar de diferentes maneras 
		System.out.println("Metodo estatico en un interfaz");
	}

}
