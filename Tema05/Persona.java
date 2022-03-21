package tema05;

public class Persona {
	private String nombre, apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.edad=edad;
	}

	public void setEdad(int edad) {
		this.edad=edad;
	}

	public void setNombre(String nom) {
		nombre=nom; 
	}

	@Override
	public boolean equals(Object p) {
		return this.nombre.equals( ((Persona) p).nombre) && this.edad== ((Persona)p).edad)); 
	}
	
	
	@Override
	public String toString() {
		return String.format("Nombre: %s, Apellidos: %s, Edad: %d, IdObjeto: %s.", this.nombre, this.apellidos, this.edad, super.toString());	
	}
}
