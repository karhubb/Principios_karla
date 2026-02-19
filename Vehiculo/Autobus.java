/**
 * Class Autobus
 */
public class Autobus extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  private int numPuertas;

  //
  // Constructors
  //
  public Autobus () { };

  //
  // Other methods
  //

  public void mostrarDatos()
  {
    System.out.println(" AUTOBUS");
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
    System.out.println("Numero de puertas: " + numPuertas);
  }

  public void setNumAsientos(int numAsientos) {
  this.numAsientos = numAsientos;
}

public void setNumPuertas(int numPuertas) {
  this.numPuertas = numPuertas;
}


  public void pruebaMotor()
  {
    System.out.println("Realizando prueba de motor del autobus...");
    encenderMotor();
  }
}
