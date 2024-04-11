package destape;

import java.util.ArrayList;

public class Caso {
  public int numeroUnico;
  public String nombreClave;
  public Detective detective;
  public ArrayList<Sospechoso> sospechosos;

  public Sospechoso buscarSospechoso(String nombre) {
    for (Sospechoso sospechoso : this.sospechosos) {
        if (sospechoso.getNombre().equals(nombre)) {
            return sospechoso;
        }
    }
    return null;
  }

  public boolean registrarSospechoso(
    String nombre,
    String alias,
    String ultimaDireccion,
    byte edad,
    String descripcionFisica,
    String foto
  ) {
    if (buscarSospechoso(nombre) == null) {
        Sospechoso sospechoso = new Sospechoso(nombre, alias, ultimaDireccion, edad, descripcionFisica, foto);
        this.sospechosos.add(sospechoso);
        return true;
    } else {
        return false;
    }
  }

  public void setDetective(Detective detective){
    this.detective = detective;
  }
}
