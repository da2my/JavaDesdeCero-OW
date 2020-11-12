package valoryreferencia;

public class PasoPorReferencia {

	public static void main(String[] args) {

		Circle circle;
		circle = new Circle(2, 3);// Creamos el circle y/o lo instanciamos. Y ponemos donde se encuentra el
									// circulo en el plano cartesiano por x,y

		System.out.println(circle);// Circle [x=2, y=3, radius=1]

		moveCircle(circle, 23, 56);// Estamos pasando la instancia "circle" y el desplazamiento de deltaX y deltaY
									// a traves del metodo "moveCircle"

		System.out.println(circle);// Circle [x=25, y=59, radius=1]

	}

	public static void moveCircle(Circle circle, int deltaX, int deltaY) {// la referencia "Circle circle" se pasa por
																			// valor. Es decir se hace una copia de la
																			// referencia y se modifica dentro del metodo

		// code to move origin of circle to x+deltaX, y+deltaY || Aqui lo que tenemos es
		// 2 referencias apuntando al mismo objeto en memoria
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);

		// code to assign a new reference to circle || Lo que no podemos modificar es la
		// referencia, porque aunque hagamos una nueva asignacion no se va a ver esta
		// modificacion. Se pierde y sigue apuntando a la misma referencia "circle = new Circle(2, 3);" de fuera
		circle = new Circle(0, 0);
	}

}
