package propiedadesymetodos;

import java.util.Date;

public class Persona {

	// ATRIBUTOS (No cualquier objeto puede acceder a las propiedades, estructura de
	// un objeto persona...
	private String nombre;
	private String apellidos;
	private int edad;
	private float altura;
	private float peso;

	// CONSTRUCTOR vacio, el profe lo ha dejado como por defecto
	public Persona() {
		this.nombre = "desconocido";// ...el mismo si y para hacerlo utilizamos el puntero this)
		this.apellidos = "desconocido";
		this.edad = 0;
	}

//	//CONSTRUCTOR con algunos parametros
//	public Persona(String nombre, String apellidos) {
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//	}

//	public Persona(String nombre, String apellidos, int edad) {
//		this(nombre, apellidos);//(hace referencia a los parametros del anterior constructor, para no tener que escribir otra vez lineas de codigo)Esta expresion se usa cuando tenemos un constructor con un numero de parametros anteriormente y queremos añadir un/unos parametros adicionales en un nuevo constructor como en el actual que queremos añadir "edad"
//		this.edad = edad;
//	}

//	public Persona(String nombre, String apellidos, int edad, float altura, float peso) {
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		this.edad = edad;
//		this.altura = altura;
//		this.peso = peso;
//	}

	// METODOS
	public void nacer() {
		System.out.println("Acabo de nacer");
	}

	public void caminar() {
		System.out.println("Estoy caminado");
	}

	public void hablar() {
		System.out.println("Estoy hablando");
	}

	public void morir() {
		System.out.println("¡¡He palmado, hasta más ver!!");
	}

	public void presentacion() {
		System.out.println(
				"Mi nombre es " + this.nombre + " " + this.apellidos + ", y tengo " + this.edad + " años de edad");
	}

	public void saludos(String mensaje) {
		System.out.println(
				"Hola, soy " + this.nombre + " " + this.apellidos + ", y quiero saludarte diciendote: " + mensaje);
	}

	public String obtenerNombreCompleto() {

		return this.nombre + " " + this.apellidos;
	}

	// Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	// toString()

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

}
