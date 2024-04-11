import banco.Banco;
import banco.Cuenta;

public class MainBanco {
    public static void main(String[] args) {
        boolean pudoCrear;
        Banco banco = new Banco("MuchoDinero");
        pudoCrear = banco.adicionarCuenta("1234", 0, "Ahorros");
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("123", 1000000, "corriente");
        System.out.println(pudoCrear);
        pudoCrear = banco.adicionarCuenta("1234", 5000, "Corriente");
        System.out.println(pudoCrear);

        for (Cuenta cuentaTemporal : banco.getCuentas()) {
            System.out.printf("Numero: %s Tipo: %s Saldo: %s \n", cuentaTemporal.getNumero(), cuentaTemporal.getTipo(), cuentaTemporal.getSaldo());
        }
    }
}
