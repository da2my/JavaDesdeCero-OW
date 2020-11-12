package lambda;

import java.util.Comparator;

public class MayorAMenor implements Comparator<Integer> {

	
	/*
	 * ESTE METODO SOBREESCRIBE EL "ORDEN NATURAL"
	 * DE LOS NUMEROS DE FORMA QUE:
	 * 
	 * - Si el primer numero es menor que el segundo, devuelve un valor positivo.
	 * - Si son iguales devuelve un cero.
	 * - Si el primer numero es mayor que el segundo, devuelve un valor negativo.  
	 */
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return -(o1.compareTo(o2));
	}
	
	

}
