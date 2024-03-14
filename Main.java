import java.util.Scanner;
import javax.swing.JOptionPane;
import venta.Venta;


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
    Venta ventica = new Venta();
    String cantidadProductoDialogo = JOptionPane.showInputDialog(
      null,
      "Ingrese la cantidad de productos:",
      "Cantidad productos",
      JOptionPane.INFORMATION_MESSAGE
    );
    int cantidadProducto = Integer.parseInt(cantidadProductoDialogo);
    String valorUnitarioDialogo = JOptionPane.showInputDialog(
      "Ingrese el valor unitario del producto"
    );
    double valorUnitario = Double.parseDouble(valorUnitarioDialogo);

    int tipoCliente = Integer.parseInt(
      JOptionPane.showInputDialog("Ingrese el tipo de cliente")
    );
    double valorVenta = ventica.calcularValorVenta(
      valorUnitario,
      cantidadProducto,
      tipoCliente
    );
    String mensaje = String.format(
      "Para el cliente de tipo %d %n, Cantidad de productos : %d %n, Valor unitario %.2f %n. El valor de la venta es: %.2f %n",
      tipoCliente,
      cantidadProducto,
      valorUnitario,
      valorVenta
    );
  }
}
