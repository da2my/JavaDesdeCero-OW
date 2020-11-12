[toc]

# USO DE super

## ACCESO A LA SUPERCLASE

​	  ▸ Si uno de nuestros métodos sobreescribe un método de la clase base, podemos
​	  invocar este a través de la palabra super. Es decir nos va a permitir acceder
​	  desde una subclase hacia su superclase. No solo a sus metodos sino tambien,
​	  dependiendo de sus modificadores de acceso, a sus atributos


​		  

​	  Esto se hace para complementar la funcionalidad. Nos daremos cuenta que en
​	  determinadas ocasiones una superclase implementa un determinado metodo que
​	  tiene una funcionalidad, una clase que extienda a esta lo que haria seria
​	  complementar la funcionalidad de este metodo, podria invocarlo dentro de un
​	  metodo que se llamara igual de manera que no existiria un solapamiento total
​	  sino que la funcionalidad de la subclase incluiria la de la superclase con
​	  algunas sentencias adicionales


​		  

​	 

```java
 // overrides printMethod in Superclass
	  
	  public void printMethod() {
	  
	  super.printMethod();
	  
	  System.out.println("Printed in Subclass");
	  
	  }
```


​		

	  ## CONSTRUCTORES Y SUPER

​	  ▸ Un constructor de una subclase puede usar super para invocar a un constructor de su clase base.  

​	  ▸ Si una subclase no lo invoca, la JVM lo hace por él. La clase base debe tener entonces un constructor sin parámetros.
​	 

```java
 public Empleado(...) {
	  super(nombre, puesto, direccion, telefono, nSS);
	  
	  this.sueldo = sueldo;
	  this.impuestos = impuestos;
}	  
```

