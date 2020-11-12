package propiedadesymetodos;

public class PropiedadesMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Persona person1 = new Persona();
//		person1.nacer();
//		person1.hablar();
//		person1.caminar();
//		person1.morir();
		
		Persona yo = new Persona();
		yo.setNombre("David");
		yo.setApellidos("Moya Mena");
		yo.setAltura(1.67f);
		yo.setPeso(63.5f);
		yo.setEdad(31);
		
		yo.saludos("hola a todoss amigosss");
		yo.presentacion();
		
		System.out.println(yo);
		
		
	}

}
