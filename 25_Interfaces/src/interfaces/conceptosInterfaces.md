[toc]

# INTERFACES Y CLASES ABSTRACTAS

## 1. INTERFACES

### INTERFACES EN JAVA

▸ Una interface en Java no es mas que un contrato de compromiso. Es la manera de comprometer a una clase a que implemente una serie de metodos. La interfaz lo que marcaria es los métodos que debe implementar una clase que implemente esa interfaz. Es decir, es como un contrato en el que nosotros definimos solamente la firma de los métodos y es la clase la que tiene que darle contenidos a esos metodos
	 
▸ Conjunto de operaciones que una clase se compromete a implementar.
	 
▸ La interfaz marca qué métodos, con su firma
	 
▸ Desde Java 8, pueden incluir también métodos con cuerpo a través de (abstractos, estáticos y por defecto).

▸ También puede incluir constantes.


​		

### DEFINICIÓN DE INTERFACES

> Podríamos utilizar una referencia para albergar instancias de un objeto que implemente esa interface [comentario del profe]

▸ La palabra **interface **para poder definir una interfaz
	 
▸ A la hora de nombrar una interface seguimos las mismas normas de acceso que una clase. La mayoria de interfaces serán públicos
	 
▸ Mismas reglas de nombres que una clase.
	 
▸ También existe la herencia de interfaces. En este caso, sí que puede ser múltiple, es decir un interfaz puede heredar de otros dos o mas interfaces, la herencia multiple se indicaría a partir de la palabra **extends**.
Una interfaz puede heredar de otro, heredaria sobretodo la definicion de esos metodos asi como los metodos estaticos y los metodos por defecto
	 
	  

```java
public interface GroupedInterface extends Interface1, Interface2 {
	  // constant declarations
	  // base of natural logarithms
	  double E = 2.718282;
	  // method signatures
	  void doSomething (int i, double x);
	  int doSomethingElse(String s);
	  }
```

En el cuerpo vamos a tener metodos abstractos en la mayoria, y desde Java 8 son metodos por defecto, estaticos o la definicion de constantes

Vamos a ir entendiendo como se define una interface, como una clase lo puede implementar. 

Como podemos tener metodos por defecto, metodos estáticos.

E incluso utilizando una referencia para albergar instancias de un objeto que implemente esa interface???????????????????????????????????????????
		 

### IMPLEMENTACIÓN DE INTERFACES

▸ Para que una clase implemente un interface, es decir como hacemos que una clase adquiera ese compromiso firme, ese contrato, para implementar esos metodos. Se hace a traves de la palabra **implements**

▸ Una clase puede implementar más de una interfaz. de hecho, cuando hablabamos de herencias deciamos que una clase solamente podia heredar de otra pero si va a poder implementar diversas interfaces. Java nos da este metodo para poder tener algo parecido a la herencia múltiple.
	 
	

```java
  public class RectanglePlus implements Relatable { 
	  //…
	  public int isLargerThan(Relatable other) {

	  RectanglePlus otherRect = (RectanglePlus)other;
	 
	  if (this.getArea() < otherRect.getArea())
	 
	  return -1;
	 
	  else if (this.getArea() > otherRect.getArea())
	 
	  return 1;
	 
	  else
	 
	  return 0;
	 
	  }
	 
	  }

```

​	

### INTERFACES COMO TIPOS

▸ Una interfaz puede ser el tipo de dato a usar para crear una instancia de un objeto. Vamos a ver como podriamos tener la posibilidad de utilizar los interfaces como tipos de una referencia a la hora de instanciar un objeto

▸ La clase del objeto a crear debe implementar dicha interfaz.

▸ Muy útil, sobre todo, para recibir argumentos en métodos. Al igual que pasaba con la herencia de clases, es muy util si tenemos un metodo que tiene que recibir un objeto que sea de un tipo concreto, en este caso; que implemente una determinada intefaz
	 
	  

```java
RectanglePlus rectangleOne = new RectanglePlus(10, 20);
Relatable rectangleTwo = new RectanglePlus(20, 10);
```

