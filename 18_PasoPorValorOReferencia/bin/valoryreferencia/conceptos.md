# PASO DE ARGUMENTOS POR VALOR Y POR REFERENCIA

## PASO DE ARGUMENTOS 

▸ *Por valor:* se realiza una copia de las variables. Al finalizar el método, esta copia se destruye. Nosotros le proporcionamos unos valores, Java no va a modificar esos valores, Java copia esos valores, trabaja con ellos  se puede modificar esa copia, se pude setear ese valor. Si embargo cuando termina la ejecución de este método esa copia se destruye. todo funciona mediante un sistema de marcos de ejecución que se van anidando en una estructura de la memoria que se llama "la pila".

▸ *Por referencia:* no se realiza una copia de las variables. Sino se modifican directamente las variables que hemos pasado y quedan modificados al finalizar el método. (En Java el paso por referencia no existe)

>   Si que tenemos que tener presente que le paso de cualquier valor va a ser por valor pero vamos a diferenciar entre tipos primitivos y en el paso de objetos

## PASO DE TIPOS PRIMITIVOS 

▸ Se hace por **valor**. 

```java
public class PasoPorValor { 
  public static void main(String[] args) {
  int x = 3; //invocamos el argumento y le pasamos x
  pasoPorValor(x); //imprimimos x y vemos si el parámetro ha cambiado 
  System.out.println("Después de invocar pasoPorValor, x = " + x); 
	} // cambiamos el valor en el método
  public static void pasoPorValor(int p) {
    p = 10; 
  } 
}
```

## PASO DE OBJETOS

▸ También se hace por **valor**. Hay que tener en cuenta que es lo que nosotros estamos pasando.

Cuando nosotros pasamos un objeto a través de un método como argumento lo que estamos pasando es una referencia, es decir recordando el concepto de referencia; que... era una variable que nos permitía acceder al objeto que estaba en otra zona de memoria. Con lo cual mediante ese paso por valor, lo que no vamos a poder modificar dentro del método es esa referencia, es decir si cambiamos a que objeto esta apuntando esa referencia, pues perderemos ese cambio cuando el método termine su ejecución. 

Sin embargo, si dentro del metodo modificamos algo del interior del objeto referenciado. Esos cambios si van a perdurar cuando nosotros terminemos la ejecución del método. Con lo cual aunque el paso también sea por valor los objetos si pueden ser modificados dentro de los métodos.

Repitiendo. Lo que no podríamos hacer es que esta referencia[^1] al terminar el método apuntara a otro objeto diferente[^3] de este tipo[^1] va a seguir apuntando al mismo[^2] pero el interior de este objeto[^2] si se va a ser modificado si nosotros lo queremos

▸ No cambia la referencia, pero el interior del objeto sí se puede modificar.

![image-20201003135934804](/Volumes/DatosMacHDD/F/Library/Application Support/typora-user-images/image-20201003135934804.png)

[^1]:Cuadrado pequeño izquierdo del dibujo memoria.
[^2]:Rectángulo grande derecho del dibujo memoria.
[^3]: En el supuesto de que haya otro Rectangulo, es decir otro objeto, que no esta en el dibujo.

