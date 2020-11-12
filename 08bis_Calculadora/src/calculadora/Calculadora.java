package calculadora;

import java.util.Scanner;

import vista.Consola;

public class Calculadora {

	int opcion = 0;
	float valor1, valor2;
	Consola con = new Consola();
	Scanner scan = new Scanner(System.in);

	public int menu() {

		do {

			con.escribeLetrasX("***** [ Calculadora Real ] *****");

			con.escribeLetrasY("\n");
			con.escribeLetrasY("1. Suma");
			con.escribeLetrasY("2. Resta");
			con.escribeLetrasY("3. Multiplicación");
			con.escribeLetrasY("4. División");
			con.escribeLetrasY("5. Resto");
			con.escribeLetrasY("0. Salir del programa");

			con.escribeLetrasY("\n");
			con.escribeLetrasX("Qué función prefiere: ");
			con.escribeLetrasY("\n");

			opcion = scan.nextInt();

			if (opcion == 0) {
				break;
			} else if (opcion < 0 || opcion >= 6) {
				con.escribeLetrasY("\n");
				con.escribeLetrasY("INCORRECTO, ELIJA UNA OPCIÓN VALIDA");

			} else {
				con.escribeLetrasY("\n");

				con.escribeLetrasX("Introduzca primer valor a operar:");
				valor1 = scan.nextFloat();
				con.escribeLetrasX("Introduzca segundo valor a operar:");
				valor2 = scan.nextFloat();

				switch (opcion) {
				case 1:
					con.escribeLetrasX("Resultado: ");
					con.escribeNumX(valor1 + valor2);
					con.escribeLetrasY("");
					break;
				case 2:
					con.escribeLetrasX("Resultado: ");
					con.escribeNumX(valor1 - valor2);
					con.escribeLetrasY("");
					break;
				case 3:
					con.escribeLetrasX("Resultado: ");
					con.escribeNumX(valor1 * valor2);
					con.escribeLetrasY("");
					break;
				case 4:
					con.escribeLetrasX("Resultado: ");
					con.escribeNumX(valor1 / valor2);
					con.escribeLetrasY("");
					break;
				case 5:
					con.escribeLetrasX("Resultado: ");
					con.escribeNumX(valor1 % valor2);
					con.escribeLetrasY("");
					break;

				default:

					break;
				}
			}

		} while (opcion != 0);

		return opcion;
	}

}
