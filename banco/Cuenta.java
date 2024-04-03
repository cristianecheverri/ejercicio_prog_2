package banco;

public class Cuenta {
    String numero;
    String tipo;
    double saldo;

    /**
     * Retorna el saldo de la cuenta
     * @return double Entrega el saldo de la cuenta
     */
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * Método para retirar saldo de la cuenta.
     * @param cantidadARetirar double Cantidad de dinero a retirar de la cuenta
     * @return boolean Indica si se pudo retirar o no
     */
    public boolean retirarSaldo(double cantidadARetirar) {
        if (cantidadARetirar <= this.saldo) {
            this.saldo -= cantidadARetirar;
            return true;
        } else {
            return false;
        }           
    }

    /**
     * Consigna un valor dado a la cuenta
     * @param cantidadAConsignar double La cantidad de dinero a consignar a la cuenta
     */
    public void consignarSaldo(double saldo) {
        this.saldo += saldo;
    }
}
