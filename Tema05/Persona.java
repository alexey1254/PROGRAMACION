package tema05;

public class Persona {
  private String nombre, apellidos;
  private int edad;
  
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
}
