[toc]

# HERENCIA

## Herencia

▸ Funcionalidad fundamental en POO.

▸ Mecanismo de extensión de clases.

▸ Jerarquía de clases.

▸ Superclase y subclase.

▸ Reutilización.

▸ Un solo padre.

▸ Para indicar que una clase hereda de otra se utiliza la palabra reservada **extends**

Este mecanismo propio de POO viene marcado para que podamos ir modelando objetos que se basan en otros objetos y poder reutilizar parte de sus variables y parte de su código

![image-20201004110643357](/Volumes/DatosMacHDD/F/Library/Application Support/typora-user-images/image-20201004110643357.png)



▸ Una clase que extiende a otra hereda sus atributos y sus métodos (**no constructores**).

▸ Puede añadir atributos y métodos nuevos.

![image-20201004110845533](/Volumes/DatosMacHDD/F/Library/Application Support/typora-user-images/image-20201004110845533.png)

## HERENCIA y ACCESO

▸ Una clase que extiende a otra hereda todos sus atributos y métodos.

▸ Solamente puede acceder a los que sean *public* y *protected* (y por defecto si

está en el mismo paquete).

▸ **protected** está poco recomendado para las propiedades, tributos. Mejor

**private** y acceso a través de métodos **public**.



## HERENCIA Y SOBREESCRITURA



▸ Una clase que extiende a otra hereda puede añadir tantos métodos o atributos como necesite.

▸ Si un nuevo atributo (o método) se llama igual que otro de una superclase, lo solapa, y ya no puede accederse al de la clase padre.

## HERENCIA y final

▸ Si no queremos que nadie pueda heredar de una de nuestras clases, podemos marcarla como **final** en su definición.

**Una clase final es una clase que no puede ser extendida** 

```java
public final class ClaseFinal {

}
```

