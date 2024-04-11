import javax.swing.JOptionPane;

import calculadora.Operaciones;
public class MainCalculadora {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));

        int operacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion a realizar: \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Potencia \n 6. Raiz cuadrada \n 7. Raiz cubica \n 8. Seno \n 9. Coseno \n 10. Sumar enteros"));

        double resultado = 0.0;
        switch (operacion) {
            case 1:
                resultado = operaciones.sumar(a, b);
                break;
            case 10:
                resultado = operaciones.sumar((int)a, (int)b);
                break;
            case 2:
                resultado = operaciones.restar(a, b);
                break;
            case 3:
                resultado = operaciones.multiplicar(a, b);
                break;
            case 4:
                resultado = operaciones.dividir(a, b);
                break;
            case 5:
                resultado = operaciones.potencia(a, b);
                break;
            case 6:
                resultado = operaciones.raizCuadrada(a);
                break;
            case 7:
                resultado = operaciones.raizCubica(a);
                break;
            case 8:
                resultado = operaciones.seno(a);
                break;
            case 9:
                resultado = operaciones.coseno(a);
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
    }

}
