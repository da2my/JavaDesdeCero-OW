package excepciones;

public class SituacionExcepcional {
	
	public static void main(String[] args) {
		
		
		//El IDE nos previene de algunas. 
//		No podemos trabajar con una variable que no haya sido inicializada. Esto es una instancia de un tipo de dato
//		String name;
//		System.out.println(name);
		
//		//Caso en el que inicializamos expresamente una instancia a null, va a escribir con println()
//		String name = null;
//		System.out.println(name);
////		estamos intentando acceder a un objeto a traves de una referencia, pero esa referencia no esta apuntando no esta referenciando a ningun objeto
//		System.out.println(name.length());
//		
//		//Otras no es posible controlarlas.
		int a = 2;
		int b = 0;
		System.out.println(a/b);//Error de division entre 0
	
		
	}

}
