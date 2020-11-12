package tiposdatos;


public class TiposDatosNumericos {

	public static void main(String[] args) {

//		//TIPOS DE DATOS ENTEROS
//		long l = 3_000_000_000L;//el "_" para identificar su valor a modo de separador y la "L" para que se aplique
//		System.out.println(l);
//		
//		//TIPOS DE DATOS REALES
//		//Presicion simple
//		float f = 0.25f;
//		System.out.println(f);
//		//Presicion doble
//		double Pi = Math.PI;
//		System.out.println(Pi);
		
		
		
		//OPERADORES A NIVEL BITS
		int bitmask = 0b0011;
		int val = 0b1111;
		
		int res = val & bitmask;//0011
		System.out.println("AND:");
		System.out.println(Integer.toBinaryString(res));
		
		res= val ^ bitmask;//1100
		System.out.println("OR EXCLUSIVO:");
		System.out.println(Integer.toBinaryString(res));
		
		res = val | bitmask;//1111
		System.out.println("OR:");
		System.out.println(Integer.toBinaryString(res));
				
		//0b1111
		res = val << 1; //11110
		System.out.println("left shift:");
		System.out.println(Integer.toBinaryString(res));
		
		res = val >> 2; //0011
		System.out.println("Signed rigth shift:");
		System.out.println(Integer.toBinaryString(res));
		
		res = (-val) >> 2; //11111111111111111111111111111100
		System.out.println("Signed rigth shift:");
		System.out.println(Integer.toBinaryString(res));
		
		res = val >>> 1; //111
		System.out.println("Unsigned rigth shift:");
		System.out.println(Integer.toBinaryString(res));
		
		res = ~val; //11111111111111111111111111111111111110000
		System.out.println("Inverso cpmplementario:");
		System.out.println(Integer.toBinaryString(res));
		
		
	}

}
