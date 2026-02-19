/**
 * Class Main
 */
public class Main {

  public static void main(String[] args)
  {
    Autobus a1 = new Autobus();
    a1.setMarca("Volvo");
    a1.setPrecio(500000);
    a1.setNumllantas(6);
    a1.setNumAsientos(40);
    a1.setNumPuertas(2);

    Motocicleta m1 = new Motocicleta();
    m1.setMarca("Yamaha");
    m1.setPrecio(45000);
    m1.setNumllantas(2);
    m1.setNumAsientos(2);

    Automovil auto1 = new Automovil();
    auto1.setMarca("Toyota");
    auto1.setPrecio(300000);
    auto1.setNumllantas(4);
    auto1.setNumPuertas(4);

    a1.mostrarDatos();
    a1.pruebaMotor();

    System.out.println();

    m1.mostrarDatos();
    m1.pruebaMotor();

    System.out.println();

    auto1.mostrarDatos();
    auto1.pruebaMotor();
  }
}
                      