package banco;

public class Cuenta {
    String numero;
    String tipo;
    double saldo;

    public Cuenta(String numero, String tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public Cuenta (String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Cuenta() {

    }

    /**
     * Retorna el saldo de la cuenta
     * @return double Entrega el saldo de la cuenta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Entrega el numero de la cuenta
     * @return el numero de la cuenta
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * Entrega el tipo de la cuenta
     * @return el tipo de la cuenta
     */
    public String getTipo() {
        return this.tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
