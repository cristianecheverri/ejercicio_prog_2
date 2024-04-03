import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import venta.Venta;
import banco.Cuenta;
import frasco.FrascoDeDulce;


/**
 * Clase para repasar conceptos de programación
 * @author Cristian Echeverri
 * @version 1.0
 */
public class Main {

  /**
   * Método principal
   * @param args Argumentos de la línea de comandos
   * @param example Ejemplo de parámetro
   * @return void
   */
  public static void main(String[] args) {
    // Venta ventica = new Venta();
    // Scanner scanner =  new Scanner(System.in);
    // String cantidadProductoDialogo = JOptionPane.showInputDialog(
    //   null,
    //   "Ingrese la cantidad de productos:",
    //   "Cantidad productos",
    //   JOptionPane.INFORMATION_MESSAGE
    // );
    // int cantidadProducto = Integer.parseInt(cantidadProductoDialogo);
    // String valorUnitarioDialogo = JOptionPane.showInputDialog(
    //   "Ingrese el valor unitario del producto"
    // );
    // double valorUnitario = Double.parseDouble(valorUnitarioDialogo);

    // int tipoCliente = Integer.parseInt(
    //   JOptionPane.showInputDialog("Ingrese el tipo de cliente")
    // );
    // double valorVenta = ventica.calcularValorVenta(
    //   valorUnitario,
    //   cantidadProducto,
    //   tipoCliente
    // );
    // String mensaje = String.format(
    //   "Para el cliente de tipo %d %n, Cantidad de productos : %d %n, Valor unitario %.2f %n. El valor de la venta es: %.2f %n",
    //   tipoCliente,
    //   cantidadProducto,
    //   valorUnitario,
    //   valorVenta
    // );




    // Cuenta cuenta = new Cuenta();
    // cuenta.consignarSaldo(1000000.0);
    // System.out.println(cuenta.consultarSaldo());
    // cuenta.consignarSaldo(500000);
    // System.out.println(cuenta.consultarSaldo());
    // cuenta.retirarSaldo(100000);
    // System.out.println(cuenta.consultarSaldo());



    FrascoDeDulce frasco = new FrascoDeDulce();
    boolean pudoEnvasar = frasco.envasar("Guayaba", 300, "2024-03-20");
    System.out.println(pudoEnvasar);
    System.out.println(frasco.consultarCantidad());
    pudoEnvasar = frasco.envasar("Guayaba", 100, "2024-03-20");
    System.out.println("siguente pudo envasar " + pudoEnvasar);
    System.out.println(frasco.consultarCantidad());
    FrascoDeDulce frasco2 = frasco;
    FrascoDeDulce frasco3 = null;
    System.out.println("cantidad en frasco 2 :" + frasco2.consultarCantidad());
    int cantidadSacada = frasco.sacarDulce(50);
    System.out.println("cantidad sacada en frasco 1: " + cantidadSacada);
    System.out.println("cantidad en frasco 2 :" + frasco2.consultarCantidad());
    System.out.println("cantidad en frasco3 " + frasco3.consultarCantidad());

  }
}
