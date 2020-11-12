package interfaces;

public class ComparadorRectangulos {

	public static void main(String[] args) {

		RectanglePlus rectangleOne = new RectanglePlus(10, 20);//Se puede crear un rectangulo de forma habitual o normal, es decir con una referencia de su propia clase
		Relatable rectangleTwo = new RectanglePlus(20, 10);//Y se puede utilizar tambien la interface que implementa RectanglePlus a la hora de instanciar una clase /tener cuidado con el concepto de instanciar para interfaces/ 
		
		rectangleOne.print();
//		rectangleTwo.print();// Esto da ERROR ya que si queremos imprimir los datos de rectangleTwo le tenemos que hacer un casting ya que el metodo print() no esta definido por el tipo Relatable. se hace como se ve a continuacion para poder utilizarlo
		MyInterface rectangle2 = (MyInterface) rectangleTwo;
		rectangle2.print();
		
		switch (rectangleOne.isLargerThan(rectangleTwo)) {
		case -1:
			System.out.println("Es menor");
			break;
		case 0:
			System.out.println("Son iguales");
			break;
		case 1:
			System.out.println("Es mayor");
			break;
		}

	}

}
