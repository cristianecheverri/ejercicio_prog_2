package frasco;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FrascoDeDulce {
    
    String sabor;
    int cantidad;
    LocalDateTime fechaEnvasado;

    public FrascoDeDulce(String sabor, LocalDateTime fechaEnvasado) {
        this.sabor = sabor;
        this.fechaEnvasado = fechaEnvasado;
    }

    public LocalDateTime getFechaEnvasado() {
        return this.fechaEnvasado;
    }

    public boolean envasar(String sabor, int cantidad, LocalDateTime fechaEnvasado) {
        int cantidadActual = this.consultarCantidad();
        this.sabor = sabor;
        if (cantidadActual < 200) {
            int cantidadFaltante = 200 - cantidadActual;
            if (cantidad > cantidadFaltante) {
                cantidad = cantidadFaltante;
            }
            this.cantidad += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public int sacarDulce(int cantidadASacar){
        if (this.cantidad < cantidadASacar) {
            cantidadASacar = this.cantidad;
        }
        this.cantidad -= cantidadASacar;
        return cantidadASacar;
    }

    public int sacarDulceFacil(int cantidadASacar){
        int cantidadSacada = 0;
        if (cantidadASacar >= this.cantidad) {
            cantidadSacada = this.cantidad;
            this.cantidad -= cantidadSacada;
        } else {
            cantidadSacada = cantidadASacar;
            this.cantidad = cantidadSacada;
        }
        return cantidadSacada;
    }

    public int consultarCantidad(){
        return this.cantidad;
    }
}
