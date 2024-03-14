package venta;

public class Venta {
    public double calcularValorVenta(double valorUnitario, int cantidadProducto, int tipoCliente) {
        final double DESCUENTO_CLIENTE_TIPO_1 = 0.0;
        final double DESCUENTO_CLIENTE_TIPO_2 = 0.05;
        final double DESCUENTO_CLIENTE_TIPO_3 = 0.08;
        final double DESCUENTO_CLIENTE_OTROS = 0.12;
        double valorVenta = valorUnitario * cantidadProducto;

        switch (tipoCliente) {
            case 1:
                valorVenta = valorVenta - (valorVenta * DESCUENTO_CLIENTE_TIPO_1);
                break;
            case 2:
                valorVenta = valorVenta - (valorVenta * DESCUENTO_CLIENTE_TIPO_2);
                break;
            case 3:
                valorVenta = valorVenta - (valorVenta * DESCUENTO_CLIENTE_TIPO_3);
                break;
            default:
                valorVenta = valorVenta - (valorVenta * DESCUENTO_CLIENTE_OTROS);
                break;
        }

        return valorVenta;
    }
}
