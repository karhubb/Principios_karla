/**
 * Class Vehiculo
 */
public class Vehiculo {

  //
  // Fields
  //

  protected int precio;
  protected String marca;
  protected int numllantas;

  //
  // Constructors
  //
  public Vehiculo () { };

  //
  // Other methods
  //

public void setPrecio(int precio) {
  this.precio = precio;
}

public int getPrecio() {
  return precio;
}

public void setMarca(String marca) {
  this.marca = marca;
}

public String getMarca() {
  return marca;
}

public void setNumllantas(int numllantas) {
  this.numllantas = numllantas;
}

public int getNumllantas() {
  return numllantas;
}


  public void mostrarCaracteristicas()
  {
    System.out.println("Marca: " + marca);
    System.out.println("Precio: $" + precio);
    System.out.println("Numero de llantas: " + numllantas);
  }

  public void encenderMotor()
  {
    System.out.println("El vehiculo ha encendido.");
  }

}
