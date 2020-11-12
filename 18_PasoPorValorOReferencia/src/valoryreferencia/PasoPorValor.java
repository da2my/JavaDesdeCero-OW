package valoryreferencia;

public class PasoPorValor {

	public static void main(String[] args) {

		int x = 3;
		// invocamos el metodo y por parametro le pasamos x, que será una copia de su
		// valor
		pasoPorValor(x);

		// imprimimos x y vemos si el parametro ha cambiado
		System.out.println("Después de invocar pasoPorValor, x = " + x);
	}

	// cambiamos el valor en el mÈtodo
	public static void pasoPorValor(int p) {// Aunque el valor de la variable p sea 10, al utilizar el metodo con la
											// copia "x" pasada por parametro; se va a ver setteado, destruida el valor de p
		p = 10;
	}

}
