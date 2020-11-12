# MODIFICADORES DE ATRIBUTOS Y MÉTODOS

¿QUIÉN ACCEDE A MIS ATRIBUTOS, MÉTODOS o CLASES? 

 ![image-20201004093656567](/Volumes/DatosMacHDD/F/Library/Application Support/typora-user-images/image-20201004093656567.png) 

## MODIFICADORES DE ACCESO A NIVEL DE CLASE 

▸ Nuestras clases deben ser public o sin modificador. 

▸ En caso de ser public, cualquiera podrá utilizarlas (más  recomendado) 

▸ Sin modificador, solamente las clases del mismo paquete podrán usarlas.   

## MODIFICADORES DE ACCESO A NIVEL DE MÉTODOS 

▸ Intentemos escoger siempre la versión más restrictiva posible. 

▸ Para métodos que realizan operaciones auxiliares a otros métodos, podemos escoger private. 

▸ La mayoría de los métodos serán public. Son su interlocutor con el exterior. 

▸ Los constructores deben ser public.  

## MODIFICADORES DE ACCESO A NIVEL DE ATRIBUTOS 

▸ Deben ser private, salvo para constantes. 

▸ Hay que tener una muy buena razón para no usarlo. 

▸ Los atributos públicos aumentan el acoplamiento del código, y limitan la flexibilidad de refactorización. 