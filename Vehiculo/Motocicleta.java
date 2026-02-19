/**
 * Class Motocicleta
 */
public class Motocicleta extends Vehiculo {

  private int numAsientos;

  public Motocicleta () { };

  public void mostrarDatos()
  {
    System.out.println(" MOTOCICLETA");
    mostrarCaracteristicas();
    System.out.println("Numero de asientos: " + numAsientos);
  }

  public void setNumAsientos(int numAsientos) {
  this.numAsientos = numAsientos;
}

public int getNumAsientos() {
  return numAsientos;
}

  public void pruebaMotor()
  {
    System.out.println("Probando motor de la motocicleta...");
    encenderMotor();
  }
}
