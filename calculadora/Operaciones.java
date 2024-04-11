package calculadora;

public class Operaciones {
    
    public double sumar(double a, double b) {
        System.out.println("sumando decimales");
        return a + b;
    }

    public int sumar(int a, int b) {
        System.out.println("sumando enteros");
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public double raizCubica(double a) {
        return Math.cbrt(a);
    }

    public double seno(double a) {
        return Math.sin(a);
    }

    public double coseno(double a) {
        return Math.cos(a);
    }
}
