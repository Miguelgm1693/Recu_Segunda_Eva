
package ex06mgm4;

public abstract class Persona {
  private String nombre;
  private String email;

  public Persona(String nombre, String email) {
    this.nombre = nombre;
    this.email = email;
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



  @Override
  public String toString() {
    String message = "Nombre: " + this.nombre + "\n"
        + "Correo electrónico: " + this.email;


    return message;
  }
}
