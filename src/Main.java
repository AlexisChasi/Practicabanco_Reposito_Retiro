
import java.util.Scanner;

public class Main {
     Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Datos Bancarios");
        cuenta datos=new cuenta();
        System.out.println("Titular: "+datos.getTitular());
        System.out.println("Cantidad: "+datos.getCantidad());
        System.out.println("================================");
        datos.depositar();
        datos.retirar();
        System.out.println("=================================");
        System.out.println("\tProceso Finalizado");






    }
}