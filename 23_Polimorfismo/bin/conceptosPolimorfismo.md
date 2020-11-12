[toc]

# POLIMORFISMO

## REFERENCIAS Y SUBCLASES

▸ Una subclase puede ser accedida a través de una referencia de una superclase. 

Cuando hay una herencia entre dos clases existes se dice que es una relacion de tipo "esUn" es decir. Si un Consultor o Empleado son
Trabajadores, entre Consultor o Empleado y Trajador hay una referencia de tipo "esUn", esto se plasma en la realidad en el hecho de que podemos utilizar referencias de una superclase para almacenar objetos o para referenciar objetos de un tipo de subclase en particular. 

Por ejemplo podriamos utilizar referencias de Trabajador para hacer referencia a Empleado o para hacer referencia a Consultor ademas de para hacer referencia a Trabajador

▸ Esto es muy útil si queremos tener un metodo que trabaje no solamente con la clase base sino con las clases heredadas, por ejemplo:

```java
  public static void saludar(Trabajador t) {//notese que se recibe una copia de la referencia Trabajador como argumento
	  System.out.println("Hola, " + t.getNombre());
	  
	}
```


​	  ¡¡IMPORTANTE!!

## OCULTACIÓN DE MÉTODOS

▸ Si una subclase añade un método con mismo nombre y firma que otro de la clase base, oculta a este.

Esto puede ser útil para que una subclase matice algo en particular, como por ejemplo el calculo de la paga. Pero empieza a dar quebradero de cabeza cuando trabajamos con referencias de tipo de la clase base. 

▸ ¿Qué sucede en caso del uso de referencias de clase base[^1], pero instanciación de objetos derivados[^2]. Y llamamos al método calcularPaga()?

```java
Trabajador empleado;
empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "",100000.0, 1000.0);

empleado.calcularPaga();
```

Aquí entra en juego el concepto de POLIMOSRFISMO

## POLIMORFISMO

▸ Java escoge, en tiempo de ejecución, el tipo de objeto. Si la referencia es de tipo Trabajador[^1] pero la instancia es de tipo Empleado[^2]. En el ejemplo va a llamar al método concreto de Empleado si es que  a ocultado el método de Trabajador. En otro caso si no hubiera ocultado ese método llamaría al método de la clase base.

▸ Si este tipo, en el ejemplo; Empleado, ha ocultado, referenciandose con el mismo nombre de un método de la superclase, llama al metodo concreto, es decir de la subclase.

▸ En otro caso si no hubiera ocultado ese metodo, llamaria al método de la clase base.

[^1]:Trabajador empleado =
[^2]:= new Empleado(...);

