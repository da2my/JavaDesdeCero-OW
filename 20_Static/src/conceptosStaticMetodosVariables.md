[toc]

# ATRIBUTOS O MÉTODOS ESTÁTICOS

## ATRIBUTOS DE OBJETO Y DE CLASE 

▸ Los objetos son instancias, es decir copias sacadas a partir de un molde llamado clase, de una clase. 

▸ Cada objeto tiene una copia de los atributos. Y permite modificar el valor de los suyos propios. 

▸ ¿Y si quisiéramos tener un **atributo que fuese común** a todos las instancias a todos los objetos de una clase? 

▸ Eso lo podemos conseguir a través del modificador **static**  que va a indicar que un atributo no va a ser de un objeto u otro en particular, de una instancia concreta. Sino que va a ser común a todas ellas porque va a ser de la clase

![image-20201004101424115](/Volumes/DatosMacHDD/F/Library/Application Support/typora-user-images/image-20201004101424115.png)

## ATRIBUTOS ESTÁTICOS 

▸ Están **asociados a la clase**, no a una instancia de ella. 

▸ Son llamados **atributos estáticos**. 

▸ **Compartidos** para todas las instancias de esa clase. 

▸ Al ser compartidos pueden ser manipulados por cualquier instancia. 

▸ **También pueden ser manipulados sin crear instancias de esa clase**.  

## MÉTODOS ESTÁTICOS 

▸ Similares a las variables estáticas (static) 

▸ Se pueden invocar sin crear una instancia de esa clase. 

▸ **Clase.metodoEstatico(…);** 

▸ Para acceder a una variable estática, necesitamos un método estático. 

▸ Clases con métodos auxiliares (como por ejemplo, *java.util.Arrays*). 

## CONSTANTES 

▸ Se suelen definir como estáticas. 

▸ static final … 

```java
	static final double PI = 3.141592653589793;
```

Para que esas constantes sean de la propia clase y no de una instancia en particular. Cada instancia no tiene porque tener su copia de esta constante y de esa manera no se puede modificar su valor.

▸ No se puede modificar su valor (error) 

▸ Nombre en mayúsculas, separando palabras con guiones bajos. 