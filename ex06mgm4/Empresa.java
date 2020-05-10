
package ex06mgm4;

public class Empresa implements Cliente {
  private String cif;
  private String nombre;
  private String telefono;

  public Empresa(String cif, String nombre, String telefono) {
    this.cif = cif;
    this.nombre = nombre;
    this.telefono = telefono;
  }


  public void compra (Comercial comercial, Articulo articulo) {
    comercial.setVendidosAdd(articulo);

  }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empresa{" + "Cif: " + cif + ", Nombre empresa: " + nombre + ", Teléfono: " + telefono + '}';
    }
}
