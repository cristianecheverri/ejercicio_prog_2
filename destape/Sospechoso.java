package destape;

public class Sospechoso {
  public String nombre;
  public String alias;
  public String ultimaDireccion;
  public byte edad;
  public String descripcionFisica;
  public String foto;

  public Sospechoso(String nombre, String alias, String ultimaDireccion ,byte edad, String descripcionFisica, String foto) {
    this.nombre = nombre;
    this.alias = alias;
    this.ultimaDireccion = ultimaDireccion;
    this.edad = edad;
    this.descripcionFisica = descripcionFisica;
    this.foto = foto;
  }

  public String getNombre() {
    return this.nombre;
  }
}
