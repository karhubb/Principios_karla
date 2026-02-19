/**
 * Class Automovil
 */
public class Automovil extends Vehiculo {

  //
  // Fields
  //

  private int numPuertas;

  //
  // Constructors
  //
  public Automovil () { };

  //
  // Accessor methods
  //

  public void setNumPuertas (int newVar) {
    numPuertas = newVar;
  }

  public int getNumPuertas () {
    return numPuertas;
  }

  //
  // Other methods
  //

  public void mostrarDatos()
  {
    System.out.println(" AUTOMOVIL");
    mostrarCaracteristicas();
    System.out.println("Numero de puertas: " + numPuertas);
  }

  public void pruebaMotor()
  {
    System.out.println("Probando motor del automovil...");
    encenderMotor();
  }
}
