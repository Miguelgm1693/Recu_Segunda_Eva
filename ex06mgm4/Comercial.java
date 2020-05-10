
package ex06mgm4;

import java.util.ArrayList;

public class Comercial extends Persona {

  private String cargo;
  private ArrayList<Articulo> vendidos;

  public Comercial(String nombre, String email, String cargo) {
    super(nombre, email);
    this.cargo = cargo;
    this.vendidos = new ArrayList<>();
  }


  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }


  public void setVendidosAdd(Articulo articulo) {
    if (this.vendidos.contains(articulo)) {
      int index = this.vendidos.indexOf(articulo);
      int getUnits = this.vendidos.get(index).getCantidad();
      this.vendidos.get(index).setCantidad(getUnits += articulo.getCantidad());

    } else {
      this.vendidos.add(articulo);
    }

  }

    @Override
    public String toString() {
        return "Comercial{" + "Nombre comercial: " + super.getNombre() + ", Correo electrónico: " + super.getEmail() + ", Cargo: " + cargo + '}';
    }

    public void consultarVenta() {
        for (Articulo vendido : vendidos) {
            System.out.println(vendido);
        }
    }
}
