package decision;

public class EstructurasDeDecision {

	public static void main(String[] args) {

		/*SWITCH 
		 * Podemos usar un caso por defecto defaultt (parecido al else)
		 */

		int mes = 6 ;
		int numDias = 0;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDias = 30;
			break;
		case 2:
			// sin tener mes bisiesto para que no se haga mas complicado
			numDias = 28;
			break;
		default:
			System.out.println("Mes no valido");
			break;
		}
		System.out.println("Numero de dias = " + numDias);
	}

}
