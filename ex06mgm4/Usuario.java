
package ex06mgm4;

public class Usuario extends Persona implements Cliente {

  private String telefono;
  

  public Usuario(String nombre, String email, String telefono) {
    super(nombre, email);
    this.telefono = telefono;

  }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

  @Override
  public void compra(Comercial comercial, Articulo articulo) {
    comercial.setVendidosAdd(articulo);
  }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre: " + super.getNombre() + ", Correo electrónico: " + super.getEmail() + ", Teléfono: " + telefono + '}';
    }
}
