package abstractas.conmetodos;

public class DerivadaConMetodos extends AbstractaConMetodos {

	@Override // Si no queremos que esta clase sea abstract se debe obligatoriamente
				// implementar el metodo en cuestion. Sino nos da ERROR
	public void saludo(String s) {
		System.out.println("Hola " + s);
	}

}
