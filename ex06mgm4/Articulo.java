
package ex06mgm4;

import java.util.Objects;

public class Articulo {
  private String nombre;
  private int cantidad;

  public Articulo(String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return this.nombre + ", " + this.cantidad + " unid.";
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Articulo articulo = (Articulo) o;
    return nombre.equals(articulo.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }
}

