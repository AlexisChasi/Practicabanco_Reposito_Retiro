import java.util.Scanner;

public class cuenta {
    Scanner sc= new Scanner(System.in);
String Titular;
double cantidad;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public cuenta(){
Titular="AlexisCHasi";
 cantidad=500.50;

    }
    public void depositar(){
       double deposito;
        System.out.println("cuanto desea depositar ");
        deposito=sc.nextDouble();
        double saldo=cantidad + deposito;
        setCantidad((saldo));
        System.out.println("Saldo total "+getCantidad());

    }
    public void retirar(){
        double retiro;
        System.out.println("cuanto desea retirar ");
        retiro=sc.nextDouble();
        double saldo=cantidad - retiro;
        setCantidad((saldo));
        System.out.println("Saldo total "+getCantidad());

    }

}
